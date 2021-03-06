/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dsola
 */
public class Cashier_BookForm_ExistingCustomer extends javax.swing.JFrame {
public String User1;
public String Team_A;
public String Team_B;
public String Match;
public String Matches;
public String RealMatch;
public String MatchDate;
public String MatchStadium;
public String   Firstname1;
public String   LastName1; 
public String   Email1;
public String   TicketNumber1;
public String Customers;
public int customerid;
public int matchid;
public int loginid;
public int StadiumID;
public float FinalPrice;
public float capacity;
public int counter;
    /**
     * Creates new form Cashier_BookForm_ExistingCustomer
     */
    public Cashier_BookForm_ExistingCustomer(String User,String Match) {
        this.Match=Match;
        this.User1=User;
        initComponents();
        FillCustomers();
        joinMatchesStadiums();
        CapacityCheck();
    }
    
    
    public void joinMatchesStadiums(){
           String arr[] = Match.split(" ",2);
   

        try{   
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql="Select * from Matches INNER JOIN Stadiums on Matches.Stadium_ID=Stadiums.ID where  Matches.Team_A=? and Matches.team_B=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, arr[0].trim());
            pst.setString(2, arr[1].trim());
            ResultSet rs1=pst.executeQuery();
  
              while(rs1.next())
              {
                    Team_A=rs1.getString("Team_A") ;
                    Team_B=rs1.getString("team_B");
                     Matches=rs1.getString("Team_A") + rs1.getString("team_B");
                    MatchDate=rs1.getString("Date");
                    MatchStadium=rs1.getString("Name");
                    RealMatch=rs1.getString("Team_A") + "_VS_" + rs1.getString("team_B");
                    RealMatch=RealMatch.replaceAll("\\s", "");
                    Match_Name_Label.setText(RealMatch);
                    Date_Label.setText(MatchDate);
                    Stadium_Label.setText(MatchStadium.trim());
              }
    }
    catch(Exception e){
                    System.out.println("error");
            }
}   
    
     public boolean CapacityCheck(){
         String arr[] = Match.split(" ",2);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sqlcheck="Select Capacity,counter from Matches INNER JOIN Stadiums on Matches.Stadium_ID=Stadiums.ID where  Matches.Team_A=? and Matches.team_B=?";
            PreparedStatement check = con.prepareStatement(sqlcheck);
            check.setString(1, arr[0].trim());
            check.setString(2, arr[1].trim());
            ResultSet checkrs=check.executeQuery();
            if(checkrs.next()){
                capacity=checkrs.getFloat("Capacity");
                counter=checkrs.getInt("counter");
                 
            }
        }catch(Exception e){
           System.out.println("Error");
        }
          
