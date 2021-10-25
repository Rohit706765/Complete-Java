package CompositionConcept;

public class Main {
    public static void main(java.lang.String args[]) {
        /*
         *   this class fully used by Composition concept
         *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
         * */

        Motherboard motherboard = new Motherboard("xamx", "Acer", 4, 6, "w2d");

        Case_Dimension case_dimension = new Case_Dimension(1500, 2100, 2);
        Case aCase = new Case("FTX", "assus", 2050, case_dimension);

        Resolution nativeResolution = new Resolution(1500, 1600);
        Monitor monitor = new Monitor("rtu", "ACer", 14, nativeResolution);

        ThePC thePC = new ThePC(motherboard, aCase, monitor);
        thePC.getaCase().PressPoweButton();
        thePC.getMonitor().DrawPixelAt(12, 13, "white");

        System.out.println("Power supply is " + thePC.getaCase().getPowersupply() + " maH");
        player rohit=new player(50,"rohit","Akm");
        rohit.loseHealth(50);
        System.out.println("Remaining Health is "+rohit.getHealth());
    }
}
class player
{
    private int Health=100;
    private String name;
    private String Weapon;

    public player(int health, String name, String weapon) {
        if(health>0 && health<=100) // you should check the variable name
        {
            Health = health;
        }
        this.name = name;
        Weapon = weapon;
    }
    public void loseHealth(int loseHealth)
    {
        Health-=loseHealth;
        if(Health<=0)
        {
            System.out.println(this.name+" is knocked out ");
        }
    }
    public int getHealth()
    {
        return Health;
    }
}

       /* Pazero pazero=new Pazero(10000);
        pazero.start();
        pazero.ChangeVelocity(20,10);
        pazero.ChangeVelocity(20,10);*/
     /*   boolean gameover=true;
        int score=10000;
        int levelcompleted=5;
        int bonus=100;
        java.lang.String owner="ROHIT";
        owner("rohit");
        owner("kajal");

        int total=calculation(true,10000,5,100);
        System.out.println("total is :"+total);
        calculation(true,4000,10,850);
*/

  /*  public static void owner(java.lang.String owner)
    {
        System.out.println("Who is owner :"+owner+"  is owner of it");
    }
    public  static int  calculation(boolean gameover,int score,int levelcompleted,int bonus)
    {
        if(gameover)
        {
            int finalscore=score+(levelcompleted*bonus);
            System.out.println("Your final score is :"+finalscore);
            return  finalscore;
        }
        return  -1;

     }
}*/
