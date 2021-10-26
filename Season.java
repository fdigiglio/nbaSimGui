import java.util.ArrayList;

import javax.swing.JLabel;

public class Season {
    
    //Instance Var
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    private Team team5;
    private Team team6;
    private Team team7;
    private Team team8;
    private Team team9;
    private Team team10;
    private Team team11;
    private Team team12;
    private Team team13;
    private Team team14;
    private Team team15;
    private Team team16;
    private Team team17;
    private Team team18;
    private Team team19;
    private Team team20;
    private Team team21;
    private Team team22;
    private Team team23;
    private Team team24;
    private Team team25;
    private Team team26;
    private Team team27;
    private Team team28;
    private Team team29;
    private Team team30;
    private Team[] seasonTeam = new Team[30];
    private ArrayList<Team> easternConf = new ArrayList<Team>();
    private ArrayList<Team> easternConfPlayoffs = new ArrayList<Team>();
    private ArrayList<Team> westernConfPlayoffs = new ArrayList<Team>();
    private ArrayList<Team> westernConf = new ArrayList<Team>();
    private ArrayList<Player> playersLeague = new ArrayList<Player>();
    private ArrayList<Game> boxScore = new ArrayList<Game>();
    private ArrayList<ArrayList<String>> playerStats = new ArrayList<ArrayList<String>>();
    

    

    //Constructor

    public Season(Team[] pNbaTeams){
        for(int i = 0; i < pNbaTeams.length; i++){
            this.seasonTeam[i] = pNbaTeams[i];
            
        }

        for(int i = 0; i < seasonTeam.length; i++){
            seasonTeam[i].addPlayer(playersLeague);
        }
    }

    public Season(Team pTeam1, Team pTeam2, Team pTeam3, Team pTeam4, Team pTeam5, Team pTeam6, Team pTeam7, Team pTeam8, Team pTeam9, Team pTeam10, Team pTeam11, Team pTeam12, Team pTeam13, Team pTeam14, Team pTeam15, Team pTeam16, Team pTeam17, Team pTeam18, Team pTeam19, Team pTeam20, Team pTeam21, Team pTeam22, Team pTeam23, Team pTeam24, Team pTeam25, Team pTeam26, Team pTeam27, Team pTeam28, Team pTeam29, Team pTeam30){
        // teams = new ArrayList<Team>();
        
        this.team1 = pTeam1;
        this.team2 = pTeam2;
        this.team3 = pTeam3;
        this.team4 = pTeam4;
        this.team5 = pTeam5;
        this.team6 = pTeam6;
        this.team7 = pTeam7;
        this.team8 = pTeam8;
        this.team9 = pTeam9;
        this.team10 = pTeam10;
        this.team11 = pTeam11;
        this.team12 = pTeam12;
        this.team13 = pTeam13;
        this.team14 = pTeam14;
        this.team15 = pTeam15;
        this.team16 = pTeam16;
        this.team17 = pTeam17;
        this.team18 = pTeam18;
        this.team19 = pTeam19;
        this.team20 = pTeam20;
        this.team21 = pTeam21;
        this.team22 = pTeam22;
        this.team23 = pTeam23;
        this.team24 = pTeam24;
        this.team25 = pTeam25;
        this.team26 = pTeam26;
        this.team27 = pTeam27;
        this.team28 = pTeam28;
        this.team29 = pTeam29;
        this.team30 = pTeam30;

        seasonTeam[0] = this.team1;
        seasonTeam[1] = this.team2;
        seasonTeam[2] = this.team30;
        seasonTeam[3] = this.team3;
        seasonTeam[4] = this.team4;
        seasonTeam[5] = this.team5;
        seasonTeam[6] = this.team6;
        seasonTeam[7] = this.team7;
        seasonTeam[8] = this.team8;
        seasonTeam[9] = this.team9;
        seasonTeam[10] = this.team10;
        seasonTeam[11] = this.team11;
        seasonTeam[12] = this.team12;
        seasonTeam[13] = this.team13;
        seasonTeam[14] = this.team14;
        seasonTeam[15] = this.team15;
        seasonTeam[16] = this.team16;
        seasonTeam[17] = this.team17;
        seasonTeam[18] = this.team18;
        seasonTeam[19] = this.team19;
        seasonTeam[20] = this.team20;
        seasonTeam[21] = this.team21;
        seasonTeam[22] = this.team22;
        seasonTeam[23] = this.team23;
        seasonTeam[24] = this.team24;
        seasonTeam[25] = this.team25;
        seasonTeam[26] = this.team26;
        seasonTeam[27] = this.team27;
        seasonTeam[28] = this.team28;
        seasonTeam[29] = this.team29;

    }



