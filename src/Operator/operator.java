package Operator;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class operator {
    public static void main(java.lang.String args[])
    {
        int result=100+200;
        System.out.println(result);

        result=result-2;
        System.out.println(result);

        result=result/2;
        System.out.println(result);

        int a=4;
        int b=3;
        int c=a%b;
        System.out.println(c);
        result=+2;
        System.out.println(result);
        result-=2;
        System.out.println(result);
        result*=2;
        System.out.println(result);
        boolean iscar=false;
       if(iscar) // it means true okay
       {
           System.out.println("you have car ");
       }
       boolean wascar=iscar ? true:false;
       if(wascar)
       {
           System.out.println("this is not possible ");
       }
        double d1=45.04;
        double d2=78.45;
        double total=(d1+d2)*25;
        double rem=total%40;
        System.out.println("reminder is :"+rem);
        if(rem>=3|| rem<=45)
        {
            System.out.println("this is the limit");
        }

    }

}
