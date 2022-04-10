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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrationFrame extends javax.swing.JFrame {
    
    String name,gender,movieType,password,confPassword,mobileNo;
    int id=0,age;
    Long mobNo;
    
    Connection con = null ;
    PreparedStatement ps = null;

    public RegistrationFrame() 
    {
        initComponents();
        setResizable(false);
        setTitle("Registration");
        this.setExtendedState(MAXIMIZED_BOTH);
        bookNowButton.setVisible(false);
        
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("src\\show\\images\\registrationBgImage.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        
        //set size and location of components
        this.setBounds(0, 0, width, height);
        regBgImage.setBounds(0, 0, width, height);
        //end here ---------------------------------------
        
        BufferedImage resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, width, height, null);
        g2.dispose();   
        ImageIcon imgicon = new ImageIcon(resizeimg);
        regBgImage.setIcon(imgicon);
        
        regPanel.setBounds(0, 0, width,50);
        regLabel.setBounds(0, 0, width, 50);
        regFieldPanel.setLocation((width/2)-(width/4), ((height/2)-(height/4))-30);
        logoutButton.setBounds(0, 50, 95, 31);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        regPanel = new javax.swing.JPanel();
        regLabel = new javax.swing.JLabel();
        regFieldPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        mobNoLabel = new javax.swing.JLabel();
        movieTypeLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        confPassLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        nameTF = new javax.swing.JTextField();
        genderComBox = new javax.swing.JComboBox<>();
        mobNoTF = new javax.swing.JTextField();
        movieTypeComBox = new javax.swing.JComboBox<>();
        passwordTF = new javax.swing.JPasswordField();
        confPassTF = new javax.swing.JPasswordField();
        bookNowButton = new javax.swing.JButton();
        ageSpinField = new com.toedter.components.JSpinField();
        regBgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logoutButton.setBackground(new java.awt.Color(51, 255, 51));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(0, 40, 130, 23);

        regPanel.setBackground(new java.awt.Color(255, 0, 51));

        regLabel.setBackground(new java.awt.Color(255, 0, 51));
        regLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        regLabel.setForeground(new java.awt.Color(255, 255, 255));
        regLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regLabel.setText("Registration");

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(regPanel);
        regPanel.setBounds(0, 0, 730, 40);

        regFieldPanel.setBackground(new java.awt.Color(255, 255, 255,50));
        regFieldPanel.setForeground(new java.awt.Color(255, 255, 255));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        mobNoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mobNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobNoLabel.setText("Mobile Number(*)");

        movieTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        movieTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieTypeLabel.setText("Movie Type");

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password(*)");

        confPassLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        confPassLabel.setText("Confirm Password(*)");

        registerButton.setBackground(new java.awt.Color(255, 0, 51));
        registerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        genderComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Other" }));
        genderComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComBoxActionPerformed(evt);
            }
        });

        movieTypeComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie type", "Comedy", "Horror", "Action ", "Drama", "Adventure", "Fantasy", "Westen", "Biopic", "Epic" }));
        movieTypeComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieTypeComBoxActionPerformed(evt);
            }
        });

        passwordTF.setText("jPasswordField1");

        confPassTF.setText("jPasswordField2");

        bookNowButton.setBackground(new java.awt.Color(255, 0, 51));
        bookNowButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookNowButton.setForeground(new java.awt.Color(255, 255, 255));
        bookNowButton.setText("Book Now");
        bookNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regFieldPanelLayout = new javax.swing.GroupLayout(regFieldPanel);
        regFieldPanel.setLayout(regFieldPanelLayout);
        regFieldPanelLayout.setHorizontalGroup(
            regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regFieldPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regFieldPanelLayout.createSequentialGroup()
                        .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(movieTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameTF)
                        .addComponent(genderComBox, 0, 263, Short.MAX_VALUE)
                        .addComponent(movieTypeComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confPassTF, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(passwordTF)
                        .addComponent(mobNoTF))
                    .addComponent(ageSpinField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regFieldPanelLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(bookNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        regFieldPanelLayout.setVerticalGroup(
            regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(nameTF))
                .addGap(28, 28, 28)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(ageSpinField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(genderComBox))
                .addGap(28, 28, 28)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mobNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(mobNoTF))
                .addGap(28, 28, 28)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(movieTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(movieTypeComBox))
                .addGap(28, 28, 28)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(passwordTF))
                .addGap(18, 18, 18)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regFieldPanelLayout.createSequentialGroup()
                        .addComponent(confPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(confPassTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(regFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(bookNowButton)))
        );

        getContentPane().add(regFieldPanel);
        regFieldPanel.setBounds(60, 90, 650, 430);
        getContentPane().add(regBgImage);
        regBgImage.setBounds(0, 0, 725, 551);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComBoxActionPerformed
        gender = (String)genderComBox.getSelectedItem();
    }//GEN-LAST:event_genderComBoxActionPerformed

    private void movieTypeComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieTypeComBoxActionPerformed
        movieType = (String)movieTypeComBox.getSelectedItem();
    }//GEN-LAST:event_movieTypeComBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        name = nameTF.getText();
        age  = ageSpinField.getValue();
        gender = (String)genderComBox.getSelectedItem();
        mobileNo = mobNoTF.getText();
        movieType = (String)movieTypeComBox.getSelectedItem();
        password = passwordTF.getText();
        confPassword = confPassTF.getText();
        
        if(!checkConstraints())
            return;
        
        try
        {
            con = DBConnection.connect();
            ps  = con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3, age);
            ps.setString(4, gender);
            ps.setString(5, mobileNo);
            ps.setString(6,movieType);
            ps.setString(7, password);    
            
            int i = ps.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Registered Successfully");
                bookNowButton.setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        
        //JOptionPane.showMessageDialog(null,"Not Saved");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new LoginFrame().show();
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void bookNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowButtonActionPerformed
        LoginCredential.setUsername(name);
        LoginCredential.setPassword(password);
        new MainFrame().show();
        dispose();
    }//GEN-LAST:event_bookNowButtonActionPerformed

    private boolean checkConstraints()
    {
        if(name.equals(""))
            JOptionPane.showMessageDialog(null,"User Name Is Mandatory");
        else if( age <= 0)
            JOptionPane.showMessageDialog(null,"Please Fill Age Properly");
        else if(gender.equals("Select Gender"))
            JOptionPane.showMessageDialog(null,"Gender Is Mandatory");
        else if(mobileNo.equals(""))
            JOptionPane.showMessageDialog(null,"Mobile Number Is Mandatory");
        else if(mobileNo.length()!= 10)
            JOptionPane.showMessageDialog(null,"Please Enter 10 digit Mobile Number");
        else if(movieType.equals("Movie type"))
            JOptionPane.showMessageDialog(null,"Movie Type Is Mandatory");
        else if(password.equals("") || confPassword.equals(""))
            JOptionPane.showMessageDialog(null,"Password Is Mandatory");
        else if( !password.equals(confPassword))
            JOptionPane.showMessageDialog(null,"Password And Confirm Password Are Not Matching");
        else
        {
            for(int i=0;i<mobileNo.length();i++)
            {
                if( mobileNo.charAt(i)<'0' || mobileNo.charAt(i)>'9')
                {
                    JOptionPane.showMessageDialog(null,"Enter Valid Mobile No");
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    
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
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private com.toedter.components.JSpinField ageSpinField;
    private javax.swing.JButton bookNowButton;
    private javax.swing.JLabel confPassLabel;
    private javax.swing.JPasswordField confPassTF;
    private javax.swing.JComboBox<String> genderComBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel mobNoLabel;
    private javax.swing.JTextField mobNoTF;
    private javax.swing.JComboBox<String> movieTypeComBox;
    private javax.swing.JLabel movieTypeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel regBgImage;
    private javax.swing.JPanel regFieldPanel;
    private javax.swing.JLabel regLabel;
    private javax.swing.JPanel regPanel;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
