package Covid_Counselling_system;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class CounseleeGenerateReport extends javax.swing.JFrame
{
String path="jdbc:mysql://localhost:33066/Counselee";
String User="root";
String Password="root@Vaishnu";
    public CounseleeGenerateReport() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        AdharNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RegDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Symptoms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MobNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MEDHISTORY = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Occupation = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRESS = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Blood = new javax.swing.JTextField();
        CouNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        GENERATE = new javax.swing.JButton();
        PRINT_RECORD = new javax.swing.JButton();
        BACK_BTN = new javax.swing.JButton();
        RESET_BTN = new javax.swing.JButton();
        EXIT_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COUNSELEE REPORT GENERATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));

        AdharNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AADHAR CARD");

        RegDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        RegDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COUNSELEE NAME");

        Symptoms.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MOBILE NO.");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AGE");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BLOOD GROUP");

        MobNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MobNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MEDHISTORY.setColumns(20);
        MEDHISTORY.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MEDHISTORY.setLineWrap(true);
        MEDHISTORY.setRows(5);
        MEDHISTORY.setTabSize(4);
        MEDHISTORY.setWrapStyleWord(true);
        jScrollPane2.setViewportView(MEDHISTORY);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRATION DATE");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GENDER");

        DOB.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MEDICAL HISTORY");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("+ 91");

        Occupation.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COU-");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SYMPTOMS");

        ADRESS.setColumns(20);
        ADRESS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        ADRESS.setLineWrap(true);
        ADRESS.setRows(5);
        ADRESS.setTabSize(4);
        ADRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRESS);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS");

        Blood.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        CouNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CouNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OCCUPATION");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COUNSELEE REGISTER");

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("STATUS");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE OF BIRTH");

        Age.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Occupation, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CouNo))
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(AdharNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(144, 144, 144)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Symptoms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CouNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdharNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        GENERATE.setBackground(new java.awt.Color(0, 51, 204));
        GENERATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GENERATE.setText("GENERATE REPORT");
        GENERATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATEActionPerformed(evt);
            }
        });

        PRINT_RECORD.setBackground(new java.awt.Color(204, 102, 0));
        PRINT_RECORD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PRINT_RECORD.setText("PRINT REPORT");
        PRINT_RECORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINT_RECORDActionPerformed(evt);
            }
        });

        BACK_BTN.setBackground(new java.awt.Color(0, 153, 51));
        BACK_BTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACK_BTN.setText("BACK TO MENU");
        BACK_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_BTNActionPerformed(evt);
            }
        });

        RESET_BTN.setBackground(new java.awt.Color(204, 0, 102));
        RESET_BTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESET_BTN.setText("RESET");
        RESET_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESET_BTNActionPerformed(evt);
            }
        });

        EXIT_BTN.setBackground(new java.awt.Color(204, 0, 0));
        EXIT_BTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT_BTN.setText("EXIT");
        EXIT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(GENERATE)
                .addGap(49, 49, 49)
                .addComponent(PRINT_RECORD)
                .addGap(54, 54, 54)
                .addComponent(BACK_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(RESET_BTN)
                .addGap(48, 48, 48)
                .addComponent(EXIT_BTN)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENERATE)
                    .addComponent(PRINT_RECORD)
                    .addComponent(BACK_BTN)
                    .addComponent(RESET_BTN)
                    .addComponent(EXIT_BTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CouNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouNoActionPerformed
        try{
            Connection conn = DriverManager.getConnection(path,User,Password);
            String s1 = "select * from couregister where reg_no = " +CouNo.getText();
            PreparedStatement stmt = conn.prepareStatement(s1);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()==true)
            {
                Name.setText(rs.getString("name"));
                DOB.setText(rs.getString("birth_date"));
                MobNo.setText(rs.getString("mobileno"));
                Occupation.setText(rs.getString("occupation"));
                ADRESS.setText(rs.getString("address"));
                Symptoms.setText(rs.getString("symptoms"));
                MEDHISTORY.setText(rs.getString("medical_history"));
                RegDate.setText(rs.getString("registeration_date"));
                Age.setText(rs.getString("age"));
                AdharNo.setText(rs.getString("adhar_card"));
                Blood.setText(rs.getString("blood_group"));
                jTextField1.setText(rs.getString("gender"));
                jTextField2.setText(rs.getString("status")); 
            }
            else{
                CouNo.setText(null);
                Name.setText(null);
                DOB.setText(null);
                MobNo.setText(null);
                Occupation.setText(null);
                ADRESS.setText(null);
                Symptoms.setText(null);
                MEDHISTORY.setText(null);
                RegDate.setText(null);
                Age.setText(null);
                AdharNo.setText(null);
                Blood.setText(null);
                jTextField1.setText(null);
                jTextField2.setText(null);
                        
                JOptionPane.showMessageDialog(rootPane,"Invalid Search");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_CouNoActionPerformed

    private void RegDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegDateActionPerformed

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void OccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupationActionPerformed

    private void GENERATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERATEActionPerformed
        // TODO add your handling code here:
        jTextArea1.append("=================COUNESELEE DETAILS===================="
            +"\n"+"===================COVID COUNSELLING MANAGEMENT SYSTEM==================="
            +"\n"+"Couselee No :" +CouNo.getText()
            +"\n"+"Couselee Name :" +Name.getText()
            +"\n"+"Birth_Date :" +DOB.getText()
            +"\n"+"Mobile_No :" +MobNo.getText()                
            +"\n"+"Registeration Date :" +RegDate.getText()
            +"\n"+"Occupation :" +Occupation.getText()
            +"\n"+"Gender :" +jTextField1.getText()
            +"\n"+"Status :" +jTextField2.getText()
            +"\n"+"Address :" +ADRESS.getText()
            +"\n"+"Symptoms :" +Symptoms.getText()
            +"\n"+"Medical History :" +MEDHISTORY.getText()
            +"\n"+"Age :" +Age.getText()
            +"\n"+"Adhar No :" +AdharNo.getText()
            +"\n"+"Blood :" +Blood.getText()
                
        );

    }//GEN-LAST:event_GENERATEActionPerformed

    private void PRINT_RECORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINT_RECORDActionPerformed
    try {
        jTextArea1.print();
    } catch (PrinterException ex) {
        Logger.getLogger(CounseleeGenerateReport.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_PRINT_RECORDActionPerformed

    private void BACK_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_BTNActionPerformed
        CounseleeRegister  menu= new CounseleeRegister();
           menu.setVisible(true);
            dispose();
    }//GEN-LAST:event_BACK_BTNActionPerformed

    private void RESET_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESET_BTNActionPerformed
        CouNo.setText(null);
        Name.setText(null);
        DOB.setText(null);
        MobNo.setText(null);
        Occupation.setText(null);
        ADRESS.setText(null);
        Symptoms.setText(null);
        MEDHISTORY.setText(null);
        RegDate.setText(null);
        Age.setText(null);
        AdharNo.setText(null);
        Blood.setText(null);
        jTextField1.setText(null);
        jTextField2.setText(null);
    }//GEN-LAST:event_RESET_BTNActionPerformed

    private void EXIT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXIT_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXIT_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(CounseleeGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounseleeGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounseleeGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounseleeGenerateReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounseleeGenerateReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRESS;
    private javax.swing.JTextField AdharNo;
    private javax.swing.JTextField Age;
    private javax.swing.JButton BACK_BTN;
    private javax.swing.JTextField Blood;
    private javax.swing.JTextField CouNo;
    private javax.swing.JTextField DOB;
    private javax.swing.JButton EXIT_BTN;
    private javax.swing.JButton GENERATE;
    private javax.swing.JTextArea MEDHISTORY;
    private javax.swing.JTextField MobNo;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Occupation;
    private javax.swing.JButton PRINT_RECORD;
    private javax.swing.JButton RESET_BTN;
    private javax.swing.JTextField RegDate;
    private javax.swing.JTextField Symptoms;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
