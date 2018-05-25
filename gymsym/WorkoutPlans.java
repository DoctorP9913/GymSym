package gymsym;

import gymsym.leaves.Equipment;
import gymsym.leaves.WorkoutTypes;
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
public class WorkoutPlans {
    
    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "WORKOUT_PLANS";
    private static Connection conn = null;
    private static Statement stmt = null;
    private int WPID,max_subscribers;
    private double price;
    private String plan_name;
    Equipment needs_equipment;
    WorkoutTypes work_type;
    
    WorkoutPlans(String plan_name, int max_subscribers, Equipment needs_equipment, WorkoutTypes work_type, double price){
        this.plan_name = plan_name;
        this.max_subscribers = max_subscribers;
        this.needs_equipment = needs_equipment;
        this.work_type = work_type;
        this.price = price;
        insertWorkPlan(createWPID(),plan_name,max_subscribers,needs_equipment,work_type,price);
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
    
    public static int createWPID(){
        Random r1 = new Random();
        int q1 = r1.nextInt(9998) + 1;
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select WPID from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(q1==results.getInt("WPID")){
                    int a = createWPID();
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
    
    
    public static int planNameToWPID(String plan_name){
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select PLAN_NAME from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(plan_name.equalsIgnoreCase(results.getString("PLAN_NAME"))){
                    return results.getInt("WPID");
                }
            }
            results.close();
            stmt.close();
            conn.commit();
            conn.close();
            return 0;
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
            return 0;
        }
    }
    
    private static void insertWorkPlan(int WPID, String plan_name, int max_subscribers, Equipment needs_equipment, WorkoutTypes work_type, double price)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + WPID + ",'" + plan_name + "'," + max_subscribers + ",'" + needs_equipment.getEquip_name() + "','" + work_type.getType() + "'," + price + ")");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }

    public int getMax_subscribers() {
        return max_subscribers;
    }

    public void setMax_subscribers(int max_subscribers) {
        this.max_subscribers = max_subscribers;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public Equipment getNeeds_equipment() {
        return needs_equipment;
    }

    public void setNeeds_equipment(Equipment needs_equipment) {
        this.needs_equipment = needs_equipment;
    }

    public WorkoutTypes getWork_type() {
        return work_type;
    }

    public void setWork_type(WorkoutTypes work_type) {
        this.work_type = work_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
