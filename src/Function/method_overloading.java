package Function;

public class method_overloading {
    public static void main(java.lang.String args[])
    {
       int totalscore= checkscore(500,"Rohit");
        System.out.println("your final score is "+totalscore);
       checkscore(145);
       int finalscore=checkscore(450,15,"kajal");
        System.out.println("after adding your bonus "+finalscore);

    }
    public  static int checkscore(int score, java.lang.String name)
    {
        if(score>120)
        {
            System.out.println("Congratulation "+name+" You get score on table "+score);
            return score*100;
        }
        return 1;
    }
    public static void checkscore(int score)//function overloading
    {
        System.out.println("unamed player"+"your total score is :"+score);
    }
    public static  int checkscore(int score, int bonus, java.lang.String name)
    {
        System.out.println("Congratulation "+name+"You give epic performance "+"you get bonus point "+bonus);
        return score*bonus;
    }
}


