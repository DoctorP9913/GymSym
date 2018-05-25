package gymsym;

import gymsym.leaves.Physic;
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
public class Subscriber extends User{
    
    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "SUBSCRIBERS";
    private static Connection conn = null;
    private static Statement stmt = null;
    private int SBID;
    private String sub_name;
    private Physic type;
    
    Subscriber(String name,String surname,String phone,String address,String username,String sub_name,Physic type){
        super(name,surname,phone,address,username);
        this.sub_name = sub_name;
        this.type = type;
        insertSubscriber(createSBID(),sub_name,type,phone);
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
    
    public static int createSBID(){
        Random r1 = new Random();
        int q1 = r1.nextInt(9998) + 1;
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select SBID from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(q1==results.getInt("SBID")){
                    int a = createSBID();
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

    private static void insertSubscriber(int SBID, String sub_name, Physic type, String phone)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + SBID + ",'" + sub_name + "','" + type.getDescription() + "'," + User.phoneToUSID(phone) + ")");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }
    
    public int getSBID() {
        return SBID;
    }

    public void setSBID(int SBID) {
        this.SBID = SBID;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public Physic getType() {
        return type;
    }

    public void setType(Physic type) {
        this.type = type;
    }
    
}
