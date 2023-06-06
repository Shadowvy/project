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
public class MediumLevel extends DifficultyType{
     Random random=new Random();
   
    
    
    @Override
    public char alpha() {
        char randomAlphabet = (char)(random.nextInt(26) + 'a');
        if(randomAlphabet>='a'&&randomAlphabet<='j'){                   // declaring range which if was the  random letter between 'a' and 'j' 
            super.rangeStartA='a';  
            super.rangeEndA='t';
  
  }else if(randomAlphabet>='q'&&randomAlphabet<='z'){           // declaring range which if was the  random letter between 'g' and 'z' 
           super.rangeStartA='g'; 
           super.rangeEndA='z';
           
  }else { 
            super.rangeStartA=(char)(randomAlphabet-9);
            super.rangeEndA=(char)(randomAlphabet+10);}
        chances=4;
        return randomAlphabet;
    }

    
    @Override
    public int number() {
        int randomNumber = random.nextInt(100) + 1; 
        if(randomNumber>=1&&randomNumber<=25){       // declaring range if the random number was between "1" to "25"
 rangeStartN=1;
 rangeEndN=50;}
 
 else if(randomNumber>=75&&randomNumber<=100){   // declaring range if the random number was between "75" to "100"
 rangeStartN=50;
 rangeEndN=100;
                                                }
     
 else   { 
rangeStartN=randomNumber-24;
 rangeEndN=randomNumber+25;
        }  
 // range will be  50 numbers
         chances=4;
    return randomNumber;
    }

    
    

    @Override
                public int calculateScore(int remainChances){
                        return remainChances;
                                    }

    
    @Override
                public String toString() {
                        return "MEDIUM!";
                                         }

    @Override
                public String getRangeStartA() {
                        return Character.toString(rangeStartA);}
    
    @Override
                public String getRangeEndA() {
                        return Character.toString(rangeEndA);
                                              }
 

    @Override
                public int getRangeStartN() {
                        return rangeStartN; }

    @Override
                public int getRangeEndN() {
                        return rangeEndN;  }

   
  
}
