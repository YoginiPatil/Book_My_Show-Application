package show;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
   
    int seatTypePrice,totalSeatTypePrice,foodPrice,totalFoodPrice,calculatedPrice,noOfSeats;
    float totalPrice;
    int choice,ch,quantity;
    
    FileInputStream movieImage = null;
    Connection con = null ;
    PreparedStatement ps = null;
   
    public MainFrame() 
    {
        initComponents();
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("Book My Show");
        
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("src\\show\\images\\popCornImg.jpg"));
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
        BookingComponentPanel.setBounds((width/2),20,(width/2)-30, height);
        BookingComponentPanel.setOpaque(false);
        logoutButton.setBounds(0, 0, 95, 31);
        //end here ---------------------------------------
        
        BufferedImage resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizeimg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, width, height, null);
        g2.dispose();
        
       ImageIcon imgicon = new ImageIcon(resizeimg);
       bgImageLabel.setIcon(imgicon);
       
       
       //set Movie1 Image
       try{
            img = ImageIO.read(new File("src\\show\\images\\movie1.jfif"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       width = (int)movieLabel1.getWidth();
       height = (int)movieLabel1.getHeight();
       resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
       g2 = resizeimg.createGraphics();
       g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
       g2.drawImage(img, 0, 0, width, height, null);
       g2.dispose();
       imgicon = new ImageIcon(resizeimg);
       movieLabel1.setIcon(imgicon);
       //set Movie1 Image Ends here
            
       //set Movie2 Image
       try{
            img = ImageIO.read(new File("src\\show\\images\\Movie2.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       width = (int)movieLabel2.getWidth();
       height = (int)movieLabel2.getHeight();
       resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
       g2 = resizeimg.createGraphics();
       g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
       g2.drawImage(img, 0, 0, width, height, null);
       g2.dispose();
       imgicon = new ImageIcon(resizeimg);
       movieLabel2.setIcon(imgicon);
       //set Movie2 Image Ends here
       
       //set Movie3 Image
       try{
            img = ImageIO.read(new File("src\\show\\images\\Movie3.jpg"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       width = (int)movieLabel3.getWidth();
       height = (int)movieLabel3.getHeight();
       resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
       g2 = resizeimg.createGraphics();
       g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
       g2.drawImage(img, 0, 0, width, height, null);
       g2.dispose();
       imgicon = new ImageIcon(resizeimg);
       movieLabel3.setIcon(imgicon);
       //set Movie3 Image Ends here
       
       //set Movie4 Image
       try{
            img = ImageIO.read(new File("src\\show\\images\\movie4.jfif"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       width = (int)movieLabel4.getWidth();
       height = (int)movieLabel4.getHeight();
       resizeimg = new BufferedImage(width, height , BufferedImage.TYPE_INT_RGB);
       g2 = resizeimg.createGraphics();
       g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
       g2.drawImage(img, 0, 0, width, height, null);
       g2.dispose();
       imgicon = new ImageIcon(resizeimg);
       movieLabel4.setIcon(imgicon);
       //set Movie4 Image Ends here
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookingComponentPanel = new javax.swing.JPanel();
        seatTypeComBox = new javax.swing.JComboBox<>();
        NoOfSeatComBox = new javax.swing.JComboBox<>();
        foodComBox = new javax.swing.JComboBox<>();
        foodQuantityComBox = new javax.swing.JComboBox<>();
        newButton = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        movieLabel1 = new javax.swing.JLabel();
        movieLabel2 = new javax.swing.JLabel();
        movieLabel3 = new javax.swing.JLabel();
        movieLabel4 = new javax.swing.JLabel();
        foodPriceLabel = new javax.swing.JLabel();
        calculatedPriceLabel = new javax.swing.JLabel();
        gstLabel = new javax.swing.JLabel();
        grossAmtLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        totalFoodPriceLabel = new javax.swing.JLabel();
        seatPriceLabel = new javax.swing.JLabel();
        totalSeatPriceLabel = new javax.swing.JLabel();
        saveToCartButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        bgImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BookingComponentPanel.setOpaque(false);

        seatTypeComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat Type", "Platinum -  Rs.200", "Diamond -  Rs.150", "Gold -  Rs.100", "Silver -  Rs.70" }));
        seatTypeComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatTypeComBoxActionPerformed(evt);
            }
        });

        NoOfSeatComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select No Of Seats", "1", "2", "3", "4", "5", "6", "Other" }));
        NoOfSeatComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoOfSeatComBoxActionPerformed(evt);
            }
        });

        foodComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food And Beverages", "Samosa - Rs.100", "Pop-Corn - Rs.150", "Coke - Rs.160", "Samosa Coke Combo - Rs.200", "Samosa Pop-Corn Combo - Rs.250" }));
        foodComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodComBoxActionPerformed(evt);
            }
        });

        foodQuantityComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food And Beverages Quantity", " " }));
        foodQuantityComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodQuantityComBoxActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        proceedButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proceedButton.setText("Proceed To Payement");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel Order");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        movieLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieLabel1MouseClicked(evt);
            }
        });

        movieLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieLabel2MouseClicked(evt);
            }
        });

        movieLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieLabel3MouseClicked(evt);
            }
        });

        movieLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieLabel4MouseClicked(evt);
            }
        });

        foodPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        calculatedPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gstLabel.setBackground(new java.awt.Color(255, 0, 0));
        gstLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gstLabel.setText("Gst 18%");

        grossAmtLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grossAmtLabel.setText("Gross Amount");

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalFoodPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        seatPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        totalSeatPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        saveToCartButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveToCartButton.setText("Save To Cart");
        saveToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BookingComponentPanelLayout = new javax.swing.GroupLayout(BookingComponentPanel);
        BookingComponentPanel.setLayout(BookingComponentPanelLayout);
        BookingComponentPanelLayout.setHorizontalGroup(
            BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proceedButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton))
                    .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(seatTypeComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoOfSeatComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foodComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foodQuantityComBox, 0, 259, Short.MAX_VALUE))
                    .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                        .addComponent(movieLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(movieLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                                .addComponent(movieLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(movieLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gstLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grossAmtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(calculatedPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalFoodPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalSeatPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(foodPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(seatPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        BookingComponentPanelLayout.setVerticalGroup(
            BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(movieLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(movieLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatTypeComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalSeatPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfSeatComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodQuantityComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BookingComponentPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(totalFoodPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculatedPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gstLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grossAmtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(BookingComponentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        getContentPane().add(BookingComponentPanel);
        BookingComponentPanel.setBounds(390, 10, 600, 640);

        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton);
        logoutButton.setBounds(0, 0, 110, 30);

        bgImageLabel.setBackground(new java.awt.Color(255, 0, 51));
        getContentPane().add(bgImageLabel);
        bgImageLabel.setBounds(0, 0, 1010, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_newButtonActionPerformed

    private void seatTypeComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatTypeComBoxActionPerformed
        int ch = seatTypeComBox.getSelectedIndex();
        
        if(ch == 1)
        {
            seatPriceLabel.setText("200");
            seatTypePrice = 200;
        }
        else if(ch == 2)
        {
            seatPriceLabel.setText("150");
            seatTypePrice = 150;
        }
        else if(ch == 3)
        {
            seatPriceLabel.setText("100");
            seatTypePrice = 100;
        }
        else if(ch == 4)
        {
            seatPriceLabel.setText("70");
            seatTypePrice = 70;
        }
        else
            reset();    
        
        if( choice != 0 && totalSeatPriceLabel.getText().equals(""))
        {
            totalSeatTypePrice = (Integer.parseInt(seatPriceLabel.getText()))*choice;
            totalSeatPriceLabel.setText(totalSeatTypePrice+"");
        }
        checkContraint();
    }//GEN-LAST:event_seatTypeComBoxActionPerformed
    
    private void checkContraint()
    {
        if( !seatPriceLabel.getText().equals("") && !totalSeatPriceLabel.getText().equals("") && !foodPriceLabel.getText().equals("") && !totalFoodPriceLabel.getText().equals(""))
        {
            totalSeatTypePrice = (Integer.parseInt(seatPriceLabel.getText()))*choice;
            totalFoodPrice = (Integer.parseInt(foodPriceLabel.getText()))*quantity;
            calculatedPrice = totalSeatTypePrice+totalFoodPrice;
            totalPrice = calculatedPrice - calculatedPrice * 0.18f;

            seatPriceLabel.setText(seatTypePrice+"");
            totalSeatPriceLabel.setText(totalSeatTypePrice+"");
            foodPriceLabel.setText(foodPrice+"");
            totalFoodPriceLabel.setText(totalFoodPrice+"");
            calculatedPriceLabel.setText(calculatedPrice+"");
            totalPriceLabel.setText(totalPrice+"");
        }
        else if( !totalSeatPriceLabel.getText().equals(""))
        {
           totalSeatTypePrice = (Integer.parseInt(seatPriceLabel.getText()))*choice;
           totalSeatPriceLabel.setText(totalSeatTypePrice+"");
        }  
        if( !totalFoodPriceLabel.getText().equals(""))
        {
            totalFoodPrice = (Integer.parseInt(foodPriceLabel.getText()))*quantity;
            totalFoodPriceLabel.setText(totalFoodPrice+"");
        }     
   }
    
    private void reset()
    {
        seatPriceLabel.setText("");
        totalSeatPriceLabel.setText("");
        foodPriceLabel.setText("");
        totalFoodPriceLabel.setText("");
        calculatedPriceLabel.setText("");
        totalPriceLabel.setText(""); 
        
        seatTypePrice = 0;totalSeatTypePrice = 0 ;foodPrice = 0; totalFoodPrice = 0;
        calculatedPrice = 0;noOfSeats = 0;totalPrice = 0.0f;ch = 0 ; choice = 0;quantity = 0;
    }
    
    private void movieLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabel1MouseClicked
        setEnabledToAll();
        movieLabel2.setEnabled(false);
        movieLabel3.setEnabled(false);
        movieLabel4.setEnabled(false);
         
        try{
            movieImage = new FileInputStream("src\\show\\images\\movie1.jfif");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_movieLabel1MouseClicked

    private void movieLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabel2MouseClicked
        setEnabledToAll();
        movieLabel1.setEnabled(false);
        movieLabel3.setEnabled(false);
        movieLabel4.setEnabled(false);
        
        try{
            movieImage = movieImage = new FileInputStream("src\\show\\images\\movie2.jpg");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_movieLabel2MouseClicked

    private void movieLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabel3MouseClicked
        setEnabledToAll();
        movieLabel1.setEnabled(false);
        movieLabel2.setEnabled(false);
        movieLabel4.setEnabled(false);
        
        try{
            movieImage = movieImage = new FileInputStream("src\\show\\images\\movie3.jpg");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_movieLabel3MouseClicked

    private void movieLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabel4MouseClicked
        setEnabledToAll();
        movieLabel1.setEnabled(false);
        movieLabel2.setEnabled(false);
        movieLabel3.setEnabled(false);
        
        try{
            movieImage = movieImage = new FileInputStream("src\\show\\images\\movie4.jpg");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_movieLabel4MouseClicked

    void setEnabledToAll()
    {
        movieLabel1.setEnabled(true);
        movieLabel2.setEnabled(true);
        movieLabel3.setEnabled(true);
        movieLabel4.setEnabled(true);
    }
    
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

    private void NoOfSeatComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoOfSeatComBoxActionPerformed
        choice =  NoOfSeatComBox.getSelectedIndex();
        
        if( choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6)
        {
            if(seatPriceLabel.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Also Select Seat Type !!");
                totalSeatPriceLabel.setText("");
            }
            else
            {
                totalSeatTypePrice= choice*seatTypePrice;     
                totalSeatPriceLabel.setText(totalSeatTypePrice+"");
            }
            addItemsToComboBox(choice);
        }
        else
        {
            reset();
        }        
        checkContraint();
    }//GEN-LAST:event_NoOfSeatComBoxActionPerformed

    void addItemsToComboBox(int ch)
    {
        //foodQuantityComBox.removeAllItems();
        //int itemCount = foodQuantityComBox.getItemCount();
        
        //String str = foodQuantityComBox.getSelectedItem().toString().trim();
        //for(int i = itemCount-1; i > 0 ; i--)
        //{
          // foodQuantityComBox.removeItemAt(i);
        //} 
        //foodQuantityComBox.addItem("Select Food And Beverages Quantity");
        for(int i=1;i<=ch;i++)
        {
            foodQuantityComBox.addItem(i+"");
        }
    }
    private void foodComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodComBoxActionPerformed
        ch = foodComBox.getSelectedIndex();
        
        if(ch == 1 )
        {
            foodPrice=100;
            foodPriceLabel.setText(foodPrice+"");
        }
        else if(ch == 2)
        {
            foodPrice=150;
            foodPriceLabel.setText(foodPrice+"");
        }
        else if(ch == 3)
        {
            foodPrice=160;
            foodPriceLabel.setText(foodPrice+"");
        }
        else if(ch == 4)
        {
            foodPrice=200;
            foodPriceLabel.setText(foodPrice+"");
        }
        else if(ch == 5)
        {
            foodPrice=250;
            foodPriceLabel.setText(foodPrice+"");
        }
        else
            reset();
        
        if( quantity != 0 && totalFoodPriceLabel.getText().equals(""))
        {
            totalFoodPrice = foodPrice*quantity;
            totalFoodPriceLabel.setText(totalFoodPrice+"");
        }
        checkContraint();
    }//GEN-LAST:event_foodComBoxActionPerformed

    private void foodQuantityComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodQuantityComBoxActionPerformed
        
        quantity = foodQuantityComBox.getSelectedIndex();
        quantity = quantity-1;
        totalFoodPrice = foodPrice*quantity;
        
        if(quantity < 1)
            reset();
        else
        {
            if(foodPriceLabel.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Also Select Food Type !!");
                totalFoodPriceLabel.setText("");
            }
            else
            {
                totalFoodPriceLabel.setText(totalFoodPrice+"");
            }

            if( !seatPriceLabel.getText().equals("") && !totalSeatPriceLabel.getText().equals("") && !foodPriceLabel.getText().equals("") && !totalFoodPriceLabel.getText().equals(""))
            {
                calculatedPrice = totalFoodPrice+totalSeatTypePrice;
                calculatedPriceLabel.setText(calculatedPrice+"");
                totalPrice = calculatedPrice-(calculatedPrice*0.18f);
                totalPriceLabel.setText(totalPrice+"");
            }
            checkContraint();
        }
    }//GEN-LAST:event_foodQuantityComBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        reset();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        if( !seatPriceLabel.getText().equals("") && !totalSeatPriceLabel.getText().equals("") && !foodPriceLabel.getText().equals("") && !totalFoodPriceLabel.getText().equals("") && !calculatedPriceLabel.getText().equals("") && !totalPriceLabel.getText().equals(""))
        {
            if(movieImage == null)
                JOptionPane.showMessageDialog(null,"Please Select Movie");
            else
            {
                int id = 0;
                int uid = 0;
                String status = "unpaid";
                
                try
                {
                    con = DBConnection.connect();
                    
                    ps = con.prepareStatement("select id from users where name=? and password=?");
                    ps.setString(1,LoginCredential.getUsername());
                    ps.setString(2,LoginCredential.getPassword());
                    ResultSet rs = ps.executeQuery();
                    rs.next();
                    uid = rs.getInt(1);
                    
                            
                    ps  = con.prepareStatement("insert into bookings values(?,?,?,?,?,?,?,?,?)");
                    ps.setInt(1,id);
                    ps.setInt(2,uid);
                    ps.setBinaryStream(3, movieImage);
                    ps.setInt(4,seatTypePrice);
                    ps.setInt(5,choice);
                    ps.setInt(6,foodPrice);
                    ps.setInt(7,quantity);
                    ps.setFloat(8,totalPrice);
                    ps.setString(9, status);
                    
                    int i = ps.executeUpdate();
                    if(i>0)
                    {
                        JOptionPane.showMessageDialog(null,"Movie Booked Successfully");
                        ps  = con.prepareStatement("select id from bookings where uid=? and status='unpaid'");
                        ps.setInt(1, uid);
                        rs = ps.executeQuery();
                        while(rs.next())
                        {
                            BookingDetails.setId(rs.getInt(1));  
                        }
                        PayementProcedureFrame p1 = new PayementProcedureFrame();
                        p1.show();
                        dispose();
                    }
                }
                catch(Exception e)
                {
                   //JOptionPane.showMessageDialog(null,"Error");
                    e.printStackTrace();
                }
            }
        }
        else
        {
            con = DBConnection.connect();
            boolean flag = false;
            try
            {
                ps = con.prepareStatement("select id from users where name=? and password=?");
                ps.setString(1,LoginCredential.getUsername());
                ps.setString(2,LoginCredential.getPassword());
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    int uid = rs.getInt(1);
                    ps = con.prepareStatement("select id from bookings where uid=?");
                    ps.setInt(1, uid);
                    rs = ps.executeQuery();
                    if(rs.next())
                    {
                        ps = con.prepareStatement("select id,status from bookings where uid=?");
                        ps.setInt(1, uid);
                        rs = ps.executeQuery();
                        while(rs.next())
                        {
                            String status = rs.getString(2);
                            if(status.equals("unpaid"))
                            {
                                int id = rs.getInt(1);
                                flag = true;
                                BookingDetails.setId(id);
                                PayementProcedureFrame p1 = new PayementProcedureFrame();
                                p1.show();
                                dispose();
                            }
                        }
                        if(!flag)
                        {
                            JOptionPane.showMessageDialog(null,"Your Are Already Done With payement !! ");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You Haven't Made Any Booking Yet,To Book Please Fill All Mandatory Field!!");
                    }
                }
                
            }
            catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void saveToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToCartButtonActionPerformed
       if( !seatPriceLabel.getText().equals("") && !totalSeatPriceLabel.getText().equals("") && !foodPriceLabel.getText().equals("") && !totalFoodPriceLabel.getText().equals("") && !calculatedPriceLabel.getText().equals("") && !totalPriceLabel.getText().equals(""))
        {
            if(movieImage == null)
                JOptionPane.showMessageDialog(null,"Please Select Movie");
            else
            {
                int id = 0;
                int uid = 0;
                String status = "unpaid";
                
                try
                {
                    con = DBConnection.connect();
                    
                    ps = con.prepareStatement("select id from users where name=? and password=?");
                    ps.setString(1,LoginCredential.getUsername());
                    ps.setString(2,LoginCredential.getPassword());
                    ResultSet rs = ps.executeQuery();
                    rs.next();
                    uid = rs.getInt(1);
                    
                            
                    ps  = con.prepareStatement("insert into bookings values(?,?,?,?,?,?,?,?,?)");
                    ps.setInt(1,id);
                    ps.setInt(2,uid);
                    ps.setBinaryStream(3, movieImage);
                    ps.setInt(4,seatTypePrice);
                    ps.setInt(5,choice);
                    ps.setInt(6,foodPrice);
                    ps.setInt(7,quantity);
                    ps.setFloat(8,totalPrice);
                    ps.setString(9, status);
                    
                    int i = ps.executeUpdate();
                    if(i>0)
                    {
                        JOptionPane.showMessageDialog(null,"Movie Save To Cart Successfully");
                    }
                }
                catch(Exception e)
                {
                   //JOptionPane.showMessageDialog(null,"Error");
                    e.printStackTrace();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Fill All Mandatory Fields");
        }
    }//GEN-LAST:event_saveToCartButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookingComponentPanel;
    private javax.swing.JComboBox<String> NoOfSeatComBox;
    private javax.swing.JLabel bgImageLabel;
    private javax.swing.JLabel calculatedPriceLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> foodComBox;
    private javax.swing.JLabel foodPriceLabel;
    private javax.swing.JComboBox<String> foodQuantityComBox;
    private javax.swing.JLabel grossAmtLabel;
    private javax.swing.JLabel gstLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel movieLabel1;
    private javax.swing.JLabel movieLabel2;
    private javax.swing.JLabel movieLabel3;
    private javax.swing.JLabel movieLabel4;
    private javax.swing.JButton newButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton saveToCartButton;
    private javax.swing.JLabel seatPriceLabel;
    private javax.swing.JComboBox<String> seatTypeComBox;
    private javax.swing.JLabel totalFoodPriceLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalSeatPriceLabel;
    // End of variables declaration//GEN-END:variables
}
