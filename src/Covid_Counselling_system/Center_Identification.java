package Covid_Counselling_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class Center_Identification extends javax.swing.JFrame {
    public Center_Identification() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NAME_OF_CENTER = new javax.swing.JTextField();
        DEPARTMENT = new javax.swing.JTextField();
        PINCODE = new javax.swing.JTextField();
        IDENTIFICATION_DETAILS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        EDITBTN = new javax.swing.JButton();
        ADDBTN = new javax.swing.JButton();
        CLOSEBTN = new javax.swing.JButton();
        RESETBTN = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COVID CENTER IDENTIFICATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PINCODE");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEPARTMENT");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME OF CENTER");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IDENTIFICATION DETAILS");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS");

        NAME_OF_CENTER.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        DEPARTMENT.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        PINCODE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        IDENTIFICATION_DETAILS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        ADDRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADDRESS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDENTIFICATION_DETAILS, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAME_OF_CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPARTMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PINCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAME_OF_CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DEPARTMENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PINCODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDENTIFICATION_DETAILS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        EDITBTN.setBackground(new java.awt.Color(255, 153, 0));
        EDITBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        EDITBTN.setText("EDIT DETAILS");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });

        ADDBTN.setBackground(new java.awt.Color(102, 255, 0));
        ADDBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        ADDBTN.setText("ADD RECORD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        CLOSEBTN.setBackground(new java.awt.Color(255, 0, 0));
        CLOSEBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CLOSEBTN.setText("CLOSE");
        CLOSEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEBTNActionPerformed(evt);
            }
        });

        RESETBTN.setBackground(new java.awt.Color(0, 153, 204));
        RESETBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(102, 102, 255));
        Back1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Back1.setText("BACK");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addComponent(Back1)
                .addGap(18, 18, 18)
                .addComponent(RESETBTN)
                .addGap(18, 18, 18)
                .addComponent(CLOSEBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLOSEBTN)
                    .addComponent(Back1)
                    .addComponent(ADDBTN)
                    .addComponent(EDITBTN)
                    .addComponent(RESETBTN))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "insert into center(NAME_OF_CENTER,DEPARTMENT,ADDRESS,PINCODE,IDENTIFICATION_DETAILS) values(?,?,?,?,?)";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, NAME_OF_CENTER.getText());
            stmt.setString(2,DEPARTMENT.getText());
            stmt.setString(3,ADDRESS.getText());
            stmt.setInt(4,Integer.parseInt(PINCODE.getText()));           
            stmt.setString(5,IDENTIFICATION_DETAILS.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Inserted Successfully!!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "Update center set NAME_OF_CENTER = ?,DEPARTMENT = ?,ADDRESS = ?,PINCODE = ?,IDENTIFICATION_DETAILS = ? ";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, NAME_OF_CENTER.getText());
            stmt.setString(2,DEPARTMENT.getText());
            stmt.setString(3,ADDRESS.getText());
            stmt.setInt(4,Integer.parseInt(PINCODE.getText()));           
            stmt.setString(5,IDENTIFICATION_DETAILS.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPDATED!!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void CLOSEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEBTNActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CLOSEBTNActionPerformed

    private void RESETBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBTNActionPerformed
        // TODO add your handling code here:
        NAME_OF_CENTER.setText(null);
        DEPARTMENT.setText(null);
        ADDRESS.setText(null);
        PINCODE.setText(null);
        IDENTIFICATION_DETAILS.setText(null);
    }//GEN-LAST:event_RESETBTNActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back1ActionPerformed

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
            java.util.logging.Logger.getLogger(Center_Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Center_Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Center_Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Center_Identification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Center_Identification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JButton Back1;
    private javax.swing.JButton CLOSEBTN;
    private javax.swing.JTextField DEPARTMENT;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField IDENTIFICATION_DETAILS;
    private javax.swing.JTextField NAME_OF_CENTER;
    private javax.swing.JTextField PINCODE;
    private javax.swing.JButton RESETBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
