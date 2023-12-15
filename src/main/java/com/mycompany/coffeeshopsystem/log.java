
package com.mycompany.coffeeshopsystem;

import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;


public class log extends javax.swing.JFrame {

    public log() {
        this.setUndecorated(true);
        initComponents();
        this.setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 50, 50));
        String[] storedCredentials = CredentialsHolder.getCredentials();
        if (storedCredentials != null) {
            userTXT.setText(storedCredentials[0]);
            passTXT.setText(storedCredentials[1]);
            rmbr.setSelected(true);
        }
        this.hidePass.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rmbr = new javax.swing.JRadioButton();
        showPass = new javax.swing.JLabel();
        hidePass = new javax.swing.JLabel();
        passTXT = new javax.swing.JPasswordField();
        loginButton = new com.mycompany.coffeeshopsystem.button();
        jPanel2 = new javax.swing.JPanel();
        esc = new javax.swing.JButton();
        min = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\DejaBrewLogoWide.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(140, 139));

        jLabel2.setBackground(new java.awt.Color(197, 186, 170));
        jLabel2.setFont(new java.awt.Font("Quache Bold PERSONAL", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 186, 170));
        jLabel2.setText("Username");

        userTXT.setBackground(new java.awt.Color(255, 255, 255));
        userTXT.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        userTXT.setForeground(new java.awt.Color(0, 0, 0));
        userTXT.setMinimumSize(new java.awt.Dimension(68, 29));
        userTXT.setPreferredSize(new java.awt.Dimension(68, 29));

        jLabel3.setBackground(new java.awt.Color(197, 186, 170));
        jLabel3.setFont(new java.awt.Font("Quache Bold PERSONAL", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(197, 186, 170));
        jLabel3.setText("Password");

        rmbr.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        rmbr.setForeground(new java.awt.Color(197, 186, 170));
        rmbr.setText("Remember me");
        rmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmbrActionPerformed(evt);
            }
        });

        showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\pass-show-hide\\show-eye-white.png")); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassMousePressed(evt);
            }
        });

        hidePass.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\pass-show-hide\\hide-eye-white.png")); // NOI18N
        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidePassMousePressed(evt);
            }
        });

        passTXT.setBackground(new java.awt.Color(255, 255, 255));
        passTXT.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        passTXT.setForeground(new java.awt.Color(0, 0, 0));
        passTXT.setMinimumSize(new java.awt.Dimension(68, 29));
        passTXT.setPreferredSize(new java.awt.Dimension(69, 29));

        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(128, 109, 97));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        esc.setBackground(new java.awt.Color(255, 51, 51));
        esc.setFont(new java.awt.Font("ResotE", 0, 12)); // NOI18N
        esc.setText("X");
        esc.setBorderPainted(false);
        esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escActionPerformed(evt);
            }
        });

        min.setBackground(new java.awt.Color(255, 51, 51));
        min.setFont(new java.awt.Font("ResotE", 0, 12)); // NOI18N
        min.setText("_");
        min.setFocusPainted(false);
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esc)
                    .addComponent(min))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(passTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmbr)
                                .addGap(71, 71, 71)
                                .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hidePass))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showPass)
                            .addComponent(rmbr)))
                    .addComponent(hidePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public String user;
   public String pass;
    
   public static void setUsername(String username) {
        username = userTXT.getText();
    }

    public static void setPassword(String password) {
        password = passTXT.getText();
    }

    public static void setRememberMe(boolean rememberMe) {
        rmbr.setSelected(true);
    } 
   
    private void rmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmbrActionPerformed
        
    }//GEN-LAST:event_rmbrActionPerformed

    private void hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMousePressed
        showPass.setVisible(true);
        hidePass.setVisible(false);
        passTXT.setEchoChar('*');
    }//GEN-LAST:event_hidePassMousePressed

    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        hidePass.setVisible(true);
        showPass.setVisible(false);
        passTXT.setEchoChar((char)0);
    }//GEN-LAST:event_showPassMousePressed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        user = userTXT.getText();
        pass = passTXT.getText();
        
       if (rmbr.isSelected()) {
                    
                    CredentialsHolder.setCredentials(user, pass);
                } else {
                    
                    CredentialsHolder.clearCredentials();
                }
       if(user.equals("admin") && pass.equals("admin123")){
            menu menu = new menu();
            menu.show();
            dispose();
       }else{
           JOptionPane.showMessageDialog(null,"Access Denied!");
       }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escActionPerformed
        this.dispose();
    }//GEN-LAST:event_escActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minActionPerformed
            private static int mouseX;
            private static int mouseY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
                mouseX = evt.getX();
                mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
                 int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                this.setLocation(x,y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
                mouseX = evt.getX();
                mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
                int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                this.setLocation(x,y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton esc;
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.mycompany.coffeeshopsystem.button loginButton;
    private javax.swing.JButton min;
    private static javax.swing.JPasswordField passTXT;
    private static javax.swing.JRadioButton rmbr;
    private javax.swing.JLabel showPass;
    private static javax.swing.JTextField userTXT;
    // End of variables declaration//GEN-END:variables
}
