/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dsola
 */
public class Admin_Update extends javax.swing.JFrame {
String Team1;
String Team2;
    /**
     * Creates new form Admin_Update
     */
    public Admin_Update() {
        initComponents();
        fillListBox();
       
    }
    
     private void fillListBox(){
    
    DefaultListModel m = new DefaultListModel();
               
    try{

           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Project_db;user=sa;password=asdfghjkl12");
            String sql="Select * from Matches";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs1=pst.executeQuery();
            String Hello;
              while(rs1.next()){
                    Hello=rs1.getString("Team_A") + rs1.getString("team_B");
                     m.addElement(Hello); 
                     
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
        Date_label = new javax.swing.JLabel();
        Time_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Update_Button = new javax.swing.JButton();
        Addmatch_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 500));

        Base.setBackground(new java.awt.Color(241, 239, 241));

        SidePannel.setBackground(new java.awt.Color(33, 40, 51));

        Mundial_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/Cashier_icon_50x50.png"))); // NOI18N

        Update_Pannel.setBackground(new java.awt.Color(33, 40, 51));
        Update_Pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_PannelMouseExited(evt);
            }
        });

        Update_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/UpdateImage.png"))); // NOI18N

        Update_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Statistics_PannelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Statistics_PannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Statistics_PannelMouseExited(evt);
            }
        });

        Statistics_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiPackage/Images/StatisticsImage.png"))); // NOI18N

        Statistics_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addContainerGap(282, Short.MAX_VALUE))
        );

        Title_Pannel.setBackground(new java.awt.Color(54, 63, 75));

        Title_label.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Title_label.setForeground(new java.awt.Color(255, 255, 255));
        Title_label.setText("Update Matches");

        Date_label.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Date_label.setText("Date");

        Time_label.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Time_label.setText("Time");

        javax.swing.GroupLayout Title_PannelLayout = new javax.swing.GroupLayout(Title_Pannel);
        Title_Pannel.setLayout(Title_PannelLayout);
        Title_PannelLayout.setHorizontalGroup(
            Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Title_PannelLayout.createSequentialGroup()
                        .addComponent(Date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        Title_PannelLayout.setVerticalGroup(
            Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_PannelLayout.createSequentialGroup()
                .addComponent(Title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Title_PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Date_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jList1.setBackground(new java.awt.Color(54, 63, 75));
        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        Update_Button.setBackground(new java.awt.Color(33, 40, 51));
        Update_Button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Update_Button.setText("Update");
        Update_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update_ButtonMouseExited(evt);
            }
        });
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Addmatch_button.setBackground(new java.awt.Color(33, 40, 51));
        Addmatch_button.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Addmatch_button.setText("Add Match");
        Addmatch_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Addmatch_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Addmatch_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Addmatch_buttonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLayout.createSequentialGroup()
                .addComponent(SidePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title_Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BaseLayout.createSequentialGroup()
                                .addComponent(Addmatch_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );
        BaseLayout.setVerticalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BaseLayout.createSequentialGroup()
                .addComponent(Title_Pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Button)
                    .addComponent(Addmatch_button))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void Addmatch_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addmatch_buttonMouseEntered
        Addmatch_button.setCursor(new Cursor(HAND_CURSOR));
        Addmatch_button.setBackground(new Color(54,63,75));
        Addmatch_button.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Addmatch_buttonMouseEntered

    private void Addmatch_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addmatch_buttonMouseExited
        Addmatch_button.setBackground(new Color(33,40,51));
        Addmatch_button.setForeground(new Color(222,222,222));
    }//GEN-LAST:event_Addmatch_buttonMouseExited

    private void Update_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_ButtonMouseEntered
        Update_Button.setCursor(new Cursor(HAND_CURSOR));
        Update_Button.setBackground(new Color(54,63,75));
        Update_Button.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Update_ButtonMouseEntered

    private void Update_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_ButtonMouseExited
        Update_Button.setBackground(new Color(33,40,51));
        Update_Button.setForeground(new Color(222,222,222));
    }//GEN-LAST:event_Update_ButtonMouseExited

    private void Statistics_PannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Statistics_PannelMouseClicked
        Admin_Statistics Window = new Admin_Statistics();
        Window.setVisible(true);
       
    }//GEN-LAST:event_Statistics_PannelMouseClicked

    private void Addmatch_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addmatch_buttonMouseClicked
       if(jList1.isSelectionEmpty()){
             JOptionPane.showMessageDialog(null,"You Must Select Item from List"); 
        }else{
        AddMatch Window = new AddMatch();
        Window.setVisible(true);
       }
    }//GEN-LAST:event_Addmatch_buttonMouseClicked

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
     if(jList1.isSelectionEmpty()){
             JOptionPane.showMessageDialog(null,"You Must Select Item from List"); 
        }
     else{
        EditMatch Window = new EditMatch(jList1.getSelectedValue());
        Window.setVisible(true);
        
     }
    }//GEN-LAST:event_Update_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addmatch_button;
    private javax.swing.JPanel Base;
    private javax.swing.JLabel Date_label;
    private javax.swing.JLabel Mundial_icon;
    private javax.swing.JPanel SidePannel;
    private javax.swing.JPanel Statistics_Pannel;
    private javax.swing.JLabel Statistics_icon;
    private javax.swing.JLabel Statistics_label;
    private javax.swing.JLabel Time_label;
    private javax.swing.JPanel Title_Pannel;
    private javax.swing.JLabel Title_label;
    private javax.swing.JButton Update_Button;
    private javax.swing.JPanel Update_Pannel;
    private javax.swing.JLabel Update_icon;
    private javax.swing.JLabel Update_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}