package Interface.BriefExample;

import Interface.BriefExample.interfaceCon.IStroageMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrocerryAcitvity {

    public static void main(String[] args) {
        Grocerry  rohit = new Grocerry(1,"table",1500);
        System.out.println(rohit.toString());
        saveObject(rohit);
        loadObj(rohit);

    }
    public static void saveObject(IStroageMedium storage)
    {
        for (int i = 0;i<storage.writeValue().size();i++)
        {
            System.out.println("Storing "+storage.writeValue().get(i)+" in the storage Medium ");
        }
    }
    public static void loadObj(IStroageMedium stroageMedium)
    {
        List<String> data = readValues();
        stroageMedium.readValue(data);
    }
    public static List<String> readValues()
    {
        List<String> newData = new ArrayList<>();;
        int action = -1, index = 0;
        boolean quit =false;
        System.out.println("0. Exit "+'\n'+"1. Enter String ");

        Scanner s = new Scanner(System.in);
        while (!quit)
        {
            System.out.println("choose your Action ");
            action =  s.nextInt() ;
            switch (action)
            {
                case 0:
                    quit = true;
                break;
                case 1:
                    System.out.println("enter a String ");
                   String data = s.next();
                   if (!(data.isEmpty()) && data!=null)
                   {
                        newData.add(index,data);
                        ++index;
                   }
                   break;
                default:
                    System.out.println("Wrong choice ");
                    break;
            }
        }
        return newData ;
    }
}
