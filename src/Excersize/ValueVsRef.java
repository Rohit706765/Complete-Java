package Excersize;

import java.util.Arrays;

public class ValueVsRef {
    public static void main(String ar[])
    {
         int MyIntValue=10;
         int AnotherIntValue=MyIntValue;// value type
        System.out.println("MyintValue is ="+MyIntValue);
        System.out.println("AnotherIntValue is ="+AnotherIntValue);

        ++AnotherIntValue;

        System.out.println(" After change MyintValue is ="+MyIntValue);
        System.out.println(" After Change AnotherIntValue is ="+AnotherIntValue);

        int[] MyIntArray=new int[5];
        int[] AnotherIntArray=MyIntArray; //Reference type Actually it hold its Address so when we try to update it then it
        // Automatically Updated

        System.out.println("MyIntArray "+Arrays.toString(MyIntArray));// this function print entire array
        System.out.println("AnotherIntArray "+Arrays.toString(AnotherIntArray));

        AnotherIntArray[0]=10;

        System.out.println("After Change MyIntArray "+Arrays.toString(MyIntArray));// this function print entire array
        System.out.println("After Change AnotherIntArray "+Arrays.toString(AnotherIntArray));

        ModifyMyArray(AnotherIntArray);


        System.out.println("After ModifyArray MyIntArray "+Arrays.toString(MyIntArray));// this function print entire array
        System.out.println("After ModifyArray AnotherIntArray "+Arrays.toString(AnotherIntArray));

    }
    public static int[] ModifyMyArray(int a[])
    {
        a[0]=20;
        a=new int[]{1,2,3,4,5}; // Derefercing

        return a;
    }

}