    public ArrayList<Game> getSeasonGamesNew(ArrayList<ArrayList<String>> arrayList, ArrayList<String> seasonStats){
        boxScore.clear();
        
        for(int i = 0; i < seasonTeam.length; i++){
            seasonTeam[i].setTeamRecord();
        }

        
        //One game against everyone (Total Games left 53)
        //TOTAL GAMES FOR 1 TEAM = 29
        for(int i = 0; i < seasonTeam.length; i++){
            for(int j = i+1; j < seasonTeam.length; j++){
                if(i == j){
                    break;
                }
                // boxScore.add(new Game(seasonTeam[i], seasonTeam[j]).playGame());
                Game game = new Game(seasonTeam[i], seasonTeam[j]);
                boxScore.add(game);
                arrayList.add(game.getPlayerStats());
                

            }
        }

        

        //One game inside of EAST conference (Total Games left 25)
        //TOTAL GAMES FOR 1 TEAM = 28
        int eastConference = 0;
        while(eastConference < 2){
            for(int i = 0; i < seasonTeam.length/2; i++){
                for(int j = i+1; j < seasonTeam.length/2; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());
                }
            }
            eastConference++;
        }
        

        // // One game inside of WEST conference (Total Games left 25)
        // //TOTAL GAMES FOR 1 TEAM = 28
        int westConference = 0;
        while(westConference < 2){
            for(int i = 15; i < seasonTeam.length; i++){
                for(int j = i+1; j < seasonTeam.length; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }
            westConference++;
        }

        // //Fours Games in Division (Total Games left 9)
        // //TOTAL GAMES FOR 1 TEAM = 16
        int division = 0;
        while(division < 4){
            for(int i = 0; i < seasonTeam.length / 6; i++){
                for(int j = i+1; j < seasonTeam.length / 6; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }

            for(int i = 5; i < seasonTeam.length / 3; i++){
                for(int j = i+1; j < seasonTeam.length / 3; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }

            for(int i = 10; i < seasonTeam.length / 2; i++){
                for(int j = i+1; j < seasonTeam.length / 2; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }

            for(int i = 15; i < seasonTeam.length / 1.5; i++){
                for(int j = i+1; j < seasonTeam.length / 1.5; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }

            for(int i = 20; i < seasonTeam.length / 1.2; i++){
                for(int j = i+1; j < seasonTeam.length / 1.2; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }
            
            for(int i = 25; i < seasonTeam.length; i++){
                for(int j = i+1; j < seasonTeam.length; j++){
                    if(i == j){
                        break;
                    }
                    Game game = new Game(seasonTeam[i], seasonTeam[j]);
                    boxScore.add(game);
                    arrayList.add(game.getPlayerStats());                }
            }
            division++;
        }
        

        // //REMAINING 9 GAMES
        for(int i = 0; i < seasonTeam.length / 3; i++){
            for(int j = i+1; j < seasonTeam.length / 3; j++){
                if(i == j){
                    break;
                }
                Game game = new Game(seasonTeam[i], seasonTeam[j]);
                boxScore.add(game);
                arrayList.add(game.getPlayerStats());            }
        }

        for(int i = 10; i < seasonTeam.length / 1.5; i++){
            for(int j = i+1; j < seasonTeam.length / 1.5; j++){
                if(i == j){
                    break;
                }
                Game game = new Game(seasonTeam[i], seasonTeam[j]);
                boxScore.add(game);
                arrayList.add(game.getPlayerStats());            }
        }

        for(int i = 20; i < seasonTeam.length; i++){
            for(int j = i+1; j < seasonTeam.length; j++){
                if(i == j){
                    break;
                }
                Game game = new Game(seasonTeam[i], seasonTeam[j]);
                boxScore.add(game);
                arrayList.add(game.getPlayerStats());            }
        }


        Sort sortArr = new Sort();
        sortArr.sort(seasonTeam);
        sortArr.sortAL(easternConf);
        sortArr.sortAL(westernConf);
        sortArr.sortALPlayers(playersLeague);

        String standings = "";
        System.out.println("\t\tW\tL\tD ====> League Sorted\n");
        for(int i = 0; i < seasonTeam.length; i++){
            standings += seasonTeam[i].getTeamAbrv() + " Record:     " + seasonTeam[i].getTeamWin() + "\t" + seasonTeam[i].getTeamLoss() + "\t" + seasonTeam[i].getTeamDraw() + "\n";
        }


        String seasonLeadingScorers = "";
        for(int i = 0; i < playersLeague.size(); i++){
            seasonStats.add(playersLeague.get(i).getPlayerName() +": "+ playersLeague.get(i).getPointAvg() + " PTS");
        }
        System.out.println(seasonLeadingScorers);
        for(int i = 0; i < playersLeague.size(); i++){
            playersLeague.get(i).resetPlayerGamePts();
            playersLeague.get(i).resetPlayerPts();
            seasonLeadingScorers = "";
        }

        System.out.println(standings);
        return boxScore;
    }

    //Getter
    public void getSeasonGames(){

        

        for(int i = 0; i < seasonTeam.length; i++){
            seasonTeam[i].setTeamRecord();
        }
        //PLAYS 30 GAMES 2 PER TEAM IN EACH CONFERENCE
        // int conferenceSim = 0;
        // while(conferenceSim < 2){
        //     for(int i = 0; i < seasonTeam.length / 2; i++){
        //         for(int j = 15; j < seasonTeam.length; j++){
        //             if(i == j){
        //                 break;
        //             }
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();

        //         }
        //     }
        //     conferenceSim++;
        // }    
        
        
        

        // //PLAYS 16 GAMES IN DIVISION
        // int inDivision = 0;
        // while(inDivision < 4){    
        //     for(int i = 0; i < 5; i++){
        //         for(int j = i + 1; j < 5; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 5; i < 10; i++){
        //         for(int j = i + 1; j < 10; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 10; i < 15; i++){
        //         for(int j = i + 1; j < 15; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 15; i < 20; i++){
        //         for(int j = i + 1; j < 20; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 20; i < 25; i++){
        //         for(int j = i + 1; j < 25; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 25; i < seasonTeam.length; i++){
        //         for(int j = i + 1; j < seasonTeam.length; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     inDivision++;
        // }


        // //PLAYS 24 GAMES OUT OF DIVISION
        // int outOfDivision = 0;
        // while(outOfDivision < 4){
        //     for(int i = 0; i < 5; i++){
        //         for(int j = 5; j < 11; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

    

        //     for(int i = 11; i < 15; i++){
        //         for(int j = 15; j < 21; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 21; i < 26; i++){
        //         for(int j = 26; j < seasonTeam.length; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }
        //     outOfDivision++;
        // }

        // //PLAYS SIX GAMES REMAING
        // for(int i = 5; i < 11; i++){
        //     for(int j = 15; j < 19; j++){
        //         new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //     }
        // }

        // for(int i = 15; i < 19; i++){
        //     for(int j = 26; j < 28; j++){
        //         new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //     }
        // }

        // for(int i = 19; i < 23; i++){
        //     for(int j = 23; j < 26; j++){
        //         new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //     }
        // }

        // for(int i = 19; i < 23; i++){
        //     for(int j = 23; j < 26; j++){
        //         new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //     }
        // }

        // //PLAYS TWO REMAINING GAMES
        // for(int i = 0; i < 2; i++){
        //     new Game(seasonTeam[21], seasonTeam[22]).playGame();
        // }

        // for(int i = 0; i < 2; i++){
        //     new Game(seasonTeam[20], seasonTeam[29]).playGame();
        // }

        // for(int i = 0; i < 2; i++){
        //     new Game(seasonTeam[19], seasonTeam[28]).playGame();
        // }

        // for(int i = 0; i < 2; i++){
        //     new Game(seasonTeam[28], seasonTeam[29]).playGame();
        // }

        
        
        // //PLAYS LAST 4 GAMES OF SEASON
        // int confTeam = 0;
        // while(confTeam < 3){
        //     for(int i = 0; i < 5; i++){
        //         for(int j = i + 1; j < 5; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 5; i < 10; i++){
        //         for(int j = i + 1; j < 10; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 10; i < 15; i++){
        //         for(int j = i + 1; j < 15; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 15; i < 20; i++){
        //         for(int j = i + 1; j < 20; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 20; i < 25; i++){
        //         for(int j = i + 1; j < 25; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }

        //     for(int i = 25; i < seasonTeam.length; i++){
        //         for(int j = i + 1; j < seasonTeam.length; j++){
        //             new Game(seasonTeam[i], seasonTeam[j]).playGame();
        //         }
        //     }
        //     confTeam++;
        // }

        // //SORTS EACH STANDINGS
        // Sort sortArr = new Sort();
        // sortArr.sort(seasonTeam);
        // sortArr.sortAL(easternConf);
        // sortArr.sortAL(westernConf);
        // sortArr.sortALPlayers(playersLeague);

        // String standings = "";
        // System.out.println("\t\tW\tL\tD ====> East Sorted\n");
        // for(int i = 0; i < seasonTeam.length; i++){
        //     standings += seasonTeam[i].getTeamAbrv() + " Record:     " + seasonTeam[i].getTeamWin() + "\t" + seasonTeam[i].getTeamLoss() + "\t" + seasonTeam[i].getTeamDraw() + "\n";
        // }
        // System.out.println(standings);

       

        // String seasonLeadingScorers = "";
        // for(int i = 0; i < playersLeague.size(); i++){
        //     seasonLeadingScorers += (i+1) + ") " + playersLeague.get(i).getPlayerName() +": "+ playersLeague.get(i).getPointAvg() + "\n";
        // }
        // System.out.println(seasonLeadingScorers);
        // for(int i = 0; i < playersLeague.size(); i++){
        //     playersLeague.get(i).resetPlayerGamePts();
        //     playersLeague.get(i).resetPlayerPts();
        //     seasonLeadingScorers = "";
        // }
    }



    public ArrayList<Game> getPlayoffGames(ArrayList<ArrayList<String>> arrList, ArrayList<Team> firstRoundStats, ArrayList<Team> semiFinals, ArrayList<Team> conferenceFinals, ArrayList<Team> finals, ArrayList<String> firstRoundSeries, ArrayList<String> semiFinalsSeries, ArrayList<String> conferenceFinalSeries, ArrayList<String> finalsSeries){

        boxScore.clear();
        


        //SORTS STANDINGS AGAIN FOR PLAYOFFS
        Sort sortArr = new Sort();
        sortArr.sort(seasonTeam);
        sortArr.sortAL(easternConf);
        sortArr.sortAL(westernConf);
        sortArr.sortALPlayers(playersLeague);
        
        
        //SAVES SEASON STATS
        String seasonLeadingScorers = "";
        for(int i = 0; i < playersLeague.size(); i++){
            seasonLeadingScorers += (i+1) + ") " + playersLeague.get(i).getPlayerName() +": "+ playersLeague.get(i).getPointAvg() + "\n";
        }
        sortArr.sortALPlayersAst(playersLeague);
        String seasonLeadingAst = "";
        for(int i = 0; i < playersLeague.size(); i++){
            seasonLeadingAst += (i+1) + ") " + playersLeague.get(i).getPlayerName() +": "+ playersLeague.get(i).getAssistAvg() + "\n";
        }
        playersLeague.clear();

        for(int i = 0; i < seasonTeam.length; i++){
            if(seasonTeam[i].getConference().equals("E")){
                easternConf.add(seasonTeam[i]);
            }
            else if(seasonTeam[i].getConference().equals("W")){
                westernConf.add(seasonTeam[i]);
            }
        }

        int eastSeed = 1;
        for(int i = 0; i < easternConf.size(); i++){
            easternConf.get(i).setSeed(eastSeed);
            eastSeed++;
        }
            
        int westSeed = 1;
        for(int i = 0; i < westernConf.size(); i++){
            westernConf.get(i).setSeed(westSeed);
            westSeed++;
        }

            

        //Adds team eligible to playoff arraylist
        for(int i = 0; i < 8; i++){
            easternConfPlayoffs.add(easternConf.get(i));
        }

        for(int i = 0; i < 8; i++){
            westernConfPlayoffs.add(westernConf.get(i));
        }

        for(int i = 0; i < 8; i++){
            easternConfPlayoffs.get(i).addPlayer(playersLeague);
            westernConfPlayoffs.get(i).addPlayer(playersLeague);
        }

        //RESETS TOTAL POINTS AND GAMES PLAYED
        for(int i = 0; i < playersLeague.size(); i++){
            playersLeague.get(i).resetGame();
            playersLeague.get(i).resetPlayerPts();
        }

            //===========================================================First Round================================================================
        


        

        String eastStandings = "";
        System.out.println("\t\tW\tL\tD ====> East Sorted\n");
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            eastStandings += easternConfPlayoffs.get(i).getTeamAbrv() + " Record:     " + easternConfPlayoffs.get(i).getTeamWin() + "\t" + easternConfPlayoffs.get(i).getTeamLoss() + "\t" + easternConfPlayoffs.get(i).getTeamDraw() + "\n";
        }

        String westStandings = "";
        System.out.println("\t\tW\tL\tD ====> West Sorted\n");
        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            westStandings += westernConfPlayoffs.get(i).getTeamAbrv() + " Record:     " + westernConfPlayoffs.get(i).getTeamWin() + "\t" + westernConfPlayoffs.get(i).getTeamLoss() + "\t" + westernConfPlayoffs.get(i).getTeamDraw() + "\n";
        }

                
        //===============================================FIRST ROUND=========================PLAYOFF SETUP================================================
        //Sets record to 0
        for(int i =0; i < seasonTeam.length; i++){
            seasonTeam[i].setTeamRecord();
        }
        

        //Simulates Best of 7 series
        int times = 0;
        while(times < 8){
            int lowerSeed = 8 - 1;
            for(int i = 0; i < 8; i++){
                if(i == lowerSeed){
                    break;
                }
                if(lowerSeed < 4){
                    break;
                }

                if(easternConfPlayoffs.get(i).getTeamWin() != 4 && easternConfPlayoffs.get(lowerSeed).getTeamWin() != 4){
                    Game game = new Game(easternConfPlayoffs.get(i), easternConfPlayoffs.get(lowerSeed));
                    boxScore.add(game);
                    arrList.add(game.getPlayerStats());
                } 
                if(westernConfPlayoffs.get(i).getTeamWin() != 4 && westernConfPlayoffs.get(lowerSeed).getTeamWin() != 4){
                    Game game = new Game(westernConfPlayoffs.get(i), westernConfPlayoffs.get(lowerSeed));
                    boxScore.add(game);
                    arrList.add(game.getPlayerStats());
                }
                lowerSeed--;
                
            }
            times++;
        }
        

                
        //PUTS TEAM STATS TO STRING THAT IS PRINTED AT THE END FOR THE FIRST ROUND (ONE FOR EAST; ONE FOR WEST)
        String firstRoundEast = "";
        int lowerSeed1 = 7;
        for(int i = 0; i < 8; i++){
            firstRoundEast += "(" + easternConfPlayoffs.get(i).getSeed() + ") " + easternConfPlayoffs.get(i).getTeamAbrv() + " vs. " + easternConfPlayoffs.get(lowerSeed1).getTeamAbrv() + "(" + easternConfPlayoffs.get(lowerSeed1).getSeed() + ") \n       (" + easternConfPlayoffs.get(i).getTeamWin() + "-" + easternConfPlayoffs.get(lowerSeed1).getTeamWin() + ")\n";
            // firstRoundStats.add(easternConfPlayoffs.get(i).getTeamLogo());
            // firstRoundStats.add(easternConfPlayoffs.get(i).getTeamAbrv());
            lowerSeed1--;
            if(lowerSeed1 < 4)
                break;
        }
        String testingStats = "";

        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            firstRoundStats.add(easternConfPlayoffs.get(i));
            firstRoundSeries.add(easternConfPlayoffs.get(i).getTeamWin() + "");
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            firstRoundStats.add(westernConfPlayoffs.get(i));
            firstRoundSeries.add(westernConfPlayoffs.get(i).getTeamWin() + "");
        }

        lowerSeed1 = 7;
        String firstRoundWest = "";
        for(int i = 0; i < 8; i++){
            firstRoundWest += "(" + westernConfPlayoffs.get(i).getSeed() + ") " + westernConfPlayoffs.get(i).getTeamAbrv() + " vs. " + "(" + westernConfPlayoffs.get(lowerSeed1).getTeamAbrv() + "(" + easternConfPlayoffs.get(lowerSeed1).getSeed() + ") \n       (" + westernConfPlayoffs.get(i).getTeamWin() + "-" + westernConfPlayoffs.get(lowerSeed1).getTeamWin() + ")\n";
            // firstRoundStats.add(westernConfPlayoffs.get(i).getTeamLogo());
            // firstRoundStats.add(westernConfPlayoffs.get(i).getTeamAbrv());
            lowerSeed1--;
            if(lowerSeed1 < 4)
                break;
        }
            //     //System.out.println("ddddd\nccccc\n\t\t\tbbbbb\n\t\t\tzzzzz\nfffff\t\t\t\t\t\nsssss\n\t\t\t\t\t\t\tZZZZZ\n\t\t\t\t\t\t\tXXXXX\nAAAAA\nVVVVV\n\t\t\tLLLLL\n\t\t\tzzzzz\nfffff\t\t\t\t\t\nsssss\n\t\t\t\t\t\t\t\t\t\t\tOOOOO\n\t\t\t\t\t\t\t\t\t\t\tNNNNN\nddddd\nccccc\n\t\t\tbbbbb\n\t\t\tzzzzz\nfffff\t\t\t\t\t\nsssss\n\t\t\t\t\t\t\tZZZZZ\n\t\t\t\t\t\t\tXXXXX\nAAAAA\nVVVVV\n\t\t\tLLLLL\n\t\t\tzzzzz\nfffff\t\t\t\t\t\nsssss\t\t\t\t\t");
            //     //System.out.println(teamPlayoff.get(0).getTeamAbrv() + "\n" + teamPlayoff.get(15).getTeamAbrv() + "\n\t\t\t" + * + "\n\t\t\t"*"\n" + team + \t\t\t\t\t\n*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n*\n*\n\t\t\t*\n\t\t\t*\n*\t\t\t\t\t\n*\n\t\t\t\t\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t\t\t\t\t*\n*\n*\n\t\t\t*\n\t\t\t*\n*\t\t\t\t\t\n*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n*\n*\n\t\t\t*\n\t\t\t*\n*\t\t\t\t\t\n*\t\t\t\t\t);
                

        //Removes Team that have 4 losses
        //East Removal
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            if(easternConfPlayoffs.get(i).getTeamWin() != 4){
                easternConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }
        //West Removal
        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            if(westernConfPlayoffs.get(i).getTeamWin() != 4){
                westernConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }

        //CLEARS TEAMS WINS TO ZERO FOR NEXT ROUND IN PLAYOFFS
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            easternConfPlayoffs.get(i).setTeamRecord();
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            westernConfPlayoffs.get(i).setTeamRecord();
        }


        //=========================================================SEMI-FINALS==============================================
        //SORTS REMAINING TEAMS SO THE PROGRAM CAN FOLLOW NBA PLAYOFF ORDER
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            if(easternConfPlayoffs.get(i).getSeed() == 1 || easternConfPlayoffs.get(i).getSeed() == 8){
                Team temp = easternConfPlayoffs.get(0);
                easternConfPlayoffs.set(0, easternConfPlayoffs.get(i));
                easternConfPlayoffs.set(i, temp);
            }
            if(easternConfPlayoffs.get(i).getSeed() == 2 || easternConfPlayoffs.get(i).getSeed() == 7){
                Team temp = easternConfPlayoffs.get(1);
                easternConfPlayoffs.set(1, easternConfPlayoffs.get(i));
                easternConfPlayoffs.set(i, temp);
            }
            if(easternConfPlayoffs.get(i).getSeed() == 3 || easternConfPlayoffs.get(i).getSeed() == 6){
                Team temp = easternConfPlayoffs.get(2);
                easternConfPlayoffs.set(2, easternConfPlayoffs.get(i));
                easternConfPlayoffs.set(i, temp);
            }
            if(easternConfPlayoffs.get(i).getSeed() == 4 || easternConfPlayoffs.get(i).getSeed() == 5){
                Team temp = easternConfPlayoffs.get(3);
                easternConfPlayoffs.set(3, easternConfPlayoffs.get(i));
                easternConfPlayoffs.set(i, temp);
            }              
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            if(westernConfPlayoffs.get(i).getSeed() == 1 || westernConfPlayoffs.get(i).getSeed() == 8){
                Team temp = westernConfPlayoffs.get(0);
                westernConfPlayoffs.set(0, westernConfPlayoffs.get(i));
                westernConfPlayoffs.set(i, temp);
            }
            if(westernConfPlayoffs.get(i).getSeed() == 2 || westernConfPlayoffs.get(i).getSeed() == 7){
                Team temp = westernConfPlayoffs.get(1);
                westernConfPlayoffs.set(1, westernConfPlayoffs.get(i));
                westernConfPlayoffs.set(i, temp);
            }
            if(westernConfPlayoffs.get(i).getSeed() == 3 || westernConfPlayoffs.get(i).getSeed() == 6){
                Team temp = westernConfPlayoffs.get(2);
                westernConfPlayoffs.set(2, westernConfPlayoffs.get(i));
                westernConfPlayoffs.set(i, temp);
            }
            if(westernConfPlayoffs.get(i).getSeed() == 4 || westernConfPlayoffs.get(i).getSeed() == 5){
                Team temp = westernConfPlayoffs.get(3);
                westernConfPlayoffs.set(3, westernConfPlayoffs.get(i));
                westernConfPlayoffs.set(i, temp);
            }              
        }

        //GAME SIMULATION FOR SEMI FINALS        
        int timesEastern = 0;
        while(timesEastern < 8){    
            int lowerSeedSemi = 3;
            for(int i = 0; i < 2; i++){
                if(lowerSeedSemi < 2){
                    break;
                }
                if(easternConfPlayoffs.get(i).getTeamWin() != 4 && easternConfPlayoffs.get(lowerSeedSemi).getTeamWin() != 4){
                    Game game = new Game(easternConfPlayoffs.get(i), easternConfPlayoffs.get(lowerSeedSemi));
                    boxScore.add(game);
                    arrList.add(game.getPlayerStats());
                }
                lowerSeedSemi--;
            }
            timesEastern++;
        }

        int timesWestern = 0;
        while(timesWestern < 8){    
            int lowerSeedSemi = 3;
            for(int i = 0; i < 2; i++){
                if(lowerSeedSemi < 2){
                    break;
                }
                if(westernConfPlayoffs.get(i).getTeamWin() != 4 && westernConfPlayoffs.get(lowerSeedSemi).getTeamWin() != 4){
                    Game game = new Game(westernConfPlayoffs.get(i), westernConfPlayoffs.get(lowerSeedSemi));
                    boxScore.add(game);
                    arrList.add(game.getPlayerStats());
                }
                lowerSeedSemi--;
            }
            timesWestern++;
        }


        //TEAM STATS FOR SEMI-FINALS
        String semisEast = "";
        int lowerSeed2 = 3;
        for(int i = 0; i < 2; i++){
            semisEast += "(" + easternConfPlayoffs.get(i).getSeed() + ") " + easternConfPlayoffs.get(i).getTeamAbrv() + " vs. " + easternConfPlayoffs.get(lowerSeed2).getTeamAbrv() + "(" + easternConfPlayoffs.get(lowerSeed2).getSeed() + ") \n       (" + easternConfPlayoffs.get(i).getTeamWin() + "-" + easternConfPlayoffs.get(lowerSeed2).getTeamWin() + ")\n";
            // semiFinals.add(easternConf.get(i).getTeamLogo());
            // semiFinals.add(easternConf.get(i).getTeamAbrv());
            lowerSeed2--;
            if(lowerSeed2 < 2)
                break;
        }

        String semisWest = "";
        int lowerSeedSW = 3;
        for(int i = 0; i < 2; i++){
            semisWest += "(" + westernConfPlayoffs.get(i).getSeed() + ") " + westernConfPlayoffs.get(i).getTeamAbrv() + " vs. " + westernConfPlayoffs.get(lowerSeedSW).getTeamAbrv() + "(" + westernConfPlayoffs.get(lowerSeedSW).getSeed() + ") \n       (" + westernConfPlayoffs.get(i).getTeamWin() + "-" + westernConfPlayoffs.get(lowerSeedSW).getTeamWin() + ")\n";
            // semiFinals.add(westernConfPlayoffs.get(i).getTeamLogo());
            // semiFinals.add(westernConfPlayoffs.get(i).getTeamAbrv());
            lowerSeedSW--;
            if(lowerSeedSW < 2)
                break;
        }

        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            semiFinals.add(easternConfPlayoffs.get(i));
            semiFinalsSeries.add(easternConfPlayoffs.get(i).getTeamWin() + "");
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            semiFinals.add(westernConfPlayoffs.get(i));
            semiFinalsSeries.add(westernConfPlayoffs.get(i).getTeamWin() + "");

        }

