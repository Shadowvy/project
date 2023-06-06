package guessinggame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author SHADOWVY
 */
public  abstract class DifficultyType {

    int chances;
    char rangeStartA;
    char rangeEndA;
    int rangeStartN;
    int rangeEndN;
  
  public abstract char alpha();
  public abstract int number();
  public abstract int calculateScore(int remainChances);

    @Override
    public abstract String toString();
     public abstract String getRangeStartA();
     

    public abstract String getRangeEndA();

    public abstract int getRangeStartN();

    public abstract int getRangeEndN();
  

       
    
     
   
    
    
}
