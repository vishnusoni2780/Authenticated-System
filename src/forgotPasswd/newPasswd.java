package forgotPasswd;

import javax.swing.JOptionPane;
        
public class newPasswd extends javax.swing.JFrame {

    public newPasswd(String EAorPN) {
        initComponents();
        EAorPN_Val.setText(EAorPN);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        EnterPasswd_Label = new javax.swing.JTextField();
        EnterNewPasswd_Val = new javax.swing.JTextField();
        ConfirmPasswd_Label = new javax.swing.JTextField();
        ConfirmNewPasswd_Val = new javax.swing.JTextField();
        UpdPasswd_Button = new javax.swing.JButton();
        EAorPN_Label = new javax.swing.JTextField();
        EAorPN_Val = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 350));

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText(" Authentication System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        EnterPasswd_Label.setBackground(new java.awt.Color(0, 0, 0));
        EnterPasswd_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EnterPasswd_Label.setForeground(new java.awt.Color(255, 102, 0));
        EnterPasswd_Label.setText("Enter New Password");
        EnterPasswd_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPasswd_LabelActionPerformed(evt);
            }
        });

        EnterNewPasswd_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterNewPasswd_ValActionPerformed(evt);
            }
        });

        ConfirmPasswd_Label.setBackground(new java.awt.Color(0, 0, 0));
        ConfirmPasswd_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ConfirmPasswd_Label.setForeground(new java.awt.Color(255, 102, 0));
        ConfirmPasswd_Label.setText("Confirm Password");
        ConfirmPasswd_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswd_LabelActionPerformed(evt);
            }
        });

        ConfirmNewPasswd_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmNewPasswd_ValActionPerformed(evt);
            }
        });

        UpdPasswd_Button.setBackground(new java.awt.Color(0, 0, 0));
        UpdPasswd_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdPasswd_Button.setForeground(new java.awt.Color(255, 102, 0));
        UpdPasswd_Button.setText("Update Password");
        UpdPasswd_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdPasswd_ButtonActionPerformed(evt);
            }
        });

        EAorPN_Label.setBackground(new java.awt.Color(0, 0, 0));
        EAorPN_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EAorPN_Label.setForeground(new java.awt.Color(255, 102, 0));
        EAorPN_Label.setText("EAorPN");
        EAorPN_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAorPN_LabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnterPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EAorPN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfirmNewPasswd_Val, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(EnterNewPasswd_Val, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(EAorPN_Val)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(UpdPasswd_Button)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EAorPN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EAorPN_Val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterNewPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmNewPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(UpdPasswd_Button)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void EnterPasswd_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPasswd_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterPasswd_LabelActionPerformed

    private void EnterNewPasswd_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterNewPasswd_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterNewPasswd_ValActionPerformed

    private void ConfirmPasswd_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswd_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswd_LabelActionPerformed

    private void ConfirmNewPasswd_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmNewPasswd_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmNewPasswd_ValActionPerformed

    private void UpdPasswd_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdPasswd_ButtonActionPerformed
        // TODO add your handling code here:
        String EAorPN = EAorPN_Val.getText();
        String enterNewPasswd = EnterNewPasswd_Val.getText();
        String confirmNewPasswd = ConfirmNewPasswd_Val.getText();
        
        if(enterNewPasswd.equals(confirmNewPasswd)){
            boolean flag = new AuthMe().updPasswd(EAorPN,confirmNewPasswd);
            if (flag){
                JOptionPane.showMessageDialog(null, "Password Updated Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                EnterNewPasswd_Val.setText("");
                ConfirmNewPasswd_Val.setText("");
                dispose();
            }
        }
        else{
                JOptionPane.showMessageDialog(null, "Password does not match.", "Invalid", JOptionPane.OK_OPTION);
            }
    }//GEN-LAST:event_UpdPasswd_ButtonActionPerformed

    private void EAorPN_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAorPN_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAorPN_LabelActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String EAorPN="";
                new newPasswd(EAorPN).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmNewPasswd_Val;
    private javax.swing.JTextField ConfirmPasswd_Label;
    private javax.swing.JTextField EAorPN_Label;
    private javax.swing.JTextField EAorPN_Val;
    private javax.swing.JTextField EnterNewPasswd_Val;
    private javax.swing.JTextField EnterPasswd_Label;
    private javax.swing.JTextField Logo;
    private javax.swing.JButton UpdPasswd_Button;
    // End of variables declaration//GEN-END:variables
}
