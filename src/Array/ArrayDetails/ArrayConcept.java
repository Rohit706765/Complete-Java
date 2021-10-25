package Array.ArrayDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayConcept {
    /*
    *    this code Explan you about Disadvantage of Array Compare to Arraylist and list
    * */
    private static  Arraylist Product=new Arraylist();
   private static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {

        boolean quit = false;
        boolean Repeat = true;

        System.out.println("Press---");
        printInstruction();
        while (Repeat) {

            while (!quit) {
                int choice = 1;
                System.out.println("Enter choice ");
                choice = s.nextInt();

                switch (choice) {
                    case 0:
                        printInstruction();
                        s.nextLine();
                        break;
                    case 1:
                        AddItem();
                        s.nextLine();
                        break;
                    case 2:
                        RemoveItem();
                        s.nextLine();
                        break;
                    case 3:
                        ChangeProduct();
                        s.nextLine();
                        break;
                    case 4:
                            SearchProduct();
                        s.nextLine();
                        break;
                    case 5:
                        Product.PrintList();
                        s.nextLine();
                        break;
                    case 6:
                        ProcessArrayList();
                        break;
                    case 7:
                        quit = true;
                        break;
                }
            }

            System.out.println("Do You Want To Repeat----->True/False");
            Repeat = s.nextBoolean();
        }
    }

    public static void printInstruction()
    {
        System.out.println("\t 0.Print Intstruction  ");
        System.out.println("\t 1.Add Item In List ");
        System.out.println("\t 2.Remove Item From List ");
        System.out.println("\t 3.Change Item From List ");
        System.out.println("\t 4. Search Item From List ");
        System.out.println("\t 5. Print List of Item ");
        System.out.println("\t 6. ProcessArrayList ");
        System.out.println("\t 7. Quit ");
    }
    public static void SearchProduct()
    {
        String FindProduct = "";
        System.out.println(" Search Product name ");
        FindProduct = s.next();
        Product.OnFile(FindProduct);

    }
    public static void ChangeProduct()
    {
        String ProductName = "";
        System.out.println("Enter Current Product Name ");
        ProductName = s.next();
        Product.Modify( ProductName);

    }
    public static void RemoveItem()
    {
        String ItemName;
        System.out.println("Enter Remove Item Name ");
        ItemName= s.next();
        Product.RemoveItem(ItemName);
    }
    public static void AddItem()
    {
        String item;
        System.out.println("Please Enter Item Name here ");
        item = s.next();
        Product.AddItem(item);
    }
    public static void ProcessArrayList()
    {
        ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(Product.getProductList()); // this is another way to copy one Arraylist to Another Array list
        for (int i=0;i<newArray.size();i++)
        {
            System.out.println(i+". "+newArray.get(i));
        }
        ArrayList<String> nextArray=new ArrayList<String>(Product.getProductList());// this is another way to copy one Arraylist to other Arraylist
        String[] myArray=new String[Product.getProductList().size()];
        myArray=Product.getProductList().toArray(myArray); // copy Arraylist to Array
    }
}

        /*
        Arraylist arraylist=new Arraylist();
        arraylist.AddItem("onion");
        arraylist.AddItem("Tomato");
        arraylist.AddItem("Chips");
        arraylist.AddItem("Drink");
        arraylist.PrintList();
        arraylist.Modify(1,"Meat");
        arraylist.PrintList();
        arraylist.RemoveItem(2);
        arraylist.PrintList();
        arraylist.FindItem("Meat");*/

     /*   int[] IntArray=new int[10];
        System.out.println("Enter 10 Array Element ");
        getInput(IntArray);
        PrintArray(IntArray);

        ResizeArray(IntArray);
        System.out.println("Enter 12 Array Element ");
        getInput(IntArray);
        PrintArray(IntArray);*/
    /*}
    public static void getInput(int a[])
    {
        Scanner s=new Scanner(System.in);
        for (int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
    }
    public static void PrintArray(int a[])
    {
        System.out.println("Array Element is here ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);// Arrays.tostring(ArrayName);
        }
    }
    public static int[] ResizeArray(int a[])
    {
        int[] OriginalArray=a;
        a=new int[12];//another way to modify it
        for (int i=0;i<OriginalArray.length;i++) // copy one Array value to another Array
        {
            a[i]=OriginalArray[i];
        }
        return a;
    }
}*/
