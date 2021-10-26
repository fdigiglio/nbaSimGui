import java.util.*;


public class Possession{

    //Instance Variables 
    private Team team;
    private boolean isAlive = true;

    public Possession(Team pTeam1){
        this.team = pTeam1;
        
    }

    public void playPossession(){
        Player[] teamPlayers = this.team.getTeamArray();


        while(isAlive){
            int playerChoice = (int)(Math.random() * 5);
            if(playerChoice == 0){
                Random rand = new Random();
                if(rand.nextInt(50) < teamPlayers[playerChoice].getTwoTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 40){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else if(rand.nextInt(50) < teamPlayers[playerChoice].getThreeTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 30){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                    
                } else {
                    break;
                }
                
            } else if(playerChoice == 1){
                Random rand = new Random();
                if(rand.nextInt(50) < teamPlayers[playerChoice].getTwoTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 40){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else if(rand.nextInt(50) < teamPlayers[playerChoice].getThreeTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 30){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else {
                    break;
                }
                
            } else if(playerChoice == 2){
                Random rand = new Random();
                if(rand.nextInt(50) < teamPlayers[playerChoice].getTwoTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 40){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else if(rand.nextInt(50) < teamPlayers[playerChoice].getThreeTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 30){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else {
                    break;
                }
                
            } else if(playerChoice == 3){
                Random rand = new Random();
                if(rand.nextInt(50) < teamPlayers[playerChoice].getTwoTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 40){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else if(rand.nextInt(50) < teamPlayers[playerChoice].getThreeTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 30){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else {
                    break;
                }
                
            } else if(playerChoice == 4){
                Random rand = new Random();
                if(rand.nextInt(50) < teamPlayers[playerChoice].getTwoTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 40){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else if(rand.nextInt(50) < teamPlayers[playerChoice].getThreeTendency()){
                    Random randShot = new Random();
                    if(randShot.nextInt(100) < 30){    
                        teamPlayers[playerChoice].setTwoPointer();
                        isAlive = false;
                    }
                } else {
                    break;
                }
                
            }
            else {
                break;
            }
        }

    }
}