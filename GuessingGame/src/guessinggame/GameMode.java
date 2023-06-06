/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggame;

/**
 *
 * @author SHADOWVY
 */
public abstract class GameMode {
    protected DifficultyType difficultyType;
    
    public GameMode(DifficultyType difficultyType){
    this.difficultyType=difficultyType;
    }
 
}
