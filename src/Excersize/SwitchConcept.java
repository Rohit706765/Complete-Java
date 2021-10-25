package Excersize;

import java.util.Scanner;
public class SwitchConcept {
    // number to word;
    /*public static void main(String ar[])
    {
        *//*String x="";
        check(x);*//*
        int x=2100;
        check(25);
        System.out.println(x%100);
    }
    static void check(int num)
    {

        String onedigit[]={"","one","two","three","four","five","six","seven","eight","nine"};
        String twodigit[]={"","ten","eleven","tweleve","thirteen","fourteen","fivteen","sixteen","seventeem","eightteen","ninteen"};
        int x =  num%10;


        System.out.println("number to word is "+onedigit[x]);
    }*/

    /// number of day in month

    public static void main(String args[])
    {
       Num_day_Month();
       Num_day_Month();
       Num_day_Month();
    }
    public static void Num_day_Month()
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter The Month Name");
        System.out.println("1.Jan \n2.Feb \n3.Mar \n4.Apr \n5.May \n6.June \n7.July  \n8.Aug \n9.Sept \n10.Oct \n11.nov \n12.Dec ");
        System.out.println("Select any one month");
        int mon=s.nextInt();
        switch (mon)
        {
            case 1:
                System.out.println(" Jan have 31 Day ");
                break;
            case 2:
                System.out.println(" Feb have 28 Day ");
                break;
            case 3:
                System.out.println(" March have 31 Day ");
                break;
            case 4:
                System.out.println(" April have 30 Day ");
                break;
            case 5:
                System.out.println(" May  have 30 Day ");
                break;
            case 6:
                System.out.println(" june  have 31 Day ");
                break;

            case 7:
                System.out.println(" july have 30 Day ");
                break;
            case 8:
                System.out.println(" Aug have 31 Day ");
                break;
            case 9:
                System.out.println(" September have 30 Day ");
                break;
            case 10:
                System.out.println(" Oct have 31 Day ");
                break;
            case 11:
                System.out.println(" Nov have 30 Day ");
                break;
            case 12:
                System.out.println(" Dec have 31 Day ");
                break;
            default:
                System.out.println(" No You Made Wrong choice Friend !!");
        }}
}
