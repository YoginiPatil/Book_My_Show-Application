package show;

import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PayementProcedureFrame extends javax.swing.JFrame {
    
    Connection con = null ;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    Blob imgb = null;
    FileOutputStream movieImg = null;
    
    String accNo = null;
    String cvc = null;
    String cardHolderName = null;
    
    public PayementProcedureFrame() {
        initComponents();
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Payement Procedure");
        
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("src\\show\\images\\PaymentBgImage.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();
        
        //set bounds of frame and componenent
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
        
        basePanel.setLocation((width/2)-(width/4), ((height/2)-(height/4))-30);
        
        
        try{
            img = ImageIO.read(new File("src\\show\\images\\DebitCardImage.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        width = (int)cardImgLabel.getWidth();
        height = (int)cardImgLabel.getHeight();
        
        resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
        g2 = resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, width, height, null);
        g2.dispose();   
        imgicon = new ImageIcon(resizeimg);
        cardImgLabel.setIcon(imgicon);
        
        try
        {
            con = DBConnection.connect();
            ps  = con.prepareStatement("select * from bookings where id=?");
            ps.setInt(1, BookingDetails.getId());
            rs = ps.executeQuery();
            if(rs.next())
            {
                imgb = rs.getBlob(3);
                byte barr[] = imgb.getBytes(1,(int)imgb.length());
                movieImg = new FileOutputStream("src\\show\\images\\BookedMovie.jpg");
                movieImg.write(barr);
                
                
                img = ImageIO.read(new File("src\\show\\images\\BookedMovie.jpg"));
                width = selectedMovieLabel.getWidth();
                height = selectedMovieLabel.getHeight();
                
                resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
                g2 = resizeimg.createGraphics();
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g2.drawImage(img, 0, 0, width, height, null);
                g2.dispose();
        
                imgicon = new ImageIcon(resizeimg);
                selectedMovieLabel.setIcon(imgicon);
       
                selectedSeatQnLabel.setText(" "+rs.getInt(5)+"    X");
                selectedSeatTypeLabel.setText(rs.getInt(4)+"");
                selectedFoodQnlabel.setText(rs.getInt(7)+"    X");
                selectedFoodTypeLabel.setText(rs.getInt(6)+"");
                int calculatedPrice = rs.getInt(4)*rs.getInt(5)+rs.getInt(6)*rs.getInt(7);
                calculatedPricelabel.setText("=  "+calculatedPrice);
                TotalAmountLabel.setText(rs.getFloat(8)+"");
                
                payButton.setText("Pay "+rs.getFloat(8));
                
                usernameLabel.setText(LoginCredential.getUsername());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        bookingDetailsPanel = new javax.swing.JPanel();
        selectedMovieLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        totalSeatLabel = new javax.swing.JLabel();
        foodQuantityLabel = new javax.swing.JLabel();
        userMobNoLabel = new javax.swing.JLabel();
        selectedSeatQnLabel = new javax.swing.JLabel();
        selectedSeatTypeLabel = new javax.swing.JLabel();
        selectedFoodQnlabel = new javax.swing.JLabel();
        selectedFoodTypeLabel = new javax.swing.JLabel();
        calculatedPricelabel = new javax.swing.JLabel();
        totalAmtLabel = new javax.swing.JLabel();
        TotalAmountLabel = new javax.swing.JLabel();
        payementCompPanel = new javax.swing.JPanel();
        cardImgLabel = new javax.swing.JLabel();
        cardNoLabel = new javax.swing.JLabel();
        cvcLabel = new javax.swing.JLabel();
        cvcTF = new javax.swing.JTextField();
        holderNameLabel = new javax.swing.JLabel();
        holderNameTF = new javax.swing.JTextField();
        expnDateLabel = new javax.swing.JLabel();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        yearChooser = new com.toedter.calendar.JYearChooser();
        payButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        cardNoTF1 = new javax.swing.JTextField();
        cardNoTF2 = new javax.swing.JTextField();
        cardNoTF3 = new javax.swing.JTextField();
        cardNoTF4 = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        bgImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        bookingDetailsPanel.setBackground(new java.awt.Color(255, 0, 102));

        selectedMovieLabel.setBorder(new javax.swing.border.MatteBorder(null));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        totalSeatLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalSeatLabel.setText("Seats");

        foodQuantityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodQuantityLabel.setText("Food");

        userMobNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userMobNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        selectedSeatQnLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        selectedSeatTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        selectedFoodQnlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        selectedFoodTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        calculatedPricelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculatedPricelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        totalAmtLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalAmtLabel.setText("Total Amount");

        TotalAmountLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout bookingDetailsPanelLayout = new javax.swing.GroupLayout(bookingDetailsPanel);
        bookingDetailsPanel.setLayout(bookingDetailsPanelLayout);
        bookingDetailsPanelLayout.setHorizontalGroup(
            bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculatedPricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userMobNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                                .addComponent(foodQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedFoodQnlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                                .addComponent(totalSeatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectedSeatQnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedSeatTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedFoodTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                        .addComponent(totalAmtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(TotalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(selectedMovieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingDetailsPanelLayout.setVerticalGroup(
            bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                .addComponent(selectedMovieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userMobNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalSeatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookingDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectedSeatQnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedSeatTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(foodQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(selectedFoodTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedFoodQnlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculatedPricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAmtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(TotalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        payementCompPanel.setBackground(new java.awt.Color(255, 255, 255));

        cardNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoLabel.setText("Card Number");

        cvcLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvcLabel.setText("CVC");

        cvcTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvcTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        holderNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        holderNameLabel.setText("Card Holder Name");

        holderNameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        expnDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expnDateLabel.setText("Expiration Date");

        payButton.setBackground(new java.awt.Color(255, 51, 102));
        payButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        previousButton.setBackground(new java.awt.Color(255, 51, 102));
        previousButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        cardNoTF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoTF1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cardNoTF2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoTF2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cardNoTF3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoTF3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cardNoTF4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardNoTF4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout payementCompPanelLayout = new javax.swing.GroupLayout(payementCompPanel);
        payementCompPanel.setLayout(payementCompPanelLayout);
        payementCompPanelLayout.setHorizontalGroup(
            payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payementCompPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(payementCompPanelLayout.createSequentialGroup()
                        .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(expnDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(holderNameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(holderNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(cardNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(payementCompPanelLayout.createSequentialGroup()
                                .addComponent(cardNoTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNoTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardNoTF4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cvcTF, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(cvcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, payementCompPanelLayout.createSequentialGroup()
                        .addComponent(monthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(yearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, payementCompPanelLayout.createSequentialGroup()
                        .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        payementCompPanelLayout.setVerticalGroup(
            payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payementCompPanelLayout.createSequentialGroup()
                .addComponent(cardImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cvcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(cardNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cvcTF, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cardNoTF1)
                    .addComponent(cardNoTF2)
                    .addComponent(cardNoTF4)
                    .addComponent(cardNoTF3))
                .addGap(18, 18, 18)
                .addComponent(holderNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(holderNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monthChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(yearChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(payementCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payButton)
                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(bookingDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payementCompPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payementCompPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(basePanel);
        basePanel.setBounds(110, 80, 710, 460);

        logoutButton.setBackground(new java.awt.Color(255, 51, 153));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(0, 0, 110, 25);
        getContentPane().add(bgImageLabel);
        bgImageLabel.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        try {
            int P = JOptionPane.showConfirmDialog(null,"Are you sure want to logout","Logout",JOptionPane.YES_NO_OPTION);
            if (P == 0) 
            {
                new LoginFrame().show();
                dispose();
            }
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        new MainFrame().show();
        dispose();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
            accNo = cardNoTF1.getText()+""+cardNoTF2.getText()+""+cardNoTF3.getText()+""+cardNoTF4.getText();
            cvc = cvcTF.getText();
            cardHolderName = holderNameTF.getText();
            
           if(!checkConstraint())
               return;
           
           con = DBConnection.connect();
        try{
            ps = con.prepareStatement("update bookings set status='paid' where id=?");
            ps.setInt(1, BookingDetails.getId());
            int i = ps.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(null,"Payement Successfull!!");
        } catch (Exception ex) {
            Logger.getLogger(PayementProcedureFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_payButtonActionPerformed
    
    public boolean checkConstraint()
    {
        if(accNo.equals(""))
            JOptionPane.showMessageDialog(null,"Account Number Is Mandatory");
        else if(accNo.length() != 16)
            JOptionPane.showMessageDialog(null,"Enter Valid Account Number");
        else if(cvc.equals(""))
            JOptionPane.showMessageDialog(null,"CVC Is Mandatory");
        else if(cvc.length() != 3)
            JOptionPane.showMessageDialog(null,"Enter Valid CVC");
        else if(cardHolderName.equals(""))
            JOptionPane.showMessageDialog(null,"Name Is Mandatory");
        else
            return true;
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
            java.util.logging.Logger.getLogger(PayementProcedureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayementProcedureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayementProcedureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayementProcedureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayementProcedureFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalAmountLabel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel bgImageLabel;
    private javax.swing.JPanel bookingDetailsPanel;
    private javax.swing.JLabel calculatedPricelabel;
    private javax.swing.JLabel cardImgLabel;
    private javax.swing.JLabel cardNoLabel;
    private javax.swing.JTextField cardNoTF1;
    private javax.swing.JTextField cardNoTF2;
    private javax.swing.JTextField cardNoTF3;
    private javax.swing.JTextField cardNoTF4;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JTextField cvcTF;
    private javax.swing.JLabel expnDateLabel;
    private javax.swing.JLabel foodQuantityLabel;
    private javax.swing.JLabel holderNameLabel;
    private javax.swing.JTextField holderNameTF;
    private javax.swing.JButton logoutButton;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JButton payButton;
    private javax.swing.JPanel payementCompPanel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel selectedFoodQnlabel;
    private javax.swing.JLabel selectedFoodTypeLabel;
    private javax.swing.JLabel selectedMovieLabel;
    private javax.swing.JLabel selectedSeatQnLabel;
    private javax.swing.JLabel selectedSeatTypeLabel;
    private javax.swing.JLabel totalAmtLabel;
    private javax.swing.JLabel totalSeatLabel;
    private javax.swing.JLabel userMobNoLabel;
    private javax.swing.JLabel usernameLabel;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
