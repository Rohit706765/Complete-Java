package if_else;

interface SameData
{
     void getName(String name);
     void getCaste(String cast);
}

public class IF_ELSE implements  SameData
{
    public static void main(String[] args) {

        IF_ELSE obj = new IF_ELSE();
        obj.getName("rohit ");
        obj.getCaste("Singh");

        int position = CalculateScore(1500);
        displayHighScore("rohit",position);
         position = CalculateScore(900);
        displayHighScore("kajal",position);
         position = CalculateScore(400);
        displayHighScore("sonal",position);
        position = CalculateScore(50);
        displayHighScore("Ranjan",position);
    }
    public static void displayHighScore(String name,int position)
    {
        if (!(name==null && position<=0))
        {
            System.out.println(name+" managed to get position "+position+" on the score board");
        }
    }
    public static int CalculateScore(double Score)
    {
        if (Score>=1000)
        {
            return 1;
        }
        else if (Score>=500 && Score<1000)
        {
            return 2;
        }
        else if (Score>=100 && Score<500)
        {
            return 3;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public void getName(String name)
    {
        System.out.println("my name is "+name);
    }

    @Override
    public void getCaste(String cast) {
        System.out.println("Your cast is "+cast);
    }
}




















/******************************************************************************************/
// if else code
/*****************************************************************************************/
/* public static void main(String[] args) {

        gameOverChecker(100,5,100,true,false);
    }
    public static double gameOverChecker(int score,int levelCompleted,int bonus,boolean gameOver,boolean prime)
    {
        double finalResult;
        if (gameOver)
        {
            if (prime)
            {
                bonus+=200;
                System.out.println("thanks for Prime member ship");
            }
            else
            {
                // give notification about prime
                System.out.println("Subscribe prime membership and add multiple bonus");
            }
            finalResult = score + (levelCompleted*bonus);
            System.out.println("your final score is "+finalResult);
            return finalResult;
        }
        else {
            System.out.println("Continue ");
            return -1;
        }

    }*/