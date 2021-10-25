package ArraylistConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    /*
    *   this class fully use Arraylist Concept here okay......................
    * */
    private static ArrayList<String> ProductList=new ArrayList<>();
    private static String ProuctName;
    private static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
        boolean quit=false;
        int choice=1;
        PrintAllStatement();
        while (!quit)
        {
            
            System.out.println("Enter Action : ");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    if(OutOfStock())
                    {
                        System.out.println("");;
                    }
                    else
                    {
                        PrintProudct();
                    }

                    break;
                case 2:
                    System.out.println("Enter Proudct Name ");
                    String ProductName=s.next();
                    if(AddProduct(ProductName))
                    {
                        System.out.println("SuccessFully Added "+ProductName+" In Your List ");
                    }
                    break;
                case 3:
                    System.out.println("Which Product Do You Want To Delete (Enter Name )");
                    String RemoveProductName=s.next();
                    if (RemoveProduct(RemoveProductName))
                    {
                        System.out.println("Successfully Deleted "+RemoveProductName+" In Your List ");
                    }
                    break;
                case 4:
                    System.out.println("Enter Existing Product Name");
                    String ExistingProductName=s.next();
                    ChangeProduct(ExistingProductName);
                    break;
                case  5:
                    System.out.println("Search Facility is here ");
                    System.out.println("Enter Product Name ");
                    String SearchProductName=s.next();
                    SearchProduct(SearchProductName);
                    break;
                case 6:
                    PrintAllStatement();
                    break;
                default:
                    System.out.println("MisMatch In Your Action");
                    break;
            }

        }
    }
    private static boolean ChangeProduct(String name)
    {
        if((findProduct(name))<0)
        {
            System.out.println("This Product Not In Your List ");
            PrintProudct();
            return false;
        }
        int FoundPosition =findProduct(name);
        System.out.println("Enter New Product Name ");
        String NewProductName=s.next();
        ProductList.set(FoundPosition,NewProductName);
        return true;
    }
    public static void PrintAllStatement()
    {
        System.out.println("0.Exit Now \n"+
                            "1. Print All Product \n"+
                            "2. Add New Product \n"+
                            "3. Remove Product \n"+
                            "4. Change Product \n"+
                            "5. Search Product \n"+
                            "6. Print All Statement  \n");
        System.out.println("Select (6 Available Action )");
    }
    public static void SearchProduct(String prouctName)
    {
        if((findProduct(prouctName))>=0)
        {
            System.out.println("This Product is Available in Your List "+prouctName);
        }
        else {
            System.out.println("Not Available This Product in Your List "+prouctName);
        }
    }
    private static void PrintProudct()
    {
        System.out.println("Your Product List ");

        for (int i=0;i<ProductList.size();i++)
        {
            System.out.println((i+1)+". "+ProductList.get(i));
        }
    }
    private static boolean RemoveProduct(String ProductName )
    {
        int FoundPosition=findProduct(ProductName);
        if((FoundPosition)<0)
        {
            System.out.println("No Product Found with this name "+ProductName);
            return false;
        }
        ProductList.remove(FoundPosition);
        System.out.println("SuccessFully Deleted ");
        return true;
    }
    private static boolean AddProduct(String prouctName)
    {
        int Quantitiy;
        if((findProduct(prouctName))>=0)
        {
            System.out.println("This Product Already in Your Bucket List ");
            System.out.println("Do you Want to Add more ");
            Quantitiy=s.nextInt();
            return false;
        }
        ProductList.add(prouctName);
        return true;
    }
    private static boolean OutOfStock()
    {
        if((ProductList.size())<=0)
        {
            System.out.println("There is "+ProductList.size()+" Product in Your list  ");
            return true;
        }
        return false;
    }
    private static int findProduct(String ProductName)
    {
        return ProductList.indexOf(ProductName);
    }/*
    private static int findProduct(String ProductName)
    {
        String IsAvailable;
        for (int i=0;i<ProductList.size();i++)
        {
            IsAvailable=ProductList.get(i);
        }
        if(ProductName.equals(IsAvailable))
        {

        }
    }*/
}
