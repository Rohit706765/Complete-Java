package Excersize;

import java.util.Scanner;
public class SoloDay1 {
    public static void main(String ar[])
    {
        /*int a=55;
        double b=55;
        String name="rohit";
        byte c=45;
        long e=78754545;
        boolean Student=true;
        float j=85;
        System.out.println("int "+a+" double "+b+" byte "+c+" long "+e+" Student"+Student);*/

       /* int sum=10000/5;
        System.out.println(sum);
        int sum1=sum/10;
        System.out.println(sum1);
        int sum2=sum1/6;
        double total=sum1/6;
        System.out.println("total value is "+sum2);
        System.out.println(total);*/

        /*int a=15,b=40;
        int total=b%a;
        System.out.println(" total is "+total);*/
//// increment operator
     /* int a=35;
      int b=38;
        System.out.println(b+=a);
        System.out.println(b-=a);
        System.out.println(b*=a);
        System.out.println(b/=a);
        System.out.println(b%=a);*/
        /*System.out.println(b++);
      c=--b+b--;
        System.out.println(c);

        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a+1);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a-1);*/
// operator

                /*int var1 = 7;
                int var2 = 3;
                int var3 = var2;//3
                int var4 = var2;
                int var7 = var2;//3
                int var5 = var1%(++var2);//3
                System.out.println(var1%(++var3));//3
                System.out.println(var1%++var7);//3
                System.out.println(var1%var4++);//1
                System.out.println(var4);//4
                System.out.println(var5);//3
                System.out.println(var5++);//3
                System.out.println(var5);//4
                System.out.println(++var5);//5
*/
        // String

       /* String s1="ROHIT";
        String s2="rohit";
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());*/
/*

        String Firstname="rohit";
        String LastName="singh";
        int age=19;
        System.out.println(" My first name is "+Firstname+" and Last name is "+LastName);
        System.out.println("I am "+age+" old");
        int year=29;
        System.out.println(" After "+ year);
        year+=age;
        System.out.println(" I will be "+year+" year old");
*/



        // Getting user input
/*
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter your name buddy ");
        System.out.println(s.nextLine());
        System.out.println(" Enter your sex type ");
        System.out.println(s.nextLine());*/

        /// Array

        String name[]={"rohit","kajal","sonal","mahesh","pardeep"};
        for(int i=0;i<5;i++)
        {
            System.out.println(" Hey Mr/Mrs "+name[i]);
        }
        // counting array length
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int ArrLength=num.length;// calculate a length and store in to variable
        System.out.println(" calculate array length ");
        for (int i=0;i<ArrLength;i++)
        {
            sum+=num[i];
            System.out.println("total length is "+sum);
        }
    }





}
