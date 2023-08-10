package Covid_Counselling_system;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
public class CounseleeRegister extends javax.swing.JFrame {
String path="jdbc:mysql://localhost:33066/Counselee";
String User="root";
String Password="root@Vaishnu";
    public CounseleeRegister() {
        initComponents();
        DisplayTable();
    }
    private void DisplayTable(){
    try{
    Connection conn = DriverManager.getConnection(path,User,Password);
    String sql="select * from counselee.couregister";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    ResultSet rs= pstmt.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(SQLException sql)
    {
        JOptionPane.showMessageDialog(rootPane,sql);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CouNo = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRESS = new javax.swing.JTextArea();
        Occupation = new javax.swing.JTextField();
        Symptoms = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RegDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        AdharNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Blood = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        MobNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FemaleBtn = new javax.swing.JRadioButton();
        MaleBtn = new javax.swing.JRadioButton();
        OtherBtn = new javax.swing.JRadioButton();
        Married = new javax.swing.JRadioButton();
        UnMarried = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MEDHISTORY = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        print = new javax.swing.JButton();
        GENERATE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COUNSELEE REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 704));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 2, true));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("COUNSELEE REGISTER");

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("COUNSELEE NAME");

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("DATE OF BIRTH");

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("ADDRESS");

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("OCCUPATION");

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("SYMPTOMS");

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("COU-");

        CouNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        CouNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouNoActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        DOB.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });

        ADRESS.setColumns(20);
        ADRESS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADRESS.setLineWrap(true);
        ADRESS.setRows(5);
        ADRESS.setTabSize(4);
        ADRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRESS);

        Occupation.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        Occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationActionPerformed(evt);
            }
        });

        Symptoms.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("REGISTRATION DATE");

        RegDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        RegDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDateActionPerformed(evt);
            }
        });

        jLabel11.setBackground(java.awt.Color.white);
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("AGE");

        jLabel12.setBackground(java.awt.Color.white);
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("GENDER");

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("AADHAR CARD");

        Age.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        AdharNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel14.setBackground(java.awt.Color.white);
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("BLOOD GROUP");

        Blood.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("MOBILE NO.");

        MobNo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        MobNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setBackground(java.awt.Color.white);
        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("STATUS");

        FemaleBtn.setBackground(new java.awt.Color(0, 102, 51));
        FemaleBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FemaleBtn.setForeground(java.awt.Color.white);
        FemaleBtn.setText("FEMALE");
        FemaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleBtnActionPerformed(evt);
            }
        });

        MaleBtn.setBackground(new java.awt.Color(0, 102, 51));
        MaleBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MaleBtn.setForeground(java.awt.Color.white);
        MaleBtn.setText("MALE");
        MaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBtnActionPerformed(evt);
            }
        });

        OtherBtn.setBackground(new java.awt.Color(0, 102, 51));
        OtherBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OtherBtn.setForeground(java.awt.Color.white);
        OtherBtn.setText("OTHER");
        OtherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherBtnActionPerformed(evt);
            }
        });

        Married.setBackground(new java.awt.Color(0, 102, 51));
        Married.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Married.setForeground(java.awt.Color.white);
        Married.setText("MARRIED");
        Married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarriedActionPerformed(evt);
            }
        });

        UnMarried.setBackground(new java.awt.Color(0, 102, 51));
        UnMarried.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        UnMarried.setForeground(java.awt.Color.white);
        UnMarried.setText("UNMARRIED");
        UnMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnMarriedActionPerformed(evt);
            }
        });

        jLabel18.setBackground(java.awt.Color.white);
        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("MEDICAL HISTORY");

        MEDHISTORY.setColumns(20);
        MEDHISTORY.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        MEDHISTORY.setLineWrap(true);
        MEDHISTORY.setRows(5);
        MEDHISTORY.setTabSize(4);
        MEDHISTORY.setWrapStyleWord(true);
        jScrollPane2.setViewportView(MEDHISTORY);

        jLabel17.setBackground(java.awt.Color.white);
        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("+ 91");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                        .addComponent(RegDate, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(MaleBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FemaleBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OtherBtn))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CouNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Married)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UnMarried))
                                    .addComponent(AdharNo)
                                    .addComponent(Occupation)
                                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(Symptoms)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(CouNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(MaleBtn)
                    .addComponent(FemaleBtn)
                    .addComponent(OtherBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Married)
                    .addComponent(UnMarried))
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
                    .addComponent(jLabel14)
                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3))
                    .addContainerGap(424, Short.MAX_VALUE)))
        );

        jTable1.setBackground(new java.awt.Color(255, 153, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Reg_No", "Name", "Birth_Date", "Mobile_No", "Status", "Occupation", "Address", "Symptoms", "Medical_History", "Registerartion_Date", "Age", "Gender", "Adhar_Card", "Blood_Group"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 2, true));

        AddBtn.setBackground(new java.awt.Color(0, 255, 0));
        AddBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddBtn.setText("ADD RECORD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 102, 0));
        EditBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EditBtn.setText("EDIT DETAILS");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        CloseBtn.setBackground(new java.awt.Color(51, 51, 51));
        CloseBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("CLOSE");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(255, 204, 0));
        ResetBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResetBtn.setText("RESET");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(204, 0, 0));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DELETE.setText("DELETE RECORD");
        DELETE.setActionCommand("");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 204, 255));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setText("BACK TO MENU");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(153, 153, 0));
        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setText("PRINT RECORD");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        GENERATE.setBackground(new java.awt.Color(0, 153, 102));
        GENERATE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GENERATE.setText("GENERATE REPORT");
        GENERATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBtn)
                .addGap(32, 32, 32)
                .addComponent(EditBtn)
                .addGap(26, 26, 26)
                .addComponent(DELETE)
                .addGap(37, 37, 37)
                .addComponent(print)
                .addGap(29, 29, 29)
                .addComponent(GENERATE)
                .addGap(48, 48, 48)
                .addComponent(Back)
                .addGap(55, 55, 55)
                .addComponent(ResetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseBtn)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditBtn)
                    .addComponent(AddBtn)
                    .addComponent(DELETE)
                    .addComponent(print)
                    .addComponent(Back)
                    .addComponent(CloseBtn)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GENERATE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GENERATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERATEActionPerformed
        CounseleeGenerateReport report = new CounseleeGenerateReport();
        report.setVisible(true);
        dispose();
    }//GEN-LAST:event_GENERATEActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:

        TableforCounselee TableCou = new TableforCounselee();
        TableCou.setVisible(true);
        dispose();
    }//GEN-LAST:event_printActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Counsellormenu menu = new Counsellormenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

        int row=jTable1.getSelectedRow();
        String cell=jTable1.getModel().getValueAt(row,0).toString();
        String sql="DELETE FROM couregister where Reg_No=" + cell;
        try
        {
            Connection conn = DriverManager.getConnection(path,User,Password);
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Delete Successfully.!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        DisplayTable();
    }//GEN-LAST:event_DELETEActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
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
        MaleBtn.setSelected(false);
        FemaleBtn.setSelected(false);
        OtherBtn.setSelected(false);
        Married.setSelected(false);
        UnMarried.setSelected(false);
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        try{
            Connection conn = DriverManager.getConnection(path,User,Password);
            String s1 = "UPDATE couregister set name = ?,birth_date = ?,mobileno = ?,status = ?,occupation = ?,address = ?,symptoms =?,medical_history =?,registeration_date = ?,age = ?,gender = ?,adhar_card = ?,blood_group = ? where reg_no = "  + CouNo.getText();
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1,Name.getText());
            stmt.setString(2,DOB.getText());
            stmt.setString(3,MobNo.getText());
            if(Married.isSelected()){
                stmt.setString(4, Married.getText());
            }
            if(UnMarried.isSelected()){
                stmt.setString(4, UnMarried.getText());
            }
            stmt.setString(5,Occupation.getText());
            stmt.setString(6,ADRESS.getText());
            stmt.setString(7,Symptoms.getText());
            stmt.setString(8,MEDHISTORY.getText());
            stmt.setString(9,RegDate.getText());
            stmt.setString(10,Age.getText());
            if(MaleBtn.isSelected()){
                stmt.setString(11, MaleBtn.getText());
            }
            if(FemaleBtn.isSelected()){
                stmt.setString(11, FemaleBtn.getText());
            }
            if(OtherBtn.isSelected()){
                stmt.setString(11, OtherBtn.getText());
            }
            stmt.setString(12,AdharNo.getText());
            stmt.setString(13,Blood.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPDATED!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }DisplayTable();
    }//GEN-LAST:event_EditBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        try{
            Connection conn = DriverManager.getConnection(path,User,Password);
            String s1 = "insert into couregister(reg_no,name,registeration_date,birth_date,age,mobileno,gender,status,occupation,adhar_card,blood_group,address,symptoms,medical_history) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setInt(1, Integer.parseInt(CouNo.getText()));
            stmt.setString(2,Name.getText());
            stmt.setString(3,RegDate.getText());
            stmt.setString(4,DOB.getText());
            stmt.setString(5,Age.getText());
            stmt.setString(6,MobNo.getText());

            if(MaleBtn.isSelected()){
                stmt.setString(7, MaleBtn.getText());
            }
            if(FemaleBtn.isSelected()){
                stmt.setString(7, FemaleBtn.getText());
            }
            if(OtherBtn.isSelected()){
                stmt.setString(7, OtherBtn.getText());
            }

            if(Married.isSelected()){
                stmt.setString(8, Married.getText());
            }
            if(UnMarried.isSelected()){
                stmt.setString(8, UnMarried.getText());
            }
            stmt.setString(9,Occupation.getText());
            stmt.setString(10,AdharNo.getText());
            stmt.setString(11,Blood.getText());
            stmt.setString(12,ADRESS.getText());
            stmt.setString(13,Symptoms.getText());
            stmt.setString(14,MEDHISTORY.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Inserted Successfully!!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
        DisplayTable();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UnMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnMarriedActionPerformed
        // TODO add your handling code here:
        Married.setSelected(false);
        UnMarried.setSelected(true);
    }//GEN-LAST:event_UnMarriedActionPerformed

    private void MarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarriedActionPerformed
        // TODO add your handling code here:
        Married.setSelected(true);
        UnMarried.setSelected(false);
    }//GEN-LAST:event_MarriedActionPerformed

    private void OtherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherBtnActionPerformed
        // TODO add your handling code here:
        MaleBtn.setSelected(false);
        FemaleBtn.setSelected(false);
        OtherBtn.setSelected(true);
    }//GEN-LAST:event_OtherBtnActionPerformed

    private void MaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleBtnActionPerformed
        // TODO add your handling code here:
        MaleBtn.setSelected(true);
        FemaleBtn.setSelected(false);
        OtherBtn.setSelected(false);
    }//GEN-LAST:event_MaleBtnActionPerformed

    private void FemaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleBtnActionPerformed
        // TODO add your handling code here:
        MaleBtn.setSelected(false);
        FemaleBtn.setSelected(true);
        OtherBtn.setSelected(false);
    }//GEN-LAST:event_FemaleBtnActionPerformed

    private void RegDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegDateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        /*DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String tblreg_no = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblname= tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblbirth_date= tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblmobileno= tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblstatus= tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tbloccupation= tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String tbladdress= tblModel.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String tblsymptoms= tblModel.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String tblmedical_history= tblModel.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String tblregisteration_date= tblModel.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String tblage= tblModel.getValueAt(jTable1.getSelectedRow(), 10).toString();
        String tblgender= tblModel.getValueAt(jTable1.getSelectedRow(), 11).toString();
        String tbladhar_card= tblModel.getValueAt(jTable1.getSelectedRow(), 12).toString();
        String tblblood_group= tblModel.getValueAt(jTable1.getSelectedRow(), 13).toString();

        CouNo.setText(tblreg_no);
        Name.setText(tblname);
        DOB.setText(tblbirth_date);
        MobNo.setText(tblmobileno);
        //status.setText(tblstatus);
        Occupation.setText(tbloccupation);
        ADRESS.setText(tbladdress);
        Symptoms.setText(tblsymptoms);
        MEDHISTORY.setText(tblmedical_history);
        RegDate.setText(tblregisteration_date);
        Age.setText(tblage);
        buttonGroup1.getSelection().toString();
        AdharNo.setText(tbladhar_card);
        Blood.setText(tblblood_group);
        */
    }//GEN-LAST:event_jTable1MouseClicked

    private void OccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupationActionPerformed

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void CouNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouNoActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection(path,User,Password);
            String s1 = "select * from couregister where reg_no = " +CouNo.getText();
            PreparedStatement stmt = conn.prepareStatement(s1);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()==true)
            {
                //reg_no,name,,birth_date,,,,status,,,,,,
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
                if(rs.getString("gender")!=null)
                switch(rs.getString("gender"))
                {
                    case "MALE" -> MaleBtn.setSelected(true);
                    case "FEMALE" -> FemaleBtn.setSelected(true);
                    case "OTHER" -> OtherBtn.setSelected(true);
                    default ->{
                        MaleBtn.setSelected(false);
                        FemaleBtn.setSelected(false);
                        OtherBtn.setSelected(false);
                    }
                }
                if(rs.getString("status")!=null)
                switch(rs.getString("status"))
                {
                    case "MARRIED" -> Married.setSelected(true);
                    case "UNMARRIED" -> UnMarried.setSelected(true);
                    default ->{
                        Married.setSelected(false);
                        UnMarried.setSelected(false);

                    }
                }
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
                MaleBtn.setSelected(false);
                FemaleBtn.setSelected(false);
                OtherBtn.setSelected(false);
                Married.setSelected(false);
                UnMarried.setSelected(false);
                JOptionPane.showMessageDialog(rootPane,"Invalid Search");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_CouNoActionPerformed
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
            java.util.logging.Logger.getLogger(CounseleeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounseleeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounseleeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounseleeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounseleeRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRESS;
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AdharNo;
    private javax.swing.JTextField Age;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Blood;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JTextField CouNo;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DOB;
    private javax.swing.JButton EditBtn;
    private javax.swing.JRadioButton FemaleBtn;
    private javax.swing.JButton GENERATE;
    private javax.swing.JTextArea MEDHISTORY;
    private javax.swing.JRadioButton MaleBtn;
    private javax.swing.JRadioButton Married;
    private javax.swing.JTextField MobNo;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Occupation;
    private javax.swing.JRadioButton OtherBtn;
    private javax.swing.JTextField RegDate;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField Symptoms;
    private javax.swing.JRadioButton UnMarried;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
