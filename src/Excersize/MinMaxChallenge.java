package Excersize;

import java.util.Scanner;
public class MinMaxChallenge {
    // Check Max and min value between two value
   /* public static void main(String a[])
    {
        int b,c;
        Scanner s=new Scanner(System.in);
        System.out.println(" Min Max challenge is here ");
        System.out.println(" Enter value one :");
        b=s.nextInt();
        System.out.println("Enter value two");
        c=s.nextInt();

        MinMax_checker(b,c);
    }
    public static int MinMax_checker(int b,int c)
    {
        if(b<0 && c<0)
        {
            return -1;
        }
        while(c>0 && b>0)
        {
            if(b>c)
            {
                System.out.println("Greater value is "+b);
            }
            else {
                System.out.println("Greater value is "+c);
            }
            break;
        }
        return 1;
    }*/

    // check Max value between three value
    public static void main(String ar[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter 1st value ");
        a=s.nextInt();
        System.out.println(" Enter 2nd value ");
        b=s.nextInt();
        System.out.println(" Enter 3rd value ");
        c=s.nextInt();

        MaxCheckerThreeNumber(a,b,c);
    }
    public static int MaxCheckerThreeNumber(int a,int b,int c)
    {
        while (a>0 && b>0 && c>0)
        {
            if(a>b && a>c)
            {
                System.out.println(a+" Is Greater value  ");
            }
            else if (b>a && b>c)
            {
                System.out.println(b+" Is  Greater value ");
            }
            else
            {
                System.out.println(c+" Is Greater value ");
            }
            break;
        }
        return 1;
    }
}
