package gymsym;

import gymsym.leaves.AcType;
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
public class Account {
    
    private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
    private static String tableName = "ACCOUNT";
    private static Connection conn = null;
    private static Statement stmt = null;
    private String username,password,email;
    private String opened;
    private AccountState state;
    private AcType account_type;
    private int ACID;
    
    Account(String username,String password,String email,String opened,AccountState state, AcType account_type){
        this.username = username;
        this.password = password;
        this.email = email;
        this.opened = opened;
        this.state = state;
        this.account_type = account_type;
        insertAccount(createACID(),username,password,email,opened,state,account_type);
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
    
    public static int createACID(){
        Random r1 = new Random();
        int q1 = r1.nextInt(9998) + 1;
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select ACID from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(q1==results.getInt(1)){
                    int a = createACID();
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
    
    public static int usernameToACID(String username){
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select ACID,USERNAME from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(username.equalsIgnoreCase(results.getString(2))){
                    System.out.println(results.getInt("ACID"));
                    return results.getInt("ACID");
                }
            }
            results.close();
            stmt.close();
            conn.commit();
            conn.close();
            return 404;
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
            return 001;
        }
    }
    
    public static boolean validUsername(String username){
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select USERNAME from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                if(username.equalsIgnoreCase(results.getString("USERNAME"))){
                    return false;
                }
            }
            results.close();
            stmt.close();
            conn.commit();
            conn.close();
            return true;
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
            return false;
        }
    }
    
    private static void insertAccount(int ACID, String username, String password, String email, String opened, AccountState state, AcType account_type)
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" + ACID + ",'" + username + "','" + password + "','" + email + "','" + opened + "','" + state.getState() + "','" + account_type.getType() + "')");
            stmt.close();
            conn.commit();
            conn.close();
        }
        catch (SQLException sqlExcept)
        {
            System.out.println(sqlExcept);
        }
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public AcType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AcType account_type) {
        this.account_type = account_type;
    }
    
}
