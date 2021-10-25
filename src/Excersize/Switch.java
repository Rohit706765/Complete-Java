package Excersize;

import  java.util.Scanner;
public class Switch {
    public static void  main(String ar[])
    {
        /*String AnyWord;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Letter of Your Name :");
        AnyWord=s.next();
        System.out.println("Wait................. ");
        switch (AnyWord)
        {
            case "A": case "B": case "C": case "D":
                System.out.println("you have lucky day so enojy now !!!!");
                break;
            case "no":
                System.out.println("Dangerous Day for u");
                break;
            default:
                System.out.println("You must be carefull");
                break;
        }*/
        String number;
        Scanner s=new Scanner(System.in);
        String[] SingleArray={"","one","two","three","four","five","six","seven","eight","nine"};
        int len=SingleArray.length;

        System.out.println("Enter a Number");
        number=s.next();
        int count=0;
        int n=Integer.parseInt(number);
       
        for (int i=n;i<len;i++)
        {
            ++count;
            System.out.println("Number "+i+" is in word "+SingleArray[i]);
            if (count==1)
            {
                break;
            }
        }


    }
}
