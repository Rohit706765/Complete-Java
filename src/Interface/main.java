package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Player rohit=new Player("rohit",12,100);
        SaveObject(rohit);

        ISavable monster=new Monster("ben-ten",15,100);
        System.out.println(((Monster )monster).getHealth()); // casting is here
        SaveObject(monster);

        LoadObject(monster);

        System.out.println(monster.toString());

    /*    System.out.println(rohit.toString());
        LoadObject(rohit);
        System.out.println(rohit.toString());*/
    }
    public static List<String> readValue()
    {
        List<String> value=new ArrayList<>();
        boolean quit=false;
        int choice;
        int index=0;
        Scanner s=new Scanner(System.in);
        while (!quit)
        {
            System.out.println("0. exit");
            System.out.println("1. enter String ");
            System.out.println("Enter choice ");
            choice=s.nextInt();
            s.nextLine();
            switch (choice)
            {
                case 0:
                    System.out.println("exit ");
                    quit=true;
                    break;
                case 1:
                    System.out.println("enter String ");
                    String Myvalue=s.nextLine();  // because it is best when you dont know which type of value will be enter
                    value.add(index,Myvalue);
                    ++index;
                    break;
                default:
                    System.out.println("Mismatch in choice ");
                    break;

            }
        }
        return value;
    }

    public static void SaveObject(ISavable iSavable)
    {
       // List<String> Mylist=iSavable.write();

        for (int i=0;i<iSavable.write().size();i++)
        {
            System.out.println("Saving "+iSavable.write().get(i)+" on storage device ");
        }
    }

    public static void LoadObject(ISavable iSavable)
    {
        List<String> mylist=readValue();
        iSavable.read(mylist);

    }


}
