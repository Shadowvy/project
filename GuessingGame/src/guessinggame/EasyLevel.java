package guessinggame;



import java.util.Random;

/**
 *
 * @author SHADOWVY
 */
public class EasyLevel extends DifficultyType{
Random random=new Random();

 

    
    
    
    @Override
    public char alpha() {
        
  char randomAlphabet = (char)(random.nextInt(26) + 'a');   //Generating a random letter between 'a' to 'z'
     // range will be 12 letters
  if(randomAlphabet>='a'&&randomAlphabet<='f'){                   // declaring range which if was the  random letter between 'a' and 'f'         
            rangeStartA='a';     
            rangeEndA='l';
  
  }else if(randomAlphabet>='u'&&randomAlphabet<='z'){            // declaring range which if was the random letter between 'u' and 'z' 
            rangeEndA='z';
            rangeStartA='o';
    
  }else { 
            rangeStartA=(char)(randomAlphabet-5);
            rangeEndA=(char)(randomAlphabet+6);}
  chances=6;
  return randomAlphabet;
    }
 
    @Override
    public int number() {
  int randomNumber = random.nextInt(100) + 1;  
  if(randomNumber>=1&&randomNumber<=7){              // declaring range if the random number was between "1" to "7"
 rangeStartN=1;
 rangeEndN=15;}
 
 else if(randomNumber>=93&&randomNumber<=100){         // declaring range if the random number was between "93" to "100"
 rangeStartN=86;
 rangeEndN=100;
                                                }
     
 else   { 
rangeStartN=randomNumber-7;
 rangeEndN=randomNumber+7;
        }  
    chances=6;
    return randomNumber;
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
    
 



    @Override
    public int calculateScore(int remainChances) {
        return (remainChances+1)*10;
    }
     @Override
    public String toString() {
return "EASY!";
    }
    
}
