package LinkedList.Excersize;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class dataList {

    static int cnt;

    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();

        System.out.println("Linked list concept is here ");

        addInOrder(data, "rohit");
        addInOrder(data, "aman");
        addInOrder(data, "aj");
        addInOrder(data, "a");
        addInOrder(data, "babu");
        addInOrder(data, "satish");
        addInOrder(data, "ramesh");

        printList(data);
        vistingCity(data);

    }

    public static boolean addInOrder(LinkedList<String> unSorted, String newName) {
        ListIterator<String> li = unSorted.listIterator();
        while (li.hasNext()) {
            int compare = li.next().compareTo(newName);

            if (compare == 0) {
                System.out.println(newName + " is already added ");
                return false;

            } else if (compare > 0) {
                li.previous();
                li.add(newName);
                return true;
            } else if (compare < 0) {
                // nothing to do here because we already moved
            }
        }
        li.add(newName);
        return true;
    }

    public static void printList(LinkedList<String> data)
    {
        System.out.println("size of list " + data.size());
        for (String datum : data)
        {
            ++cnt;
            System.out.println("#" + cnt + ". " + datum);
        }
    }

    public static void vistingCity(LinkedList<String> city) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> newCity = city.listIterator();
        if (city.isEmpty()) {
            System.out.println("No Favourite Country in list ");
            return;
        }
        else {
            System.out.println("Now Visting " + newCity.next());
            printMenu();
        }

        while (!quit) {
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Package is Over Now !");
                    quit = true;
                    break;
                case 1:
                    if (newCity.hasNext()) {
                        System.out.println("Next Name is " + newCity.next());
                    } else {
                        System.out.println("we are at the end ");
                    }
                    break;
                case 2:
                    if (newCity.hasPrevious()) {
                        System.out.println("Previous Name is " + newCity.previous());
                    } else {
                        System.out.println("we are reached at the begining ");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Mismatch in input");
                    break;
            }
        }
    }
    public static void printMenu() {
        System.out.println("Available city ");
        System.out.println("0 - quit \n" + "1 - Next City \n" + "2 - Previous City " + "3 - Print Menu ");
    }
}
