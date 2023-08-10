package Covid_Counselling_system;
import java.sql.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Counselling_Recommendation extends javax.swing.JFrame {

    public Counselling_Recommendation() {
        initComponents();
        YOGA.setEnabled(false);
        EXERCISE.setEnabled(false);
        RELAXATION.setEnabled(false);
        DIETPLAN.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MOBILE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DIETPLAN = new javax.swing.JButton();
        RELAXATION = new javax.swing.JButton();
        EXERCISE = new javax.swing.JButton();
        YOGA = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COUNSELLING RECOMMENDATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        MOBILE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        MOBILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILEActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MOBILE NO");

        jTextField1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRATION NO.");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("+ 91");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIET PLAN");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RELAXATION TECHNIC");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXERCISE");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("YOGA");
        jLabel2.setToolTipText("");

        DIETPLAN.setBackground(new java.awt.Color(0, 0, 0));
        DIETPLAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DIETPLAN.setForeground(new java.awt.Color(255, 255, 255));
        DIETPLAN.setText("DIET PLAN PDF");
        DIETPLAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIETPLANActionPerformed(evt);
            }
        });

        RELAXATION.setBackground(new java.awt.Color(0, 0, 0));
        RELAXATION.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RELAXATION.setForeground(new java.awt.Color(255, 255, 255));
        RELAXATION.setText("RELAXATION TECHNIC PDF");
        RELAXATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RELAXATIONActionPerformed(evt);
            }
        });

        EXERCISE.setBackground(new java.awt.Color(0, 0, 0));
        EXERCISE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EXERCISE.setForeground(new java.awt.Color(255, 255, 255));
        EXERCISE.setText("EXERCISE PDF");
        EXERCISE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXERCISEActionPerformed(evt);
            }
        });

        YOGA.setBackground(new java.awt.Color(0, 0, 0));
        YOGA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YOGA.setForeground(new java.awt.Color(255, 255, 255));
        YOGA.setText("YOGA PDF");
        YOGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YOGAActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THERAPY NAME/DISCRIPTION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EXERCISE)
                                    .addComponent(YOGA)
                                    .addComponent(RELAXATION)
                                    .addComponent(DIETPLAN)))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YOGA)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EXERCISE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(RELAXATION, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIETPLAN)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXERCISEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXERCISEActionPerformed
        // TODO add your handling code here:
        try{
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\BreathingExercises.PDF");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_EXERCISEActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String get= jTextField1.getText();
        if(get.equals("1"))
        {
         YOGA.setEnabled(true);
         EXERCISE.setEnabled(false);
         RELAXATION.setEnabled(false);
         DIETPLAN.setEnabled(false);
         
        }
        else if(get.equals("2"))
        {
        YOGA.setEnabled(false);
         EXERCISE.setEnabled(true);
         RELAXATION.setEnabled(false);
         DIETPLAN.setEnabled(false);
             
        }
        else if(get.equals("3"))
        {
        YOGA.setEnabled(false);
         EXERCISE.setEnabled(false);
         RELAXATION.setEnabled(true);
         DIETPLAN.setEnabled(false);
        }
        else if(get.equals("4"))
        {
        YOGA.setEnabled(false);
         EXERCISE.setEnabled(false);
         RELAXATION.setEnabled(false);
         DIETPLAN.setEnabled(true);
                 
        }
        else
        {
         YOGA.setEnabled(false);
         EXERCISE.setEnabled(false);
         RELAXATION.setEnabled(false);
         DIETPLAN.setEnabled(false);
        }    
        
        
               
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void YOGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YOGAActionPerformed
        // TODO add your handling code here:
        try
        {
         File file =new File("C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\yogas.PDF");
         if(file.exists())
         {
             if(Desktop.isDesktopSupported())
             {
                 Desktop.getDesktop().open(file);
              }
             else
             {
                 JOptionPane.showMessageDialog(this,"Not supported ");
             }
             }
        }
        catch(Exception e)
          {
                               JOptionPane.showMessageDialog(this,e);

          }
    }//GEN-LAST:event_YOGAActionPerformed

    private void MOBILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILEActionPerformed
        // TODO add your handling code here:
         try
        {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
        String s1 = "select * from counsellingcounseller where  CONTACT_NO like '"+MOBILE.getText()+"%'";     
        PreparedStatement pst= conn.prepareStatement(s1);   
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
        jTextField1.setText(rs.getString("Recommend")); 
        }
        else
        {
        jTextField1.setText(null);
        MOBILE.setText(null);
                }
        
        }
        catch(SQLException e)
        {
                               JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_MOBILEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
           menu.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DIETPLANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIETPLANActionPerformed
        // TODO add your handling code here:
        try{
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\dietplan.PDF");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_DIETPLANActionPerformed

    private void RELAXATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RELAXATIONActionPerformed
        // TODO add your handling code here:
        try{
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\RelaxationTechniques.PDF");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_RELAXATIONActionPerformed

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
            java.util.logging.Logger.getLogger(Counselling_Recommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counselling_Recommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counselling_Recommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counselling_Recommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counselling_Recommendation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIETPLAN;
    private javax.swing.JButton EXERCISE;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JButton RELAXATION;
    private javax.swing.JButton YOGA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
