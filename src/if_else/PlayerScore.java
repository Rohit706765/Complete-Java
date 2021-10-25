package if_else;

public class PlayerScore {
    public static void main(String ar[]) {
         String PlayerName;
        int Score;
        int Position;

        Position=CalculateScore(4500);
        DisplayPlayerName("Rohit",4500,Position);

        Position=CalculateScore(200);
        DisplayPlayerName("sonal",200,Position);
    }
    public static void DisplayPlayerName(String playerName,int score,int position)
    {
        System.out.println(playerName+"  total score was "+score+" he/she get "+position+" position in table");
    }
    public static int CalculateScore(int Score)
    {
        int position;
        if(Score>=1000)
        {
            position=1;
        }
        else  if (Score>=500)
        {
            position=2;
        }
        else if(Score>=100)
        {
            position=3;
        }
        else {
            position=4;
        }
        return position;
    }
}
