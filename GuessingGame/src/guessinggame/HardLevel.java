package guessinggame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.*;

/**
 *
 * @author SHADOWVY
 */
public class HardLevel extends DifficultyType{
      Random random=new Random();
  
    
            
      
      
    
      @Override
    public char alpha(){
        //Generating a random letter between 'a' to 'z'
     char randomAlphabet = (char)(random.nextInt(26) + 'a'); 
     rangeStartA='a';
     rangeEndA='z';
  chances=2;
  
  return randomAlphabet;
}
    
    
      @Override
   public  int number(){
 
        int randomNumber = random.nextInt(100) + 1; 
 chances=2;
 rangeStartA=1; rangeEndN=100;
             return randomNumber;
                                }

    @Override
    public int calculateScore(int remainChances) {
  
    return (remainChances+1)*100;
    }
     @Override
    public String toString() {
return "HARD!";
    }

    public int getChances() {
        return chances;
    }

   
    public String getRangeStartA() {
        return Character.toString(rangeStartA);
    }

    public String getRangeEndA() {
        return Character.toString(rangeEndA);
    }


    public int getRangeStartN() {
        return rangeStartN;
    }

    public int getRangeEndN() {
        return rangeEndN;
    }

 
    
}