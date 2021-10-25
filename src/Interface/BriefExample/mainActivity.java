package Interface.BriefExample;

import Interface.BriefExample.interfaceCon.Isavable;

import java.util.ArrayList;
import java.util.Scanner;

public class mainActivity {
    public static void main(String[] args) {

        ReadChallenge rohit = new ReadChallenge("rohit",45,15);
        System.out.println(rohit.toString());
        SaveObject(rohit);
        rohit.setName("kajal");
        SaveObject(rohit);
        loadObject(rohit);
    }

    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();
        int index = 0;
        boolean quit= false;
        int action = - 1;
        printCommand();
        Scanner s = new Scanner(System.in);
        while (!quit)
        {
            printCommand();
            System.out.println("Enter Action ");
            action = s.nextInt();
            switch (action)
            {
                case 0:
                    quit =true;
                    break;
                case 1:
                    System.out.println("enter String ");
                    String newString = s.next();
                    values.add(index,newString);
                    index++;
                    break;
                default:
                    System.out.println("wrong choice ");
                    break;
            }
        }

        return values;
    }
    public static void printCommand()
    {
        System.out.println("choose action "+'\n'+"0. quit "+'\n'+"1. Enter String ");
    }
    public static void SaveObject(Isavable data)
    {
        for (int i=0;i<data.writeValue().size();i++)
        {
            System.out.println("Saving "+data.writeValue().get(i)+" in storage medium ");
        }
    }
    public static void loadObject(Isavable loadData)
    {
        ArrayList<String> newDAta = readValues();
        loadData.readValue(newDAta);
    }

}
