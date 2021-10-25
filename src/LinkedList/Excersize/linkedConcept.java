package LinkedList.Excersize;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedConcept {

    private static String name;
    private static LinkedList<String> product = new LinkedList<>();
    private static int action = -1;
    private static boolean quit = false;
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        print();

        while (!quit)
        {
            System.out.println("Enter Your Choice ");
            action = s.nextInt();
            switch (action)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter Product Name ");
                    String item  = s.next();
                    addInLinked(product,item);
                    break;
                case 2:
                    print();
                    break;
                default:
                    break;
            }
        }
    }
    public static void print()
    {
        System.out.println("0. Exit ");
        System.out.println("1. Enter a Product Name ");
        System.out.println("2. Print the command  ");
    }

    public static LinkedList<String> addInLinked(LinkedList<String> foodList, String foodName) {

        return null;
    }
}
