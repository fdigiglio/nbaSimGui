import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Game{
    
    //Instance Variables 
    private Team team1;
    private Team team2;
    private int p1t1;
    private int p2t1;
    private int p3t1;
    private int p4t1;
    private int p5t1;
    private int p1t2;
    private int p2t2;
    private int p3t2;
    private int p4t2;
    private int p5t2;
    private int p1t1Ast;
    private int p2t1Ast;
    private int p3t1Ast;
    private int p4t1Ast;
    private int p5t1Ast;
    private int p1t2Ast;
    private int p2t2Ast;
    private int p3t2Ast;
    private int p4t2Ast;
    private int p5t2Ast;
    int team1Score;
    int team2Score;
    String team1PlayerScoring = "";
    String team2PlayerScoring = "";
    String[] boxScore = new String[3];
    String[] playerStats = new String[10];
    ArrayList<String> pS = new ArrayList<String>();

    public Game(Team pTeam1, Team pTeam2){
        
        this.team1 = pTeam1;
        this.team2 = pTeam2;
        Player[] team1Players = this.team1.getTeamArray();
        p1t1 = team1Players[0].getPlayerScoring();
        p2t1 = team1Players[1].getPlayerScoring();
        p3t1 = team1Players[2].getPlayerScoring();
        p4t1 = team1Players[3].getPlayerScoring();
        p5t1 = team1Players[4].getPlayerScoring();
        p1t1Ast = team1Players[0].getPlayerAssisting();
        p2t1Ast = team1Players[1].getPlayerAssisting();
        p3t1Ast = team1Players[2].getPlayerAssisting();
        p4t1Ast = team1Players[3].getPlayerAssisting();
        p5t1Ast = team1Players[4].getPlayerAssisting();

        Player[] team2Players = this.team2.getTeamArray();
        p1t2 = team2Players[0].getPlayerScoring();
        p2t2 = team2Players[1].getPlayerScoring();
        p3t2 = team2Players[2].getPlayerScoring();
        p4t2 = team2Players[3].getPlayerScoring();
        p5t2 = team2Players[4].getPlayerScoring();
        p1t2Ast = team2Players[0].getPlayerAssisting();
        p2t2Ast = team2Players[1].getPlayerAssisting();
        p3t2Ast = team2Players[2].getPlayerAssisting();
        p4t2Ast = team2Players[3].getPlayerAssisting();
        p5t2Ast = team2Players[4].getPlayerAssisting();

        team1Score = p1t1 + p2t1 + p3t1 + p4t1 + p5t1;
        team2Score = p1t2 + p2t2 + p3t2 + p4t2 + p5t2;

        team1Players[0].setPlayerPts(p1t1);
        team1Players[1].setPlayerPts(p2t1);
        team1Players[2].setPlayerPts(p3t1);
        team1Players[3].setPlayerPts(p4t1);
        team1Players[4].setPlayerPts(p5t1);
        team1Players[0].setPlayerAst(p1t1Ast);
        team1Players[1].setPlayerAst(p2t1Ast);
        team1Players[2].setPlayerAst(p3t1Ast);
        team1Players[3].setPlayerPts(p4t1Ast);
        team1Players[4].setPlayerAst(p5t1Ast);

        team2Players[0].setPlayerPts(p1t2);
        team2Players[1].setPlayerPts(p2t2);
        team2Players[2].setPlayerPts(p3t2);
        team2Players[3].setPlayerPts(p4t2);
        team2Players[4].setPlayerPts(p5t2);
        team2Players[0].setPlayerAst(p1t2Ast);
        team2Players[1].setPlayerAst(p2t2Ast);
        team2Players[2].setPlayerAst(p3t2Ast);
        team2Players[3].setPlayerAst(p4t2Ast);
        team2Players[4].setPlayerAst(p5t2Ast);

        if(team1Score > team2Score){
            team1.win++;
            team2.loss++;
            team1.gamesPlayed++;
            team2.gamesPlayed++;
            for(int i = 0; i < team1Players.length; i++){
                team1Players[i].playerGamesPlayed++;
            }
            for(int i = 0; i < team2Players.length; i++){
                team2Players[i].playerGamesPlayed++;
            }

            System.out.println("\n" + team1.getTeamName() + " are tonights winners against the " + team2.getTeamName() + "! \n" + team1.getTeamAbrv() + " " + team1Score + " - " + team2Score + " " + team2.getTeamAbrv());
            System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
            System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
        
        } else if(team1Score < team2Score){
            team1.loss++;
            team2.win++;
            team1.gamesPlayed++;
            team2.gamesPlayed++;
            for(int i = 0; i < team1Players.length; i++){
                team1Players[i].playerGamesPlayed++;
            }
            for(int i = 0; i < team2Players.length; i++){
                team2Players[i].playerGamesPlayed++;
            }
            System.out.println("\n" + team2.getTeamName() + " are tonights winners against the " + team1.getTeamName() + "! \n" + team1.getTeamAbrv() + " " + team1Score + " - " + team2Score + " " + team2.getTeamAbrv());
            System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
            System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
        
        } else if(team1Score == team2Score){
            int team1OT1Score = team1.getOvertimeScoring() + team1Score;
            int team2OT1Score = team2.getOvertimeScoring() + team2Score;
            if(team1OT1Score > team2OT1Score){
                team1.win++;
                team2.loss++;
                team1.gamesPlayed++;
                team2.gamesPlayed++;
                for(int i = 0; i < team1Players.length; i++){
                    team1Players[i].playerGamesPlayed++;
                }
                for(int i = 0; i < team2Players.length; i++){
                    team2Players[i].playerGamesPlayed++;
                }
                System.out.println(team1.getTeamName() + " have won it in overtime!!!!\n" + team1.getTeamName() + "! \n" + team1.getTeamAbrv() + " " + team1Score + " - " + team2Score + " " + team2.getTeamAbrv());
                System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
                System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
        
            } else if(team1OT1Score < team2OT1Score){
                team2.win++;
                team1.loss++;
                team1.gamesPlayed++;
                team2.gamesPlayed++;
                for(int i = 0; i < team1Players.length; i++){
                    team1Players[i].playerGamesPlayed++;
                }
                for(int i = 0; i < team2Players.length; i++){
                    team2Players[i].playerGamesPlayed++;
                }
                System.out.println(team2.getTeamName() + " have won it in overtime!!!!");
                System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
                System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
        
            } else if(team1OT1Score == team2OT1Score){
                int team1OT2Score = team1.getOvertimeScoring();
                int team2OT2Score = team2.getOvertimeScoring();
                if(team1OT2Score > team2OT2Score){
                    team1.win++;
                    team2.loss++;
                    team1.gamesPlayed++;
                    team2.gamesPlayed++;
                    for(int i = 0; i < team1Players.length; i++){
                        team1Players[i].playerGamesPlayed++;
                    }
                    for(int i = 0; i < team2Players.length; i++){
                        team2Players[i].playerGamesPlayed++;
                    }
                    System.out.println(team1.getTeamName() + " have won it in overtime!!!!");
                    System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
                    System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
                    
                } else if(team1OT2Score < team2OT2Score){
                    team2.win++;
                    team1.loss++;
                    team1.gamesPlayed++;
                    team2.gamesPlayed++;
                    for(int i = 0; i < team1Players.length; i++){
                        team1Players[i].playerGamesPlayed++;
                    }
                    for(int i = 0; i < team2Players.length; i++){
                        team2Players[i].playerGamesPlayed++;
                    }
                    System.out.println(team2.getTeamName() + " have won it in overtime!!!!");
                    System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
                    System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
                 
                
                } else {
                    System.out.println("Game ends in a draw!\n" + team1.getTeamAbrv() + team1.getTeamScore() + " - " + team2.getTeamScore() + team2.getTeamAbrv());
                    System.out.println("\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1);
                    System.out.println("\n\n" + team2.getTeamName() + ": \n" + team2Players[0].getPlayerName() + ": " + p1t2 + "\n" + team2Players[1].getPlayerName() + ": " + p2t2 + "\n" + team2Players[2].getPlayerName() + ": " + p3t2 + "\n" + team2Players[3].getPlayerName() + ": " + p4t2 + "\n" + team2Players[4].getPlayerName() + ": " + p5t2);
                
                }
            } 

        } 
        
        

        playerStats[0] = team1Players[0].getPlayerName() + ": " + this.p1t1 + " PTS";
        playerStats[1] = team1Players[1].getPlayerName() + ": " + this.p2t1 + " PTS";
        playerStats[2] = team1Players[2].getPlayerName() + ": " + this.p3t1 + " PTS";
        playerStats[3] = team1Players[3].getPlayerName() + ": " + this.p4t1 + " PTS";
        playerStats[4] = team1Players[4].getPlayerName() + ": " + this.p5t1 + " PTS";

        playerStats[5] = team2Players[0].getPlayerName() + ": " + this.p1t2 + " PTS";
        playerStats[6] = team2Players[1].getPlayerName() + ": " + this.p2t2 + " PTS";
        playerStats[7] = team2Players[2].getPlayerName() + ": " + this.p3t2 + " PTS";
        playerStats[8] = team2Players[3].getPlayerName() + ": " + this.p4t2 + " PTS";
        playerStats[9] = team2Players[4].getPlayerName() + ": " + this.p5t2 + " PTS";

        boxScore[0] = team1.getTeamAbrv();
        boxScore[1] = team1Score + " - " + team2Score;
        boxScore[2] = team2.getTeamAbrv();

        // team1PlayerScoring += "\n" + team1.getTeamName() + ": \n" + team1Players[0].getPlayerName() + ": " + p1t1 + "\n" + team1Players[1].getPlayerName() + ": " + p2t1 + "\n" + team1Players[2].getPlayerName() + ": " + p3t1 + "\n" + team1Players[3].getPlayerName() + ": " + p4t1 + "\n" + team1Players[4].getPlayerName() + ": " + p5t1
        
    }

    //Methods 


    public String getTeamAbrv(){
        return team1.getTeamAbrv();
    }

    public String getTeamAbrv2(){
        return team2.getTeamAbrv();
    }

    public String getTeamScore(){
       return boxScore[1];
    }

    public String getPlayerPts(int x){
        return this.playerStats[x];
    }

    public String getPlayerName(int x){
        return this.playerStats[x];
    }
    

    public ArrayList<String> getPlayerStats(){
        for(int i = 0; i < playerStats.length; i++){
            pS.add(playerStats[i]);
        }
        return pS;
    }

    public String getTeamName(Team team){
        return "";
    }

    public String getPlayer1Scoring(){
        return team1PlayerScoring;
    }

    public String getPlayer2Scoring(){
        return team2PlayerScoring;
    }

    
        
    
}

