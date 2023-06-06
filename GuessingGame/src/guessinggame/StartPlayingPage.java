/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guessinggame;

import javax.swing.JOptionPane;

/**
 *
 * @author SHADOWVY
 */
public class StartPlayingPage extends javax.swing.JFrame {

 //private  GameMode gamemode;
 private AlphaMode alphaMode;
 private NumberMode numberMode;
 private Player player=new Player();
 int randomNumber,rangeStartN,rangeEndN;
 boolean inputMode;
 char randomAlpha,rangeStartA,rangeEndA;
 int chances;

 
 
 public void initReqData(GameMode gamemode){
   //  this.gamemode=gamemode;
     
 if(gamemode instanceof AlphaMode ){
     inputMode=true;
     alphaMode=(AlphaMode)gamemode;
      
     randomAlpha=alphaMode.difficultyType.alpha();
     chances=gamemode.difficultyType.chances;
   rangeEndA=Character.toString(alphaMode.difficultyType.rangeEndA).charAt(0);
  
   rangeStartA=Character.toString(alphaMode.difficultyType.rangeStartA).charAt(0);
   
   texArea.setText("                             Mode("+alphaMode.toString()+") Level ("+alphaMode.difficultyType.toString()+")\n"
+"----------------------------------------------------------------------------\n"
+"1.In this Guess game you must guess the vowel alphabet.\n" +
"2.You are allowed to make one guess at a time.\n" +
"3.Each game has #"+chances+" chances to guess the correct vowel.\n" +
"4.Once you have used up all your chances, you lose the game.\n" +
"5.You have #"+chances+" chances to guess the alphabet\n"+
"                                                  Good Luck!\n"
+"----------------------------------------------------------------------------\n"+
"Your Guess have to be in this range:"+ "[ "+rangeStartA+" , "+rangeEndA+" ]\n");
          
     
 } 
 else if(gamemode instanceof NumberMode){ 
     inputMode=false;
     numberMode=(NumberMode)gamemode;
      randomNumber=numberMode.difficultyType.number();
 rangeEndN = numberMode.difficultyType.rangeEndN;
 chances=numberMode.difficultyType.chances;
        rangeStartN = numberMode.difficultyType.rangeStartN;
      texArea.setText("                             Mode("+numberMode.toString()+") Level ("+numberMode.difficultyType.toString()+")\n"
+"----------------------------------------------------------------------------\n"
+"1.In this Guess game you must guess the random number.\n" +
"2.You are allowed to make one guess at a time.\n" +
"3.Each game has #"+chances+" chances to guess the correct number.\n" +
"4.Once you have used up all your chances, you lose the game.\n" +
"5.You have #"+chances+" chances to guess the alphabet\n"+
"                                                  Good Luck!\n"
+"----------------------------------------------------------------------------\n"+
"Your Guess have to be in this range: "+ "[ "+rangeStartN+" , "+rangeEndN+" ]\n");   
        
       
 }
 
 }
 
 private void checkGuess(){
  char userLetter;    
  int userInt;
   
if(inputMode){
           userLetter=guessingField.getText().toLowerCase().charAt(0);
       
        if(chances==1){
               JOptionPane.showMessageDialog(this, "You have lost the game!"
                      + "\n The random Character was: [ "+randomAlpha+" ]");
               player.setPlayerScoreAlpha(0);
               GameDashboard back=new GameDashboard();
               dispose();
               back.setVisible(true);
                       }
        
        else if(randomAlpha==userLetter){
               chances--;
             player.setPlayerScoreAlpha(alphaMode.difficultyType.calculateScore(chances));
               JOptionPane.showMessageDialog(this, "You Won! with "+chances+
                       " chances left!");
               GameDashboard back=new GameDashboard();
               dispose();
               back.setVisible(true);
               }
    
        else if(userLetter>rangeEndA ||userLetter<rangeStartA){
                          errorMsg.setText("Your guess was out of range!");
                                 return;}
        
        else if(userLetter>randomAlpha)   {
                      chances--;// if the user guess was more than 3 letters from above the random number
                          errorMsg.setText("Your guess was too high!\n Chances left: "+chances+"\n");
                                 return;}
        
        else if(userLetter<randomAlpha){
                       chances--;
                          errorMsg.setText("Your guess was too low! \nChances left: "+chances+"\n");                // if the user guess was more than 3 letters from down the random number
                                 return;}
  
    }else {
    
    userInt=Integer.parseInt(guessingField.getText());
    
            if(chances==1){
               JOptionPane.showMessageDialog(this, "You have lost the game!"
                       + "\n The random number was: [ "+randomNumber+" ]");
              player.setPlayerScoreNumber(0);
                       GameDashboard back=new GameDashboard();
               dispose();
               back.setVisible(true);}
           
            else if(randomNumber==userInt){
                chances--;
                JOptionPane.showMessageDialog(this, "You Won! with "+chances+" chances left\n ");
            player.setPlayerScoreNumber(numberMode.difficultyType.calculateScore(chances+1));
            GameDashboard back=new GameDashboard();
               dispose();
               back.setVisible(true);
            }
          
            else if(userInt>rangeEndN ||userInt<rangeStartN){
                     errorMsg.setText("Your guess was out of range!");
                     return;}
            
            else if(userInt>randomNumber)        {  
                     chances--;
                     errorMsg.setText("Your guess was too high! \nChances left: "+chances+"\n");
                     return;  }
            
            else if(userInt<randomNumber){
                     chances--;
                     errorMsg.setText("Your guess was too low! \nChances left: "+chances+"\n");               
                     return;}
  
}
 }
 
