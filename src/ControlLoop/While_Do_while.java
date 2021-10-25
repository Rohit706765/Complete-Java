package ControlLoop;

public class While_Do_while {
    public static void main(String ar[]) {

        int cnt=0;
        int n=0;
        int FirstNum=4,LastNum=20;
        while( Iseven(FirstNum,LastNum))
        {
            ++cnt;
            System.out.println(FirstNum);
            if(cnt==5)
            {
               break;
            }
            ++FirstNum;
        }
    }
    public static boolean Iseven(int FirstNum,int LastNum)
    {
        if(FirstNum>LastNum)
        {
            return false;
        }
        else
        {
            if(FirstNum%2==0)
            {
                //System.out.println("Next FirstNum :"+FirstNum);
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
/**
 *  The diffrence between while and do while loop
 * */
        /*int cnt = 0;
        int n=6;
        while (n<5)
        {
            System.out.println(n++);
        }
        n=6;
        do {
            System.out.println(n++);
        }while (n<5);*/


        /**
         *  man code with bad example
         * */

/*

        boolean man = true;
        while (man) {
            System.out.println(" You can proudly say ... You are man ");
            System.out.println(" Bad joke ");
            cnt++;

            if (cnt == 5) {
                break;
            }
        }

        System.out.println("no of time repeat :" + cnt);
        cnt = 0;
        do {
            System.out.println(" You can proudly say ... You are man ");
            System.out.println("Bad joke ");
            cnt++;
            if (cnt == 5) {
                break;
            }
        } while (man);
*/


        /**
         * even method code is here
         * */


        // Challenge are here okay
        /*for(int i=0;i<20;i++)
        {
            while(Iseven(i))
            {
                System.out.println("No "+i+" Is Even :"+Iseven(i));
                break;
            }

        }

    }
    public static boolean Iseven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
/*

        int firstNumber=4,LastNumber=20;
        int cnt=0,sum=0;
        while(firstNumber<=LastNumber)
        {
            if(cnt==5)
            {
                break;
            }
            if(Iseven(firstNumber))
            {
                System.out.println("even number is :"+firstNumber);
                sum+=firstNumber;

                cnt++;
            }
            firstNumber++;
        }
        System.out.println(" sum of even no :"+sum);


        }

    public static boolean Iseven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
*/

