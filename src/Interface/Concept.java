package Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concept {

    public static void main(String[] args)
    {
        // converting Arraylist to Array

        ArrayList<String> number=new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");

        String[] Mynumber=number.toArray(new String[number.size()]);

        System.out.println(Arrays.toString(Mynumber));
        Mobile mobile=new Mobile(124);

        System.out.println(mobile.getClass().getSimpleName());

    }
}
        // converting Arraylist  to Arraylist

/*
    ArrayList<String> city=new ArrayList<>();
    ArrayList<String> visitedCity=new ArrayList<>();
        city.add("Surat");
                city.add("udhana");
                city.add("vapi");

                city.addAll(visitedCity); // how to copy one arraylist to another arraylist
                for (int i=0;i<visitedCity.size();i++)
        {
        System.out.println(visitedCity.get(i));
        }*/


    // converting Array to list

    /*
        int[] number={1,2,3,4,5,6,7};
        List<Integer> list=new ArrayList<>();

        System.out.println("Element in Arraylist ");
        for (int a:number)
        {
            list.add(a);
        }
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }*/