        //REMOVES TEAMS THAT DO NOT HAVE REQUIRED 4 WINS
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            if(easternConfPlayoffs.get(i).getTeamWin() != 4){
                easternConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            if(westernConfPlayoffs.get(i).getTeamWin() != 4){
                westernConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }

        //CLEARS WINS TO ZERO FOR NEXT ROUND
        for(Team t: easternConfPlayoffs)
            t.setTeamRecord();

        for(Team t: westernConfPlayoffs)
            t.setTeamRecord();

        //=============================================================CONFERENCE FINALS======================================================
        //SINCE WE USE AN ARRAYLIST AND IT CHANGES SIZE DYNAMICALLY WE CAN ASSUME THE INDEXES FOR THE TWO REMAINING TEAMS
        for(int i = 0; i < 8; i++){
            if(easternConfPlayoffs.get(0).getTeamWin() != 4 && easternConfPlayoffs.get(1).getTeamWin() != 4){
                Game game = new Game(easternConfPlayoffs.get(0), easternConfPlayoffs.get(1));
                boxScore.add(game);
                arrList.add(game.getPlayerStats());
            }
        }
            
        for(int i = 0; i < 8; i++){
            if(westernConfPlayoffs.get(0).getTeamWin() != 4 && westernConfPlayoffs.get(1).getTeamWin() != 4){
                Game game = new Game(westernConfPlayoffs.get(0), westernConfPlayoffs.get(1));
                boxScore.add(game);
                arrList.add(game.getPlayerStats());
            }
        }

        //TEAM STATS FOR CONFERENCE FINALS TEAM
        String cFinalEast = "";
        int lowerSeedCFinal = 1;
        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            cFinalEast += "(" + easternConfPlayoffs.get(i).getSeed() + ") " + easternConfPlayoffs.get(i).getTeamAbrv() + " vs. " + easternConfPlayoffs.get(lowerSeedCFinal).getTeamAbrv() + "(" + easternConfPlayoffs.get(lowerSeedCFinal).getSeed() + ") \n       (" + easternConfPlayoffs.get(i).getTeamWin() + "-" + easternConfPlayoffs.get(lowerSeedCFinal).getTeamWin() + ")\n";
            // conferenceFinals.add(easternConfPlayoffs.get(i).getTeamLogo());
            // conferenceFinals.add(easternConfPlayoffs.get(i).getTeamAbrv());
            lowerSeedCFinal--;
            if(lowerSeedCFinal < 1)
                break;
        }

