package Interface;


public class Pattern {
    public static void main(String[] args) {

        ITelephone phone = new Deskphone(454454);
        phone.start();
        phone.callphone(454454);
        phone.dial(84545);
        phone.answer();
    }
}


    //TODO find the pattern using regex

    /*public static void pattern()
    {
        String name = " 'kajal' and 'sonal' are 'best friend' ";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(" '(.*?)' ");
        Matcher m = p.matcher(name);

        while (m.find())
        {
            System.out.println(m.group(1));
        }

    }*/


    /*    //TODO     j j j j (j for column and i for row )
     *      i  1
     *      i  1 2
     *      i  1 2 3
     *      i  1 2 3 4
     *
     *
   public static void pyramidPattern(int n)
    {

        for (int i=1;i<=4;i++) // row
        {
            for (int j=1;j<=i;j++) // column
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Reveresed pattern ");
        for (int i=1;i<=4;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}*/
/********************************************************************************************************************/
 /*
    *   // TODO print  *
    *                  * *
    *                  * * *
    *                  * * * *
    *                  * * * *
    *                  * * *
    *                  * *
    *                  *
    *

    public static void printpattern()
    {
        for (int i = 1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=1;i<=4;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
   */