         if(counter<=capacity)
                  return true;
         else
                  return false;
    }
    
    public void FillCustomers(){
           
    
    DefaultListModel m = new DefaultListModel();
               
    try{

           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql="Select FirstName,LastName from Customer";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs1=pst.executeQuery();
          
              while(rs1.next()){
                    Customers=rs1.getString("FirstName") + rs1.getString("LastName");
                     m.addElement(Customers);   
              }
                 jList1.setModel(m);
                 con.close();
        }        catch(Exception e){
                    System.out.println("error");
                    }

    }       
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        SidePannel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_Home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Home_label = new javax.swing.JLabel();
        btn_Matches = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Matches_Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Match_Name_Label = new javax.swing.JLabel();
        Stadium_Label = new javax.swing.JLabel();
        Date_Label = new javax.swing.JLabel();
        FirstName_Label = new javax.swing.JLabel();
        TicketNumber_Label = new javax.swing.JLabel();
        TicketNumber = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier Existing Customer");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1033, 650));

        SidePannel.setBackground(new java.awt.Color(55, 38, 91));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/Cashier_icon_50x50.png"))); // NOI18N

        btn_Home.setBackground(new java.awt.Color(66, 48, 103));
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_HomeMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/Home_button.png"))); // NOI18N

        Home_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home_label.setForeground(new java.awt.Color(204, 204, 204));
        Home_label.setText("Home");

        javax.swing.GroupLayout btn_HomeLayout = new javax.swing.GroupLayout(btn_Home);
        btn_Home.setLayout(btn_HomeLayout);
        btn_HomeLayout.setHorizontalGroup(
            btn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(Home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_HomeLayout.setVerticalGroup(
            btn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_HomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_Matches.setBackground(new java.awt.Color(66, 48, 103));
        btn_Matches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MatchesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MatchesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MatchesMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/Matches.png"))); // NOI18N

        Matches_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Matches_Label.setForeground(new java.awt.Color(204, 204, 204));
        Matches_Label.setText("Matches");

        javax.swing.GroupLayout btn_MatchesLayout = new javax.swing.GroupLayout(btn_Matches);
        btn_Matches.setLayout(btn_MatchesLayout);
        btn_MatchesLayout.setHorizontalGroup(
            btn_MatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_MatchesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(Matches_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btn_MatchesLayout.setVerticalGroup(
            btn_MatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_MatchesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_MatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_MatchesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Matches_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 226, 229));
        jLabel5.setText(User1.trim());

        javax.swing.GroupLayout SidePannelLayout = new javax.swing.GroupLayout(SidePannel);
        SidePannel.setLayout(SidePannelLayout);
        SidePannelLayout.setHorizontalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Matches, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePannelLayout.createSequentialGroup()
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
            .addComponent(btn_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SidePannelLayout.setVerticalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePannelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Matches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(124, 85, 227));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Booking Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Match_Name_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Match_Name_Label.setText("Match Name               -");

        Stadium_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Stadium_Label.setText("Stadium");

        Date_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Date_Label.setText("Date               -");

        FirstName_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FirstName_Label.setText("Customer :");

        TicketNumber_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TicketNumber_Label.setText("Ticket #    :");

        TicketNumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TicketNumber.setForeground(new java.awt.Color(51, 51, 51));
        TicketNumber.setText("enter Number of tickets");
        TicketNumber.setBorder(null);
        TicketNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketNumberMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setText("Purchase tickets");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(SidePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(TicketNumber_Label)
                                .addGap(26, 26, 26)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TicketNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(jSeparator5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Match_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FirstName_Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addComponent(Stadium_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(222, 222, 222))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stadium_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Match_Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TicketNumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TicketNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(159, 159, 159))
            .addComponent(SidePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TicketNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketNumberMouseClicked
        TicketNumber.setText("");
    }//GEN-LAST:event_TicketNumberMouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(HAND_CURSOR));
        jButton2.setBackground(new Color(18,30,49));
        jButton2.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(255,255,255));
        jButton2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void btn_MatchesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MatchesMouseExited
        Matches_Label.setForeground(new Color(203,203,171));
        btn_Matches.setBackground(new Color(66,48,103));
    }//GEN-LAST:event_btn_MatchesMouseExited

    private void btn_MatchesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MatchesMouseEntered
        btn_Matches.setCursor(new Cursor(HAND_CURSOR));
        btn_Matches.setBackground(new Color(87,70,120));
        Matches_Label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_MatchesMouseEntered

    private void btn_MatchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MatchesMouseClicked
        Cashier_Matches Window = new Cashier_Matches(User1);
        Window.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_MatchesMouseClicked

    private void btn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseExited
        Matches_Label.setForeground(new Color(203,203,171));
        Home_label.setBackground(new Color(66,48,103));
    }//GEN-LAST:event_btn_HomeMouseExited

    private void btn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseEntered
        btn_Home.setCursor(new Cursor(HAND_CURSOR));
        btn_Home.setBackground(new Color(87,70,120));
        Home_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btn_HomeMouseEntered

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        Cashier_Home Window1 = new Cashier_Home(User1);
        Window1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String CustomerWord = jList1.getSelectedValue();
        String CustArr[] = CustomerWord.split(" ",2);
        System.out.println(CustArr[0]);
            System.out.println(CustArr[1]);
             TicketNumber1=  TicketNumber.getText();
     Date p = new Date();
        if(CapacityCheck()){
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
              String select = "Select * from Customer where FirstName=? and LastName=?";
              PreparedStatement selected = con.prepareStatement(select);
              selected.setString(1,CustArr[0].trim() );
              selected.setString(2,CustArr[1].trim() );
              ResultSet rs3=selected.executeQuery();
              if(rs3.next()){
                  customerid=rs3.getInt(1);
                
              }
              
              String select2 = "Select * from Matches where Team_A=? and team_B=?";
              PreparedStatement selected2 = con.prepareStatement(select2);
              selected2.setString(1,Team_A);
              selected2.setString(2,Team_B);
              ResultSet rs4=selected2.executeQuery();
              if(rs4.next()){
                  matchid=rs4.getInt(1);
                  StadiumID=rs4.getInt("Stadium_ID");
              }
              
              String select3 = "Select * from Login where username=? ";
              PreparedStatement selected3 = con.prepareStatement(select3);
              selected3.setString(1,User1);
              ResultSet rs5=selected3.executeQuery();
             
              if(rs5.next()){
                  loginid=rs5.getInt(1);
                  
              }
              
                        String select4 = "Select * from Stadiums where ID=? ";
                        PreparedStatement selected4 = con.prepareStatement(select4);
                        selected4.setInt(1,StadiumID);
                        ResultSet rsfinal=selected4.executeQuery();
             
                        if(rsfinal.next()){
                         FinalPrice=rsfinal.getFloat("Ticket Price");
                         
              }
              
              
              
              
              
              String sqlpurch="INSERT INTO Purchase VALUES (?,?,?,?,?);";
                PreparedStatement pst1 = con.prepareStatement(sqlpurch);
               //  pst1.setDate(1, (java.sql.Date) p);
                 pst1.setInt(1,customerid);
                 pst1.setInt(2,matchid);
                 pst1.setInt(3,Integer.parseInt(TicketNumber1));
                 pst1.setFloat(4,FinalPrice*Integer.parseInt(TicketNumber1));// TODOprice
                 pst1.setInt(5,loginid);
                  int rs6=pst1.executeUpdate();
                  
                  
                     String sqlupdate="UPDATE Matches SET counter= counter +? where Team_A=? and team_B=?";
                     PreparedStatement psupdate = con.prepareStatement(sqlupdate);
                     psupdate.setString(1, TicketNumber1);
                     psupdate.setString(2, Team_A);
                     psupdate.setString(3, Team_B);
                     int rs7=psupdate.executeUpdate();
                  Cashier_Printing print = new Cashier_Printing(User1,CustArr[0].trim() ,CustArr[1].trim() );
                  print.setVisible(true);
                  setVisible(false);
                  
                    con.close();
     }catch(Exception e){
         System.out.println("The customer Probably exists!Or Server Error.");
     }
     }

       else if(!CapacityCheck())
                     JOptionPane.showMessageDialog(null,"The Match is full");  
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier_BookForm_ExistingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier_BookForm_ExistingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier_BookForm_ExistingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier_BookForm_ExistingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date_Label;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JLabel Home_label;
    private javax.swing.JLabel Match_Name_Label;
    private javax.swing.JLabel Matches_Label;
    private javax.swing.JPanel SidePannel;
    private javax.swing.JLabel Stadium_Label;
    private javax.swing.JTextField TicketNumber;
    private javax.swing.JLabel TicketNumber_Label;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_Home;
    private javax.swing.JPanel btn_Matches;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
