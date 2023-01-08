package register;

import javax.swing.JOptionPane;

public class regs_GUI extends javax.swing.JFrame {
    public regs_GUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        EnterPasswd_Val = new javax.swing.JTextField();
        EmailAddr_Val = new javax.swing.JTextField();
        PhnNum_Val = new javax.swing.JTextField();
        ConfirmPasswd_Val = new javax.swing.JTextField();
        UserName_Val = new javax.swing.JTextField();
        UserName_Label = new javax.swing.JTextField();
        PhnNum_Label = new javax.swing.JTextField();
        EnterPasswd_Label = new javax.swing.JTextField();
        ConfirmPasswd_Label = new javax.swing.JTextField();
        EmailAddr_Label = new javax.swing.JTextField();
        Exit_Button = new javax.swing.JButton();
        RegsMe_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText(" Authentication System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
            }
        });

        EnterPasswd_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPasswd_ValActionPerformed(evt);
            }
        });

        EmailAddr_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddr_ValActionPerformed(evt);
            }
        });

        PhnNum_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhnNum_ValActionPerformed(evt);
            }
        });

        ConfirmPasswd_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswd_ValActionPerformed(evt);
            }
        });

        UserName_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_ValActionPerformed(evt);
            }
        });

        UserName_Label.setBackground(new java.awt.Color(0, 0, 0));
        UserName_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UserName_Label.setForeground(new java.awt.Color(255, 102, 0));
        UserName_Label.setText("Username");
        UserName_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_LabelActionPerformed(evt);
            }
        });

        PhnNum_Label.setBackground(new java.awt.Color(0, 0, 0));
        PhnNum_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PhnNum_Label.setForeground(new java.awt.Color(255, 102, 0));
        PhnNum_Label.setText("Phone Number");
        PhnNum_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhnNum_LabelActionPerformed(evt);
            }
        });

        EnterPasswd_Label.setBackground(new java.awt.Color(0, 0, 0));
        EnterPasswd_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EnterPasswd_Label.setForeground(new java.awt.Color(255, 102, 0));
        EnterPasswd_Label.setText("Enter Password");
        EnterPasswd_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPasswd_LabelActionPerformed(evt);
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

        EmailAddr_Label.setBackground(new java.awt.Color(0, 0, 0));
        EmailAddr_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EmailAddr_Label.setForeground(new java.awt.Color(255, 102, 0));
        EmailAddr_Label.setText("Email Address");
        EmailAddr_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddr_LabelActionPerformed(evt);
            }
        });

        Exit_Button.setBackground(new java.awt.Color(0, 0, 0));
        Exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit_Button.setForeground(new java.awt.Color(255, 102, 0));
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        RegsMe_Button.setBackground(new java.awt.Color(0, 0, 0));
        RegsMe_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegsMe_Button.setForeground(new java.awt.Color(255, 102, 0));
        RegsMe_Button.setText("Register Me");
        RegsMe_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegsMe_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmailAddr_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhnNum_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnterPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ConfirmPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegsMe_Button)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UserName_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailAddr_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhnNum_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EnterPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConfirmPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailAddr_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailAddr_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhnNum_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhnNum_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPasswd_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegsMe_Button)
                    .addComponent(Exit_Button))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void EnterPasswd_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPasswd_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterPasswd_ValActionPerformed

    private void EmailAddr_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddr_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddr_ValActionPerformed

    private void PhnNum_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhnNum_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhnNum_ValActionPerformed

    private void ConfirmPasswd_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswd_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswd_ValActionPerformed

    private void UserName_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_ValActionPerformed

    private void UserName_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_LabelActionPerformed

    private void PhnNum_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhnNum_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhnNum_LabelActionPerformed

    private void EnterPasswd_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPasswd_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterPasswd_LabelActionPerformed

    private void ConfirmPasswd_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswd_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswd_LabelActionPerformed

    private void EmailAddr_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddr_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddr_LabelActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void RegsMe_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegsMe_ButtonActionPerformed
        // TODO add your handling code here:
        String userName = UserName_Val.getText();
        String emailAddr = EmailAddr_Val.getText();
        String phnNum = PhnNum_Val.getText();
        String enterPasswd = EnterPasswd_Val.getText();
        String confirmPasswd = ConfirmPasswd_Val.getText();
        
        if ((userName.isEmpty() || emailAddr.isEmpty()) || (phnNum.isEmpty() || (enterPasswd.isEmpty() || confirmPasswd.isEmpty() ))){
            JOptionPane.showMessageDialog(null, "Please enter all the required fields.", "All Fields are Required", JOptionPane.OK_OPTION);
        }
        else{
            if(enterPasswd.equals(confirmPasswd)) {
                RegisterMeModel regMe = new RegisterMeModel(userName,emailAddr,phnNum,enterPasswd);
                new RegisterMe().RegisterUser(regMe);
                JOptionPane.showMessageDialog(null, "User Registered Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                UserName_Val.setText("");
                EmailAddr_Val.setText("");
                PhnNum_Val.setText("");
                EnterPasswd_Val.setText("");
                ConfirmPasswd_Val.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Password does not match.", "Invalid", JOptionPane.OK_OPTION);
            }
        }
        
    }//GEN-LAST:event_RegsMe_ButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regs_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmPasswd_Label;
    private javax.swing.JTextField ConfirmPasswd_Val;
    private javax.swing.JTextField EmailAddr_Label;
    private javax.swing.JTextField EmailAddr_Val;
    private javax.swing.JTextField EnterPasswd_Label;
    private javax.swing.JTextField EnterPasswd_Val;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField PhnNum_Label;
    private javax.swing.JTextField PhnNum_Val;
    private javax.swing.JButton RegsMe_Button;
    private javax.swing.JTextField UserName_Label;
    private javax.swing.JTextField UserName_Val;
    // End of variables declaration//GEN-END:variables
}
