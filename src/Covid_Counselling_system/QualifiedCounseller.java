package Covid_Counselling_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class QualifiedCounseller extends javax.swing.JFrame {
    public QualifiedCounseller() {
        initComponents();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPnel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IDNO = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        MALEBTN = new javax.swing.JRadioButton();
        FEMALEBTN = new javax.swing.JRadioButton();
        OTHERBTN = new javax.swing.JRadioButton();
        MOBNO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        EMAIL = new javax.swing.JTextField();
        ACCNO = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CALL = new javax.swing.JCheckBox();
        VIDEO = new javax.swing.JCheckBox();
        FEILDCOU = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        ADDBTN = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        CLOSEBTN = new javax.swing.JButton();
        RESETBTN = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUALIFIED COUNSELLER ENROLLMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jPnel3.setBackground(new java.awt.Color(0, 0, 153));
        jPnel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PERSONAL DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("ID NO");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("NAME");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("DOB");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("GENDER");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("MOBILE NO");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("ADDRESS");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("EMAIL ID");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("ACCOUNT NO");

        IDNO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        IDNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNOActionPerformed(evt);
            }
        });

        NAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        DOB.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        MALEBTN.setBackground(new java.awt.Color(0, 0, 153));
        MALEBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        MALEBTN.setForeground(new java.awt.Color(255, 255, 51));
        MALEBTN.setText("MALE");

        FEMALEBTN.setBackground(new java.awt.Color(0, 0, 153));
        FEMALEBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FEMALEBTN.setForeground(new java.awt.Color(255, 255, 51));
        FEMALEBTN.setText("FEMALE");

        OTHERBTN.setBackground(new java.awt.Color(0, 0, 153));
        OTHERBTN.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OTHERBTN.setForeground(new java.awt.Color(255, 255, 51));
        OTHERBTN.setText("OTHER");

        MOBNO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        ADDRESS.setTabSize(4);
        ADDRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADDRESS);

        EMAIL.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        ACCNO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPnel3Layout = new javax.swing.GroupLayout(jPnel3);
        jPnel3.setLayout(jPnel3Layout);
        jPnel3Layout.setHorizontalGroup(
            jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(65, 65, 65)
                .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnel3Layout.createSequentialGroup()
                        .addComponent(MALEBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FEMALEBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OTHERBTN))
                    .addComponent(IDNO, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MOBNO, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnel3Layout.setVerticalGroup(
            jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnel3Layout.createSequentialGroup()
                        .addComponent(IDNO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(OTHERBTN)
                                .addComponent(FEMALEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MALEBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MOBNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFESSIONAL DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FEILD OF COUNSELLING");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("THE BEST TO CONTACT");

        CALL.setBackground(new java.awt.Color(0, 0, 153));
        CALL.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CALL.setForeground(new java.awt.Color(255, 255, 255));
        CALL.setText("CALL");
        CALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALLActionPerformed(evt);
            }
        });

        VIDEO.setBackground(new java.awt.Color(0, 0, 153));
        VIDEO.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        VIDEO.setForeground(new java.awt.Color(255, 255, 255));
        VIDEO.setText("VIDEO CALL");

        FEILDCOU.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        FEILDCOU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Psychology", "Covid", "Normal HealthCare" }));
        FEILDCOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEILDCOUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(CALL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VIDEO))
                    .addComponent(FEILDCOU, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FEILDCOU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CALL)
                    .addComponent(VIDEO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        ADDBTN.setBackground(new java.awt.Color(0, 204, 0));
        ADDBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADDBTN.setText("ADD RECORD");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EDITBTN.setBackground(new java.awt.Color(255, 102, 0));
        EDITBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EDITBTN.setText("EDIT DETAILS");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });

        CLOSEBTN.setBackground(new java.awt.Color(204, 0, 0));
        CLOSEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CLOSEBTN.setForeground(new java.awt.Color(255, 255, 255));
        CLOSEBTN.setText("CLOSE");
        CLOSEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEBTNActionPerformed(evt);
            }
        });

        RESETBTN.setBackground(new java.awt.Color(102, 255, 102));
        RESETBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESETBTN.setText("RESET");
        RESETBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBTNActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(153, 0, 51));
        DELETE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(51, 0, 153));
        Back1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CLOSEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RESETBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EDITBTN))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ADDBTN)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESETBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLOSEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPnel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPnel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "insert into qualifedcounseller(IDNO,NAME,DOB,GENDER,MOBNO,ADDRESS,EMAIL,ACCNO,FEILDCOU,BESTCONTACT) values(?,?,?,?,?,?,?,?,?,?)";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setInt(1, Integer.parseInt(IDNO.getText()));
            stmt.setString(2,NAME.getText());
            stmt.setString(3,DOB.getText());
            
            if(MALEBTN.isSelected()){
                stmt.setString(4, MALEBTN.getText());
            }
            if(FEMALEBTN.isSelected()){
                stmt.setString(4, FEMALEBTN.getText());
            }
            if(OTHERBTN.isSelected()){
                stmt.setString(4, OTHERBTN.getText());
            }
            stmt.setString(5,MOBNO.getText());
            stmt.setString(6,ADDRESS.getText());
            stmt.setString(7,EMAIL.getText());
            stmt.setString(8,ACCNO.getText());
            
            String value = FEILDCOU.getSelectedItem().toString();
            stmt.setString(9,value);
            
            if(CALL.isSelected()){
                stmt.setString(10, CALL.getText());
            }
            if(VIDEO.isSelected()){
                stmt.setString(10, VIDEO.getText());
            }            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Inserted Successfully!!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void RESETBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBTNActionPerformed
        // TODO add your handling code here:
        IDNO.setText(null);
        NAME.setText(null);
        DOB.setText(null);
        MOBNO.setText(null);
        ADDRESS.setText(null);
        EMAIL.setText(null);
        ACCNO.setText(null);
    }//GEN-LAST:event_RESETBTNActionPerformed

    private void CALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CALLActionPerformed

    private void CLOSEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEBTNActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CLOSEBTNActionPerformed

    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "Update qualifedcounseller set NAME = ?,DOB = ?,GENDER = ?,MOBNO = ?,ADDRESS = ?,EMAIL = ?,ACCNO = ?,FEILDCOU = ?,BESTCONTACT = ? where IDNO = "+IDNO.getText();     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setString(1,NAME.getText());
            stmt.setString(2,DOB.getText());
            
            if(MALEBTN.isSelected()){
                stmt.setString(3, MALEBTN.getText());
            }
            if(FEMALEBTN.isSelected()){
                stmt.setString(3, FEMALEBTN.getText());
            }
            if(OTHERBTN.isSelected()){
                stmt.setString(3, OTHERBTN.getText());
            }
            stmt.setString(4,MOBNO.getText());
            stmt.setString(5,ADDRESS.getText());
            stmt.setString(6,EMAIL.getText());
            stmt.setString(7,ACCNO.getText());
            
            String value = FEILDCOU.getSelectedItem().toString();
            stmt.setString(8,value);           
            
            if(CALL.isSelected()){
                stmt.setString(9, CALL.getText());
            }
            if(VIDEO.isSelected()){
                stmt.setString(9, VIDEO.getText());
            }            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPDATED!");
        }
    catch(SQLException e){
                        JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void FEILDCOUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEILDCOUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEILDCOUActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33066/Counselee","root","root@Vaishnu");
            String s1 = "DELETE FROM qualifedcounseller where IDNO=?";     
            PreparedStatement stmt = conn.prepareStatement(s1);
            stmt.setInt(1,Integer.parseInt(IDNO.getText()));
            stmt.execute();
            JOptionPane.showMessageDialog(rootPane,"Deleted Successfully!!");
            conn.close();
        } 
        catch(SQLException e)
                {
                JOptionPane.showMessageDialog(rootPane,e);
                }
            
    }//GEN-LAST:event_DELETEActionPerformed

    private void IDNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNOActionPerformed

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
            java.util.logging.Logger.getLogger(QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QualifiedCounseller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QualifiedCounseller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACCNO;
    private javax.swing.JButton ADDBTN;
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JButton Back1;
    private javax.swing.JCheckBox CALL;
    private javax.swing.JButton CLOSEBTN;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DOB;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JComboBox<String> FEILDCOU;
    private javax.swing.JRadioButton FEMALEBTN;
    private javax.swing.JTextField IDNO;
    private javax.swing.JRadioButton MALEBTN;
    private javax.swing.JTextField MOBNO;
    private javax.swing.JTextField NAME;
    private javax.swing.JRadioButton OTHERBTN;
    private javax.swing.JButton RESETBTN;
    private javax.swing.JCheckBox VIDEO;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPnel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
