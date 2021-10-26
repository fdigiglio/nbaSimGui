import java.util.ArrayList;

public class Sort {
    
    // public int getNextGap(int gap)
    // {
    //     // Shrink gap by Shrink factor
    //     gap = (gap*10)/13;
    //     if (gap < 1)
    //         return 1;
    //     return gap;
    // }

    public void sort(Team array[])
    {
        int num = array.length;
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
              if (array[j].getTeamWin() < array[j+1].getTeamWin()) 
              {
                Team temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
              }
            }
          }

    }

    public void sortAL(ArrayList<Team> array)
    {
        int num = array.size();
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
              if (array.get(j).getTeamWin() < array.get(j+1).getTeamWin()) 
              {
                Team temp = array.get(j);
                array.set(j, array.get(j+1));
                array.set(j+1, temp);
              }
            }
          }

    }

    public void sortALPlayers(ArrayList<Player> array)
    {
        int num = array.size();
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
              if (array.get(j).getPointAvg() < array.get(j+1).getPointAvg()) 
              {
                Player temp = array.get(j);
                array.set(j, array.get(j+1));
                array.set(j+1, temp);
              }
            }
          }

    }

    public void sortALPlayersAst(ArrayList<Player> array)
    {
        int num = array.size();
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
              if (array.get(j).getAssistAvg() < array.get(j+1).getAssistAvg()) 
              {
                Player temp = array.get(j);
                array.set(j, array.get(j+1));
                array.set(j+1, temp);
              }
            }
          }

    }

}
