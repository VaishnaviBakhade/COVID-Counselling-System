package Covid_Counselling_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class Employee_Registeration extends javax.swing.JFrame {
    public Employee_Registeration() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EMP_NAME = new javax.swing.JTextField();
        REG_DATE = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        OTHER = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        CONTACT_NO = new javax.swing.JTextField();
        AADHARCARD_NO = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        LAST_WORK_PLACE = new javax.swing.JTextField();
        EXPERIENCE = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ADDBTN = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        CLOSEBTN = new javax.swing.JButton();
        RESETBTN = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();

        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COVID CENTRE EMPLOYEE REGISTERATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE NAME");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTERATION DATE");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGE");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENDER");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NO");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AADHARCARD NO");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL ID");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LAST WORK PLACE");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EXPERIENCE");

        EMP_NAME.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        REG_DATE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        AGE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        MALE.setBackground(new java.awt.Color(0, 0, 102));
        MALE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 255, 255));
        MALE.setText("MALE");

        FEMALE.setBackground(new java.awt.Color(0, 0, 102));
        FEMALE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FEMALE.setForeground(new java.awt.Color(255, 255, 255));
        FEMALE.setText("FEMALE");

        OTHER.setBackground(new java.awt.Color(0, 0, 102));
        OTHER.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OTHER.setForeground(new java.awt.Color(255, 255, 255));
        OTHER.setText("OTHER");

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        ADDRESS.setTabSize(4);
        ADDRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADDRESS);

        CONTACT_NO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        AADHARCARD_NO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        EMAIL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        LAST_WORK_PLACE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        EXPERIENCE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(MALE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FEMALE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OTHER))
                    .addComponent(AADHARCARD_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EMAIL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(LAST_WORK_PLACE, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EXPERIENCE, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(CONTACT_NO, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EMP_NAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(REG_DATE, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMP_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MALE)
                    .addComponent(FEMALE)
                    .addComponent(OTHER))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CONTACT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AADHARCARD_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LAST_WORK_PLACE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EXPERIENCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));

        ADDBTN.setBackground(new java.awt.Color(0, 153, 0));
        ADDBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ADDBTN.setForeground(new java.awt.Color(255, 255, 255));
        ADDBTN.setText("ADD RECORD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EDITBTN.setBackground(new java.awt.Color(255, 102, 0));
        EDITBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EDITBTN.setText("EDIT DEATAILS");
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

        RESETBTN.setBackground(new java.awt.Color(255, 102, 102));
        RESETBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(0, 153, 255));
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
                    .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EDITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RESETBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CLOSEBTN)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADDBTN)
                            .addComponent(EDITBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back1)
                            .addComponent(RESETBTN)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(CLOSEBTN)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "insert into employee(EMP_NAME,REG_DATE,AGE,GENDER,ADDRESS,CONTACT_NO,AADHARCARD_NO,EMAIL,LAST_WORK_PLACE,EXPERIENCE) values(?,?,?,?,?,?,?,?,?,?)";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, EMP_NAME.getText());
            stmt.setString(2,REG_DATE.getText());
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
            stmt.setString(5,ADDRESS.getText());           
            stmt.setString(6,CONTACT_NO.getText());           
            stmt.setString(7,AADHARCARD_NO.getText());
            stmt.setString(8,EMAIL.getText());
            stmt.setString(9,LAST_WORK_PLACE.getText());
            stmt.setString(10,EXPERIENCE.getText());
            
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
            String s1 = "UPDATE employee set EMP_NAME = ?,REG_DATE = ?,AGE = ?,GENDER = ?,ADDRESS = ?,CONTACT_NO = ?,AADHARCARD_NO = ?,EMAIL = ?,LAST_WORK_PLACE = ?,EXPERIENCE = ?";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1, EMP_NAME.getText());
            stmt.setString(2,REG_DATE.getText());
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
            stmt.setString(5,ADDRESS.getText());           
            stmt.setString(6,CONTACT_NO.getText());           
            stmt.setString(7,AADHARCARD_NO.getText());
            stmt.setString(8,EMAIL.getText());
            stmt.setString(9,LAST_WORK_PLACE.getText());
            stmt.setString(10,EXPERIENCE.getText());
            
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
        EMP_NAME.setText(null);
        REG_DATE.setText(null);
        AGE.setText(null);
        ADDRESS.setText(null);
        CONTACT_NO.setText(null);
        AADHARCARD_NO.setText(null);
        EMAIL.setText(null);
        LAST_WORK_PLACE.setText(null);
        EXPERIENCE.setText(null);
    }//GEN-LAST:event_RESETBTNActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Registeration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AADHARCARD_NO;
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JTextField AGE;
    private javax.swing.JButton Back;
    private javax.swing.JButton Back1;
    private javax.swing.JButton CLOSEBTN;
    private javax.swing.JTextField CONTACT_NO;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField EMP_NAME;
    private javax.swing.JTextField EXPERIENCE;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JTextField LAST_WORK_PLACE;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JRadioButton OTHER;
    private javax.swing.JTextField REG_DATE;
    private javax.swing.JButton RESETBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
