package gymsym;

import static gymsym.Employee.createEMID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DoctorP
 */
public class PersonalSchedule {
    
    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "PERSONAL_SCHEDULE";
    private static Connection conn = null;
    private static Statement stmt = null;
    private double price;
    
    PersonalSchedule(int WIID, int SBID){
        insertPersSchedule(WIID,SBID);
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
    
    private static void insertPersSchedule(int WIID, int SBID)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + WIID + "," + SBID + ")");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }
    
    public double getTotalPrice(int SBID){
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select PRICE from WORKOUT_PLANS join INSTANCE ON WORKOUT_PLANS.WPID = INSTANCE.WPID JOIN PERSONAL_SCHEDULE ON INSTANCE.WIID = PERSONAL_SCHEDULE.WIID WHERE SBID = " + SBID);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                price += results.getInt("Price");
            }
            results.close();
            stmt.close();
            conn.commit();
            conn.close();
            return price;
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
            return price;
        }
    }
    
}
