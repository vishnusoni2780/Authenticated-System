package forgotPasswd;

import javax.swing.JOptionPane;

public class forgotPasswd_GUI extends javax.swing.JFrame {
    public forgotPasswd_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JTextField();
        EAorPN_Label = new javax.swing.JTextField();
        EAorPN_Val = new javax.swing.JTextField();
        AuthMe_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 750));

        Logo.setBackground(new java.awt.Color(0, 0, 0));
        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 102, 0));
        Logo.setText(" Authentication System");
        Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoActionPerformed(evt);
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

        EAorPN_Val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAorPN_ValActionPerformed(evt);
            }
        });

        AuthMe_Button.setBackground(new java.awt.Color(0, 0, 0));
        AuthMe_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AuthMe_Button.setForeground(new java.awt.Color(255, 102, 0));
        AuthMe_Button.setText("Authenticate Me");
        AuthMe_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthMe_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(EAorPN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(EAorPN_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(AuthMe_Button)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EAorPN_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EAorPN_Val, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(AuthMe_Button)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoActionPerformed

    private void EAorPN_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAorPN_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAorPN_LabelActionPerformed

    private void EAorPN_ValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAorPN_ValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EAorPN_ValActionPerformed

    private void AuthMe_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthMe_ButtonActionPerformed
        // TODO add your handling code here:
        String EAorPN = EAorPN_Val.getText();
        if (EAorPN.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all the required fields.", "All Fields are Required", JOptionPane.OK_OPTION);
        }
        else{
            boolean flag = new AuthMe().AuthMe(EAorPN);
            if (flag){
                JOptionPane.showMessageDialog(null, "User Authenticated Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                new newPasswd(EAorPN).setVisible(true);     
            }
            else{
                JOptionPane.showMessageDialog(null, "You are not registered.", "No User Found", JOptionPane.OK_OPTION);
            }
            //dispose();
        }
    }//GEN-LAST:event_AuthMe_ButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPasswd_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthMe_Button;
    private javax.swing.JTextField EAorPN_Label;
    private javax.swing.JTextField EAorPN_Val;
    private javax.swing.JTextField Logo;
    // End of variables declaration//GEN-END:variables
}
