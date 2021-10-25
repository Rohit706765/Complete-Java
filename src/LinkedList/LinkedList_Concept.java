package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList_Concept {
    public static void main(String[] args) {

        LinkedList<String> city=new LinkedList<>();
        addInOrder(city,"surat");
        addInOrder(city,"Aanad");
        addInOrder(city,"Bamroli gav");
        addInOrder(city,"Bharuch");

        printcity(city);
        visit(city);
    }
    public static void printcity(LinkedList<String> city)
    {
        ListIterator<String> i=city.listIterator();
        while (i.hasNext())
        {
            System.out.println("City Visit ---> "+i.next());
        }
    }
    public static boolean addInOrder(LinkedList<String> city,String newCity)
    {
        ListIterator<String> i=city.listIterator();
        while (i.hasNext())
        {
            int compare=i.next().compareTo(newCity);
            if (compare==0)
            {
                System.out.println(newCity+" city already exist ");
                return false;
            }
            else if(compare>0)
            {
                i.previous(); // because we already move to the next entry
                i.add(newCity);
                return true;
            }
            else if(compare<0)
            {
                // because we already move to the next record so not to apply any code here

            }
        }
        city.add(newCity);
        return true;
    }
    public static void visit(LinkedList<String> city)
    {
        Scanner s=new Scanner(System.in);
        boolean quit=false;
        ListIterator<String> visitCity=city.listIterator();
        if (city.isEmpty())
        {
            System.out.println("no city for visit ");
            return;
        }
        else {
            System.out.println("You are visiting now "+visitCity.next());
            printmenu();
        }
        while (!quit)
        {
            int choice=s.nextInt();
            s.nextLine();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    if(visitCity.hasNext()) {
                        System.out.println("Next city is " + visitCity.next());
                    }
                    else {
                        System.out.println("You are reached at the end ");
                    }
                    break;
                case 2:
                    if (visitCity.hasPrevious()) {
                        System.out.println("previous city is " + visitCity.previous());
                    }
                    else {
                        System.out.println("You are at the begining ");
                    }
                        break;
            }
        }
    }
    public  static void printmenu()
    {
        System.out.println("press");
        System.out.println("0. holiday over ");
        System.out.println("1. Next city ");
        System.out.println("2. previous city  ");
        System.out.println();
        System.out.println("choose your option   ");
    }
}
