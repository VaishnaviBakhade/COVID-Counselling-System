package Covid_Counselling_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class Counselling_QualifiedCounseller extends javax.swing.JFrame
{
    public Counselling_QualifiedCounseller() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DATE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PATIENT_NAME = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        MALEBTN = new javax.swing.JRadioButton();
        FEMALEBTN = new javax.swing.JRadioButton();
        OTHERBTN = new javax.swing.JRadioButton();
        CONTACT_NO = new javax.swing.JTextField();
        MEDICAL_HISTORY = new javax.swing.JTextField();
        COUNSELLER_NAME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Remmend = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        EDITBTN = new javax.swing.JButton();
        ADDBTN = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COUNSELLING BY QUALIFIED COUNSELLER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        DATE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGE");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENDER");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTACT_NO");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MEDICAL_HISTORY");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COUNSELLER NAME TO BE COUNSELLING");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATE");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PATIENT_NAME");

        PATIENT_NAME.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        AGE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MALEBTN.setBackground(new java.awt.Color(153, 153, 153));
        MALEBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MALEBTN.setForeground(new java.awt.Color(255, 255, 255));
        MALEBTN.setText("MALE");
        MALEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEBTNActionPerformed(evt);
            }
        });

        FEMALEBTN.setBackground(new java.awt.Color(153, 153, 153));
        FEMALEBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FEMALEBTN.setForeground(new java.awt.Color(255, 255, 255));
        FEMALEBTN.setText("FEMALE");

        OTHERBTN.setBackground(new java.awt.Color(153, 153, 153));
        OTHERBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OTHERBTN.setForeground(new java.awt.Color(255, 255, 255));
        OTHERBTN.setText("OTHER");

        CONTACT_NO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MEDICAL_HISTORY.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        COUNSELLER_NAME.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RECOMMEND NO");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COUNSELEE DETAILS");

        Remmend.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Remmend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemmendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MALEBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FEMALEBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OTHERBTN))
                            .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PATIENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 69, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CONTACT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEDICAL_HISTORY, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COUNSELLER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Remmend, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PATIENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MALEBTN)
                    .addComponent(FEMALEBTN)
                    .addComponent(OTHERBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CONTACT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MEDICAL_HISTORY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COUNSELLER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Remmend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        EDITBTN.setBackground(new java.awt.Color(255, 153, 0));
        EDITBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EDITBTN.setForeground(new java.awt.Color(255, 255, 255));
        EDITBTN.setText("EDIT DETAILS");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });

        ADDBTN.setBackground(new java.awt.Color(0, 153, 0));
        ADDBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ADDBTN.setForeground(new java.awt.Color(255, 255, 255));
        ADDBTN.setText("ADD RECORD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        CLOSE.setBackground(new java.awt.Color(0, 51, 204));
        CLOSE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 102, 102));
        RESET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(102, 0, 102));
        BACK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADDBTN)
                .addGap(18, 18, 18)
                .addComponent(EDITBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RESET)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CLOSE)
                .addGap(18, 18, 18)
                .addComponent(BACK)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDBTN)
                    .addComponent(EDITBTN)
                    .addComponent(CLOSE)
                    .addComponent(RESET)
                    .addComponent(BACK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MALEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MALEBTNActionPerformed

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "insert into counsellingcounseller(date, patient_name,age,gender,contact_no, medical_history,counseller_name,recommend) values (?,?,?,?,?,?,?,?)";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, DATE.getText());
            stmt.setString(2,PATIENT_NAME.getText());
            stmt.setString(3,AGE.getText());
            
            if(MALEBTN.isSelected()){
                stmt.setString(4, MALEBTN.getText());
            }
            if(FEMALEBTN.isSelected()){
                stmt.setString(4, FEMALEBTN.getText());
            }
            if(OTHERBTN.isSelected()){
                stmt.setString(4, OTHERBTN.getText());
            }
            stmt.setString(5,CONTACT_NO.getText());           
            stmt.setString(6,MEDICAL_HISTORY.getText());
            stmt.setString(7,COUNSELLER_NAME.getText());
            stmt.setString(8,Remmend.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"INSERT SUCCESSFULLY!!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "UPDATE counsellingcounseller set DATE = ?,PATIENT_NAME = ?,AGE = ?,GENDER = ?,CONTACT_NO = ?,MEDICAL_HISTORY = ?,COUNSELLER_NAME = ?,remmend = ?";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, DATE.getText());
            stmt.setString(2,PATIENT_NAME.getText());
            stmt.setString(3,AGE.getText());
            
            if(MALEBTN.isSelected()){
                stmt.setString(4, MALEBTN.getText());
            }
            if(FEMALEBTN.isSelected()){
                stmt.setString(4, FEMALEBTN.getText());
            }
            if(OTHERBTN.isSelected()){
                stmt.setString(4, OTHERBTN.getText());
            }
            stmt.setString(5,CONTACT_NO.getText());           
            stmt.setString(6,MEDICAL_HISTORY.getText());
            stmt.setString(7,COUNSELLER_NAME.getText());
            stmt.setString(8,Remmend.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPDATED!!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        dispose();
    }//GEN-LAST:event_CLOSEActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        DATE.setText(null);
        PATIENT_NAME.setText(null);
        AGE.setText(null);
        CONTACT_NO.setText(null);
        MEDICAL_HISTORY.setText(null);
        COUNSELLER_NAME.setText(null);
        Remmend.setText(null);
    }//GEN-LAST:event_RESETActionPerformed

    private void RemmendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemmendActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_RemmendActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(Counselling_QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counselling_QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counselling_QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counselling_QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counselling_QualifiedCounseller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextField AGE;
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLOSE;
    private javax.swing.JTextField CONTACT_NO;
    private javax.swing.JTextField COUNSELLER_NAME;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JRadioButton FEMALEBTN;
    private javax.swing.JRadioButton MALEBTN;
    private javax.swing.JTextField MEDICAL_HISTORY;
    private javax.swing.JRadioButton OTHERBTN;
    private javax.swing.JTextField PATIENT_NAME;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField Remmend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
