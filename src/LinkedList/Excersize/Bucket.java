package LinkedList.Excersize;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Bucket {

    //TODO create bucket and add the your food
    // check your next and previous food
    // traversing your food
    // add in alphabetic order to new Food


   static LinkedList<FoodModel> favouriteFood;
   static int cnt = 0;


   public static void main(String[] args) {

       favouriteFood = new LinkedList<>();
       addFood(favouriteFood,"palak panner",108.23);
       addFood(favouriteFood,"shai panner",200.23);
       addFood(favouriteFood,"shev panner",350.23);

       showOrderFood(favouriteFood);

    }
    public static boolean addFood(LinkedList<FoodModel> food,String name,double price)
    {
        ListIterator<FoodModel> foodlist = food.listIterator();
        while (foodlist.hasNext())
        {
            foodlist.next();
            foodlist.add(new FoodModel(name,price));
            return true;
        }
        if (food.size()==0)
        {
            foodlist.add(new FoodModel(name,price));
            return true;
        }
        return false;
    }
    public static void showOrderFood(LinkedList<FoodModel> food)
    {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int action ;
        ListIterator<FoodModel> foodlist = food.listIterator();
        while (foodlist.hasNext())
        {
            ++cnt;
            System.out.println("#"+cnt+". "+foodlist.next());
        }

        while (!quit)
        {
            printMenu();
            System.out.println("enter Your Action ");
            action = s.nextInt();

            switch (action)
            {
                case 0:
                    System.out.println("food list is over ");
                    quit =true;
                    break;
                case 1:
                    if (!forward)
                    {
                        if (foodlist.hasNext())
                        {
                            foodlist.next();
                        }
                        forward = true;
                    }
                    if (foodlist.hasNext())
                    {
                        System.out.println("food is "+foodlist.next());
                    }
                    else
                    {
                        System.out.println("we are reached at the end of the list ");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward)
                    {
                        if (foodlist.hasPrevious())
                        {
                            foodlist.previous();
                        }
                        forward = false;
                    }
                    if (foodlist.hasPrevious())
                    {
                        System.out.println("food is "+foodlist.previous());
                    }
                    else
                    {
                        System.out.println("We are at the beginig ");
                        forward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("wrong input type ");
                    break;
            }
        }
    }
    public static void printMenu()
    {
        System.out.println("0. exit ");
        System.out.println("1. Next Food  ");
        System.out.println("2. Previous Food ");
        System.out.println("3. Print Menu  ");
    }
}
/*
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LinkedList<String> myBucket = new LinkedList<>();
        int numberOfItem;

        System.out.println("How much item you Want to add in your bucket  ");
        numberOfItem = s.nextInt();

        for (int i =0 ;i<numberOfItem;i++)
        {
            System.out.println("Enter New item name ");
            String newName = s.next();

            addInOrder(myBucket,newName);
        }

        showBucket(myBucket);

    }
    public static void showBucket(LinkedList<String> showMyBucket)
    {
        Scanner s = new Scanner(System.in);
        boolean quit = false;

        ListIterator<String> listIterator = showMyBucket.listIterator();

        if (showMyBucket.isEmpty())
        {
            System.out.println("No item in your bucket ");
            return;
        }
        else
        {
            System.out.println("Next Item is "+listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = s.nextInt();

            switch (action)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext())
                    {
                        System.out.println("your next item "+listIterator.next());
                    }
                    else
                    {
                        System.out.println("we are reached at the end ");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("your previous item "+listIterator.previous());
                    }
                    else
                    {
                        System.out.println("we are reached at the end ");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("wrong choice ");
                    break;
            }
        }

    }
    public static void printMenu()
    {
        System.out.println("0 - to exit \n"+"1 - next item \n"+"2 - previous Item "+"3 - print menu ");
    }
    public static boolean addInOrder(LinkedList<String> myBucket,String newItem)
    {
        ListIterator<String> listIterator = myBucket.listIterator();
        while (listIterator.hasNext())
        {
            int compare = listIterator.next().compareTo(newItem );

            if (compare==0)
            {
                System.out.println(newItem+" item is already added ");
                return false;
            }
            else if (compare>0)
            {
                listIterator.previous();
                listIterator.add(newItem);
                return true;
            }
            else if(compare<0)
            {
                // nothing to do
            }
        }
        listIterator.add(newItem);
        return true;
    }*/