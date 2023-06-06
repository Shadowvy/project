
package guessinggame;



import java.sql.*;
import javax.swing.JOptionPane;


public class SigninPage extends javax.swing.JFrame {
Connection con=null;


    PreparedStatement ps=null;
    ResultSet rset=null;
    
    public SigninPage() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        passLabel = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        piclogo = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign in Page!");
        setBackground(java.awt.Color.darkGray);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(493, 560));
        setName("sgininFrame"); // NOI18N
        setResizable(false);

        backGround.setBackground(new java.awt.Color(43, 43, 43));
        backGround.setForeground(new java.awt.Color(102, 102, 102));
        backGround.setMaximumSize(new java.awt.Dimension(493, 560));
        backGround.setMinimumSize(new java.awt.Dimension(493, 560));
        backGround.setPreferredSize(new java.awt.Dimension(493, 560));

        passLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passLabel.setLabelFor(PasswordField);
        passLabel.setText("Enter your password:");

        UserNameField.setBackground(new java.awt.Color(102, 102, 102));
        UserNameField.setForeground(new java.awt.Color(255, 255, 255));
        UserNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        UserNameField.setCaretColor(new java.awt.Color(102, 102, 102));

        SubmitBtn.setBackground(new java.awt.Color(103, 125, 183));
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitBtn.setFocusable(false);
        SubmitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userLabel.setLabelFor(UserNameField);
        userLabel.setText("Enter your username:");

        BackBtn.setBackground(new java.awt.Color(158, 43, 37));
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back>");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.setFocusable(false);
        BackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        piclogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        piclogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guessinggame/signin.png"))); // NOI18N

        PasswordField.setBackground(new java.awt.Color(102, 102, 102));
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PasswordField.setCaretColor(new java.awt.Color(102, 102, 102));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))
                        .addComponent(passLabel)
                        .addComponent(userLabel)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordField)
                            .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backGroundLayout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(piclogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(piclogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBtn)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        // prepare statement to check the user info if it was in db or not
         String findUser="select * from playerdata where username=? and password=?";
        try {
             con=Database.dbconnect();
            ps=con.prepareStatement(findUser);
            ps.setString(1, UserNameField.getText());
            ps.setString(2, PasswordField.getText());
            rset=ps.executeQuery();
            
            if(rset.next()){
          
                // if the user enter the valid info it will directing him to nextpage 
                  Player.setPlayerName(UserNameField.getText().toUpperCase());
                  Dashboard dash=new Dashboard();                
                  dispose();
                  dash.setVisible(true);
            }
            else { // if the user failed to log in
                JOptionPane.showMessageDialog(null, "Username or password is incorrect");
                    return;  } 
        
        }catch (Exception e) {
            
            e.printStackTrace();
            
        }
        finally{
            
          // to close connection with db
         if(con!=null){
             try{con.close();}
             catch(Exception e){e.printStackTrace();}}
        
        }
    
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        // to return the user to previous page
        Welcome back=new Welcome();
        dispose();
        back.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SigninPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SigninPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel piclogo;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}