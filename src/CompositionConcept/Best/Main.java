package CompositionConcept.Best;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String ar[]) {
     /*   Player rajan=new Player("rajan",50,"gun");
        rajan.LoseHealth(51);
        System.out.println(rajan.getHealthPoint());
  */
       /* BMW bmw=new BMW(false,4,15000);
        bmw.accelrate(20);

        bmw.Steer(45);
        bmw.accelrate(20);
        bmw.Steer(0);
        bmw.accelrate(20);
        bmw.stop();
        int t=bmw.getCurrentVelocity();
        System.out.println("Current velocity of vehicle  is "+t);
        bmw.accelrate(30);*/

        /* *****************************************************************/
    /*    Dimension dimension=new Dimension(1500,1800,75);
        Case aCase = new Case("Dell",3500,dimension,"dell-784");
        Resolution resolution=new Resolution(2800,2800);
        Monitor monitor=new Monitor(1200,"dell-8554","Dell",resolution);

        Motheboard motheboard=new Motheboard("Dell",2,"Dell-78524",6,"Dell");
        ThePc thepc=new ThePc(aCase,motheboard,monitor);
        thepc.powerup();
        thepc.Drawlogo();

        thepc.getTheMonitor().DrawPixelat(45,45,"Orange");
    */
        /* ****************************************/

        /** Composition example is here **/

        /*Roomsize roomsize=new Roomsize(15,22);
        Wall wall1=new Wall("yellow","Good","Flower");
        Wall wall2=new Wall("red","Good","Flower");
        Wall wall3=new Wall("orange","Good","Flower");
        Bed bed=new Bed(16,"Double","High",true);
        Table table=new Table("large",10,20,7000);

        Room rohit=new Room("3BHK",roomsize,wall1,bed,table,"large");
        System.out.println(  rohit.getWall().getDecorationType()+'\n'+rohit.getWall().getWallQuality());
        */

        /**
         *      Vowel Checker
         * */
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter A character ");
        String VowelCheck=sc.next();
        switch (VowelCheck)
        {
            case "a":case "A":case "e":case "E":case "i":case "I":case "o":case "O":case "u":case "U":
            System.out.println("Character "+VowelCheck+" is vowel");
            break;
            default:
                System.out.println("Character "+VowelCheck +" is not Vowel");
                break;

       */
        /*int NumberOfAttempt=0;
        boolean InterviewGoneGood=false;
        String[] AvailableName={"Rohit","kajal","sonal","raju","pardeep"};
        String[] SortedMember={"Rohit","kajal","sonal"};
        String[] JudgeName={"Narvan","Clay","Aranb"};
        String[][] JudgeForInterview={}
        System.out.println("welcome to in Audition room ");
        if(NumberOfAttempt>=3)
        {
            System.out.println("Try to next year !! ");
        }

        if (InterviewGoneGood==true)
        {
            for(String CandidateName:AvailableName)
            {
                System.out.println("Welcome Mr/Mrs "+CandidateName+" to the Audition Round ");
                ++NumberOfAttempt;
            }
       }
       */

        for (int i = 1; i < 4; i++) {
            numberAttempt();
        }
    }

    public static void numberAttempt() {
        int numberAttempt = 0;
        while (numberAttempt < 5) {
            System.out.println("you cant try now  Wait for second ");
        }

            System.out.println("welcome");

        ++numberAttempt;
    }
}

