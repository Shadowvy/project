/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggame;


/**
 *
 * @author SHADOWVY
 */
import java.sql.*;
import java.util.ArrayList;


public class Player {
    private static String playerName;
    private String username;
    private int scoreA,scoreN;
    private ArrayList<Player> scoreList=new ArrayList<>();;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public Player() {
    }
     public Player(String username,int scoreA,int scoreN){
     
     this.username=username;
     this.scoreA=scoreA;
     this.scoreN=scoreN;
     
     }
  

    public void setPlayerScoreAlpha(int playerScoreAlpha) {
        con=Database.dbconnect();
      int dbScore=comparingScore("scorealpha");
      if(playerScoreAlpha>=dbScore){
        String addScore="UPDATE playerdata SET scorealpha = ? WHERE username = ?";
        try {
            ps=con.prepareStatement(addScore);
            ps.setInt(1, playerScoreAlpha);
            ps.setString(2, playerName);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }        finally{
         if(con!=null){
             try{con.close();}
             catch(Exception e){e.printStackTrace();}}
        
        }
      }
        
        
    }
    public void setPlayerScoreNumber(int playerScoreNumber) {
        con=Database.dbconnect();
      int dbScore=comparingScore("scorenumber");
      if(playerScoreNumber>=dbScore){
        String addScore="UPDATE playerdata SET scorenumber = ? WHERE username = ?";
        try {
            ps=con.prepareStatement(addScore);
            ps.setInt(1, playerScoreNumber);
            ps.setString(2, playerName);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }        finally{
         if(con!=null){
             try{con.close();}
             catch(Exception e){e.printStackTrace();}}
        
        }}
      
      
    }
    
    
    private int comparingScore(String compareType){
    
        int score = 0;
    String dbScore = "SELECT "+ compareType +" FROM playerdata WHERE username = ?";
    try {
        ps = con.prepareStatement(dbScore);
        ps.setString(1, playerName);
        rs = ps.executeQuery();

        if (rs.next()) {
            score = rs.getInt(compareType);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return score;
    }
    
    
    
    public ArrayList<Player> getScoreList(){
    String query="SELECT username,scorealpha,scorenumber from playerdata";
    con=Database.dbconnect();
    
    try{
    ps=con.prepareStatement(query);
    rs=ps.executeQuery();
    while(rs.next()){
    String username=rs.getString("username");
    int scorealpha=rs.getInt("scorealpha");
     int scorenumber=rs.getInt("scorenumber");
    
    Player player=new Player(username, scorealpha, scorenumber);
    scoreList.add(player);
    
  
    }
        
        
    }catch(Exception e){
    e.printStackTrace();
    }        finally{
         if(con!=null){
             try{con.close();}
             catch(Exception e){e.printStackTrace();}}
        
        }
    
     return scoreList;
    }
    
    
    
    
    
    public static String getPlayerName() {
        return playerName;
    }

    
    
    public static void setPlayerName(String playerName) {
        Player.playerName = playerName;
    }

    public String getUsername() {
        return username;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreN() {
        return scoreN;
    }
    
    
    
    
}
