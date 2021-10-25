package Excersize;

import java.util.Scanner;
public class braking_dog {
    public static void main(String args[])
    {
        int temp;
        String whether;
        Scanner s=new Scanner(System.in);
        System.out.println(" enter temperater of dog ");
       temp= s.nextInt();
        System.out.println(" Enter Whether condition now ");
        whether=s.next();
       bark_check(temp,whether);
        System.out.println();
    }
    public static void bark_check(int temp,String whether)
    {
        if(whether.equals("winter")|| whether.equals("cool"))
        {
            if(temp>20&&temp<=35)
            {
                System.out.println(" whether is cool So your Dog will be not Bark ");
            }
            else if(temp>35 && temp<=45)
            {
                System.out.println("It may be difficult time for them ");
            }
            else
            {
                System.out.println(" Your dog will be bark !!");
            }
        }
        else
        {
            System.out.println("Sorry Too difficult time for them ");
            System.out.println(" visit our site for more info ");
            System.out.println(" www.xyz.com");
            System.out.println(" Take care of yourself ");
        }

    }

}
