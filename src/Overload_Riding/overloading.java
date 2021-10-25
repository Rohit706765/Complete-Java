package Overload_Riding;

public class overloading {
/*    public static void main(String args[])
    {
        int mark,bonus=0;

        String PlayerName;
        Scanner s=new Scanner(System.in);
        System.out.println("** Enter your all details below **");
        System.out.println(" Enter PlayerName ");
        PlayerName=s.nextLine();
        System.out.println(" Enter Score");
        mark=s.nextInt();
        Checkdetails(mark,PlayerName);
        Checkdetails(mark);
        Checkdetails(mark,PlayerName,bonus);
    }
    public static void  Checkdetails(int mark,String Pname)
    {
        if(Pname=="")
        {
            System.out.println("Unknown Player Get "+mark+" In the table ");
        }
        else
        {
            if(mark<80 && mark>=70)
            {
                System.out.println(" congratulation You must be Rewarded by us !!");
            }
            else if(mark<70 && mark>=60)
            {
                System.out.println(" okay You must be wait !! ");
            }
            else if (mark<60 && mark>=50)
            {
                System.out.println(" jUST WAIT OKAY !!");
            }
            else
            {
                System.out.println(" Sorry we cant say anything Right now !");
            }

            System.out.println(" Mr/Mrs "+Pname+" Get Score in the table "+mark);
        }
    }

    public static void Checkdetails(int mark )
    {
        System.out.println(" Unknown Player get "+mark+" on the table");
    }
    public static void Checkdetails(int mark,String PlayerName,int bonus)
    {
        int total=mark*bonus;
        System.out.println("Mr/Mrs "+PlayerName+" You Recevie"+bonus+" As A Bonus "+"And"+" Now your total Mark is "+total);
    }*/

    // calculate feet and inch to centimeter

    public static void main(String a[])
    {
        double feet,inch;
        System.out.println("");
        Calfeet_inch(12,12);
        Calfeet_inch();

    }public static void Calfeet_inch()
    {
        System.out.println(" just test mode");
    }

    public static double Calfeet_inch(double feet,double inch)
    {
        if(inch<0 && (feet<0 && feet>=12))
        {
            System.out.println(" invalid feet and inch ");
            return -1;
        }
        double centimeter=(feet*12)*2.54;
        centimeter+=inch*2.54;
        System.out.println("feet "+feet+" inch "+inch+" centimeter"+centimeter);
        return centimeter;
    }
}
