package ArraylistConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    private int[] a =new int[5]; //Declaring Array
    private ArrayList<String> ProductList=new ArrayList<String>();

    // it support different Function such as
    /*
    *   ProductList.add(String item); ProductList.remove(int position),ProductList.set(int position,String item) ProductList.get(int index), ProductList.size()
    * */

    public ArrayList<String> getProductList() {
        return ProductList;
    }

    Scanner s=new Scanner(System.in);
    public void AddItem(String item)
    {
        ProductList.add(item);
    }
    public void PrintList()
    {
        System.out.println("You have "+ProductList.size()+" Items in Your Bucket ");
        System.out.println("Added Item List ");
        for (int i=0;i<ProductList.size();i++)
        {
            System.out.println(i+1+". "+ProductList.get(i));
        }
    }
    public void Modify(String ItemName)
    {
            int Position=FindItem(ItemName);
            Modify(Position,ItemName);
    }
    private void Modify(int position,String NewItem)
    {
        String item;
        if(position>=0 && position<=ProductList.size())
        {
            System.out.println("Enter New Product Insted of "+NewItem);
            item=s.next();
            ProductList.set(position,item);
            System.out.println("Item "+(position+1)+" Recently Modified ");
        }
        else
        {
            System.out.println("Sorry You have only "+ProductList.size()+" Number Item in Your list ");
            System.out.println("Not Available "+(position+1)+" Number Item in your list");

        }
    }
    public void RemoveItem(String ItemName)
    {
        int Position= FindItem(ItemName);
        RemoveItem(Position);
    }
    private void RemoveItem(int position)
    {
        String RemoveItem=ProductList.get(position);
        ProductList.remove(position);
        System.out.println("Recently Remove Item is "+RemoveItem);
    }
    private int FindItem(String SearchItem)
    {
        int position=ProductList.indexOf(SearchItem);
       // System.out.println(position);
        if(position>=0)
        {
            System.out.println("Found "+SearchItem+" in your list ");
        }
        else
        {
            System.out.println(SearchItem+" Not Found in your list");
        }
        /*boolean Exist=ProductList.contains(SearchItem);
        if(Exist)
        {
            System.out.println("Your item "+SearchItem+" is Already Added in Your List");
        }
        else
        {
            System.out.println(SearchItem+" is not in Your list ");
        }*/
        return position;
    }
    public boolean OnFile(String SearchItem)
    {
        int Position=FindItem(SearchItem);
        if (Position>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
