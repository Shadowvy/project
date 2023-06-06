package guessinggame;



public class NumberMode extends GameMode{

    public NumberMode(DifficultyType difficultyType) {
        super(difficultyType);
    }

 

    @Override
    public String toString() {
        return "Guessing Number!";
    }
    
       public void setDifficultyType(DifficultyType difficultyType) {
        this.difficultyType = difficultyType;
    }

   
    
}
