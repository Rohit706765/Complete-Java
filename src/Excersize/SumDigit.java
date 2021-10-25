package Excersize;

import java.util.Scanner;

public class SumDigit {

    public static void main(String ar[])
    {
        System.out.println(SumDigt());
        System.out.println(SumDigt());
    }
    public static int SumDigt()
    {
        int len=0, temp=0, Number,Sum=0;
        String TempNum="";
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter A Number");
        TempNum=s.next();
        len=TempNum.length();

        Number=Integer.parseInt(TempNum);
        int[] MyArray=new int[len];
        for (int i=0;i<len;i++)
        {
            while (Number>0)
            {
                temp=Number%10;
                MyArray[i]=temp;
                Sum+=MyArray[i];
                Number/=10;
            }
        }
        return Sum;
    }

}
