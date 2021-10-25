package Autoboxing;

import java.util.ArrayList;

public class Autoboxing {
    /*
    *   this conceot fully applied on Arraylist
    * */
    public static void main(String ad[])
    {
        String[] StringArray=new String[10];
        int[] IntArray=new int[10];
        ArrayList<String> MyArrayList=new ArrayList<>();
        //ArrayList<int> IntArrayList=new ArrayList<int>() //
        // we cant create Arraylist of Primitive type like int ,double ,float

        // For this we need to Create Wrapper Class for
        // this like for integer.... We need to create integer class (MyIntger)

      //  ArrayList<MyIntger> IntArraylist=new ArrayList<>();//
        //  so like this for int class and for another type of class

        Integer integer=new Integer(10);
        Double Mydouble=new Double(12.5);

        ArrayList<Integer> MyIntList=new ArrayList<>();

        for (int i=0;i<10;i++)
        {
            MyIntList.add(i);
           // MyIntList.add(Integer.valueOf(i)); // valueOf it add value in integer class   // it also called Autoboxing
            // because here we convert primitive type to Class type value
        }
        for (int i=0;i<10;i++)
        {
            System.out.println((i+1)+" ---->"+MyIntList.get(i));
            /*
            System.out.println((i+1)+" ---> "+MyIntList.get(i).intValue());*/
        }
        Integer MyIntValue=50; // Integer.valueOf(50) // Primitive type to Class type
        int IntegerValue=MyIntValue; // MyIntValue.intValue() // Class type to Primitive type

        ArrayList<Double> MyDoubleList=new ArrayList<>();
        for (double i=0;i<10;i+=0.5)
        {
            MyDoubleList.add(i); // Autoboxing // Double.valueOf(i)
        }
        for (int i=0;i<10;i++)
        {
            System.out.println((i+1)+" --> "+MyDoubleList.get(i).doubleValue());
        }
    }

    class MyIntger{
        private int value=20;

        public MyIntger(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
