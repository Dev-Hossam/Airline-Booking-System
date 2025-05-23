
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Omar Ismail
 */
public class gui_login extends javax.swing.JFrame {

    int counter = 1;

    /**
     * Creates new form gui_login
     */
    public gui_login() {

        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LOGIN = new javax.swing.JLabel();
        loginUN = new javax.swing.JTextField();
        loginPW = new javax.swing.JPasswordField();
        loginButton3 = new javax.swing.JButton();
        jBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(106, 0, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acclogin.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(34, 45, 65));

        LOGIN.setBackground(new java.awt.Color(0, 0, 0));
        LOGIN.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN.setText("Login");
        LOGIN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loginUN.setBackground(new java.awt.Color(34, 45, 65));
        loginUN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginUN.setForeground(new java.awt.Color(255, 255, 255));
        loginUN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginUN.setText("ENTER USERNAME"); // NOI18N
        loginUN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        loginUN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUNMouseClicked(evt);
            }
        });
        loginUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUNActionPerformed(evt);
            }
        });

        loginPW.setBackground(new java.awt.Color(34, 45, 65));
        loginPW.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginPW.setForeground(new java.awt.Color(255, 255, 255));
        loginPW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPW.setText("PASSWORD");
        loginPW.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        loginPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPWMouseClicked(evt);
            }
        });
        loginPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPWActionPerformed(evt);
            }
        });

        loginButton3.setBackground(new java.awt.Color(106, 0, 28));
        loginButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        loginButton3.setForeground(new java.awt.Color(255, 255, 255));
        loginButton3.setText("Login");
        loginButton3.setBorder(null);
        loginButton3.setBorderPainted(false);
        loginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPW, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginUN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginUN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPW, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBackButton.setBackground(new java.awt.Color(106, 0, 28));
        jBackButton.setFont(new java.awt.Font("Times New Roman", 0, 8)); // NOI18N
        jBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backabyadfinal.png"))); // NOI18N
        jBackButton.setBorder(null);
        jBackButton.setBorderPainted(false);
        jBackButton.setContentAreaFilled(false);
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(69, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(224, 224, 224))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton3ActionPerformed
        try {

            PersonsController per = new PersonsController();

            String login_username = (String) loginUN.getText();
            String login_password = new String(loginPW.getPassword());
            int auth = per.authenticatePerson(login_username.trim(), login_password.trim());

            if (auth == -1) {
                if (counter == 3) {
                    JOptionPane.showMessageDialog(null, "too many tries", "Something went wrong", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null, "Invalid login try number: " + counter, "Something went wrong", JOptionPane.INFORMATION_MESSAGE);
                counter++;
            } else if (auth == 1) {
                try {
                    new gui_passenger().setVisible(true);
                    this.setVisible(false);
                } catch (Exception e) {
                    // Handle the exception appropriately, for example, logging it
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Something went wrong", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    new gui_admin().setVisible(true);
                    this.setVisible(false);
                } catch (Exception e) {
                    // Handle the exception appropriately, for example, logging it
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Something went wrong", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Something went wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButton3ActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
        try {
            new gui_main().setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void loginPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPWMouseClicked
        loginPW.setText("");
    }//GEN-LAST:event_loginPWMouseClicked

    private void loginPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPWActionPerformed

    private void loginUNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUNMouseClicked
        loginUN.setText("");
    }//GEN-LAST:event_loginUNMouseClicked

    private void loginUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUNActionPerformed

    }//GEN-LAST:event_loginUNActionPerformed

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
            java.util.logging.Logger.getLogger(gui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGIN;
    private javax.swing.JButton jBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton3;
    private javax.swing.JPasswordField loginPW;
    private javax.swing.JTextField loginUN;
    // End of variables declaration//GEN-END:variables
}
