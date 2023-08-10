package Covid_Counselling_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class OfficeImpanelment extends javax.swing.JFrame {
public OfficeImpanelment() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DATE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MALE = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DEP_WORK = new javax.swing.JTextField();
        FEMALE = new javax.swing.JRadioButton();
        NAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CON_NO = new javax.swing.JTextField();
        OTHER = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ADDBTN = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        CLOSEBTN = new javax.swing.JButton();
        RESETBTN = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COVID OFFICE IMPANELMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("DATE");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("DEPARTMENT OF WORK");

        DATE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("EMAIL ID");

        MALE.setBackground(new java.awt.Color(51, 51, 51));
        MALE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 204, 0));
        MALE.setText("MALE");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("ADDRESS");

        EMAIL.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        AGE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("AGE");

        DEP_WORK.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        FEMALE.setBackground(new java.awt.Color(51, 51, 51));
        FEMALE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FEMALE.setForeground(new java.awt.Color(255, 204, 0));
        FEMALE.setText("FEMALE");

        NAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("GENDER");

        CON_NO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        OTHER.setBackground(new java.awt.Color(51, 51, 51));
        OTHER.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OTHER.setForeground(new java.awt.Color(255, 204, 0));
        OTHER.setText("OTHER");

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        ADDRESS.setTabSize(4);
        ADDRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADDRESS);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("CONTACT NO");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(MALE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FEMALE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OTHER))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DEP_WORK, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CON_NO, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MALE)
                    .addComponent(FEMALE)
                    .addComponent(OTHER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CON_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DEP_WORK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        ADDBTN.setBackground(new java.awt.Color(0, 153, 0));
        ADDBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ADDBTN.setForeground(new java.awt.Color(255, 255, 255));
        ADDBTN.setText("ADD RECORD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EDITBTN.setBackground(new java.awt.Color(255, 153, 51));
        EDITBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EDITBTN.setForeground(new java.awt.Color(255, 255, 255));
        EDITBTN.setText("EDIT DETAILS");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });

        CLOSEBTN.setBackground(new java.awt.Color(204, 0, 0));
        CLOSEBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CLOSEBTN.setForeground(new java.awt.Color(255, 255, 255));
        CLOSEBTN.setText("CLOSE");
        CLOSEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEBTNActionPerformed(evt);
            }
        });

        RESETBTN.setBackground(new java.awt.Color(153, 0, 204));
        RESETBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RESETBTN.setForeground(new java.awt.Color(255, 255, 255));
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(204, 102, 0));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE RECORDS");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(0, 0, 204));
        Back1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back1.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ADDBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RESETBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EDITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CLOSEBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDBTN)
                    .addComponent(EDITBTN)
                    .addComponent(DELETE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RESETBTN)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back1)
                            .addComponent(CLOSEBTN))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "insert into office (NAME,DATE,AGE,GENDER,EMAIL,CON_NO,ADDRESS,DEP_WORK) values(?,?,?,?,?,?,?,?)";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, NAME.getText());
            stmt.setString(2,DATE.getText());
            stmt.setString(3,AGE.getText());
            
            if(MALE.isSelected()){
                stmt.setString(4, MALE.getText());
            }
            if(FEMALE.isSelected()){
                stmt.setString(4, FEMALE.getText());
            }
            if(OTHER.isSelected()){
                stmt.setString(4, OTHER.getText());
            }
            
            stmt.setString(5,EMAIL.getText());           
            stmt.setString(6,CON_NO.getText());
            stmt.setString(7,ADDRESS.getText());
            stmt.setString(8,DEP_WORK.getText());         
            
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
            String s1 = "Update office set NAME = ?,DATE = ?,AGE = ?,GENDER = ?,EMAIL = ?,CON_NO = ?,ADDRESS = ?,DEP_WORK = ? ";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, NAME.getText());
            stmt.setString(2,DATE.getText());
            stmt.setString(3,AGE.getText());
            
            if(MALE.isSelected()){
                stmt.setString(4, MALE.getText());
            }
            if(FEMALE.isSelected()){
                stmt.setString(4, FEMALE.getText());
            }
            if(OTHER.isSelected()){
                stmt.setString(4, OTHER.getText());
            }
            
            stmt.setString(5,EMAIL.getText());           
            stmt.setString(6,CON_NO.getText());
            stmt.setString(7,ADDRESS.getText());
            stmt.setString(8,DEP_WORK.getText());         
            
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
        NAME.setText(null);
        DATE.setText(null);
        AGE.setText(null);
        EMAIL.setText(null);
        CON_NO.setText(null);
        ADDRESS.setText(null);
        DEP_WORK.setText(null);
    }//GEN-LAST:event_RESETBTNActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "DELETE FROM office where NAME =?";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1,NAME.getText());
            stmt.execute();
            JOptionPane.showMessageDialog(rootPane,"Deleted Successfully!!");
            conn.close();
        } 
        catch(SQLException e)
                {
                JOptionPane.showMessageDialog(rootPane,e);
                }
    }//GEN-LAST:event_DELETEActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back1ActionPerformed

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
            java.util.logging.Logger.getLogger(OfficeImpanelment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficeImpanelment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficeImpanelment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficeImpanelment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficeImpanelment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JTextField AGE;
    private javax.swing.JButton Back1;
    private javax.swing.JButton CLOSEBTN;
    private javax.swing.JTextField CON_NO;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DEP_WORK;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField NAME;
    private javax.swing.JRadioButton OTHER;
    private javax.swing.JButton RESETBTN;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
