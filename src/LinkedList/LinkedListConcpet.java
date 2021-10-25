package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

        /*
        *       Linked List Concept used here
        *       Just look this program and you will get understand about linkedlist
        * */
public class LinkedListConcpet {
    private static LinkedList<String> city=new LinkedList<>();
    public static void main(String[] args)
    {/*
        city.add("surat");
        city.add("navsari");
        city.add("vapi");
        city.add("valsad");
        city.add("rajkot");*/
        AddInOrder(city,"Aanad");
        AddInOrder(city,"surat");
        AddInOrder(city,"Daman");
        showRecord(city);
        Visit(city);
    }
    public static void showRecord(LinkedList<String> record)
    {
        ListIterator<String> Record=record.listIterator();
        while (Record.hasNext())
        {
            System.out.println("City--->"+Record.next());
        }
    }
    public static boolean AddInOrder(LinkedList<String> linkedList ,String CityName)
    {
        ListIterator<String> listIterator=linkedList.listIterator();
        // linkedList.listIterator() it simply fatch all Record from Linkedlist
        while (listIterator.hasNext())
        {
            int Compare=listIterator.next().compareTo(CityName); // 0 Means Match and Greather than >0 Means Alphabatically greater value...
            // <0 means move to next record
            if(Compare==0)
            {
                System.out.println(CityName+" is Already in your Destination city ");
                return false;
            }
            else if(Compare>0)
            {
                // this is work when surat is already exist but you entered Navsari as city then it Automatically change its position
                listIterator.previous();
                listIterator.add(CityName);
                return true;
            }
            else if(Compare<0)
            {
                // move to next record but we Already move to next record
            }
        }
        listIterator.add(CityName);
        return true;
    }
    public static void Visit(LinkedList<String> city)
    {
        Scanner s=new Scanner(System.in);
        ListIterator<String> listIterator=city.listIterator();
        if(city.isEmpty()) // for integer and double value city.getFirst()==""
        {
            System.out.println("No City Found As Destination City ");
            return;
        }
        else {
            System.out.println("Now Visiting City "+listIterator.next()+"\n");
            printMenu();
        }
        int choice;
        boolean quit=false;
        boolean GoingForward=true;

        while (!quit)
        {
            System.out.println("Enter Choice");
            choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Holiday Vacation is over ");
                    quit=true;
                    break;
                case 2:
                    if(!GoingForward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        GoingForward=true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now Visting "+listIterator.next());
                    }
                    else {
                        System.out.println("We are Reached to end of the city ");
                        GoingForward=false;
                    }
                    break;
                case 3:
                    if(GoingForward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        GoingForward=false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now Visiting "+listIterator.previous());
                    }
                    else {
                        System.out.println("We Are Reached At the Starting of the city ");
                        GoingForward=true;
                    }
                    break;
                case 4:
                    printMenu();
                    break;
                default:
                    System.out.println("Mistmatch in choice ");
                    break;
            }
        }
    }
    public static void printMenu()
    {
        System.out.println("\t 1. Holiday Is Over Now , I Can't Go");
        System.out.println("\t 2. My Next Destination City ");
        System.out.println("\t 3. My Previous Destination City ");
        System.out.println("\t 4. Print Menu");
    }
}
