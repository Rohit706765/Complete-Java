package Array.ArrayDetails;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcersize {
    public static void main(String Ar[]) {
        System.out.println("enter Array element here ");
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for (int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
            ReverseArray(a);
    }
    public static void ReverseArray(int a[])
    {
        System.out.println("Reverse Element is here ");
        int temp=0;
        int MaxIndex=a.length-1;
        int halfLength=a.length/2;
        for (int i=0;i<halfLength;i++)
        {
            temp=a[i];
            a[i]=a[MaxIndex-i];
            a[MaxIndex-i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
        /*
        *   this method reverse Array element (Swapping method)   {1,2,3,4,5} after Reverse {5,4,3,2,1}
        * */
        /*int IntArray[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Element ");
        for (int i=0;i<IntArray.length;i++)
        {
            IntArray[i]=s.nextInt();
        }
        Reverse(IntArray);
    }
    public  static void Reverse(int a[])
    {
        int temp=0;
        int MaxIndex=a.length-1;
        int HalfLength=a.length/2;
        System.out.println("Reverse Array Element ");
        for(int i=0;i<HalfLength;i++)
        {
            temp=a[i];
            a[i]=a[MaxIndex-i];
            a[MaxIndex-i]=temp;
        }
        System.out.println("Reverse Array Element is "+Arrays.toString(a));
    }
}*/
        /*
        *  Reverse Array element code is here (For kid only )
        *
        *
        int cnt=0;
        Scanner s=new Scanner(System.in);
        System.out.println("How Many Element You Enter in Array ");
        cnt=s.nextInt();
        int ArrayInt[]=ReadInteger(cnt);
        ReverseArray(ArrayInt);
    }
    public static void ReverseArray(int a[])
    {
        System.out.println("Before Reverse Array Element is ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("After Reverse Array Element is ");
        for (int i=a.length-1;i>=0;i--)
       {
            System.out.println(a[i]);
        }


    }
    public static int[] ReadInteger(int cnt){
        int[] MyIntArray=new int[cnt];
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter Array element here ");
        for(int i=0;i<MyIntArray.length;i++)
        {
            MyIntArray[i]=s.nextInt();
        }
        return MyIntArray;
    }
}*/
        /*
        *       Minimum element challenge is here
        *
        int cnt=0;
        Scanner s=new Scanner(System.in);
        System.out.println("How Many Element you want to enter in array ");
        cnt=s.nextInt();
        int[] IntArray=ReadInteger(cnt);
        System.out.println("Array element is here ");
        System.out.println("Element is Array "+Arrays.toString(IntArray));
        System.out.println("Minimum Element list is here ");
        int[] MinArray=FindMin(IntArray);
        System.out.println("Minimum element in Array "+Arrays.toString(MinArray));
    }
    public  static int[] FindMin(int a[])
    {
        boolean flag=true;
        int[] MinElement=new int[a.length];
        for (int i=0;i<MinElement.length;i++)
        {
            MinElement[i]=a[i];
        }
        while (flag)
        {
            // index 0 element 135
            // index 1 element 120
            int temp=0;
            flag=false;
            for(int i=0;i<MinElement.length-1;i++)
            {
                if(MinElement[i]>MinElement[i+1])
                {
                    flag=true;
                    temp=MinElement[i];
                    MinElement[i]=MinElement[i+1];
                    MinElement[i+1]=temp;
                }
            }
        }

        return MinElement;

    }
    public static  int[] ReadInteger(int cnt)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter "+cnt+" Element in Array");
        int[] MyIntArray=new int[cnt];
        for (int i=0;i<MyIntArray.length;i++)
        {
            MyIntArray[i]=s.nextInt();
        }
        return MyIntArray;
    }

}*/
    /**
     *          this program sort the Array and pass the Array as Parameter and return Array;
     *          for showing entire Array you need to use System.out.println(Arrays.tostring(MyintArray));
     * ***/

       /* Scanner s=new Scanner(System.in);
        System.out.println("enter Value in array ");
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();

        }
        System.out.println("Enter Element in array ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("#"+i+" element is "+a[i]);
        }
        System.out.println('\n');
        System.out.println("Sorted Array Element is here");

        System.out.println("*****************************");
        
        int SortArray[]=sort(a);
        for(int i=0;i<SortArray.length;i++)
        {
            System.out.println(SortArray[i]);
        }
    }
    public static int[] sort(int[] a)
    {
        int[] UnsortedArray=new int[a.length];
        boolean flag=true;
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            UnsortedArray[i]=a[i];
        }
        while(flag){

            flag=false;

            for (int i=0;i<UnsortedArray.length-1;i++)
            {
                if(UnsortedArray[i]<UnsortedArray[i+1])
                {
                    flag=true;
                    temp=UnsortedArray[i];
                    UnsortedArray[i]=UnsortedArray[i+1];
                    UnsortedArray[i+1]=temp;
                }
            }
        }
        return UnsortedArray;
    }
}
*/
       /* int[] a=new int[5];
        Scanner s=new Scanner(System.in);

        System.out.println("enter A value in Array ");
        for(int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }
        int[] Sort=sort(a);

        System.out.println("sorting Array");
        for(int i=0;i<Sort.length;i++)
        {
            System.out.println(Sort[i]);
        }
    }
    public static int[] sort(int[] a){
        int[] UnsortArry=new int[a.length];
        for(int i=0;i<UnsortArry.length;i++)
        {
            UnsortArry[i]=a[i];
        }
        int temp;
        boolean flag=true;
        while(flag)
        {
            flag=false;
            for (int i=0;i<UnsortArry.length-1;i++)
            {
                if (UnsortArry[i]<UnsortArry[i+1])
                {
                    flag=true;
                    temp=UnsortArry[i];
                    UnsortArry[i]=UnsortArry[i+1];
                    UnsortArry[i+1]=temp;
                }
                System.out.println(UnsortArry[i]);
            }
        }

        return UnsortArry;
    }
}
*/