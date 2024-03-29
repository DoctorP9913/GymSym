package gymsym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author DoctorP
 */
public class Trainer extends User{
    
    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "TRAINER";
    private static Connection conn = null;
    private static Statement stmt = null;
    private String trainer_name,spec;
    
    Trainer(String name,String surname,String phone,String address,String username,String trainer_name,String spec){
        super(name,surname,phone,address,username);
        this.trainer_name = trainer_name;
        this.spec = spec;
        insertTrainer(createTRID(),trainer_name,spec,phone);
        
    }
    
    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    public static int createTRID(){
        Random r1 = new Random();
        int q1 = r1.nextInt(9998) + 1;
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select TRID from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(q1==results.getInt("TRID")){
                    int a = createTRID();
                    return a;
                }
            }
            results.close();
            stmt.close();
            conn.commit();
            conn.close();
            return q1;
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
            return q1;
        }
    }
    
    private static void insertTrainer(int TRID, String trainer_name, String spec, String phone)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + TRID + ",'" + trainer_name + "','" + spec + "'," + User.phoneToUSID(phone) + ")");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
}
