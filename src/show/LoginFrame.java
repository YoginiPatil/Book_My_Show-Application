package show;

import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
 
    Connection con = null ;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public LoginFrame()
    {
        initComponents();
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Login");
        
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("src\\show\\images\\LoginBgImage.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        //set size and location of components
        this.setBounds(0, 0, width, height);
        bgImageLabel.setBounds(0, 0, width, height);
        //end here ---------------------------------------  
        BufferedImage resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, width, height, null);
        g2.dispose();   
        ImageIcon imgicon = new ImageIcon(resizeimg);
        bgImageLabel.setIcon(imgicon);
       
       //Set Panel
       try{
            img = ImageIO.read(new File("src\\show\\images\\cinemaTicket.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       loginCredentialPanel.setLocation((width/2)-(width/4), ((height/2)-(height/4))-30);
        width = (int)tiketImageLabel.getWidth();
        height = (int)tiketImageLabel.getHeight();      
        resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
        g2 = resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, width, height, null);
        g2.dispose();  
        imgicon = new ImageIcon(resizeimg);
        tiketImageLabel.setIcon(imgicon);
        //set panel ends here             
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginCredentialPanel = new javax.swing.JPanel();
        tiketImageLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextF = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        loginLabelPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        passwordtextF = new javax.swing.JPasswordField();
        signinButton = new javax.swing.JButton();
        bgImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        loginCredentialPanel.setBackground(new java.awt.Color(255, 255, 255,80));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(15, 0, 0));
        usernameLabel.setText("UserName");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(15, 0, 0));
        passwordLabel.setText("Password");

        cancelButton.setBackground(new java.awt.Color(255, 112, 77));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 15));
        cancelButton.setText("cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 112, 77));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 15));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginLabelPanel.setBackground(new java.awt.Color(0, 0, 102));

        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 71, 26));
        loginLabel.setText("Login");

        javax.swing.GroupLayout loginLabelPanelLayout = new javax.swing.GroupLayout(loginLabelPanel);
        loginLabelPanel.setLayout(loginLabelPanelLayout);
        loginLabelPanelLayout.setHorizontalGroup(
            loginLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLabelPanelLayout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(exitButton)
                .addContainerGap())
        );
        loginLabelPanelLayout.setVerticalGroup(
            loginLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(exitButton)
        );

        passwordtextF.setText("jPasswordField1");

        signinButton.setBackground(new java.awt.Color(255, 112, 77));
        signinButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signinButton.setText("Sign-In");
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginCredentialPanelLayout = new javax.swing.GroupLayout(loginCredentialPanel);
        loginCredentialPanel.setLayout(loginCredentialPanelLayout);
        loginCredentialPanelLayout.setHorizontalGroup(
            loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                .addGroup(loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                        .addComponent(tiketImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTextF)
                                    .addComponent(passwordtextF)))
                            .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(loginLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        loginCredentialPanelLayout.setVerticalGroup(
            loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                .addGroup(loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(passwordtextF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(loginCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginCredentialPanelLayout.createSequentialGroup()
                        .addComponent(loginLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiketImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(loginCredentialPanel);
        loginCredentialPanel.setBounds(110, 90, 680, 450);
        getContentPane().add(bgImageLabel);
        bgImageLabel.setBounds(0, 0, 980, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      String username = usernameTextF.getText();
      String password = passwordtextF.getText();
      
      if(username.equals("") || password.equals(""))
          JOptionPane.showMessageDialog(null,"Enter username or password");
      else
          validLogin(username,password);
      
    }//GEN-LAST:event_loginButtonActionPerformed

    void validLogin(String username,String password)
    {
        con = DBConnection.connect();
        try 
        {
            ps  = con.prepareStatement("select * from users where name=? and password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                LoginCredential.setUsername(rs.getString(2));
                LoginCredential.setPassword(rs.getString(7));
                MainFrame mf = new MainFrame();
                mf.show();
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Username Or Password");
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    
    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
       RegistrationFrame rf = new RegistrationFrame();
       rf.show();
       dispose();
    }//GEN-LAST:event_signinButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImageLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginCredentialPanel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginLabelPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordtextF;
    private javax.swing.JButton signinButton;
    private javax.swing.JLabel tiketImageLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextF;
    // End of variables declaration//GEN-END:variables
}
