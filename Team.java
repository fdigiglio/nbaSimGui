import java.util.ArrayList;

public class Team{

    //Instance Variables
    private String teamName;
    private String teamAbrv;
    // private int teamOffensiveRating;
    // private int teamDefensiveRating;
    // private int teamScore;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private Player teamArray[] = new Player[5];
    private static ArrayList<Player> teamList = new ArrayList<Player>();
    public int win = 0;
    public int loss = 0;
    public int draw = 0;
    public int gamesPlayed = 0;
    public int totalPoints = 0;
    public int playoffWin = 0;
    public int playoffLoss = 0;
    public int playoffDraw = 0;
    public int seed = 0;
    private String conference;
    private String pace;
    private String teamLogo;
    private int championshipTotal;
    private boolean trade = false;

    // Constructor

    public Team() {

    }


    public Team(String pTeamName, String pConf, String pTeamAbrv, Player pPlayer1, Player pPlayer2, Player pPlayer3, Player pPlayer4, Player pPlayer5, String pPace, String pTeamLogo) {
        this.teamName = pTeamName;
        this.conference = pConf;
        this.teamAbrv = pTeamAbrv;
        this.player1 = pPlayer1;
        this.player2 = pPlayer2;
        this.player3 = pPlayer3;
        this.player4 = pPlayer4;
        this.player5 = pPlayer5;
        this.pace = pPace;
        this.teamLogo = pTeamLogo;
        teamArray[0] = this.player1;
        teamArray[1] = this.player2;
        teamArray[2] = this.player3;
        teamArray[3] = this.player4;
        teamArray[4] = this.player5; 

    }

    
    public void setSeed(int pSeed){
        seed = pSeed;
    }

    // Getter Methods

    public int getSeed(){
        return seed;
    }

    public String getConference(){
        return this.conference;
    }

    public int getTeamOffensiveRating() {
        int offTeamRate = (this.player1.getOffensiveRating() + this.player2.getOffensiveRating()
                + this.player3.getOffensiveRating() + this.player4.getOffensiveRating()
                + this.player5.getOffensiveRating()) / 5;
        return offTeamRate;
    }

    public int getTeamDefensiveRating() {
        int defTeamRate = (this.player1.getDefensiveRating() + this.player2.getDefensiveRating()
                + this.player3.getDefensiveRating() + this.player4.getDefensiveRating()
                + this.player5.getDefensiveRating()) / 5;
        return defTeamRate;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTeamAbrv() {
        return this.teamAbrv;
    }

    public void getTeamPlayers(ArrayList<Player> list){
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getPlayerName());
        }
        
    }

    public String getTeamLogo(){
        return this.teamLogo;
    }

    public static ArrayList<Player> getList(){
        return teamList;
    }

    public Player[] getTeamArray(){
        return teamArray;
    }

    public int getTeamScore(){
        int teamScore = this.player1.getPlayerScoring() + this.player2.getPlayerScoring() + this.player3.getPlayerScoring() + this.player4.getPlayerScoring() + this.player5.getPlayerScoring();
        return teamScore;
    }

    public int getOvertimeScoring(){
        int teamScore = (this.player1.getPlayerScoring() + this.player2.getPlayerScoring() + this.player3.getPlayerScoring() + this.player4.getPlayerScoring() + this.player5.getPlayerScoring()) / 2;
        return teamScore;
    }

    public int getGamesPlayed(){
        return this.gamesPlayed;
    }


    public int getTeamWin(){
        return this.win;
    }

    public int getTeamLoss(){
        return this.loss;
    }

    public int getTeamDraw(){
        return this.draw;
    }

    public int getPlayoffWin(){
        return playoffWin;
    }

    public String getPaceString(){
        return this.pace;
    }

    public void setPlayoffWin(){
        this.playoffWin = 0;
    }
    
    public void setTeamRecord(){
        this.win = 0;
        this.loss = 0;
        this.draw = 0;
    }

    public void setTeamGames(){
        this.gamesPlayed = 0;
        this.totalPoints = 0;
    }

    public void addPlayer(ArrayList<Player> playersArr){
        for(int i = 0; i < teamArray.length; i++){
            playersArr.add(teamArray[i]);
        }
    }

    public Player[] getPlayerArray(){
        return this.teamArray;
    }

    public void setPlayerArray(Player[] arr){
        this.teamArray = arr;
    }

    public void setChamps(int newChamp){
        this.championshipTotal = newChamp;
    }

    public void winChampionship(){
        this.championshipTotal++;
    }

    public int getChamps(){
        return this.championshipTotal;
    }

    public void setTradeOn(boolean newBool){
        trade = newBool;
    }

    public boolean getTradeOn(){
        return this.trade;
    }

    
    

}