        String cFinalWest = "";
        int lowerSeedCFinalW = 1;
        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            cFinalWest += "(" + westernConfPlayoffs.get(i).getSeed() + ") " + westernConfPlayoffs.get(i).getTeamAbrv() + " vs. " + westernConfPlayoffs.get(lowerSeedCFinalW).getTeamAbrv() + "(" + westernConfPlayoffs.get(lowerSeedCFinalW).getSeed() + ") \n       (" + westernConfPlayoffs.get(i).getTeamWin() + "-" + westernConfPlayoffs.get(lowerSeedCFinalW).getTeamWin() + ")\n";
            // conferenceFinals.add(westernConfPlayoffs.get(i).getTeamLogo());
            // conferenceFinals.add(westernConfPlayoffs.get(i).getTeamAbrv());
            lowerSeedCFinalW--;
            if(lowerSeedCFinalW < 1)
                break;
        }

        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            conferenceFinals.add(easternConfPlayoffs.get(i));
            conferenceFinalSeries.add(easternConfPlayoffs.get(i).getTeamWin() + "");
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            conferenceFinals.add(westernConfPlayoffs.get(i));
            conferenceFinalSeries.add(westernConfPlayoffs.get(i).getTeamWin() + "");
        }

        for(int i = 0; i < easternConfPlayoffs.size(); i++){
            if(easternConfPlayoffs.get(i).getTeamWin() != 4){
                easternConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }

        for(int i = 0; i < westernConfPlayoffs.size(); i++){
            if(westernConfPlayoffs.get(i).getTeamWin() != 4){
                westernConfPlayoffs.remove(i);
                i--;
                continue;
            }
        }



        //==================================================FINALS=========================================
        
        //CLEARS WINS FOR FINALS
        for(Team t: easternConfPlayoffs)
            t.setTeamRecord();

        for(Team t: westernConfPlayoffs)
            t.setTeamRecord();

        //ARRAYLIST SO WE ASSUME POSITION
        for(int i = 0; i < 8; i++){
            if(westernConfPlayoffs.get(0).getTeamWin() != 4 && easternConfPlayoffs.get(0).getTeamWin() != 4){
                Game game = new Game(westernConfPlayoffs.get(0), easternConfPlayoffs.get(0));
                boxScore.add(game);
                arrList.add(game.getPlayerStats());
            }
        }

        //PRINTS OUT SEASON PLAYER STATS
        
        System.out.println("\nLEADING SCORERS IN SEASON:\n" + seasonLeadingScorers + "\nLEADING AST: \n" + seasonLeadingAst);

        //PRINTS OUT PLAYOFF STATS
        sortArr.sortALPlayers(playersLeague);
        String playoffLeadingScorers = "";
        for(int i = 0; i < playersLeague.size() / 8; i++){
            playoffLeadingScorers += (i+1) + ") " + playersLeague.get(i).getPlayerName() +": "+ playersLeague.get(i).getPointAvg() + "\n";
        }
        System.out.println("\nLEADING SCORERS IN PLAYOFFS:\n" + playoffLeadingScorers);


        //PRINTS PLAYOFFS TEAM STATS
        System.out.println("\nPLAYOFF STANDINGS: \n" + eastStandings + "\n" + westStandings + "\n");

        System.out.println("FIRST ROUND: \n" + firstRoundEast + "\n" + firstRoundWest + "\n");
        System.out.println("SEMI-FINALS: \n" + semisEast + "\n" + semisWest + "\n");
        System.out.println("CONFERENCE FINALS: \n" + cFinalEast + "\n" + cFinalWest + "\n");
        finals.add(easternConfPlayoffs.get(0));
        finals.add(westernConfPlayoffs.get(0));
        finalsSeries.add(easternConfPlayoffs.get(0).getTeamWin() + "");
        finalsSeries.add(westernConfPlayoffs.get(0).getTeamWin() + "");

        

        if(westernConfPlayoffs.get(0).getTeamWin() == 4){
            System.out.println("Congratulations to your NBA Champs, the " + westernConfPlayoffs.get(0).getTeamName() + "\n(" + westernConfPlayoffs.get(0).getSeed() + ") " + westernConfPlayoffs.get(0).getTeamAbrv() + " " + westernConfPlayoffs.get(0).getTeamWin() + " - " + easternConfPlayoffs.get(0).getTeamWin() + " " + easternConfPlayoffs.get(0).getTeamAbrv() + " (" + easternConfPlayoffs.get(0).getSeed() + ")");
        }
        if(easternConfPlayoffs.get(0).getTeamWin() == 4){
            System.out.println("Congratulations to your NBA Champs, the " + easternConfPlayoffs.get(0).getTeamName() + "\n(" + westernConfPlayoffs.get(0).getSeed() + ") " + westernConfPlayoffs.get(0).getTeamAbrv() + " " + westernConfPlayoffs.get(0).getTeamWin() + " - " + easternConfPlayoffs.get(0).getTeamWin() + " " + easternConfPlayoffs.get(0).getTeamAbrv() + " (" + easternConfPlayoffs.get(0).getSeed() + ")");
        }    
        System.out.println(testingStats);    

        //CLEAN SLATE FOR NEXT SEASON
        for(Team t: easternConfPlayoffs)
            t.setTeamRecord();

        for(Team t: westernConfPlayoffs)
            t.setTeamRecord();
        
        easternConfPlayoffs.clear();
        westernConfPlayoffs.clear();
        easternConf.clear();
        westernConf.clear();
        playersLeague.clear();

        return boxScore;
        
    } 
        
}