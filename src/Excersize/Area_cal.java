package Excersize;

import java.util.Scanner;

public class Area_cal {
    public static void main(String[] ar)
    {
        Scanner s=new Scanner(System.in);
        int choice=0;
        boolean flag=true;
        double width=0;
        double height=0;
        double sum=0,pi=3.14;
        System.out.println("Area Calculator is here ");
        System.out.println("1.Calculate Area of land ");
        System.out.println("2.Calculate Area of Triangle ");
        System.out.println("3.for continue ");
        System.out.println("4. Exit ");

        System.out.println(" Enter Number for contine ");
        choice=s.nextInt();
        if (choice==4)
        {
            exit();
        }
        while (flag)
        {
            switch (choice)
            {
                case 1:
                    System.out.println("enter width ");
                    width=s.nextDouble();
                    System.out.println("enter Height ");
                    height=s.nextDouble();
                    sum=width*height;
                    System.out.println("total length of room "+width+" * "+height+" is "+sum );
                    flag=false;
                    break;
                case 2:
                    System.out.println("enter width ");
                    width=s.nextDouble();
                    System.out.println("enter Height ");
                    height=s.nextDouble();
                    sum=width*height*pi;
                    System.out.println("total was "+sum);
                    flag=false;
                    break;
                case  3:
                    break;
                case 4:
                    exit();
                    flag=false;
                    break;
            }
        }
    }

    public  static void exit()
    {
        System.out.println(" You are Exit now ");
    }
}
