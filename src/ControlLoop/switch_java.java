package ControlLoop;

import java.util.Scanner;

public class switch_java {/*
    public static void main(String arr[]) {
        System.out.println(" Check your string here ");
        String FoundAlpha = "b";
         FoundAlpha = "B";

        switch (FoundAlpha)
        {
            case "a": case "A":
                System.out.println(" your Alphabet is "+FoundAlpha);
                break;
            case "b": case "B": case "c" :case "C": case "D": case "d": case "e" : case "E": case "g": case "G":
            System.out.println(" your Alphabet is "+FoundAlpha);
            break;

            default:
                System.out.println(" Sorry nothing Alphabet is found here ");
                break;

        }
    }*/

    //  calculator is here
    /*public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        double  a=0 ,b=0 ,sum=0;
        int op=0;
        System.out.println(" Calculator is here ");
        System.out.println(" choese any value here ");
        System.out.println("1 For "+" + (plus)");
        System.out.println("2 For "+" - (minus)");
        System.out.println("3 For "+" / (divide)");
        System.out.println("4 For "+" % (modulos)");
        System.out.println("5 For "+" * (multiply )");
        System.out.println(" enter first value :");
        a=sc.nextDouble();
        System.out.println(" enter Second value :");
        b=sc.nextDouble();
        System.out.println(" Select your operator :");
        op=sc.nextInt();

        switch (op)
        {
            case 1:

                sum=a+b;
                System.out.println(" input is "+sum);
                break;
            case 2:
                sum=a-b;
                System.out.println(" input is "+sum);
                break;
            case 3:
                sum=a/b;
                System.out.println(" input is "+sum);
                break;
            case 4:
                sum=a%b;
                System.out.println(" input is "+sum);
                break;
            case 5:
                sum=a*b;
                System.out.println(" input is "+sum);
                break;
            default:
                System.out.println(" Sorry  May be choose wrong operator ");
                break;

        }
    }*/

   /* public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        String s="";

        System.out.println(" enter your name ");
        s=sc.nextLine();

        int option=0;
        System.out.println(" String function is here ");
        System.out.println(" 1. lowercase ");
        System.out.println(" 2. uppercase ");
         System.out.println(" Enter your option here ");
        option=sc.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(s.toLowerCase());
                break;
            case 2:
                System.out.println(s.toUpperCase());
                break;
            default:
                System.out.println(" no option is here ");
                break;

        }
    }*/
    // day of week challenge

    public static void main(String a[])
    {
        Scanner val=new Scanner(System.in);
        int day=0;
        String y="";
        System.out.println(" Enter value and for Monday...Sunday  ");
        System.out.println(" 0 For sunday And limit goes to 6 ");
        day=val.nextInt();
        switch (day)
        {
            case 0:
                System.out.println(" Hey Today is Sunday  ");
                System.out.println(" Relax day okay !!");
                break;
            case 1:
                System.out.println(" Hey Today is Monday  ");
                System.out.println(" Work time will be active !!");
                break;
            case 2:
                System.out.println(" Hey Today is Tuesday  ");
                System.out.println(" Work time will be active !!");
                break;
            case 3:
                System.out.println(" Hey Today is wednesday  ");
                System.out.println(" Work time will be active !!");
                break;
            case 4:
                System.out.println(" Hey Today is Thursday  ");
                System.out.println(" Work time will be active !!");
                break;

            case 5:
                System.out.println(" Hey Today is Friday  ");
                System.out.println(" Work time will be active !!");
                break;

            case 6:
                System.out.println(" Hey Today is Satuday  ");
                System.out.println(" Hey Night party waitting for u && weekend is near !!");
                break;
            default:
                System.out.println(" Set your perfect time and then refresh okay !!");
                System.out.println(" I hope u will understand");
                y=val.next();
                if(y.equals("yes"))
                {
                    break;
                }
                else
                {
                    System.out.println(" sorry Refresh it or Exit from this system ");
                }
        }

    }
}
