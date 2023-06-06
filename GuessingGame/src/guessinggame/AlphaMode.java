package guessinggame;


public class AlphaMode extends GameMode{
 

public AlphaMode(DifficultyType difficultyType){
super(difficultyType);
}
  

    @Override
    public String toString() {
        return "Guessing Alpha!";
        
    }
      public void setDifficultyType(DifficultyType difficultyType) {
        this.difficultyType = difficultyType;
    }

  
}
