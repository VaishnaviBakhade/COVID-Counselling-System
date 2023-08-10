package Covid_Counselling_system;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class Covid_Doctor extends javax.swing.JFrame {
    String link = "jdbc:mysl://localhost:33066/Counselee";
    String users = "root";
    String Password = "root@Vaishnu";
    public Covid_Doctor() {
        initComponents();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DATE.setText(format.format(date));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DATE = new javax.swing.JTextField();
        PATIENT_NAME = new javax.swing.JTextField();
        CONTACT_NO = new javax.swing.JTextField();
        CLOSE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        medicalprescription = new javax.swing.JCheckBox();
        dietplan = new javax.swing.JCheckBox();
        BACK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SEARCH_PATIENT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ALLOCATION_DOCTOR = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        DOCTOR_SEARCH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COUNSELLING BY COVID DOCTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATE");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PATIENT NAME");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTACT NO");

        DATE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        PATIENT_NAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        PATIENT_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PATIENT_NAMEActionPerformed(evt);
            }
        });

        CONTACT_NO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        CLOSE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        RESET.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RECOMMENDATION");

        medicalprescription.setBackground(new java.awt.Color(51, 0, 51));
        medicalprescription.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        medicalprescription.setForeground(new java.awt.Color(255, 255, 255));
        medicalprescription.setText("MEDICAL PRESCRIPTION");
        medicalprescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalprescriptionActionPerformed(evt);
            }
        });

        dietplan.setBackground(new java.awt.Color(51, 0, 51));
        dietplan.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        dietplan.setForeground(new java.awt.Color(255, 255, 255));
        dietplan.setText("DIET PLAN");
        dietplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietplanActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SEARCH_PATIENT.setBackground(new java.awt.Color(0, 0, 102));
        SEARCH_PATIENT.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        SEARCH_PATIENT.setForeground(new java.awt.Color(255, 255, 255));
        SEARCH_PATIENT.setText("SEARCH");
        SEARCH_PATIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_PATIENTActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 153, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DOCTOR ALLOCTION NO");

        ALLOCATION_DOCTOR.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jTable3.setBackground(new java.awt.Color(255, 153, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        DOCTOR_SEARCH.setBackground(new java.awt.Color(0, 0, 102));
        DOCTOR_SEARCH.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        DOCTOR_SEARCH.setForeground(new java.awt.Color(255, 255, 255));
        DOCTOR_SEARCH.setText("SEARCH");
        DOCTOR_SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOCTOR_SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PATIENT_NAME, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(CONTACT_NO))
                        .addGap(100, 100, 100)
                        .addComponent(SEARCH_PATIENT)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dietplan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(medicalprescription)
                                .addGap(48, 48, 48)
                                .addComponent(DOCTOR_SEARCH))
                            .addComponent(ALLOCATION_DOCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(RESET)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(BACK)
                        .addGap(64, 64, 64)
                        .addComponent(CLOSE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PATIENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CONTACT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ALLOCATION_DOCTOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(medicalprescription)
                            .addComponent(DOCTOR_SEARCH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dietplan)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RESET)
                            .addComponent(jButton1)
                            .addComponent(BACK)
                            .addComponent(CLOSE))
                        .addGap(189, 189, 189))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(SEARCH_PATIENT)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            PreparedStatement pst = conn.prepareStatement("DELETE FROM counsellingdoctor where CONTACT_NO = "+ CONTACT_NO.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Delete Successfully.!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void dietplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietplanActionPerformed
        // TODO add your handling code here:
        try{
            if(dietplan.isSelected())
            {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\DietPlan.PDF");
            }
            else
            {
                dietplan.setSelected(false);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_dietplanActionPerformed

    private void medicalprescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalprescriptionActionPerformed
        // TODO add your handling code here:
        try{
            if(medicalprescription.isSelected())
            {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\Dell\\Downloads\\Capstone Project Planning\\Files PDF\\medicalprescription.PDF");
            }
            else
            {
                medicalprescription.setSelected(false);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_medicalprescriptionActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        PATIENT_NAME.setText(null);
        CONTACT_NO.setText(null);
        medicalprescription.setSelected(false);
        dietplan.setSelected(false);
        ALLOCATION_DOCTOR.setText(null);
    }//GEN-LAST:event_RESETActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void PATIENT_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PATIENT_NAMEActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1= "select * from counsellingdoctor where PATIENT_NAME like'"+PATIENT_NAME.getText()+"%'";
            PreparedStatement stmt = conn.prepareStatement(s1);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()==true)
            {
                PATIENT_NAME.setText(rs.getString(2));
                CONTACT_NO.setText(rs.getString(5));
                if(rs.getString(10)!=null)
                switch(rs.getString(10)){
                    case "Medical Prescription"->medicalprescription.setSelected(true);
                    case "Diet Plan"->dietplan.setSelected(true);
                    default->
                    {
                        medicalprescription.setSelected(false);
                        dietplan.setSelected(false);
                    }
                }
            }
            else{
                PATIENT_NAME.setText(null);
                CONTACT_NO.setText(null);
                medicalprescription.setSelected(false);
                dietplan.setSelected(false);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_PATIENT_NAMEActionPerformed

    private void SEARCH_PATIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_PATIENTActionPerformed
        try{
            Connection con = DriverManager.getConnection(link,users,Password);
            PreparedStatement pst = con.prepareStatement("Select * from <tablename> where PATIENT_NAME = " + PATIENT_NAME.getText());
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(this,sql);
        }
    }//GEN-LAST:event_SEARCH_PATIENTActionPerformed

    private void DOCTOR_SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOCTOR_SEARCHActionPerformed
        try{
            Connection con = DriverManager.getConnection(link,users,Password);
            PreparedStatement pst = con.prepareStatement("Select * from <tablename> where Recommand_no = " + ALLOCATION_DOCTOR.getText());
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(this,sql);
        }
    }//GEN-LAST:event_DOCTOR_SEARCHActionPerformed

                    
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
            java.util.logging.Logger.getLogger(Covid_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Covid_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Covid_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Covid_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Covid_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALLOCATION_DOCTOR;
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLOSE;
    private javax.swing.JTextField CONTACT_NO;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton DOCTOR_SEARCH;
    private javax.swing.JTextField PATIENT_NAME;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH_PATIENT;
    private javax.swing.JCheckBox dietplan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JCheckBox medicalprescription;
    // End of variables declaration//GEN-END:variables
}
