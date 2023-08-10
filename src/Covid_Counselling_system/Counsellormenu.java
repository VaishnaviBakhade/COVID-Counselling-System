package Covid_Counselling_system;
public class Counsellormenu extends javax.swing.JFrame {
    public Counsellormenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CouRegister = new javax.swing.JButton();
        QualifiedCounsellor = new javax.swing.JButton();
        DocRegister = new javax.swing.JButton();
        Officer = new javax.swing.JButton();
        Center = new javax.swing.JButton();
        CenterEmployee = new javax.swing.JButton();
        Recommend = new javax.swing.JButton();
        CounsellingQualifiedCounsellor = new javax.swing.JButton();
        CounsellingCovidDoctor = new javax.swing.JButton();
        OfficeInteraction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WELCOME ADMINISTARTOR!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("------------------- MENU PANEL -------------------");

        CouRegister.setBackground(new java.awt.Color(51, 204, 0));
        CouRegister.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CouRegister.setForeground(new java.awt.Color(255, 255, 255));
        CouRegister.setText("Counselee Registration");
        CouRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouRegisterActionPerformed(evt);
            }
        });

        QualifiedCounsellor.setBackground(new java.awt.Color(255, 102, 51));
        QualifiedCounsellor.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        QualifiedCounsellor.setForeground(new java.awt.Color(255, 255, 255));
        QualifiedCounsellor.setText("Qualified Counsellor Enrolment");
        QualifiedCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualifiedCounsellorActionPerformed(evt);
            }
        });

        DocRegister.setBackground(new java.awt.Color(255, 153, 102));
        DocRegister.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        DocRegister.setForeground(new java.awt.Color(255, 255, 255));
        DocRegister.setText("Covid Doctor Registration");
        DocRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocRegisterActionPerformed(evt);
            }
        });

        Officer.setBackground(new java.awt.Color(153, 0, 51));
        Officer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Officer.setForeground(new java.awt.Color(255, 255, 255));
        Officer.setText("Covid Officer Empanelment");
        Officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficerActionPerformed(evt);
            }
        });

        Center.setBackground(new java.awt.Color(153, 0, 255));
        Center.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Center.setForeground(new java.awt.Color(255, 255, 255));
        Center.setText("Covid Center Identification");
        Center.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterActionPerformed(evt);
            }
        });

        CenterEmployee.setBackground(new java.awt.Color(0, 0, 153));
        CenterEmployee.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CenterEmployee.setForeground(new java.awt.Color(255, 255, 255));
        CenterEmployee.setText("Covid Center Employee Registration");
        CenterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterEmployeeActionPerformed(evt);
            }
        });

        Recommend.setBackground(new java.awt.Color(0, 153, 153));
        Recommend.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        Recommend.setForeground(new java.awt.Color(255, 255, 255));
        Recommend.setText("Counselling Recommendation");
        Recommend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecommendActionPerformed(evt);
            }
        });

        CounsellingQualifiedCounsellor.setBackground(new java.awt.Color(0, 102, 255));
        CounsellingQualifiedCounsellor.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CounsellingQualifiedCounsellor.setForeground(new java.awt.Color(255, 255, 255));
        CounsellingQualifiedCounsellor.setText("Counselling By Qualified Counsellor");
        CounsellingQualifiedCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CounsellingQualifiedCounsellorActionPerformed(evt);
            }
        });

        CounsellingCovidDoctor.setBackground(new java.awt.Color(153, 153, 255));
        CounsellingCovidDoctor.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CounsellingCovidDoctor.setForeground(new java.awt.Color(255, 255, 255));
        CounsellingCovidDoctor.setText("Counselling By Covid Doctor");
        CounsellingCovidDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CounsellingCovidDoctorActionPerformed(evt);
            }
        });

        OfficeInteraction.setBackground(new java.awt.Color(102, 51, 0));
        OfficeInteraction.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        OfficeInteraction.setForeground(new java.awt.Color(255, 255, 255));
        OfficeInteraction.setText("Office Interaction");
        OfficeInteraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeInteractionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Recommend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DocRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CouRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Officer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QualifiedCounsellor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CenterEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(CounsellingQualifiedCounsellor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CounsellingCovidDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OfficeInteraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(CouRegister)
                .addGap(18, 18, 18)
                .addComponent(QualifiedCounsellor)
                .addGap(18, 18, 18)
                .addComponent(DocRegister)
                .addGap(18, 18, 18)
                .addComponent(Officer)
                .addGap(18, 18, 18)
                .addComponent(Center)
                .addGap(16, 16, 16)
                .addComponent(CenterEmployee)
                .addGap(18, 18, 18)
                .addComponent(Recommend)
                .addGap(18, 18, 18)
                .addComponent(CounsellingQualifiedCounsellor)
                .addGap(18, 18, 18)
                .addComponent(CounsellingCovidDoctor)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(OfficeInteraction)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CouRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouRegisterActionPerformed
        // TODO add your handling code here:
        CounseleeRegister cou = new CounseleeRegister();
        cou.setVisible(true);
        dispose();
        //color
        
    }//GEN-LAST:event_CouRegisterActionPerformed

    private void QualifiedCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualifiedCounsellorActionPerformed
        // TODO add your handling code here:
        Counselling_QualifiedCounseller cou1 = new Counselling_QualifiedCounseller();
        cou1.setVisible(true);
        dispose();
    }//GEN-LAST:event_QualifiedCounsellorActionPerformed

    private void DocRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocRegisterActionPerformed
        // TODO add your handling code here:
        DoctorRegister Doc = new DoctorRegister();
        Doc.setVisible(true);
        dispose();
    }//GEN-LAST:event_DocRegisterActionPerformed

    private void OfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficerActionPerformed
        // TODO add your handling code here:
        OfficeImpanelment Office = new OfficeImpanelment();
        Office.setVisible(true);
        dispose();
    }//GEN-LAST:event_OfficerActionPerformed

    private void CenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterActionPerformed
        // TODO add your handling code here:
        Center_Identification center = new Center_Identification();
        center.setVisible(true);
        dispose();
    }//GEN-LAST:event_CenterActionPerformed

    private void CenterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterEmployeeActionPerformed
        // TODO add your handling code here:
        Employee_Registeration employee = new Employee_Registeration();
        employee.setVisible(true);
        dispose();
    }//GEN-LAST:event_CenterEmployeeActionPerformed

    private void RecommendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecommendActionPerformed
        // TODO add your handling code here:
        Counselling_Recommendation cou2 = new Counselling_Recommendation();
        cou2.setVisible(true);
        dispose();
    }//GEN-LAST:event_RecommendActionPerformed

    private void CounsellingQualifiedCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CounsellingQualifiedCounsellorActionPerformed
        // TODO add your handling code here:
        Counselling_QualifiedCounseller cou3 = new Counselling_QualifiedCounseller();
        cou3.setVisible(true);
        dispose();
    }//GEN-LAST:event_CounsellingQualifiedCounsellorActionPerformed

    private void CounsellingCovidDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CounsellingCovidDoctorActionPerformed
        // TODO add your handling code here:
        Covid_Doctor cou4 = new Covid_Doctor();
        cou4.setVisible(true);
        dispose();
    }//GEN-LAST:event_CounsellingCovidDoctorActionPerformed

    private void OfficeInteractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeInteractionActionPerformed
        // TODO add your handling code here:
        Office_Interaction off1 = new Office_Interaction();
        off1.setVisible(true);
        dispose();
    }//GEN-LAST:event_OfficeInteractionActionPerformed

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
            java.util.logging.Logger.getLogger(Counsellormenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counsellormenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counsellormenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counsellormenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counsellormenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Center;
    private javax.swing.JButton CenterEmployee;
    private javax.swing.JButton CouRegister;
    private javax.swing.JButton CounsellingCovidDoctor;
    private javax.swing.JButton CounsellingQualifiedCounsellor;
    private javax.swing.JButton DocRegister;
    private javax.swing.JButton OfficeInteraction;
    private javax.swing.JButton Officer;
    private javax.swing.JButton QualifiedCounsellor;
    private javax.swing.JButton Recommend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