    public StartPlayingPage() {
       
        
        
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

        jPanel1 = new javax.swing.JPanel();
        guessingField = new javax.swing.JTextField();
        guessBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();
        texArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start Guessing!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));
        jPanel1.setMaximumSize(new java.awt.Dimension(493, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(493, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(493, 560));

        guessingField.setBackground(new java.awt.Color(102, 102, 102));
        guessingField.setForeground(new java.awt.Color(255, 255, 255));
        guessingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessingFieldActionPerformed(evt);
            }
        });
        guessingField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidateInput(evt);
            }
        });

        guessBtn.setBackground(new java.awt.Color(0, 128, 0));
        guessBtn.setForeground(new java.awt.Color(255, 255, 255));
        guessBtn.setText("Guess!");
        guessBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guessBtn.setFocusable(false);
        guessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(158, 43, 37));
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        errorMsg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errorMsg.setForeground(new java.awt.Color(255, 51, 51));
        errorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        texArea.setEditable(false);
        texArea.setBackground(new java.awt.Color(43, 43, 43));
        texArea.setColumns(20);
        texArea.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        texArea.setForeground(new java.awt.Color(255, 255, 255));
        texArea.setRows(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(guessingField)
                    .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addComponent(texArea, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(texArea, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(guessingField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(resetBtn)
                .addGap(48, 48, 48))
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

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        GameDashboard returning=new GameDashboard();
        dispose();
        returning.setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void ValidateInput(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidateInput
        // TODO add your handling code here:
        char userInput=evt.getKeyChar();
        String inputContent=guessingField.getText().trim();
        
        
//if statement here to check if the mode is number or alphabet
if(inputMode){
               // if the user inputMode has a number
                 if (Character.isDigit(userInput)) {
                                evt.consume();
                                 errorMsg.setText("Please enter a valid letter.");
                                 guessBtn.setEnabled(false); return;
                  }
                 
               // if the user inputMode more than one char
                else  if (inputContent.length() >= 1) {
                               evt.consume();
                               errorMsg.setText("Please enter only one letter.");
                               guessBtn.setEnabled(false); return;
                } 
                
                
                else guessBtn.setEnabled(true);
}
else {
                    // if the user inputMode has a letter
                 if (Character.isLetter(userInput)) {
                                evt.consume();
                                 errorMsg.setText("Please enter a valid number.");
                 guessBtn.setEnabled(false); return;}
                 
                 else   guessBtn.setEnabled(true);
}
 
               

                    
                                
 
    }//GEN-LAST:event_ValidateInput
                      
    private void guessingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessingFieldActionPerformed
      
     
 

// method ends      
    }//GEN-LAST:event_guessingFieldActionPerformed

    private void guessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessBtnActionPerformed
    
   if (guessingField.getText().isBlank()){
       errorMsg.setText("Please enter a value!");
   return;}
    
  checkGuess();
  
  
  
  
  
  
  
  
  
  
  
  
  
    }//GEN-LAST:event_guessBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StartPlayingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPlayingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPlayingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPlayingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPlayingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorMsg;
    private javax.swing.JButton guessBtn;
    private javax.swing.JTextField guessingField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextArea texArea;
    // End of variables declaration//GEN-END:variables
}
