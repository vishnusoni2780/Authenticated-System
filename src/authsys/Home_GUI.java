package authsys;

import forgotPasswd.forgotPasswd_GUI;
import login.login;
import register.regs_GUI;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Home_GUI extends javax.swing.JFrame {
    public Home_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        S_Name_Label = new javax.swing.JTextField();
        Logo = new javax.swing.JTextField();
        EAorPN_Val = new javax.swing.JTextField();
        Login_Button = new javax.swing.JButton();
        EAorPN_Label = new javax.swing.JTextField();
        Passwd_Label = new javax.swing.JTextField();
        Regs_Button = new javax.swing.JButton();
        ForgotPasswd_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        Passwd_Val = new javax.swing.JPasswordField();

        S_Name_Label.setBackground(new java.awt.Color(0, 0, 0));
        S_Name_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        S_Name_Label.setForeground(new java.awt.Color(255, 102, 0));
        S_Name_Label.setText("Student Name");
        S_Name_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_Name_LabelActionPerformed(evt);
            }
        });

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

        EAorPN_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAorPN_ValActionPerformed(evt);
            }
        });

        Login_Button.setBackground(new java.awt.Color(0, 0, 0));
        Login_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Login_Button.setForeground(new java.awt.Color(255, 102, 0));
        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        EAorPN_Label.setBackground(new java.awt.Color(0, 0, 0));
        EAorPN_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EAorPN_Label.setForeground(new java.awt.Color(255, 102, 0));
        EAorPN_Label.setText("Email Address/Phone Number");
        EAorPN_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAorPN_LabelActionPerformed(evt);
            }
        });

        Passwd_Label.setBackground(new java.awt.Color(0, 0, 0));
        Passwd_Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Passwd_Label.setForeground(new java.awt.Color(255, 102, 0));
        Passwd_Label.setText("Password");
        Passwd_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Passwd_LabelActionPerformed(evt);
            }
        });

        Regs_Button.setBackground(new java.awt.Color(0, 0, 0));
        Regs_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Regs_Button.setForeground(new java.awt.Color(255, 102, 0));
        Regs_Button.setText("Register");
        Regs_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regs_ButtonActionPerformed(evt);
            }
        });

        ForgotPasswd_Button.setBackground(new java.awt.Color(0, 0, 0));
        ForgotPasswd_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ForgotPasswd_Button.setForeground(new java.awt.Color(255, 102, 0));
        ForgotPasswd_Button.setText("Forgot Passwd?");
        ForgotPasswd_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasswd_ButtonActionPerformed(evt);
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

        Passwd_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Passwd_ValActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Regs_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exit_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ForgotPasswd_Button)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Passwd_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EAorPN_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Passwd_Val)
                    .addComponent(EAorPN_Val, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EAorPN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EAorPN_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Passwd_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Passwd_Val)
                        .addGap(1, 1, 1)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_Button)
                    .addComponent(ForgotPasswd_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regs_Button)
                    .addComponent(Exit_Button))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void EAorPN_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAorPN_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAorPN_ValActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // TODO add your handling code here:
        String EAorPN = EAorPN_Val.getText();
        String passwd = Passwd_Val.getText();
        String userName="";
        boolean flag=false;
        
        if ((EAorPN.isEmpty() || passwd.isEmpty())){
            JOptionPane.showMessageDialog(null, "Please enter all the required fields.", "All Fields are Required", JOptionPane.OK_OPTION);
        }
        else{
            try{
                ResultSet set = new login().login();
                while(set.next()){
                    String EmailAddr =set.getString("EmailAddress");
                    String PhnNum =set.getString("PhoneNumber");
                    String Passwd =set.getString("Password");

                    if (EAorPN.equals(EmailAddr) || EAorPN.equals(PhnNum)){
                        flag = passwd.equals(Passwd); 
                        userName = set.getString("UserName");
                        //JOptionPane.showMessageDialog(null, "Login Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                        //JOptionPane.showMessageDialog(null, "Password does not match.", "Wrong Password", JOptionPane.OK_OPTION);
                    }
                }
                
                if(flag){
                    JOptionPane.showMessageDialog(null, "Login Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                    EAorPN_Val.setText("");
                    Passwd_Val.setText("");
                    new Welcome_GUI(userName).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials or You may not have done you Registration.", "Invalid Credentials", JOptionPane.OK_OPTION);
                }
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void S_Name_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_Name_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_Name_LabelActionPerformed

    private void EAorPN_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAorPN_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAorPN_LabelActionPerformed

    private void Passwd_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Passwd_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Passwd_LabelActionPerformed

    private void Regs_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regs_ButtonActionPerformed
        // TODO add your handling code here:
        new regs_GUI().setVisible(true);
    }//GEN-LAST:event_Regs_ButtonActionPerformed

    private void ForgotPasswd_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasswd_ButtonActionPerformed
        // TODO add your handling code here:
        new forgotPasswd_GUI().setVisible(true);
    }//GEN-LAST:event_ForgotPasswd_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Passwd_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Passwd_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Passwd_ValActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EAorPN_Label;
    private javax.swing.JTextField EAorPN_Val;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Exit_Button1;
    private javax.swing.JButton Exit_Button2;
    private javax.swing.JButton ForgotPasswd_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JTextField Logo;
    private javax.swing.JTextField Passwd_Label;
    private javax.swing.JPasswordField Passwd_Val;
    private javax.swing.JButton Regs_Button;
    private javax.swing.JTextField S_Name_Label;
    // End of variables declaration//GEN-END:variables
}
