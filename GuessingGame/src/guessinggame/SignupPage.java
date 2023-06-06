
package guessinggame;


import java.sql.*;
import javax.swing.JOptionPane;
public class SignupPage extends javax.swing.JFrame {

 Connection con;

   
   
    
    public SignupPage() {
        initComponents();
       con=Database.dbconnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFrame = new javax.swing.JPanel();
        registerBtn = new javax.swing.JButton();
        newPassword = new javax.swing.JPasswordField();
        newuserField = new javax.swing.JTextField();
        picLogo = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        retypenewPassword = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        rePassLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signup Page!");
        setBackground(java.awt.Color.darkGray);
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(493, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(493, 560));

        bgFrame.setBackground(new java.awt.Color(43, 43, 43));
        bgFrame.setForeground(new java.awt.Color(255, 255, 255));
        bgFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgFrame.setMaximumSize(new java.awt.Dimension(493, 560));
        bgFrame.setMinimumSize(new java.awt.Dimension(493, 560));

        registerBtn.setBackground(new java.awt.Color(103, 125, 183));
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register!");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        newPassword.setBackground(new java.awt.Color(102, 102, 102));
        newPassword.setForeground(new java.awt.Color(255, 255, 255));

        newuserField.setBackground(new java.awt.Color(102, 102, 102));
        newuserField.setForeground(new java.awt.Color(255, 255, 255));
        newuserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserFieldActionPerformed(evt);
            }
        });

        picLogo.setForeground(java.awt.Color.darkGray);
        picLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessinggame/signup.png"))); // NOI18N
        picLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backBtn.setBackground(new java.awt.Color(158, 43, 37));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back ->");
        backBtn.setToolTipText("return to main menu");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusable(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setLabelFor(newuserField);
        userNameLabel.setText("Enter your username:");

        retypenewPassword.setBackground(new java.awt.Color(102, 102, 102));
        retypenewPassword.setForeground(new java.awt.Color(255, 255, 255));
        retypenewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypenewPasswordActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setLabelFor(newPassword);
        passwordLabel.setText("Enter your password:");

        rePassLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rePassLabel.setForeground(new java.awt.Color(255, 255, 255));
        rePassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rePassLabel.setLabelFor(retypenewPassword);
        rePassLabel.setText("Re-type your password agin:");

        javax.swing.GroupLayout bgFrameLayout = new javax.swing.GroupLayout(bgFrame);
        bgFrame.setLayout(bgFrameLayout);
        bgFrameLayout.setHorizontalGroup(
            bgFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFrameLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(bgFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypenewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rePassLabel)
                    .addComponent(picLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newuserField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel)
                    .addComponent(passwordLabel))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        bgFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newPassword, newuserField, retypenewPassword});

        bgFrameLayout.setVerticalGroup(
            bgFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFrameLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(picLogo)
                .addGap(30, 30, 30)
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newuserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rePassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retypenewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        bgFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newPassword, newuserField, retypenewPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newuserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newuserFieldActionPerformed

    private void retypenewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypenewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retypenewPasswordActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        // going back to the previous page
            Welcome back=new Welcome();
        setVisible(false);
        back.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    // initilaize from user inputs
    String username = newuserField.getText();
    String password = new String(newPassword.getText());
    String confirmPassword = new String(retypenewPassword.getText());
    
    
    //check if the user has filled all the fields
    if(username.isBlank()|password.isBlank()||confirmPassword.isBlank()){
    JOptionPane.showMessageDialog(this,"Please make sure all the fields are filled!");
    return;
    }else if (!password.equals(confirmPassword)) {// check if the password and retyped password match
        JOptionPane.showMessageDialog(null, "Please make sure you entered the password correctly.");
        return;
              }
    
    
    
    // prepare the query to add the user
        String adduser = "INSERT INTO playerdata (username, password) VALUES (?, ?)";
         con=Database.dbconnect();
         
         
        // trying to add user
      try (PreparedStatement ps = con.prepareStatement(adduser)) {
    
  

    // Check if the username already exists in the database
    String checkexistenceUser = "SELECT COUNT(*) FROM playerdata WHERE username = ?";
    
    // trying to check if it was in the database or not
    try (PreparedStatement checkUserStatement = con.prepareStatement(checkexistenceUser)) {
        checkUserStatement.setString(1, username);
        ResultSet resultSet = checkUserStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);

        if (count > 0) {
            // here if the user already exists in the database
            JOptionPane.showMessageDialog(null, "Username already exists.\n Please choose a different username.");
            return;
        }
    }

    // Insert the new user into the database after confirming that his name doesn't exist in db and the password matchs.
    int rowsUpdate=0;           
    ps.setString(1, username);
    ps.setString(2, password);
    rowsUpdate = ps.executeUpdate();

    if (rowsUpdate>0) {
        // Registration successful
        JOptionPane.showMessageDialog(null, "Registration completed!\nLet's Sign in :)");
        
        // moving to the sign in page
        SigninPage back = new SigninPage();
        dispose();
        back.setVisible(true);
    } else {
        // if failed to insert the new user
        JOptionPane.showMessageDialog(null, "Registration failed. Please try again.");
    }
} catch (SQLException e) {
    // if the db doesn't responed
    JOptionPane.showMessageDialog(null, "An error occurred during registration :).\n Please try again.");
    e.printStackTrace();
} finally{
          
          // to close the connection
         if(con!=null){
             try{con.close();}
             catch(Exception e){e.printStackTrace();}}
        
        }
                  
        
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel bgFrame;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField newuserField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel picLogo;
    private javax.swing.JLabel rePassLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPasswordField retypenewPassword;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}