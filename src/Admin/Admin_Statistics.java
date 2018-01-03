/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author dsola
 */
public class Admin_Statistics extends javax.swing.JFrame {
 
    int count=0;
    float moneycount=0;
    String Usernam;
    String Logid = null;
    /**
     * Creates new form Admin_Statistics
     */
    public Admin_Statistics() {
        
        initComponents();
        fillListBox();
        ;
    }
    
      private void fillListBox(){
    
    DefaultListModel m = new DefaultListModel();

               
    try{

           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql="Select * from Login";
       
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs1=pst.executeQuery();

            
              while(rs1.next() ){
                    Usernam=rs1.getString("username"); 
                     m.addElement(Usernam);     
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

        Base = new javax.swing.JPanel();
        SidePannel = new javax.swing.JPanel();
        Mundial_icon = new javax.swing.JLabel();
        Update_Pannel = new javax.swing.JPanel();
        Update_icon = new javax.swing.JLabel();
        Update_label = new javax.swing.JLabel();
        Statistics_Pannel = new javax.swing.JPanel();
        Statistics_icon = new javax.swing.JLabel();
        Statistics_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Title_Pannel = new javax.swing.JPanel();
        Title_label = new javax.swing.JLabel();
        UserList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        User_label = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Select_Button = new javax.swing.JButton();
        Select_Button2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Statistics");

        Base.setBackground(new java.awt.Color(241, 239, 241));

        SidePannel.setBackground(new java.awt.Color(33, 40, 51));

        Mundial_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/Cashier_icon_50x50.png"))); // NOI18N

        Update_Pannel.setBackground(new java.awt.Color(33, 40, 51));
        Update_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_PannelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_PannelMouseExited(evt);
            }
        });

        Update_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/UpdateImage.png"))); // NOI18N

        Update_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update_label.setForeground(new java.awt.Color(0, 153, 51));
        Update_label.setText("Update");

