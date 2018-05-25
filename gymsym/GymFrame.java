/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GymFrame.java
 *
 * Created on Oct 11, 2017, 2:52:06 PM
 */
package gymsym;

import static gymsym.Account.createACID;
import static gymsym.User.createUSID;
import gymsym.leaves.AcType;
import gymsym.leaves.Equipment;
import gymsym.leaves.Physic;
import gymsym.leaves.WorkoutTypes;
import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class GymFrame extends javax.swing.JFrame {

    /** Creates new form GymFrame */

        private static String dbURL = "jdbc:derby://localhost:1527/GymSymDB;create=true;user=doctorp;password=201727";
        private static String tableName = "USERS";
        private static Connection conn = null;
        private static Statement stmt = null;
        JPasswordField p1 = new JPasswordField("password",20);
        static FileWriter fw;
        double base_price = 0.0;
        double price;
        Account ac1;
        User us1;
        Subscriber sb1;
        Employee em1;
        Trainer tr1;
        private int currentUserACID;
        private int currentCreationWPID;
               
                static GymFrame ass1 = new GymFrame();
                DefaultListModel dlm1 = new DefaultListModel();
        
                WorkoutTypes wt1 = new WorkoutTypes("Muscle Building");
                WorkoutTypes wt2 = new WorkoutTypes("Fat Loss");
                WorkoutTypes wt3 = new WorkoutTypes("Increase Strength");
                WorkoutTypes wt4 = new WorkoutTypes("Beginner");
                
                Physic ph1 = new Physic("Beginner");
                Physic ph2 = new Physic("Amatuer");
                Physic ph3 = new Physic("Experienced");
                Physic ph4 = new Physic("Athlete");
                Physic ph5 = new Physic("Bodybuilding");
                
                AccountState as1 = new AccountState("Active");
                AccountState as2 = new AccountState("Frozen");
                AccountState as3 = new AccountState("Closed");
                
                AcType at1 = new AcType("Subscriber");
                AcType at2 = new AcType("Employee");
                AcType at3 = new AcType("Trainer");
                
                Equipment eq1 = new Equipment("Threadmills");
                Equipment eq2 = new Equipment("Ellipticals");
                Equipment eq3 = new Equipment("Exercise Bikes");
                Equipment eq4 = new Equipment("Rowers");
                Equipment eq5 = new Equipment("Treadmill Desks");
                Equipment eq6 = new Equipment("Bowflex TreadClimber");
                
                String[] t1_columns = {"hours","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                Object[][] t1_data = {
                    {"09:00",null,null,null,null,null,null,null},
                    {"10:00",null,null,null,null,null,null,null},
                    {"11:00",null,null,null,null,null,null,null},
                    {"12:00",null,null,null,null,null,null,null},
                    {"13:00",null,null,null,null,null,null,null},
                    {"14:00",null,null,null,null,null,null,null},
                    {"15:00",null,null,null,null,null,null,null},
                    {"16:00",null,null,null,null,null,null,null},
                    {"17:00",null,null,null,null,null,null,null},
                    {"18:00",null,null,null,null,null,null,null},
                    {"19:00",null,null,null,null,null,null,null},
                    {"20:00",null,null,null,null,null,null,null},
                };
                JTable tt1 = new JTable(t1_data,t1_columns);
                
        
        //ImageIcon cards1 = new ImageIcon("./src/lib/card-icons.png");
        //Image scaleImage = cards1.getImage().getScaledInstance(10,10,Image.SCALE_DEFAULT);
        
    public GymFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame_Register = new javax.swing.JFrame();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        REG_Name = new javax.swing.JTextField();
        REG_Surname = new javax.swing.JTextField();
        REG_Username = new javax.swing.JTextField();
        REG_Password = new javax.swing.JPasswordField();
        REG_ConfirmPass = new javax.swing.JPasswordField();
        REG_Email = new javax.swing.JTextField();
        BUT_RegConfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Registration_Message = new javax.swing.JLabel();
        BUT_PriceWindow = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        REG_Phone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        REG_Address = new javax.swing.JTextField();
        CB_Phys = new javax.swing.JComboBox<>();
        Register_Confirm = new javax.swing.JDialog();
        REG_windowConfirm = new javax.swing.JLabel();
        BUT_OK = new javax.swing.JButton();
        FRA_Admin = new javax.swing.JFrame();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        FRA_PriceWindow = new javax.swing.JFrame();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SP_Total = new javax.swing.JSpinner();
        LB_Time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LB_TotalPrice = new javax.swing.JLabel();
        BUT_Pay = new javax.swing.JButton();
        syndromi = new javax.swing.ButtonGroup();
        FRA_Pay = new javax.swing.JFrame();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        BUT_FullBuy = new javax.swing.JButton();
        FRA_AccountWindow = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        PROF_Name = new javax.swing.JLabel();
        PROF_Surname = new javax.swing.JLabel();
        PROF_Address = new javax.swing.JLabel();
        PROF_Phone = new javax.swing.JLabel();
        PROF_Username = new javax.swing.JLabel();
        PROF_Email = new javax.swing.JLabel();
        PROF_Date = new javax.swing.JLabel();
        PROF_NameS = new javax.swing.JLabel();
        PROF_SurnameS = new javax.swing.JLabel();
        PROF_AddressS = new javax.swing.JLabel();
        PROF_PhoneS = new javax.swing.JLabel();
        PROF_UsernameS = new javax.swing.JLabel();
        PROF_EmailS = new javax.swing.JLabel();
        PROF_DateS = new javax.swing.JLabel();
        BUT_Logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        FRA_Employee = new javax.swing.JFrame();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BUT_CreateWI = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        LB_EmployeeID = new javax.swing.JLabel();
        LB_EmployeeName = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        FRA_CreateWI = new javax.swing.JFrame();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        CB_HoursWIC = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        CB_RoomWIC = new javax.swing.JComboBox<>();
        CH_Mo = new javax.swing.JCheckBox();
        CH_Tu = new javax.swing.JCheckBox();
        CH_We = new javax.swing.JCheckBox();
        CH_Th = new javax.swing.JCheckBox();
        CH_Fr = new javax.swing.JCheckBox();
        CH_Sa = new javax.swing.JCheckBox();
        CH_Su = new javax.swing.JCheckBox();
        jLabel61 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        LB_WICMessage = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        CB_PlanWIC = new javax.swing.JComboBox<>();
        FRA_Trainer = new javax.swing.JFrame();
        jButton6 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        LB_TrainerID = new javax.swing.JLabel();
        LB_TrainerName = new javax.swing.JLabel();
        LB_Speciality = new javax.swing.JLabel();
        FRA_CreateWP = new javax.swing.JFrame();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TF_PlanName = new javax.swing.JTextField();
        SP_MaxSubscribers = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_Equip = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        CB_WorkoutPlanCreator = new javax.swing.JComboBox<>();
        SP_Price = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        LB_WPCMessage = new javax.swing.JLabel();
        FRA_InsertTrainer = new javax.swing.JFrame();
        jLabel31 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        BUT_TrainerReg = new javax.swing.JButton();
        TF_SurnameTR = new javax.swing.JTextField();
        TF_NameTR = new javax.swing.JTextField();
        TF_PhoneTR = new javax.swing.JTextField();
        TF_AddressTR = new javax.swing.JTextField();
        TF_UsernameTR = new javax.swing.JTextField();
        TF_SpecialityTR = new javax.swing.JTextField();
        PF_PassTR = new javax.swing.JPasswordField();
        PF_PassConfirmTR = new javax.swing.JPasswordField();
        jLabel40 = new javax.swing.JLabel();
        TF_EmailTR = new javax.swing.JTextField();
        LB_RegTR = new javax.swing.JLabel();
        FRA_InsertEmployee = new javax.swing.JFrame();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        BUT_EmployeeRegistration = new javax.swing.JButton();
        TF_NameEM = new javax.swing.JTextField();
        TF_SurnameEM = new javax.swing.JTextField();
        TF_PhoneEM = new javax.swing.JTextField();
        TF_AddressEM = new javax.swing.JTextField();
        TF_UsernameEM = new javax.swing.JTextField();
        TF_PositionEM = new javax.swing.JTextField();
        PF_PassEM = new javax.swing.JPasswordField();
        PF_PassConfirmEM = new javax.swing.JPasswordField();
        jLabel51 = new javax.swing.JLabel();
        TF_EmailEM = new javax.swing.JTextField();
        LB_EMMessage = new javax.swing.JLabel();
        FRA_RoomCreator = new javax.swing.JFrame();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        BUT_RoomC = new javax.swing.JButton();
        TF_RoomNameRC = new javax.swing.JTextField();
        SP_CapacityRC = new javax.swing.JSpinner();
        jSeparator12 = new javax.swing.JSeparator();
        CH_ThreadmillsRC = new javax.swing.JCheckBox();
        CH_EllipticalsRC = new javax.swing.JCheckBox();
        CH_ExerciseBikesRC = new javax.swing.JCheckBox();
        CH_RowersRC = new javax.swing.JCheckBox();
        CH_TreadmillDesksRC = new javax.swing.JCheckBox();
        CH_BowflexTreadClimberRC = new javax.swing.JCheckBox();
        LB_RCMessage = new javax.swing.JLabel();
        FRA_CreateS = new javax.swing.JFrame();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        CB_WorkoutInstancesSE = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        LB_WorkoutTypeSE = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        LB_DurationSE = new javax.swing.JLabel();
        LB_HoursSE = new javax.swing.JLabel();
        LB_RoomNameSE = new javax.swing.JLabel();
        LB_PriceSE = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        LB_SEMessage = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        LB_DaysSE = new javax.swing.JLabel();
        GymSymDBPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("GymSymDBPU").createEntityManager();
        instance_1Query = java.beans.Beans.isDesignTime() ? null : GymSymDBPUEntityManager.createQuery("SELECT i FROM Instance_1 i");
        instance_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : instance_1Query.getResultList();
        account_1Query = java.beans.Beans.isDesignTime() ? null : GymSymDBPUEntityManager.createQuery("SELECT a FROM Account_1 a");
        account_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : account_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        GymSum = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        TF_Username = new javax.swing.JTextField();
        BUT_Login = new javax.swing.JButton();
        BUT_Cancel = new javax.swing.JButton();
        BUT_FPass = new javax.swing.JButton();
        LB_Message = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BUT_Register = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        jFrame_Register.setAlwaysOnTop(true);
        jFrame_Register.setMinimumSize(new java.awt.Dimension(553, 560));
        jFrame_Register.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setText("Όνομα:");

        jLabel3.setText("Επίθετο:");

        jLabel4.setText("Username:");

        jLabel5.setText("Password:");

        jLabel6.setText("Confirm Password:");

        jLabel7.setText("Email:");

        REG_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REG_NameActionPerformed(evt);
            }
        });

        REG_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REG_EmailActionPerformed(evt);
            }
        });

        BUT_RegConfirm.setText("Register");
        BUT_RegConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_RegConfirmActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BUT_PriceWindow.setText("Υπολογισμός Κόστους");
        BUT_PriceWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_PriceWindowActionPerformed(evt);
            }
        });

        jLabel20.setText("Τηλέφωνο:");

        REG_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REG_PhoneActionPerformed(evt);
            }
        });

        jLabel21.setText("Διεύθυνση:");

        jLabel22.setText("Φυσική κατάσταση:");

        javax.swing.GroupLayout jFrame_RegisterLayout = new javax.swing.GroupLayout(jFrame_Register.getContentPane());
        jFrame_Register.getContentPane().setLayout(jFrame_RegisterLayout);
        jFrame_RegisterLayout.setHorizontalGroup(
            jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createSequentialGroup()
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame_RegisterLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20))
                            .addGroup(jFrame_RegisterLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(1, 1, 1)))
                        .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame_RegisterLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(REG_Name)
                                    .addComponent(REG_Surname)
                                    .addComponent(REG_Username)
                                    .addComponent(REG_Password)
                                    .addComponent(REG_ConfirmPass)
                                    .addComponent(REG_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(REG_Phone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(REG_Address)
                                    .addComponent(CB_Phys, 0, 206, Short.MAX_VALUE))))))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createSequentialGroup()
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame_RegisterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registration_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame_RegisterLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BUT_PriceWindow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BUT_RegConfirm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        jFrame_RegisterLayout.setVerticalGroup(
            jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(REG_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(REG_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(REG_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(REG_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(REG_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(REG_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(CB_Phys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Registration_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BUT_PriceWindow, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BUT_RegConfirm)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        Register_Confirm.setAlwaysOnTop(true);
        Register_Confirm.setMinimumSize(new java.awt.Dimension(412, 130));

        REG_windowConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BUT_OK.setText("OK");
        BUT_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Register_ConfirmLayout = new javax.swing.GroupLayout(Register_Confirm.getContentPane());
        Register_Confirm.getContentPane().setLayout(Register_ConfirmLayout);
        Register_ConfirmLayout.setHorizontalGroup(
            Register_ConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Register_ConfirmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUT_OK)
                .addGap(178, 178, 178))
            .addGroup(Register_ConfirmLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(REG_windowConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        Register_ConfirmLayout.setVerticalGroup(
            Register_ConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_ConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(REG_windowConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUT_OK)
                .addContainerGap())
        );

        FRA_Admin.setMinimumSize(new java.awt.Dimension(430, 300));
        FRA_Admin.setResizable(false);
        FRA_Admin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FRA_AdminWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_AdminWindowClosing(evt);
            }
        });

        jLabel12.setText("Administration Panel");

        jButton1.setText("Insert Subscriber");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Insert Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Insert Trainer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setText("Create Workout Instance");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Create Workout Plan");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Add Room");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FRA_AdminLayout = new javax.swing.GroupLayout(FRA_Admin.getContentPane());
        FRA_Admin.getContentPane().setLayout(FRA_AdminLayout);
        FRA_AdminLayout.setHorizontalGroup(
            FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_AdminLayout.createSequentialGroup()
                .addGroup(FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_AdminLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(FRA_AdminLayout.createSequentialGroup()
                        .addGroup(FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_AdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(FRA_AdminLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel12))
                            .addGroup(FRA_AdminLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(FRA_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FRA_AdminLayout.setVerticalGroup(
            FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        FRA_PriceWindow.setAlwaysOnTop(true);
        FRA_PriceWindow.setMinimumSize(new java.awt.Dimension(420, 220));
        FRA_PriceWindow.setResizable(false);

        syndromi.add(jRadioButton1);
        jRadioButton1.setText("Ετήσια Συνδρομή");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        syndromi.add(jRadioButton2);
        jRadioButton2.setText("Εξαμηνιαία Συνδρομή");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        syndromi.add(jRadioButton3);
        jRadioButton3.setText("Μηνιαία Συνδρομή");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("200€");

        jLabel9.setText("140€");

        jLabel10.setText("25€");

        SP_Total.setValue(1);
        SP_Total.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SP_TotalStateChanged(evt);
            }
        });

        LB_Time.setText("Σύνολο");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Συνολικό Κόστος:");

        LB_TotalPrice.setText("0,0€");

        BUT_Pay.setText("Πληρωμή");
        BUT_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_PayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FRA_PriceWindowLayout = new javax.swing.GroupLayout(FRA_PriceWindow.getContentPane());
        FRA_PriceWindow.getContentPane().setLayout(FRA_PriceWindowLayout);
        FRA_PriceWindowLayout.setHorizontalGroup(
            FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LB_Time)))
                .addGap(32, 32, 32)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                        .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel11))
                            .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                                .addComponent(SP_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(BUT_Pay)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB_TotalPrice)
                        .addGap(78, 78, 78))))
        );
        FRA_PriceWindowLayout.setVerticalGroup(
            FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_PriceWindowLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel9)
                    .addComponent(LB_TotalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_PriceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SP_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Time)
                    .addComponent(BUT_Pay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FRA_Pay.setAlwaysOnTop(true);
        FRA_Pay.setMinimumSize(new java.awt.Dimension(408, 480));
        FRA_Pay.setResizable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Secure Payment Info");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymsym/lib/card-icons.png"))); // NOI18N

        jLabel15.setText("Όνομα (όπως εμφανίζεται στη κάρτα)");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Αριθμός Κάρτας (χωρίς παύλες ή κενά)");

        jLabel17.setText("Ημερομηνία λήξης");

        jLabel18.setText("CVV");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymsym/lib/cvv-graphic.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        jRadioButton4.setText("Έχω διαβάσει και αποδέχομαι τους όρους χρήσης.");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        BUT_FullBuy.setText("Ολοκλήρωση πληρωμής");
        BUT_FullBuy.setEnabled(false);
        BUT_FullBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_FullBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FRA_PayLayout = new javax.swing.GroupLayout(FRA_Pay.getContentPane());
        FRA_Pay.getContentPane().setLayout(FRA_PayLayout);
        FRA_PayLayout.setHorizontalGroup(
            FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_PayLayout.createSequentialGroup()
                .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_PayLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel13))
                    .addGroup(FRA_PayLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(jLabel15)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addComponent(jTextField2))
                            .addGroup(FRA_PayLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_PayLayout.createSequentialGroup()
                                .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addComponent(jRadioButton4))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_PayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_PayLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_PayLayout.createSequentialGroup()
                        .addComponent(BUT_FullBuy)
                        .addGap(183, 183, 183))))
        );
        FRA_PayLayout.setVerticalGroup(
            FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_PayLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRA_PayLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FRA_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(BUT_FullBuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.addItem("01 - January");
        jComboBox1.addItem("01 - February");
        jComboBox1.addItem("01 - March");
        jComboBox1.addItem("01 - April");
        jComboBox1.addItem("01 - May");
        jComboBox1.addItem("01 - June");
        jComboBox1.addItem("01 - July");
        jComboBox1.addItem("01 - August");
        jComboBox1.addItem("01 - September");
        jComboBox1.addItem("01 - October");
        jComboBox1.addItem("01 - November");
        jComboBox1.addItem("01 - December");
        jComboBox2.addItem("2018");jComboBox2.addItem("2019");
        jComboBox2.addItem("2020");jComboBox2.addItem("2021");
        jComboBox2.addItem("2022");jComboBox2.addItem("2023");
        jComboBox2.addItem("2024");jComboBox2.addItem("2025");
        jComboBox2.addItem("2026");jComboBox2.addItem("2027");

        FRA_AccountWindow.setMinimumSize(new java.awt.Dimension(622, 360));
        FRA_AccountWindow.setPreferredSize(new java.awt.Dimension(622, 360));
        FRA_AccountWindow.setResizable(false);
        FRA_AccountWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_AccountWindowWindowClosing(evt);
            }
        });

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(622, 331));

        jPanel3.setMinimumSize(new java.awt.Dimension(617, 303));
        jPanel3.setPreferredSize(new java.awt.Dimension(617, 303));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymsym/lib/ico-fitness.png"))); // NOI18N

        PROF_Name.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Name.setText("Όνομα:");

        PROF_Surname.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Surname.setText("Επίθετο:");

        PROF_Address.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Address.setText("Διεύθυνση:");

        PROF_Phone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Phone.setText("Τηλέφωνο:");

        PROF_Username.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Username.setText("Username:");

        PROF_Email.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Email.setText("Email:");

        PROF_Date.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_Date.setText("Date:");

        PROF_NameS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_NameS.setText("Όνομα:");

        PROF_SurnameS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_SurnameS.setText("Όνομα:");

        PROF_AddressS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_AddressS.setText("Όνομα:");

        PROF_PhoneS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_PhoneS.setText("Όνομα:");

        PROF_UsernameS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_UsernameS.setText("Όνομα:");

        PROF_EmailS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_EmailS.setText("Όνομα:");

        PROF_DateS.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        PROF_DateS.setText("Όνομα:");

        BUT_Logout.setText("Logout");
        BUT_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PROF_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PROF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PROF_DateS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PROF_EmailS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(PROF_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PROF_Surname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PROF_Address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(PROF_Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PROF_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PROF_PhoneS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PROF_AddressS, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                            .addComponent(PROF_SurnameS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PROF_NameS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(PROF_UsernameS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BUT_Logout)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PROF_Name)
                            .addComponent(PROF_NameS))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PROF_Surname)
                            .addComponent(PROF_SurnameS))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PROF_Address)
                            .addComponent(PROF_AddressS))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PROF_Phone)
                            .addComponent(PROF_PhoneS))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROF_Username)
                    .addComponent(PROF_UsernameS))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROF_Email)
                    .addComponent(PROF_EmailS))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PROF_Date)
                    .addComponent(PROF_DateS))
                .addGap(33, 33, 33)
                .addComponent(BUT_Logout)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Profile", jPanel3);

        jButton14.setText("Add/Edit Schedule");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButton14)
                .addGap(73, 73, 73))
        );

        jTabbedPane2.addTab("Schedule", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout FRA_AccountWindowLayout = new javax.swing.GroupLayout(FRA_AccountWindow.getContentPane());
        FRA_AccountWindow.getContentPane().setLayout(FRA_AccountWindowLayout);
        FRA_AccountWindowLayout.setHorizontalGroup(
            FRA_AccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FRA_AccountWindowLayout.setVerticalGroup(
            FRA_AccountWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        FRA_Employee.setMinimumSize(new java.awt.Dimension(970, 580));
        FRA_Employee.setResizable(false);
        FRA_Employee.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_EmployeeWindowClosing(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymsym/lib/ico-fitness.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ώρες", "Δευτέρα", "Τρίτη", "Τετάρτη", "Πέμπτη", "Παρασκευή", "Σάββατο", "Κυριακή"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        BUT_CreateWI.setText("Create Workout Instance");
        BUT_CreateWI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_CreateWIActionPerformed(evt);
            }
        });

        jButton8.setText("Logout");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel52.setText("Employee ID:");

        jLabel53.setText("Employee Name:");

        LB_EmployeeID.setText("jLabel54");

        LB_EmployeeName.setText("jLabel55");

        jButton9.setText("Add Room");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FRA_EmployeeLayout = new javax.swing.GroupLayout(FRA_Employee.getContentPane());
        FRA_Employee.getContentPane().setLayout(FRA_EmployeeLayout);
        FRA_EmployeeLayout.setHorizontalGroup(
            FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_EmployeeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BUT_CreateWI))
                    .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                                .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FRA_EmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LB_EmployeeName))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FRA_EmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(60, 60, 60)
                                        .addComponent(LB_EmployeeID)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        FRA_EmployeeLayout.setVerticalGroup(
            FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(FRA_EmployeeLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(LB_EmployeeID))
                        .addGap(18, 18, 18)
                        .addGroup(FRA_EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(LB_EmployeeName)))
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUT_CreateWI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FRA_CreateWI.setMinimumSize(new java.awt.Dimension(430, 450));
        FRA_CreateWI.setResizable(false);
        FRA_CreateWI.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_CreateWIWindowClosing(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Workout Instance Creator");

        jLabel58.setText("Hours:");

        CB_HoursWIC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));

        jLabel59.setText("Max Capacity:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(5, 5, 20, 1));

        jLabel60.setText("Room:");

        CH_Mo.setText("Monday");
        CH_Mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH_MoActionPerformed(evt);
            }
        });

        CH_Tu.setText("Tuesday");
        CH_Tu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH_TuActionPerformed(evt);
            }
        });

        CH_We.setText("Wednesday");

        CH_Th.setText("Thursday");

        CH_Fr.setText("Friday");

        CH_Sa.setText("Saturday");

        CH_Su.setText("Sunday");

        jLabel61.setText("Duration(minutes):");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(60, 30, 150, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Schedule");

        jButton10.setText("Create");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel67.setText("Plan:");

        javax.swing.GroupLayout FRA_CreateWILayout = new javax.swing.GroupLayout(FRA_CreateWI.getContentPane());
        FRA_CreateWI.getContentPane().setLayout(FRA_CreateWILayout);
        FRA_CreateWILayout.setHorizontalGroup(
            FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_CreateWILayout.createSequentialGroup()
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel57))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(LB_WICMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton10))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_CreateWILayout.createSequentialGroup()
                                .addComponent(CH_Mo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH_Tu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH_We)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH_Th)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH_Fr))
                            .addGroup(FRA_CreateWILayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(CH_Sa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH_Su))))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel62)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(FRA_CreateWILayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CB_PlanWIC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CB_RoomWIC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CB_HoursWIC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FRA_CreateWILayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        FRA_CreateWILayout.setVerticalGroup(
            FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_CreateWILayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(CB_PlanWIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(CB_HoursWIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(CB_RoomWIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH_Mo)
                    .addComponent(CH_Tu)
                    .addComponent(CH_We)
                    .addComponent(CH_Th)
                    .addComponent(CH_Fr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FRA_CreateWILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH_Sa)
                    .addComponent(CH_Su))
                .addGap(18, 18, 18)
                .addComponent(LB_WICMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );

        FRA_Trainer.setMinimumSize(new java.awt.Dimension(400, 400));
        FRA_Trainer.setResizable(false);
        FRA_Trainer.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_TrainerWindowClosing(evt);
            }
        });

        jButton6.setText("Create Workout Plan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymsym/lib/personal-trainer.png"))); // NOI18N
        jLabel54.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel55.setText("Trainer Name:");

        jLabel56.setText("Trainer ID:");

        LB_TrainerID.setText("jLabel57");

        LB_TrainerName.setText("jLabel57");

        LB_Speciality.setText("jLabel57");

        javax.swing.GroupLayout FRA_TrainerLayout = new javax.swing.GroupLayout(FRA_Trainer.getContentPane());
        FRA_Trainer.getContentPane().setLayout(FRA_TrainerLayout);
        FRA_TrainerLayout.setHorizontalGroup(
            FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8)
            .addGroup(FRA_TrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_TrainerLayout.createSequentialGroup()
                        .addComponent(LB_Speciality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(FRA_TrainerLayout.createSequentialGroup()
                        .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_TrainerID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_TrainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FRA_TrainerLayout.setVerticalGroup(
            FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_TrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FRA_TrainerLayout.createSequentialGroup()
                        .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(LB_TrainerID))
                        .addGap(18, 18, 18)
                        .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(LB_TrainerName))
                        .addGap(21, 21, 21)
                        .addGroup(FRA_TrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(LB_Speciality))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        FRA_CreateWP.setMinimumSize(new java.awt.Dimension(420, 450));
        FRA_CreateWP.setResizable(false);
        FRA_CreateWP.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_CreateWPWindowClosing(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Workout Plan Creator");

        jLabel26.setText("Plan Name:");

        jLabel27.setText("Max Subscribers:");

        jLabel28.setText("Equipment Needed:");

        jLabel29.setText("Workout Type:");

        jLabel30.setText("Price:");

        TF_PlanName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PlanNameActionPerformed(evt);
            }
        });

        SP_MaxSubscribers.setModel(new javax.swing.SpinnerNumberModel(5, 5, 20, 1));

        JL_Equip.setModel(dlm1);
        JL_Equip.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(JL_Equip);

        jButton7.setText("Create");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        CB_WorkoutPlanCreator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { wt1.getType(), wt2.getType(), wt3.getType(), wt4.getType()}));
        CB_WorkoutPlanCreator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_WorkoutPlanCreatorActionPerformed(evt);
            }
        });

        SP_Price.setModel(new javax.swing.SpinnerNumberModel(5.0d, 5.0d, 25.0d, 0.5d));

        jLabel41.setText("€");

        javax.swing.GroupLayout FRA_CreateWPLayout = new javax.swing.GroupLayout(FRA_CreateWP.getContentPane());
        FRA_CreateWP.getContentPane().setLayout(FRA_CreateWPLayout);
        FRA_CreateWPLayout.setHorizontalGroup(
            FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateWPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(129, 129, 129))
            .addGroup(FRA_CreateWPLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateWPLayout.createSequentialGroup()
                        .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(68, 68, 68)
                        .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_PlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SP_MaxSubscribers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateWPLayout.createSequentialGroup()
                        .addComponent(LB_WPCMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(FRA_CreateWPLayout.createSequentialGroup()
                        .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FRA_CreateWPLayout.createSequentialGroup()
                                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FRA_CreateWPLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateWPLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(125, 125, 125)))
                                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CB_WorkoutPlanCreator, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SP_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        FRA_CreateWPLayout.setVerticalGroup(
            FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_CreateWPLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TF_PlanName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(SP_MaxSubscribers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(CB_WorkoutPlanCreator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(SP_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(FRA_CreateWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(LB_WPCMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FRA_InsertTrainer.setMinimumSize(new java.awt.Dimension(420, 480));
        FRA_InsertTrainer.setResizable(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Trainer Registration");

        jLabel32.setText("Name:");

        jLabel33.setText("Surname:");

        jLabel34.setText("Phone:");

        jLabel35.setText("Address:");

        jLabel36.setText("Username:");

        jLabel37.setText("Password:");

        jLabel38.setText("Password Confirm:");

        jLabel39.setText("Speciality:");

        BUT_TrainerReg.setText("Register");
        BUT_TrainerReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_TrainerRegActionPerformed(evt);
            }
        });

        TF_SurnameTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_SurnameTRActionPerformed(evt);
            }
        });

        TF_NameTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_NameTRActionPerformed(evt);
            }
        });

        TF_PhoneTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PhoneTRActionPerformed(evt);
            }
        });

        TF_AddressTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_AddressTRActionPerformed(evt);
            }
        });

        TF_UsernameTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_UsernameTRActionPerformed(evt);
            }
        });

        TF_SpecialityTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_SpecialityTRActionPerformed(evt);
            }
        });

        jLabel40.setText("Email:");

        TF_EmailTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_EmailTRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FRA_InsertTrainerLayout = new javax.swing.GroupLayout(FRA_InsertTrainer.getContentPane());
        FRA_InsertTrainer.getContentPane().setLayout(FRA_InsertTrainerLayout);
        FRA_InsertTrainerLayout.setHorizontalGroup(
            FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                        .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel31))
                            .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_NameTR, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_SurnameTR, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_PhoneTR, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_AddressTR, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertTrainerLayout.createSequentialGroup()
                                        .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel40))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                        .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TF_EmailTR, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TF_UsernameTR, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(PF_PassTR)
                                                .addComponent(PF_PassConfirmTR))
                                            .addComponent(TF_SpecialityTR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(16, 16, 16))
                    .addGroup(FRA_InsertTrainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LB_RegTR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BUT_TrainerReg)))
                .addContainerGap())
        );
        FRA_InsertTrainerLayout.setVerticalGroup(
            FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertTrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(TF_NameTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(TF_SurnameTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(TF_PhoneTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TF_AddressTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TF_UsernameTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(PF_PassTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(PF_PassConfirmTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(TF_EmailTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TF_SpecialityTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(FRA_InsertTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BUT_TrainerReg)
                    .addComponent(LB_RegTR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        FRA_InsertEmployee.setMinimumSize(new java.awt.Dimension(400, 480));
        FRA_InsertEmployee.setResizable(false);
        FRA_InsertEmployee.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FRA_InsertEmployeeWindowClosing(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Employee Registration");

        jLabel43.setText("Name:");

        jLabel44.setText("Surname:");

        jLabel45.setText("Phone:");

        jLabel46.setText("Address:");

        jLabel47.setText("Username:");

        jLabel48.setText("Password:");

        jLabel49.setText("Password Confirm:");

        jLabel50.setText("Position:");

        BUT_EmployeeRegistration.setText("Register");
        BUT_EmployeeRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_EmployeeRegistrationActionPerformed(evt);
            }
        });

        jLabel51.setText("Email:");

        javax.swing.GroupLayout FRA_InsertEmployeeLayout = new javax.swing.GroupLayout(FRA_InsertEmployee.getContentPane());
        FRA_InsertEmployee.getContentPane().setLayout(FRA_InsertEmployeeLayout);
        FRA_InsertEmployeeLayout.setHorizontalGroup(
            FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                        .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_PositionEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_NameEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_SurnameEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_PhoneEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_AddressEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_UsernameEM, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(PF_PassEM)
                                    .addComponent(PF_PassConfirmEM)))
                            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_EmailEM, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertEmployeeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_InsertEmployeeLayout.createSequentialGroup()
                                .addComponent(LB_EMMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BUT_EmployeeRegistration)
                                .addContainerGap())))))
        );
        FRA_InsertEmployeeLayout.setVerticalGroup(
            FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_InsertEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(TF_NameEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(TF_SurnameEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(TF_PhoneEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(TF_AddressEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(TF_EmailEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(TF_UsernameEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(PF_PassEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(PF_PassConfirmEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(TF_PositionEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(FRA_InsertEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUT_EmployeeRegistration)
                    .addComponent(LB_EMMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FRA_RoomCreator.setMinimumSize(new java.awt.Dimension(420, 350));
        FRA_RoomCreator.setResizable(false);

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Room Creator");

        jLabel64.setText("Room Number:");

        jLabel65.setText("Capacity:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("Equipment");

        BUT_RoomC.setText("Create");
        BUT_RoomC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_RoomCActionPerformed(evt);
            }
        });

        SP_CapacityRC.setModel(new javax.swing.SpinnerNumberModel(15, 10, 25, 1));

        CH_ThreadmillsRC.setText("Threadmills");
        CH_ThreadmillsRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CH_ThreadmillsRCActionPerformed(evt);
            }
        });

        CH_EllipticalsRC.setText("Ellipticals");

        CH_ExerciseBikesRC.setText("Exercise Bikes");

        CH_RowersRC.setText("Rowers");

        CH_TreadmillDesksRC.setText("Treadmill Desks");

        CH_BowflexTreadClimberRC.setText("Bowflex TreadClimber");

        javax.swing.GroupLayout FRA_RoomCreatorLayout = new javax.swing.GroupLayout(FRA_RoomCreator.getContentPane());
        FRA_RoomCreator.getContentPane().setLayout(FRA_RoomCreatorLayout);
        FRA_RoomCreatorLayout.setHorizontalGroup(
            FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_RoomCreatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_RoomCreatorLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_RoomCreatorLayout.createSequentialGroup()
                        .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(BUT_RoomC))
                        .addGap(163, 163, 163))))
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TF_RoomNameRC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SP_CapacityRC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_RoomCreatorLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_RCMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CH_ThreadmillsRC)
                                    .addComponent(CH_ExerciseBikesRC)
                                    .addComponent(CH_EllipticalsRC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CH_RowersRC)
                                    .addComponent(CH_TreadmillDesksRC)
                                    .addComponent(CH_BowflexTreadClimberRC))))
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        FRA_RoomCreatorLayout.setVerticalGroup(
            FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRA_RoomCreatorLayout.createSequentialGroup()
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel64))
                    .addComponent(TF_RoomNameRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(SP_CapacityRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addGap(14, 14, 14)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH_ThreadmillsRC)
                    .addComponent(CH_RowersRC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH_EllipticalsRC)
                    .addComponent(CH_TreadmillDesksRC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_RoomCreatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CH_ExerciseBikesRC)
                    .addComponent(CH_BowflexTreadClimberRC))
                .addGap(18, 18, 18)
                .addComponent(LB_RCMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUT_RoomC)
                .addContainerGap())
        );

        FRA_CreateS.setMinimumSize(new java.awt.Dimension(400, 420));
        FRA_CreateS.setResizable(false);

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Schedule Editor");

        CB_WorkoutInstancesSE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_WorkoutInstancesSEItemStateChanged(evt);
            }
        });

        jLabel69.setText("Workout Type: ");

        LB_WorkoutTypeSE.setText(":record:");

        jLabel71.setText("Hours:");

        jLabel72.setText("Duration:");

        jLabel73.setText("Room Name:");

        jLabel74.setText("Price:");

        LB_DurationSE.setText(":record:");

        LB_HoursSE.setText(":record:");

        LB_RoomNameSE.setText(":record:");

        LB_PriceSE.setText(":record:");

        jButton15.setText("Add");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        LB_SEMessage.setText("Choose a Workout Instance.");

        jLabel70.setText("€");

        jLabel75.setText("Days:");

        LB_DaysSE.setText(":record:");

        javax.swing.GroupLayout FRA_CreateSLayout = new javax.swing.GroupLayout(FRA_CreateS.getContentPane());
        FRA_CreateS.getContentPane().setLayout(FRA_CreateSLayout);
        FRA_CreateSLayout.setHorizontalGroup(
            FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator13)
            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateSLayout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRA_CreateSLayout.createSequentialGroup()
                                .addComponent(CB_WorkoutInstancesSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))))
                    .addGroup(FRA_CreateSLayout.createSequentialGroup()
                        .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel73)
                                    .addComponent(jLabel74))
                                .addGap(18, 18, 18)
                                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FRA_CreateSLayout.createSequentialGroup()
                                        .addComponent(LB_PriceSE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel70))
                                    .addComponent(LB_RoomNameSE)
                                    .addComponent(LB_DurationSE)
                                    .addComponent(LB_WorkoutTypeSE)
                                    .addComponent(LB_HoursSE)
                                    .addComponent(LB_DaysSE, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))))
            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jButton15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LB_SEMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FRA_CreateSLayout.setVerticalGroup(
            FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRA_CreateSLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(CB_WorkoutInstancesSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel69)
                    .addComponent(LB_WorkoutTypeSE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(LB_HoursSE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(LB_DurationSE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(LB_RoomNameSE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(LB_PriceSE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addGap(18, 18, 18)
                .addGroup(FRA_CreateSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(LB_DaysSE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LB_SEMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(513, 260));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        GymSum.setText("GymSym");

        Username.setText("Username:");

        Password.setText("Password:");

        BUT_Login.setText("Log In");
        BUT_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_LoginActionPerformed(evt);
            }
        });

        BUT_Cancel.setText("Cancel");
        BUT_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_CancelActionPerformed(evt);
            }
        });

        BUT_FPass.setText("Forgot Password");

        BUT_Register.setText("Register");
        BUT_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_RegisterActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BUT_Login)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Username, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Password))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TF_Username)
                                .addComponent(BUT_Cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BUT_FPass, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                        .addComponent(LB_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GymSum)
                        .addGap(90, 90, 90)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(BUT_Register)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GymSum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(TF_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUT_FPass)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUT_Login)
                    .addComponent(BUT_Cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUT_Register))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
        p1.setEchoChar('&');
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void BUT_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_CancelActionPerformed
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(GymFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.exit(0);
    }//GEN-LAST:event_BUT_CancelActionPerformed

    private void BUT_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_RegisterActionPerformed
        jFrame_Register.setVisible(true);
        jFrame_Register.setLocationRelativeTo(null);
    }//GEN-LAST:event_BUT_RegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame_Register.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void REG_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REG_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REG_EmailActionPerformed

    private void REG_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REG_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REG_NameActionPerformed

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
    
    private void getEmployeeInfo(){
        System.out.println(currentUserACID);
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select ACID,USID,SURNAME from USERS WHERE ACID=" + currentUserACID);
            if(results1.next()){
                LB_EmployeeID.setText(results1.getString("USID"));
                LB_EmployeeName.setText(results1.getString("SURNAME"));
            }
            results1.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
        
    }
    
    private void BUT_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_LoginActionPerformed
        char[] pass1 = jPasswordField1.getPassword();
        boolean flag_found = false;
        String temp_username = null;
        String temp_password = new String(pass1);
        
        if(TF_Username.getText().length()<1){
            
            LB_Message.setText("Please type in your username.");
            return;
            
        }
        
        if(temp_password.equalsIgnoreCase("admin") && TF_Username.getText().equals("Admin")){

            LB_Message.setText("Administration Login successful.");
            ass1.setVisible(false);
            FRA_Admin.setVisible(true);
            FRA_Admin.setLocationRelativeTo(null);
            System.out.println("Admin login.");
            return;
        }
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select USERNAME,PASSWORD,ACID,ACCOUNT_TYPE from ACCOUNT");
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next() && !flag_found){
                if(TF_Username.getText().equalsIgnoreCase(results.getString("USERNAME"))){
                    System.out.println("Username found.");
                    if(temp_password.equalsIgnoreCase(results.getString("PASSWORD"))){
                        currentUserACID = results.getInt("ACID");
                        LB_Message.setText("Login successful.");
                        flag_found = true;
                        ass1.setVisible(false);
                        if(results.getString("ACCOUNT_TYPE").equalsIgnoreCase("trainer")){
                            switchWindows(ass1,FRA_Trainer);
                            getTrainerInfo();
                        } else if(results.getString("ACCOUNT_TYPE").equalsIgnoreCase("employee")){
                            switchWindows(ass1,FRA_Employee);
                            getEmployeeInfo();
                        } else {
                            FRA_AccountWindow.setVisible(true);
                            FRA_AccountWindow.setLocationRelativeTo(null);
                            getAccountInfo();
                        }
                    } else {
                        LB_Message.setText("Invalid username or password.");
                    }
                } else {
                    LB_Message.setText("Invalid username or password.");
                }
            }
            results.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
        
        
    }//GEN-LAST:event_BUT_LoginActionPerformed
    
    private void getAccountInfo(){
        System.out.println(currentUserACID);
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select * from ACCOUNT WHERE ACID=" + currentUserACID);
            while(results1.next()){
                PROF_UsernameS.setText(results1.getString("Username"));
                PROF_EmailS.setText(results1.getString("EMAIL"));
                PROF_DateS.setText(results1.getString("DATE"));
            }
            results1.close();
            ResultSet results2 = stmt.executeQuery("select * from USERS WHERE ACID=" + currentUserACID);
            while(results2.next()){
                PROF_NameS.setText(results2.getString("NAME"));
                PROF_SurnameS.setText(results2.getString("SURNAME"));
                PROF_AddressS.setText(results2.getString("ADDRESS"));
                PROF_PhoneS.setText(results2.getString("PHONE"));
            }
            results2.close();
            //TAB_PS.
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
        
    }
    
    private void BUT_RegConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_RegConfirmActionPerformed
        
        Registration_Message.setText("");
        if(REG_Name.getText().length()<1 || REG_Surname.getText().length()<1 || REG_Username.getText().length()<1 || REG_Password.getText().length()<1 || REG_Email.getText().length()<1 || REG_Phone.getText().length()<1 || REG_Address.getText().length()<1){
            Registration_Message.setForeground(Color.red);
            Registration_Message.setText("Please fill in all the fields.");
            return;
        } else if(!Arrays.equals(REG_Password.getPassword(), REG_ConfirmPass.getPassword())){
            Registration_Message.setForeground(Color.red);
            Registration_Message.setText("Passwords are different.");
            return;
        }
        /*
        try{
           
            //int reg_amInt = Integer.parseInt(reg_am);
            //reg_amInt++;
            fw.write("\n =====Customer=====" + "\n Name:\t\t" + REG_Name.getText() + "\n Surname:\t" + REG_Surname.getText() + "\n Username:\t" + REG_Username.getText() + "\n Password:\t" + REG_Password.getText() + "\n Email:\t\t" + REG_Email.getText() + "\n \n");
            jFrame_Register.setVisible(false);
            Register_Confirm.setVisible(true);
            Register_Confirm.setLocationRelativeTo(null);
            REG_windowConfirm.setText("Registration for customer " + REG_Name.getText() + " " + REG_Surname.getText() + "\n has been completed.");
            REG_Name.setText("");
            REG_Surname.setText("");
            REG_Username.setText("");
            REG_Password.setText("");
            REG_ConfirmPass.setText("");
            REG_Email.setText("");
            
        }catch(IOException e1){
            
        }*/
        
        int cbIndex = CB_Phys.getSelectedIndex();
        Physic phys1;
        
        switch (cbIndex) {
            case 0:
                phys1 = ph1;
                break;
            case 1:
                phys1 = ph2;
                break;
            case 2:
                phys1 = ph3;
                break;
            case 3:
                phys1 = ph4;
                break;
            case 4:
                phys1 = ph5;
                break;
            default:
                phys1 = ph1;
                break;
        }
        if(Account.validUsername(REG_Username.getText())){
          
            Date datenow = new Date();
            Calendar cal1 = Calendar.getInstance();
            String dat = String.valueOf(cal1.get(Calendar.YEAR)) + "-"+ datenow.getMonth() + "-" + String.valueOf(cal1.get(Calendar.DAY_OF_MONTH));
            System.out.println(dat);
            Account acc1 = new Account(REG_Username.getText(),REG_Password.getText(),REG_Email.getText(),dat,as1,at1);
            Subscriber s1 = new Subscriber(REG_Name.getText(),REG_Surname.getText(),REG_Phone.getText(),REG_Address.getText(),REG_Username.getText(),REG_Surname.getText(),phys1);
            jFrame_Register.setVisible(false);
            Register_Confirm.setVisible(true);
            Register_Confirm.setLocationRelativeTo(null);
            REG_windowConfirm.setText("Registration for customer " + REG_Name.getText() + " " + REG_Surname.getText() + "\n has been completed.");
            REG_Name.setText("");
            REG_Surname.setText("");
            REG_Username.setText("");
            REG_Password.setText("");
            REG_ConfirmPass.setText("");
            REG_Address.setText("");
            REG_Email.setText("");
            
        } else {
            Registration_Message.setText("Username already exists.");
        }
    }//GEN-LAST:event_BUT_RegConfirmActionPerformed

    private void BUT_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_OKActionPerformed
        Register_Confirm.setVisible(false);
    }//GEN-LAST:event_BUT_OKActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        LB_Time.setText("Χρόνια:");
        base_price = 200.0;
        price = base_price * Integer.parseInt(SP_Total.getValue().toString());
        LB_TotalPrice.setText(price + "€");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void BUT_PriceWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_PriceWindowActionPerformed
        FRA_PriceWindow.setVisible(true);
        FRA_PriceWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_BUT_PriceWindowActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        LB_Time.setText("Εξάμηνα:");
        base_price = 140.0;
        price = base_price * Integer.parseInt(SP_Total.getValue().toString());
        LB_TotalPrice.setText(price + "€");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        LB_Time.setText("Μήνες:");
        base_price = 25.0;
        price = base_price * Integer.parseInt(SP_Total.getValue().toString());
        LB_TotalPrice.setText(price + "€");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void SP_TotalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_TotalStateChanged
        price = base_price * Integer.parseInt(SP_Total.getValue().toString());
        LB_TotalPrice.setText(price + "€");
    }//GEN-LAST:event_SP_TotalStateChanged

    private void BUT_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_PayActionPerformed
        FRA_Pay.setVisible(true);
        FRA_Pay.setLocationRelativeTo(null);
        //CardsIcon.setIcon(new ImageIcon(scaleImage));
    }//GEN-LAST:event_BUT_PayActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        BUT_FullBuy.setEnabled(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void BUT_FullBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_FullBuyActionPerformed
        FRA_Pay.setVisible(false);
        Register_Confirm.setLocationRelativeTo(null);
        REG_windowConfirm.setText("Η συναλλαγή ολοκληρώθηκε.");
        Register_Confirm.setVisible(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_BUT_FullBuyActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void REG_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REG_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REG_PhoneActionPerformed

    private void BUT_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_LogoutActionPerformed
        switchWindows(FRA_AccountWindow,ass1);
        currentUserACID = 0;
        PROF_NameS.setText("");
        PROF_SurnameS.setText("");
        PROF_AddressS.setText("");
        PROF_PhoneS.setText("");
        PROF_UsernameS.setText("");
        PROF_EmailS.setText("");
        PROF_DateS.setText("");
        clearLogin();
    }//GEN-LAST:event_BUT_LogoutActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switchWindows(FRA_Admin,FRA_InsertTrainer);
        FRA_InsertTrainer.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void switchWindows(JFrame close, JFrame open){
        close.setVisible(false);
        open.setLocationRelativeTo(null);
        open.setVisible(true);
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FRA_Admin.setVisible(false);
        ass1.setVisible(true);
        TF_Username.setText("");
        jPasswordField1.setText("");
        LB_Message.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFrame_Register.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FRA_AdminWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_AdminWindowClosed
        
    }//GEN-LAST:event_FRA_AdminWindowClosed

    private void clearLogin(){
        ass1.TF_Username.setText("");
        ass1.jPasswordField1.setText("");
        LB_Message.setText("");
    }
    
    private void FRA_AdminWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_AdminWindowClosing
        switchWindows(FRA_Admin,ass1);
        clearLogin();
    }//GEN-LAST:event_FRA_AdminWindowClosing

    private void FRA_AccountWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_AccountWindowWindowClosing
        switchWindows(FRA_AccountWindow,ass1);
        clearLogin();
        currentUserACID = 0;
    }//GEN-LAST:event_FRA_AccountWindowWindowClosing

    private void BUT_CreateWIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_CreateWIActionPerformed
        FRA_CreateWI.setVisible(true);
        FRA_CreateWI.setLocationRelativeTo(null);
    }//GEN-LAST:event_BUT_CreateWIActionPerformed

    private void FRA_EmployeeWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_EmployeeWindowClosing
        switchWindows(FRA_Employee,ass1);
        clearLogin();
        currentUserACID = 0;
    }//GEN-LAST:event_FRA_EmployeeWindowClosing

    private void TF_PlanNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PlanNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PlanNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FRA_CreateWP.setVisible(true);
        FRA_CreateWP.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BUT_TrainerRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_TrainerRegActionPerformed
        if(TF_NameTR.getText().length()<1 || TF_SurnameTR.getText().length()<1 || TF_AddressTR.getText().length()<1 || PF_PassTR.getText().length()<1 || TF_EmailTR.getText().length()<1 || TF_PhoneTR.getText().length()<1 || TF_SpecialityTR.getText().length()<1){
            LB_RegTR.setForeground(Color.red);
            LB_RegTR.setText("Please fill in all the fields.");
            return;
        } else if(!Arrays.equals(PF_PassTR.getPassword(), PF_PassConfirmTR.getPassword())){
            LB_RegTR.setForeground(Color.red);
            LB_RegTR.setText("Passwords are different.");
            return;
        }
        
        if(Account.validUsername(TF_UsernameTR.getText())){
          
            Date datenow = new Date();
            Calendar cal1 = Calendar.getInstance();
            String dat = String.valueOf(cal1.get(Calendar.YEAR)) + "-"+ datenow.getMonth() + "-" + String.valueOf(cal1.get(Calendar.DAY_OF_MONTH));
            System.out.println(dat);
            Account acc1 = new Account(TF_UsernameTR.getText(),PF_PassTR.getText(),TF_EmailTR.getText(),dat,as1,at3);
            Trainer s1 = new Trainer(TF_NameTR.getText(),TF_SurnameTR.getText(),TF_PhoneTR.getText(),TF_AddressTR.getText(),TF_UsernameTR.getText(),TF_SurnameTR.getText(),TF_SpecialityTR.getText());
            switchWindows(FRA_InsertTrainer,FRA_Admin);
            Register_Confirm.setVisible(true);
            Register_Confirm.setLocationRelativeTo(null);
            REG_windowConfirm.setText("Registration for trainer " + TF_NameTR.getText() + " " + TF_SurnameTR.getText() + "\n has been completed.");
            TF_NameTR.setText("");
            TF_SurnameTR.setText("");
            TF_UsernameTR.setText("");
            PF_PassTR.setText("");
            PF_PassConfirmTR.setText("");
            TF_EmailTR.setText("");
            TF_AddressTR.setText("");
            TF_SpecialityTR.setText("");
            
        } else {
            Registration_Message.setText("Username already exists.");
        }
    }//GEN-LAST:event_BUT_TrainerRegActionPerformed

    private void TF_SurnameTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_SurnameTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_SurnameTRActionPerformed

    private void TF_NameTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_NameTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_NameTRActionPerformed

    private void TF_PhoneTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PhoneTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PhoneTRActionPerformed

    private void TF_AddressTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_AddressTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_AddressTRActionPerformed

    private void TF_UsernameTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_UsernameTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_UsernameTRActionPerformed

    private void TF_SpecialityTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_SpecialityTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_SpecialityTRActionPerformed

    private void TF_EmailTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_EmailTRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EmailTRActionPerformed

    private void FRA_CreateWPWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_CreateWPWindowClosing
        //switchWindows(FRA_CreateWP,FRA_Trainer);
    }//GEN-LAST:event_FRA_CreateWPWindowClosing

    private void FRA_TrainerWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_TrainerWindowClosing
        switchWindows(FRA_Trainer,ass1);
        clearLogin();
        currentUserACID = 0;
    }//GEN-LAST:event_FRA_TrainerWindowClosing

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Equipment temp_eq = null;
        
        switch (JL_Equip.getSelectedValue()){
            case "Threadmills":
                temp_eq = eq1;
                break;
            case "Ellipticals":
                temp_eq = eq2;
                break;
            case "Exercise Bikes":
                temp_eq = eq3;
                break;
            case "Rowers":
                temp_eq = eq4;
                break;
            case "Treadmill Desks":
                temp_eq = eq5;
                break;
            case "Bowflex TreadClimber":
                temp_eq = eq6;
                break;
        }
        
        WorkoutTypes temp_wt = null;
        
        switch (CB_WorkoutPlanCreator.getSelectedItem().toString()){
            case "Muscle Building":
                temp_wt = wt1;
                break;
            case "Fat Loss":
                temp_wt = wt2;
                break;
            case "Increase Strength":
                temp_wt = wt3;
                break;
            case "Beginner":
                temp_wt = wt4;
                break;
        }
        int subs = ((SpinnerNumberModel) SP_MaxSubscribers.getModel()).getNumber().intValue();
        double sp_price = ((SpinnerNumberModel) SP_Price.getModel()).getNumber().doubleValue();
        if(TF_PlanName.getText().length()>=1 && !JL_Equip.isSelectionEmpty()){
            WorkoutPlans wp1 = new WorkoutPlans(TF_PlanName.getText(),subs,temp_eq,temp_wt,sp_price);  
        } else {
            LB_WPCMessage.setText("Please fill in all the fields");
            LB_WPCMessage.setForeground(Color.red);
        }
        
        FRA_CreateWP.setVisible(false);
        Register_Confirm.setVisible(true);
        Register_Confirm.setLocationRelativeTo(null);
        REG_windowConfirm.setText("Creation of " + TF_PlanName.getText() + "\n has been completed.");
        TF_PlanName.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed
    private void getTrainerInfo() {
        System.out.println(currentUserACID);
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select * from trainer inner join users on trainer.usid=users.usid  inner join account on users.acid = account.acid where account.acid =" + currentUserACID);
            if(results1.next()){
                LB_TrainerID.setText(results1.getString("TRID"));
                LB_TrainerName.setText(results1.getString("NAME"));
                LB_Speciality.setText(results1.getString("SPEC"));
            }
            results1.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }

    private void BUT_EmployeeRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_EmployeeRegistrationActionPerformed
        if(TF_NameEM.getText().length()<1 || TF_UsernameEM.getText().length()<1 || TF_SurnameEM.getText().length()<1 || TF_AddressEM.getText().length()<1 || PF_PassEM.getText().length()<1 || TF_EmailEM.getText().length()<1 || TF_PhoneEM.getText().length()<1 || TF_PositionEM.getText().length()<1){
            LB_EMMessage.setForeground(Color.red);
            LB_EMMessage.setText("Please fill in all the fields.");
        } else if(!Arrays.equals(PF_PassEM.getPassword(), PF_PassConfirmEM.getPassword())){
            LB_EMMessage.setForeground(Color.red);
            LB_EMMessage.setText("Passwords are different.");
        } else {
            if(Account.validUsername(TF_UsernameEM.getText())){
                String pass_temp = new String(PF_PassEM.getPassword());
                Date datenow = new Date();
                Calendar cal1 = Calendar.getInstance();
                String dat = String.valueOf(cal1.get(Calendar.YEAR)) + "-"+ datenow.getMonth() + "-" + String.valueOf(cal1.get(Calendar.DAY_OF_MONTH));
                System.out.println(dat);
                Account acx1 =  new Account(TF_UsernameEM.getText(),pass_temp,TF_EmailEM.getText(),dat,as1,at2);
                Employee e1 = new Employee(TF_NameEM.getText(),TF_SurnameEM.getText(),TF_PhoneEM.getText(),TF_AddressEM.getText(),TF_UsernameEM.getText(),TF_SurnameEM.getText(),TF_PositionEM.getText());
                switchWindows(FRA_InsertEmployee,FRA_Admin);
                Register_Confirm.setVisible(true);
                Register_Confirm.setLocationRelativeTo(null);
                REG_windowConfirm.setText("Registration of " + TF_UsernameEM.getText() + "\n has been completed.");
                TF_NameEM.setText("");
                TF_SurnameEM.setText("");
                TF_AddressEM.setText("");
                PF_PassEM.setText("");
                TF_EmailEM.setText("");
                TF_PhoneEM.setText("");
                TF_PositionEM.setText("");
                TF_Username.setText("");
                PF_PassEM.setText("");
                PF_PassConfirmEM.setText("");
                
            } else {
                LB_EMMessage.setText("Username already exists.");
            }
        }
    }//GEN-LAST:event_BUT_EmployeeRegistrationActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switchWindows(FRA_Admin,FRA_InsertEmployee);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void FRA_InsertEmployeeWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_InsertEmployeeWindowClosing
        switchWindows(FRA_InsertEmployee,FRA_Admin);
    }//GEN-LAST:event_FRA_InsertEmployeeWindowClosing

    private void FRA_CreateWIWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FRA_CreateWIWindowClosing
        switchWindows(FRA_CreateWI,FRA_Employee);
    }//GEN-LAST:event_FRA_CreateWIWindowClosing

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        switchWindows(FRA_Employee,ass1);
        clearLogin();
        currentUserACID = 0;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void CH_MoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH_MoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CH_MoActionPerformed

    private void CH_TuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH_TuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CH_TuActionPerformed

    private void CH_ThreadmillsRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CH_ThreadmillsRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CH_ThreadmillsRCActionPerformed

    private void getWorkoutInstances(){
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select * from Instance join Workout_plans on instance.WPID = workout_plans.WPID");
            while(results1.next()){
                CB_WorkoutInstancesSE.addItem(results1.getString("WIID"));
            }
            String temp_planID = CB_WorkoutInstancesSE.getSelectedItem().toString();
            results1.close();
            ResultSet results2 = stmt.executeQuery("select * from Instance join Workout_plans on instance.WPID = workout_plans.WPID where WIID=" + Integer.parseInt(temp_planID));
            while(results2.next()){
                LB_WorkoutTypeSE.setText(results2.getString("WORK_TYPE"));
                LB_HoursSE.setText(results2.getString("HOURS"));
                LB_DurationSE.setText(results2.getString("DURATION"));
                LB_RoomNameSE.setText(results2.getString("ROOM_NAME"));
                LB_PriceSE.setText(results2.getString("PRICE"));
                LB_DaysSE.setText(results2.getString("DAYS"));
            }
            results2.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }
    
    private void getWIInfo(){
        try{
            createConnection();
            stmt = conn.createStatement();
            String temp_planName = CB_WorkoutInstancesSE.getSelectedItem().toString();
            ResultSet results2 = stmt.executeQuery("select * from Instance join Workout_plans on instance.WPID = workout_plans.WPID where WIID=" + Integer.parseInt(temp_planName));
            while(results2.next()){
                LB_WorkoutTypeSE.setText(results2.getString("WORK_TYPE"));
                LB_HoursSE.setText(results2.getString("HOURS"));
                LB_DurationSE.setText(results2.getString("DURATION"));
                LB_RoomNameSE.setText(results2.getString("ROOM_NAME"));
                LB_PriceSE.setText(results2.getString("PRICE"));
                LB_DaysSE.setText(results2.getString("DAYS"));
            }
            results2.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }
    
    private void getWorkoutPlans(){
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select PLAN_NAME,WPID from WORKOUT_PLANS");
            while(results1.next()){
                CB_PlanWIC.addItem(results1.getString("PLAN_NAME"));
                currentCreationWPID = results1.getInt("WPID");
            }
            results1.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }
    
    private void BUT_RoomCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_RoomCActionPerformed
        if(TF_RoomNameRC.getText().length() >= 1){
            Equipment[] temp_eq = new Equipment[6];
            if(CH_ThreadmillsRC.isSelected())temp_eq[0] = eq1;
            if(CH_EllipticalsRC.isSelected())temp_eq[1] = eq2;
            if(CH_ExerciseBikesRC.isSelected())temp_eq[2] = eq3;
            if(CH_RowersRC.isSelected())temp_eq[3] = eq4;
            if(CH_TreadmillDesksRC.isSelected())temp_eq[4] = eq5;
            if(CH_BowflexTreadClimberRC.isSelected())temp_eq[5] = eq6;
            int cap_rc = ((SpinnerNumberModel) SP_CapacityRC.getModel()).getNumber().intValue();
            Rooms r1 = new Rooms(Integer.parseInt(TF_RoomNameRC.getText()),cap_rc,temp_eq);
                Register_Confirm.setVisible(true);
                Register_Confirm.setLocationRelativeTo(null);
                FRA_RoomCreator.setVisible(false);
                REG_windowConfirm.setText("Creation of Room " + TF_RoomNameRC.getText() + "\n has been completed.");
                TF_RoomNameRC.setText("");
                CH_ThreadmillsRC.setSelected(false);
                CH_EllipticalsRC.setSelected(false);
                CH_ExerciseBikesRC.setSelected(false);
                CH_RowersRC.setSelected(false);
                CH_TreadmillDesksRC.setSelected(false);
                CH_BowflexTreadClimberRC.setSelected(false);
                SP_CapacityRC.setValue(15);
        } else {
            LB_RCMessage.setText("Please fill in the Room Number.");
        }
    }//GEN-LAST:event_BUT_RoomCActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        FRA_RoomCreator.setVisible(true);
        FRA_RoomCreator.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String dayz = "";
        if(CH_Mo.isSelected())dayz+="Monday ";
        if(CH_Tu.isSelected())dayz+="Tuesday ";
        if(CH_We.isSelected())dayz+="Wednesday ";
        if(CH_Th.isSelected())dayz+="Thursday ";
        if(CH_Fr.isSelected())dayz+="Friday ";
        if(CH_Su.isSelected())dayz+="Saturday ";
        if(CH_Su.isSelected())dayz+="Sunday ";
        if(!CH_Mo.isSelected() && !CH_Tu.isSelected() && !CH_We.isSelected() && !CH_Th.isSelected() && !CH_Fr.isSelected() && !CH_Sa.isSelected() && !CH_Su.isSelected()){
            LB_WICMessage.setText("Please select at least one day of the week.");
        } else {
            Instance in1 = new Instance(CB_HoursWIC.getSelectedItem().toString(),((SpinnerNumberModel) jSpinner1.getModel()).getNumber().intValue(),currentCreationWPID,CB_RoomWIC.getSelectedItem().toString(),dayz,currentCreationWPID,((SpinnerNumberModel) jSpinner2.getModel()).getNumber().intValue());
            FRA_CreateWI.setVisible(false);
            Register_Confirm.setVisible(true);
            Register_Confirm.setLocationRelativeTo(null);
            REG_windowConfirm.setText("Creation of instance has been completed.");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void get_Rooms(){
        
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select ROOM_NAME from ROOMS");
            while(results1.next()){
                CB_RoomWIC.addItem(results1.getString("ROOM_NAME"));
            }
            results1.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }
    
    private void CB_WorkoutPlanCreatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_WorkoutPlanCreatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_WorkoutPlanCreatorActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        FRA_CreateWI.setVisible(true);
        FRA_CreateWI.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        FRA_CreateWP.setVisible(true);
        FRA_CreateWP.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        FRA_RoomCreator.setVisible(true);
        FRA_RoomCreator.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        FRA_CreateS.setVisible(true);
        FRA_CreateS.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void CB_WorkoutInstancesSEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_WorkoutInstancesSEItemStateChanged
        getWIInfo();
    }//GEN-LAST:event_CB_WorkoutInstancesSEItemStateChanged

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try{
            createConnection();
            stmt = conn.createStatement();
            ResultSet results1 = stmt.executeQuery("select * from subscribers join users on users.USID=subscribers.USID where ACID=" + currentUserACID);
            int temp_sbid = 0;
            while(results1.next()){
                temp_sbid = results1.getInt("SBID");
            }
            results1.close();
            ResultSet results2 = stmt.executeQuery("select * from personal_schedule where sbid = " + temp_sbid);
            while(results2.next()){
                if(results2.getInt("WIID")==Integer.parseInt(CB_WorkoutInstancesSE.getSelectedItem().toString())){
                    LB_SEMessage.setText("Selected workout instance is already in schedule.");
                    return;
                }
            }
            PersonalSchedule ps1 = new PersonalSchedule(Integer.parseInt(CB_WorkoutInstancesSE.getSelectedItem().toString()),temp_sbid);
            FRA_CreateS.setVisible(false);
            Register_Confirm.setVisible(true);
            Register_Confirm.setLocationRelativeTo(null);
            REG_windowConfirm.setText("Addition of workout instance has been completed.");
            stmt.close();
            conn.close();
        } catch (SQLException sqlExcept){
            System.out.println(sqlExcept);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GymFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GymFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GymFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GymFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ass1.setVisible(true);
                ass1.setLocationRelativeTo(null);
                ass1.getRootPane().setDefaultButton(ass1.BUT_Login);
                ass1.CB_Phys.addItem(ass1.ph1.getDescription());
                ass1.CB_Phys.addItem(ass1.ph2.getDescription());
                ass1.CB_Phys.addItem(ass1.ph3.getDescription());
                ass1.CB_Phys.addItem(ass1.ph4.getDescription());
                ass1.CB_Phys.addItem(ass1.ph5.getDescription());
                ass1.dlm1.addElement(ass1.eq1.getEquip_name());
                ass1.dlm1.addElement(ass1.eq2.getEquip_name());
                ass1.dlm1.addElement(ass1.eq3.getEquip_name());
                ass1.dlm1.addElement(ass1.eq4.getEquip_name());
                ass1.dlm1.addElement(ass1.eq5.getEquip_name());
                ass1.dlm1.addElement(ass1.eq6.getEquip_name());
                ass1.get_Rooms();
                ass1.getWorkoutPlans();
                ass1.getWorkoutInstances();
                TableColumn monday = ass1.jTable1.getColumnModel().getColumn(1);
                TableColumn tuesday = ass1.jTable1.getColumnModel().getColumn(2);
                TableColumn wednesday = ass1.jTable1.getColumnModel().getColumn(3);
                TableColumn thursday = ass1.jTable1.getColumnModel().getColumn(4);
                TableColumn friday = ass1.jTable1.getColumnModel().getColumn(5);
                TableColumn saturday = ass1.jTable1.getColumnModel().getColumn(6);
                TableColumn sunday = ass1.jTable1.getColumnModel().getColumn(7);
                
                
                    try{
                        
                        fw = new FileWriter("dat" + ".ass");
                        //fw.write("Registrations: \n" + "0");
                        //fw.close();
                        
                    } catch(IOException e1){
                        
                        
                    }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUT_Cancel;
    private javax.swing.JButton BUT_CreateWI;
    private javax.swing.JButton BUT_EmployeeRegistration;
    private javax.swing.JButton BUT_FPass;
    private javax.swing.JButton BUT_FullBuy;
    private javax.swing.JButton BUT_Login;
    private javax.swing.JButton BUT_Logout;
    private javax.swing.JButton BUT_OK;
    private javax.swing.JButton BUT_Pay;
    private javax.swing.JButton BUT_PriceWindow;
    private javax.swing.JButton BUT_RegConfirm;
    private javax.swing.JButton BUT_Register;
    private javax.swing.JButton BUT_RoomC;
    private javax.swing.JButton BUT_TrainerReg;
    private javax.swing.JComboBox<String> CB_HoursWIC;
    private javax.swing.JComboBox<String> CB_Phys;
    private javax.swing.JComboBox<String> CB_PlanWIC;
    private javax.swing.JComboBox<String> CB_RoomWIC;
    private javax.swing.JComboBox<String> CB_WorkoutInstancesSE;
    private javax.swing.JComboBox<String> CB_WorkoutPlanCreator;
    private javax.swing.JCheckBox CH_BowflexTreadClimberRC;
    private javax.swing.JCheckBox CH_EllipticalsRC;
    private javax.swing.JCheckBox CH_ExerciseBikesRC;
    private javax.swing.JCheckBox CH_Fr;
    private javax.swing.JCheckBox CH_Mo;
    private javax.swing.JCheckBox CH_RowersRC;
    private javax.swing.JCheckBox CH_Sa;
    private javax.swing.JCheckBox CH_Su;
    private javax.swing.JCheckBox CH_Th;
    private javax.swing.JCheckBox CH_ThreadmillsRC;
    private javax.swing.JCheckBox CH_TreadmillDesksRC;
    private javax.swing.JCheckBox CH_Tu;
    private javax.swing.JCheckBox CH_We;
    private javax.swing.JFrame FRA_AccountWindow;
    private javax.swing.JFrame FRA_Admin;
    private javax.swing.JFrame FRA_CreateS;
    private javax.swing.JFrame FRA_CreateWI;
    private javax.swing.JFrame FRA_CreateWP;
    private javax.swing.JFrame FRA_Employee;
    private javax.swing.JFrame FRA_InsertEmployee;
    private javax.swing.JFrame FRA_InsertTrainer;
    private javax.swing.JFrame FRA_Pay;
    private javax.swing.JFrame FRA_PriceWindow;
    private javax.swing.JFrame FRA_RoomCreator;
    private javax.swing.JFrame FRA_Trainer;
    private javax.swing.JLabel GymSum;
    private javax.persistence.EntityManager GymSymDBPUEntityManager;
    private javax.swing.JList<String> JL_Equip;
    private javax.swing.JLabel LB_DaysSE;
    private javax.swing.JLabel LB_DurationSE;
    private javax.swing.JLabel LB_EMMessage;
    private javax.swing.JLabel LB_EmployeeID;
    private javax.swing.JLabel LB_EmployeeName;
    private javax.swing.JLabel LB_HoursSE;
    private javax.swing.JLabel LB_Message;
    private javax.swing.JLabel LB_PriceSE;
    private javax.swing.JLabel LB_RCMessage;
    private javax.swing.JLabel LB_RegTR;
    private javax.swing.JLabel LB_RoomNameSE;
    private javax.swing.JLabel LB_SEMessage;
    private javax.swing.JLabel LB_Speciality;
    private javax.swing.JLabel LB_Time;
    private javax.swing.JLabel LB_TotalPrice;
    private javax.swing.JLabel LB_TrainerID;
    private javax.swing.JLabel LB_TrainerName;
    private javax.swing.JLabel LB_WICMessage;
    private javax.swing.JLabel LB_WPCMessage;
    private javax.swing.JLabel LB_WorkoutTypeSE;
    private javax.swing.JPasswordField PF_PassConfirmEM;
    private javax.swing.JPasswordField PF_PassConfirmTR;
    private javax.swing.JPasswordField PF_PassEM;
    private javax.swing.JPasswordField PF_PassTR;
    private javax.swing.JLabel PROF_Address;
    private javax.swing.JLabel PROF_AddressS;
    private javax.swing.JLabel PROF_Date;
    private javax.swing.JLabel PROF_DateS;
    private javax.swing.JLabel PROF_Email;
    private javax.swing.JLabel PROF_EmailS;
    private javax.swing.JLabel PROF_Name;
    private javax.swing.JLabel PROF_NameS;
    private javax.swing.JLabel PROF_Phone;
    private javax.swing.JLabel PROF_PhoneS;
    private javax.swing.JLabel PROF_Surname;
    private javax.swing.JLabel PROF_SurnameS;
    private javax.swing.JLabel PROF_Username;
    private javax.swing.JLabel PROF_UsernameS;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField REG_Address;
    private javax.swing.JPasswordField REG_ConfirmPass;
    private javax.swing.JTextField REG_Email;
    private javax.swing.JTextField REG_Name;
    private javax.swing.JPasswordField REG_Password;
    private javax.swing.JTextField REG_Phone;
    private javax.swing.JTextField REG_Surname;
    private javax.swing.JTextField REG_Username;
    private javax.swing.JLabel REG_windowConfirm;
    private javax.swing.JDialog Register_Confirm;
    private javax.swing.JLabel Registration_Message;
    private javax.swing.JSpinner SP_CapacityRC;
    private javax.swing.JSpinner SP_MaxSubscribers;
    private javax.swing.JSpinner SP_Price;
    private javax.swing.JSpinner SP_Total;
    private javax.swing.JTextField TF_AddressEM;
    private javax.swing.JTextField TF_AddressTR;
    private javax.swing.JTextField TF_EmailEM;
    private javax.swing.JTextField TF_EmailTR;
    private javax.swing.JTextField TF_NameEM;
    private javax.swing.JTextField TF_NameTR;
    private javax.swing.JTextField TF_PhoneEM;
    private javax.swing.JTextField TF_PhoneTR;
    private javax.swing.JTextField TF_PlanName;
    private javax.swing.JTextField TF_PositionEM;
    private javax.swing.JTextField TF_RoomNameRC;
    private javax.swing.JTextField TF_SpecialityTR;
    private javax.swing.JTextField TF_SurnameEM;
    private javax.swing.JTextField TF_SurnameTR;
    private javax.swing.JTextField TF_Username;
    private javax.swing.JTextField TF_UsernameEM;
    private javax.swing.JTextField TF_UsernameTR;
    private javax.swing.JLabel Username;
    private java.util.List<gymsym.Account_1> account_1List;
    private javax.persistence.Query account_1Query;
    private java.util.List<gymsym.Instance_1> instance_1List;
    private javax.persistence.Query instance_1Query;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.ButtonGroup syndromi;
    // End of variables declaration//GEN-END:variables


}