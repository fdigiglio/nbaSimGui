public class Player {

    //instance variables
    private String playerName;
    private String position;
    private int playerScoreRating;
    private int playerDefensiveRating;
    private int playerPassRating;
    private int twoPointerTendency;
    private int threePointerTendency;
    //private int totalShotTendency = this.twoPointerTendency + this.threePointerTendency;;
    private double playerTotalPts = 0.00;
    private double playerTotalAst = 0.00;
    public double playerGamesPlayed = 0.00;
    private int gameScoring = 0;
    private int totalSeasonScoring = 0;
    private String playerFace;
    
    public Player(){
        this.playerName = "Place Holder";
    }

    public Player(String fn, int pScoreRating, int pDefRating, int pPassRating, int pTwoPointerTendency, int pThreePointerTendency, String pPosition, String pPlayerFace){
        this.playerName = fn;
        this.playerScoreRating = pScoreRating;
        this.playerDefensiveRating = pDefRating;
        this.playerPassRating = pPassRating;
        this.twoPointerTendency = pTwoPointerTendency;
        this.threePointerTendency = pThreePointerTendency;
        this.position = pPosition;
        this.playerFace = pPlayerFace;
    }

    public Player(String fn, int pScoreRating, int pDefRating, int pPassRating, int pTwoPointerTendency, int pThreePointerTendency, String pPosition){
        this.playerName = fn;
        this.playerScoreRating = pScoreRating;
        this.playerDefensiveRating = pDefRating;
        this.playerPassRating = pPassRating;
        this.twoPointerTendency = pTwoPointerTendency;
        this.threePointerTendency = pThreePointerTendency;
        this.position = pPosition;
    }

    //Getter Methods
    public String getPlayerName(){
        return this.playerName;
    }

    public int getOffensiveRating(){
        return this.playerScoreRating;
    }

    public int getDefensiveRating(){
        return this.playerDefensiveRating;
    }

    public int getPassingRating(){
        return this.playerPassRating;
    }

    public String getPosition(){
        return this.position;
    }

    public int getTwoTendency(){
        return this.twoPointerTendency;
    }

    public int getThreeTendency(){
        return this.threePointerTendency;
    }

    public String getPlayerFace(){
        return playerFace;
    }

    //get random number from 1 - 20 if it lands on a specific number add 25 to what they dropped (Potentially scale this so 95 and up will have random number from 1-3 if it lands they drop over 30)
    public int getPlayerScoring(){
        int maxScoring;
        int minScoring;
        if(getOffensiveRating() >= 98){

            int rand30 = (int)(Math.random() * (3 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (10 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (50 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (175 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (1000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (3075 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (25000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 30;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 20;
              maxScoring = 29;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        }
        else if(getOffensiveRating() >= 95){

            int rand30 = (int)(Math.random() * (5 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (35 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (100 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (175 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (1000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (3075 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (25000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 28;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 20;
              maxScoring = 27;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 90){

            int rand30 = (int)(Math.random() * (25 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (50 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (125 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (250 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (1250 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (4500 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (75000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (100000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 26;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 20;
              maxScoring = 25;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 85){

            int rand30 = (int)(Math.random() * (35 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (75 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (350 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (800 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (5000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (10000 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (150000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (300000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 21;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 15;
              maxScoring = 20;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 80){

            int rand30 = (int)(Math.random() * (100 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (175 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (500 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (1000 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (7500 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (12500 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (100000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (500000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 25;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 10;
              maxScoring = 25;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 75){

            int rand30 = (int)(Math.random() * (150 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (500 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (1000 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (125000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (200000 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (350000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (750000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 20;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 10;
              maxScoring = 20;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 70){

            int rand30 = (int)(Math.random() * (1000 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (2000 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (10000 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (100000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (300000 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (500000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (1000000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 16;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 5;
              maxScoring = 15;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else if(getOffensiveRating() >= 65){

            int rand30 = (int)(Math.random() * (25000 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (75000 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (100000 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (150000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (500000 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (750000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (1500000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 11;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 0;
              maxScoring = 10;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        } else {

            int rand30 = (int)(Math.random() * (100000 - 1 + 1)) + 1;
            int rand40 = (int)(Math.random() * (500000 - 1 + 1)) + 1;
            int rand50 = (int)(Math.random() * (750000 - 1 + 1)) + 1;
            int rand60 = (int)(Math.random() * (1000000 - 1 + 1)) + 1;
            int rand70 = (int)(Math.random() * (1250000 - 1 + 1)) + 1; 
            int rand80 = (int)(Math.random() * (1500000 - 1 + 1)) + 1;
            int rand90 = (int)(Math.random() * (1750000 - 1 + 1)) + 1; 
            int rand100 = (int)(Math.random() * (2000000 - 1 + 1)) + 1;
                          
            if(rand100 == 1){
              minScoring = 80;
              maxScoring = 110; 
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand90 == 1){
                minScoring = 70;
                maxScoring = 99;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand80 == 1){
                minScoring = 60;
                maxScoring = 89;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);  
            }else if(rand70 == 1){
                minScoring = 50;
                maxScoring = 79; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand60 == 1){
                minScoring = 40;
                maxScoring = 69; 
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);    
            }else if(rand50 == 1){
                minScoring = 30;
                maxScoring = 59;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand40 == 1){
                minScoring = 30;
                maxScoring = 49;  
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring); 
            }else if(rand30 == 1){
                minScoring = 11;
                maxScoring = 39;
                return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            } else {
              minScoring = 0;
              maxScoring = 10;
              return (int)(Math.random() * (maxScoring - minScoring + 1) + minScoring);
            }
            
        }
    }

    

    public void setTotalPoints(int pPoints){
        this.totalSeasonScoring += pPoints;
    }

    public void setTwoPointer(){
        this.gameScoring += 2;
        this.totalSeasonScoring += 3;

    }

    public void setThreePointer(){
        this.gameScoring += 3;
        this.totalSeasonScoring += 3;
    }

    //========================================================PLAYER ASSISTS====================

    public int getPlayerAssisting(){
        int maxAssists;
        int minAssists;
        if(getPassingRating() >= 98){

            int rand15 = (int)(Math.random() * (125 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (950 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (5000 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
              minAssists = 21;
              maxAssists = 25; 
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 11;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }
            else {
              minAssists = 8;
              maxAssists = 10;
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() >= 95){

            int rand15 = (int)(Math.random() * (150 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (1250 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (7500 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
                minAssists = 21;
                maxAssists = 25; 
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 11;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }
            else {
                minAssists = 6;
                maxAssists = 10;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() >= 90){

            int rand15 = (int)(Math.random() * (175 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (1500 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (10000 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
                minAssists = 21;
                maxAssists = 25; 
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 9;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }else {
                minAssists = 4;
                maxAssists = 8;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() >= 85){

            int rand15 = (int)(Math.random() * (225 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (2250 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (12500 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
              minAssists = 21;
              maxAssists = 25; 
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 8;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            } else {
                minAssists = 3;
                maxAssists = 7;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() >= 80){

            int rand15 = (int)(Math.random() * (250 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (2500 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (15000 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
              minAssists = 21;
              maxAssists = 25; 
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 7;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }else {
              minAssists = 2;
              maxAssists = 6;
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() >= 75){

            int rand15 = (int)(Math.random() * (500 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (5000 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (25000 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
              minAssists = 21;
              maxAssists = 25; 
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 4;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }else {
              minAssists = 2;
              maxAssists = 3;
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else if(getPassingRating() < 75 && getPassingRating() >= 60) {

            int rand15 = (int)(Math.random() * (1500 - 1 + 1)) + 1;
            int rand20 = (int)(Math.random() * (15000 - 1 + 1)) + 1; 
            int rand25 = (int)(Math.random() * (50000 - 1 + 1)) + 1;
                          
            if(rand25 == 1){
              minAssists = 21;
              maxAssists = 25; 
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand20 == 1){
                minAssists = 16;
                maxAssists = 20;
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);    
            }else if(rand15 == 1){
                minAssists = 4;
                maxAssists = 15;  
                return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);  
            }else {
              minAssists = 0;
              maxAssists = 3;
              return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
            }
            
        } else {
            minAssists = 0;
            maxAssists = 3;
            return (int)(Math.random() * (maxAssists - minAssists + 1) + minAssists);
        }
    }


   
    

    //Setter Methods
    
    public void setDefensiveRating(int newPlayerDefensiveRating){
        this.playerDefensiveRating = newPlayerDefensiveRating;
    }

    public void setOffensiveRating(int newPlayerOffensiveRating){
        this.playerScoreRating = newPlayerOffensiveRating;
    }

    public void setPlayerName(String newPlayerName){
        this.playerName = newPlayerName;
    }

    public void setPlayerPts(int pPoints){
        this.playerTotalPts += pPoints;
    }

    public void setPlayerAst(int pAssists){
        this.playerTotalAst += pAssists;
    }

    public void resetPlayerPts(){
        this.playerTotalPts = 0;
    }

    public void resetPlayerGamePts(){
        this.gameScoring = 0;
    }

    public void resetPlayerAst(){
        this.playerTotalAst = 0;
    }

    public void resetGame(){
        this.playerGamesPlayed = 0;
    }

    public void setPlayedGames(double pGames){
        this.playerGamesPlayed = pGames;
    }

    public double getTotalPoints(){
        return this.playerTotalPts;
    }

    public double getSeasonPoints(){
        return this.totalSeasonScoring;
    }

    public double getTotalAssists(){
        return this.playerTotalAst;
    }

    public double getPointAvg(){
        double a = (double)(this.getTotalPoints() / 82);
        double roundOff = Math.round(a * 100.0) / 100.0;
        return roundOff;
    }

    public double getAssistAvg(){
        double a = (double)(this.getTotalAssists() / playerGamesPlayed);
        double roundOff = Math.round(a * 100.0) / 100.0;
        return roundOff;
    }

}