        javax.swing.GroupLayout Update_PannelLayout = new javax.swing.GroupLayout(Update_Pannel);
        Update_Pannel.setLayout(Update_PannelLayout);
        Update_PannelLayout.setHorizontalGroup(
            Update_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Update_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Update_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Update_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        Update_PannelLayout.setVerticalGroup(
            Update_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Update_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Update_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Statistics_Pannel.setBackground(new java.awt.Color(33, 40, 51));
        Statistics_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Statistics_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Statistics_PannelMouseExited(evt);
            }
        });

        Statistics_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/StatisticsImage.png"))); // NOI18N

        Statistics_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Statistics_label.setForeground(new java.awt.Color(0, 153, 51));
        Statistics_label.setText("Statistics");

        javax.swing.GroupLayout Statistics_PannelLayout = new javax.swing.GroupLayout(Statistics_Pannel);
        Statistics_Pannel.setLayout(Statistics_PannelLayout);
        Statistics_PannelLayout.setHorizontalGroup(
            Statistics_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Statistics_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Statistics_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Statistics_label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        Statistics_PannelLayout.setVerticalGroup(
            Statistics_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Statistics_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Statistics_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Statistics_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Statistics_PannelLayout.createSequentialGroup()
                        .addComponent(Statistics_icon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administration");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SidePannelLayout = new javax.swing.GroupLayout(SidePannel);
        SidePannel.setLayout(SidePannelLayout);
        SidePannelLayout.setHorizontalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mundial_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Update_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Statistics_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SidePannelLayout.setVerticalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePannelLayout.createSequentialGroup()
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mundial_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(Update_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Statistics_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Title_Pannel.setBackground(new java.awt.Color(54, 63, 75));

        Title_label.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Title_label.setForeground(new java.awt.Color(255, 255, 255));
        Title_label.setText("Statistics");

        javax.swing.GroupLayout Title_PannelLayout = new javax.swing.GroupLayout(Title_Pannel);
        Title_Pannel.setLayout(Title_PannelLayout);
        Title_PannelLayout.setHorizontalGroup(
            Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Title_PannelLayout.setVerticalGroup(
            Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_PannelLayout.createSequentialGroup()
                .addComponent(Title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jList1.setBackground(new java.awt.Color(54, 63, 75));
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        UserList.setViewportView(jList1);

        User_label.setBackground(new java.awt.Color(255, 255, 255));
        User_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        User_label.setForeground(new java.awt.Color(33, 40, 51));
        User_label.setText("User :");

        Select_Button.setBackground(new java.awt.Color(33, 40, 51));
        Select_Button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Select_Button.setForeground(new java.awt.Color(255, 102, 102));
        Select_Button.setText("Select");
        Select_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Select_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Select_ButtonMouseExited(evt);
            }
        });
        Select_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_ButtonActionPerformed(evt);
            }
        });

        Select_Button2.setBackground(new java.awt.Color(33, 40, 51));
        Select_Button2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Select_Button2.setForeground(new java.awt.Color(0, 153, 0));
        Select_Button2.setText("Tickets Per Match");
        Select_Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Select_Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Select_Button2MouseExited(evt);
            }
        });
        Select_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLayout.createSequentialGroup()
                .addComponent(SidePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Title_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Select_Button)
                            .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserList)
                                .addComponent(User_label, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jSeparator2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Select_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        BaseLayout.setVerticalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BaseLayout.createSequentialGroup()
                .addComponent(Title_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(UserList, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Select_Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Select_Button)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Update_PannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_PannelMouseEntered
        Update_Pannel.setCursor(new Cursor(HAND_CURSOR));
        Update_Pannel.setBackground(new Color(54,63,75));
        Update_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Update_PannelMouseEntered

    private void Update_PannelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_PannelMouseExited
        Update_label.setForeground(new Color(222,222,222));
        Update_Pannel.setBackground(new Color(33,40,51));
    }//GEN-LAST:event_Update_PannelMouseExited

    private void Statistics_PannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Statistics_PannelMouseEntered
        Statistics_Pannel.setCursor(new Cursor(HAND_CURSOR));
        Statistics_Pannel.setBackground(new Color(54,63,75));
        Statistics_label.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Statistics_PannelMouseEntered

    private void Statistics_PannelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Statistics_PannelMouseExited
        Statistics_label.setForeground(new Color(222,222,222));
        Statistics_Pannel.setBackground(new Color(33,40,51));
    }//GEN-LAST:event_Statistics_PannelMouseExited

    private void Select_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_ButtonMouseEntered
        Select_Button.setCursor(new Cursor(HAND_CURSOR));
        Select_Button.setBackground(new Color(54,63,75));
        Select_Button.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Select_ButtonMouseEntered

    private void Select_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_ButtonMouseExited
        Select_Button.setBackground(new Color(33,40,51));
        Select_Button.setForeground(new Color(222,222,222));
    }//GEN-LAST:event_Select_ButtonMouseExited

    private void Update_PannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_PannelMouseClicked
        Admin_Update Window = new Admin_Update();
        Window.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Update_PannelMouseClicked

    private void Select_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_ButtonActionPerformed
      if(jList1.isSelectionEmpty()){
             JOptionPane.showMessageDialog(null,"You Must Select Item from List"); 
        }
      else{
      try{   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql3="Select ID from Login where username=?;";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            pst3.setString(1, jList1.getSelectedValue());
          
            ResultSet rs3=pst3.executeQuery();
            while(rs3.next()){
                 Logid=rs3.getString("ID");
            }
      
             String sql4="Select * from Purchase where LoginID=?;";
             PreparedStatement pst4 = con.prepareStatement(sql4);
             pst4.setString(1, Logid);
             ResultSet rs4=pst4.executeQuery();
                 
                  while(rs4.next()){
                      count++;
                      moneycount=moneycount+rs4.getFloat("Price");
                  }
                
      } catch(Exception e){
          System.out.println("Error Creating Charts");
          }
      }
                
      DefaultCategoryDataset dataset= new DefaultCategoryDataset();
      dataset.setValue(count,"Count","Tickets Registered");
      dataset.setValue(moneycount,"Money","Money Earned");
      JFreeChart chart=ChartFactory.createBarChart("Statistics Per User", "", "", dataset, PlotOrientation.VERTICAL, false, true, false);
      CategoryPlot catPlot=chart.getCategoryPlot();
      catPlot.setRangeGridlinePaint(Color.red);
      ChartFrame frame1=new ChartFrame("Tickets Per User",chart);

   
        frame1.setVisible(true);
        frame1.setSize(500,500);
        moneycount=0;
    }//GEN-LAST:event_Select_ButtonActionPerformed

    private void Select_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_Button2ActionPerformed
     

        try{
            DefaultCategoryDataset dataset= new DefaultCategoryDataset();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql5="Select * from Matches;";
            PreparedStatement pst5 = con.prepareStatement(sql5);
            ResultSet rs5=pst5.executeQuery();
            while(rs5.next()){
                dataset.setValue(rs5.getInt("counter"),"Tickets",rs5.getString("Team_A")+rs5.getString("team_B"));
            }
            
        JFreeChart chart=ChartFactory.createBarChart("Tickets Per Match", "", "", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot catPlot=chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.red);

        ChartFrame frame1=new ChartFrame("Tickets Per Match",chart);
        //chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));

        frame1.setVisible(true);
        frame1.setSize(500,500);
        
        } catch(Exception e){
            System.out.println("Error Creating Charts");
        }
        

       

    }//GEN-LAST:event_Select_Button2ActionPerformed

    private void Select_Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_Button2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_Button2MouseExited

    private void Select_Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_Button2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_Button2MouseEntered

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
            java.util.logging.Logger.getLogger(Admin_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JLabel Mundial_icon;
    private javax.swing.JButton Select_Button;
    private javax.swing.JButton Select_Button2;
    private javax.swing.JPanel SidePannel;
    private javax.swing.JPanel Statistics_Pannel;
    private javax.swing.JLabel Statistics_icon;
    private javax.swing.JLabel Statistics_label;
    private javax.swing.JPanel Title_Pannel;
    private javax.swing.JLabel Title_label;
    private javax.swing.JPanel Update_Pannel;
    private javax.swing.JLabel Update_icon;
    private javax.swing.JLabel Update_label;
    private javax.swing.JScrollPane UserList;
    private javax.swing.JLabel User_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
