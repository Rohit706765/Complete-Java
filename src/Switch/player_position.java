package Switch;

public class player_position {
    public  static void main(java.lang.String args[])
    {
       /* double score=4504;
        int position=calculate_Score(4500);
        displayhighscoreposition("Rohit",position);
        position=calculate_Score(850);
        displayhighscoreposition("kajal",position);
        position=calculate_Score(500);
        displayhighscoreposition("sonal",position);
        position=calculate_Score(50);
        displayhighscoreposition("prithvi",position);
*/
    checknumber(5);
    checknumber(-5);
    checknumber(0);

    }
    public static void checknumber(int a)
    {
        if(a>0)
        {
            System.out.println("this is positive number ");
        }
        else if(a<0)
        {
            System.out.println("this is negative number");

        }
        else
        {
            System.out.println("zero");

        }
    }
}
   /* public static void displayhighscoreposition(java.lang.String name,int position)
    {
        System.out.println("Athlete name is "+name+" Managed to get the position on the table #"+position);

    }
    public static int calculate_Score(double score)
    {
        int position=0;
        if(score>=1000)
        {
            System.out.println("Your score is :"+score);
           position=1;
        }
        else if(score>500&&score<=1000)
        {
            System.out.println("Your score is :"+score);
            position= 2;
        }
        else if(score>=100&&score<=500)
        {
            System.out.println("Your score is :"+score);
            position= 3;
        }
        else
        {
            System.out.println("Try again !");
            position= 4;
        }
        return position;
    }


}*/
