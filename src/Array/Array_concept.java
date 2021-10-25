package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
    /*
    *   this code show the advantage of Arraylist
    *   this code show the disadvantage of Array 
    * */

import java.util.Scanner;

public  class Array_concept
{
    private static Scanner s=new Scanner(System.in);
    private static int[] a;

    public static void main(String[] args) {
        System.out.println("how many element you want to enter in array ");
        int number=s.nextInt();
        int[] MyArray=getInteger(number);
        printArray(MyArray);
        int[] NewArray;
        NewArray=ResizeArray(MyArray);

        printArray(NewArray);
    }
    public static int[] getInteger(int number)
    {   a=new int[number];
        for (int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        return a;
    }
    public static void printArray(int Myarray[])
    {
        System.out.println("Array Element ");
        for (int i=0;i<Myarray.length;i++)
        {
            System.out.println((i+1)+". "+Myarray[i]);
        }
    }
    public static int[] ResizeArray(int[] MyArray)
    {
        int[] b=MyArray;
        MyArray=new int[12];
        MyArray[10]=10;
        MyArray[11]=11;
        return MyArray;
    }
}
    /*
    *   in this program we will reverse the Array
    *   like if we have [1 2 3 4 5]
    *   so we can reverse it [5 4 3 2 1 ]
    * */
  /* public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("how many element you want in array ");
        int len=s.nextInt();

        int[] MyArray=new int[len];
        System.out.println("Enter "+len+" in Array ");
        for (int i=0;i<MyArray.length;i++)
        {
            MyArray[i]=s.nextInt();
        }
        int[] ReverserdArray=new int[len];
        ReverserdArray=reverseArray(MyArray);
        printArray(ReverserdArray);
    }
    public static void printArray(int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.println((i+1)+". "+a[i]);
        }
    }
    public static int[] reverseArray(int MyArray[])
    {
        int halfLength=MyArray.length/2;
        int MaxIndex=MyArray.length-1;
        for (int i=0;i<halfLength;i++)
        {
            int temp=MyArray[i];
            MyArray[i]=MyArray[MaxIndex-i];
            MyArray[MaxIndex-i]=temp;
        }
        return MyArray;
    }*/




























/*
public class Array_concept
{
    */
/*
    *   In this code we find min element in Array
    * *//*

    private static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many element you want in array ");
        int number=s.nextInt();
        int[] MyArray=new int[number];
        MyArray=readInteger(number);

        int[] sortArray=new int[number];
        sortArray=findMin(MyArray);

        printArray(sortArray);
    }
    public static void printArray(int[] sort)
    {
        System.out.println("element is here ");
        for (int i=0;i<sort.length;i++)
        {
            System.out.println((i+1)+". "+sort[i]);
        }
        System.out.println("Minimum value in Array is "+sort[0]+" in Between "+ Arrays);
    }
    public static int[] findMin(int[] MinArray)
    {
        boolean flag=true;
        while (flag) {
            int temp = 0;
            flag=false;
            for (int i = 0; i < MinArray.length - 1; i++) {
                if (MinArray[i] > MinArray[i + 1]) {
                    flag=true;
                    temp = MinArray[i];
                    MinArray[i] = MinArray[i + 1];
                    MinArray[i + 1] = temp;
                }
            }
        }
       return MinArray;
    }
    public static int[] readInteger(int a)
    {
        int[] MyIntArray=new int[a];
        System.out.println("Enter element in array ");
        for (int i=0;i<MyIntArray.length;i++)
        {
            MyIntArray[i]=s.nextInt();
        }
        return MyIntArray;
    }


}
*/
    /*
    *   this function sort array of element
    *   it contain getinteger(), printArray(), Sortinteger();
    *   getInteger() // read how many value user want to enter in array
    *   printArray() it print array element
    *   sortIntger() // it sort Array element
    *
    * */

    /*private static Scanner s=new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("how many element you want in array");
        int NumberOfElement=s.nextInt();

        int[] MyArray= new int[NumberOfElement];
        MyArray=getIntger(NumberOfElement);

        printArray(MyArray);
        int[] sortArray=new int[NumberOfElement];
        sortArray=SortArray(MyArray);

        System.out.println("Sorted Array element is ");
        printArray(sortArray);
    }
    public static int[] SortArray(int[] b)
    {
        int[] Sort=new int[b.length];
        for(int i=0;i<Sort.length;i++)
        {
            Sort[i]=b[i];
        }
        int temp=0;
        int cnt=0;
        boolean flag=true;
        while (flag) {
            ++cnt;
            System.out.println("Number of time function called "+cnt);
            flag=false;
            for (int i = 0; i < Sort.length-1; i++) {
                System.out.println("value of i "+i);
                if (Sort[i] < Sort[i + 1]) {
                    flag=true;
                    temp = Sort[i];
                    Sort[i] = Sort[i + 1];
                    Sort[i + 1] = temp;
                }
            }
        }
        return Sort;
    }
    public static void printArray(int[] a)
    {
        System.out.println("Element in Array ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println((i+1)+". "+a[i]);
        }
    }
    public  static int[] getIntger(int a)
    {
        int[] MyArray=new int[a];
        System.out.println("Enter element in Array ");
        for (int i=0;i<MyArray.length;i++)
        {
            MyArray[i]=s.nextInt();
        }
        return MyArray;
    }
}
*/
        /*
            this function show how to pass Array as parameter
        *
        * */
/*
import java.util.Scanner;

public class Array_concept
{
    private  static Scanner s=new Scanner(System.in);
    private static int[] a=new int[10];

    public static void main(String[] args)
    {
        System.out.println("Array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        printArray(a);
    }
    public static void printArray(int[] a)
    {
        System.out.println("Array component is here ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println((i+1)+". "+a[i]);
        }
    }
}

*/
