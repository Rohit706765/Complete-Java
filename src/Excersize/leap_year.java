package Excersize;

import java.util.Scanner;
public class leap_year {
    //leap year checker
    /*
            public static void main(String args[])
            {
                int year=2011;
                System.out.println(" Leap year Checker !!");
                if((year%400==0)||(year%4==0)&&(year%100!=0))
                {
                    System.out.println("year is leap year ");
                }
                else
                {
                    System.out.println(" year is not leap");
                }
            }*/
    //MB converter

    /*public static void main(String args[])
    {
        int mb=5;
        int kb=1024;
        System.out.println("Mb to kb !!");
        int tMb=mb*kb;
        System.out.println("total KB Was "+tMb+" KB");
    }*/

    // Cat playing code is here

    /*public static void main(String args[]) {
        System.out.println("check here CAt is playing or not !!");
        boolean check=Iscatplay(true,45);
        System.out.println("Is Cat play Right now True || false ---->"+check);
    }
    public static boolean Iscatplay(boolean summer,int temp)
    {
        if(summer==true)
        {
            if(temp>=25 && temp<=45)
            {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(temp>=25 && temp<=35)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }*/

    // MINUTE TO HOUR ,YEAR DAY CONVERTER


    public static void main(String args[])
    {
        int min;
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter Minute Now ** ");
        min=input.nextInt();
       converter(min);

    }
    public static void converter(int minute)
    {
        if(minute>=0)
        {
            int hour=minute/60;
            int day=hour/24;
            int year=day/365;
            day=day%365;
            System.out.println("Minute == "+minute+" hour =="+hour+" year == "+year+" day == "+day);
        }
        else
        {
            System.out.println("invalid time");
        }
    }

    // eqaulify printer

    /*public static void main(String args[])
    {
        equalify(1,2,3);
        equalify(1,1,1);
    }
    public static void equalify(int a,int b,int c)
    {
        if(a<0 && b<0 && c< 0)
        {
            System.out.println("Not enter invalid value !!");
        }
        else if(a==b && a==c && b==c)
        {
            System.out.println("all number is equal ");
        }
        else
        {
            System.out.println(" All number is Different");
        }
    }*/
}
