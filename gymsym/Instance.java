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
public class Instance {

    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "INSTANCE";
    private static Connection conn = null;
    private static Statement stmt = null;
    int WIID,WPID;
    String hours,room_name,days;
    int max_capacity,duration;
    
    Instance(String hours, int max_capacity, int WPID, String room_name, String days, int wp1, int duration){
        this.hours = hours;
        this.max_capacity = max_capacity;
        this.room_name = room_name;
        this.days = days;
        this.duration = duration;
        insertInstance(createWIID(),hours,max_capacity,room_name,days,wp1,duration);
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
    
    public static int createWIID(){
        Random r1 = new Random();
        int q1 = r1.nextInt(9998) + 1;
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select WIID from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(q1==results.getInt("WIID")){
                    int a = createWIID();
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
    
    private static void insertInstance(int WIID, String hours, int max_capacity, String room_name, String days, int WPID,int duration)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + WIID + ",'" + hours + "'," + max_capacity +  ",'" + room_name + "','" + days + "'," + WPID + "," + duration + ")");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }
    
}
