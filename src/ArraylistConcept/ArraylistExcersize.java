package ArraylistConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExcersize {
    private static Scanner s=new Scanner(System.in);

    private static Mobile nokia=new Mobile();
    public static void main(String ar[]) {
        String Repeat = "yes";
        int choice = 1;
        boolean quit = false;
        PrintStatement();
        System.out.println("Mobile Contact System ");
        while (Repeat.equals("yes"))
        {
            while (!quit) {
                System.out.println("enter Choice ");
                choice = s.nextInt();
                switch (choice) {
                    case 0:
                        PrintStatement();
                        break;
                    case 1:
                        AddContact();
                        break;
                    case 2:
                        FindContact();
                        break;
                    case 3:
                        RemoveContact();
                        break;
                    case 4:
                        UpdateExistingContact();
                        break;
                    case 5:
                        PrintContact();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }
            System.out.println("Do you want Repeat----->Yes/No");
            Repeat=s.next();
    }
        /*
        Mobile nokia=new Mobile();
        nokia.AddContact("rohit");
        nokia.AddContact("kajal");
        nokia.AddContact("sonal");
        nokia.PrintContact();
        nokia.UpdateExistingContact("rohit");
        nokia.PrintContact();
        nokia.RemoveContact("sonal");*/
    }
    public static void AddContact()
    {
        String name;
        System.out.println("Enter Contact Name ");
        name=s.next();
        nokia.AddContact(name);

    }
    public  static void RemoveContact()
    {
        String name;
        System.out.println("Enter Contact Name ");
        name=s.next();
        nokia.RemoveContact(name);
    }
    public static void FindContact()
    {
        String SearchContactName;
        System.out.println("Enter Search Name ");
        SearchContactName=s.next();
        nokia.FindContact(SearchContactName);
    }
    public static void PrintContact()
    {
        System.out.println("Your All Contact Is Here ");
        nokia.PrintContact();
    }
    public static void UpdateExistingContact()
    {
        String name;
        System.out.println("Enter Person Name ");
        name=s.next();
        nokia.UpdateExistingContact(name);
    }
    public static void PrintStatement()
    {
        System.out.println("Press----");
        System.out.println("\t 0. Print All Statement");
        System.out.println("\t 1. Add Contact");
        System.out.println("\t 2. Search Contact");
        System.out.println("\t 3. Remove Contact");
        System.out.println("\t 4. Update Existing Contact");
        System.out.println("\t 5. Display All Contact");
        System.out.println("\t 6. exit");
    }
}
class Mobile
{
     ArrayList<String> Contact=new ArrayList<>();
    public void AddContact(String name)
    {
        Contact.add(name);
        System.out.println("Successfully Added "+name+" Name Contact ");
    }
    private void RemoveContact(int Position)
    {
        String RemoveContact=Contact.get(Position);
        Contact.remove(Position);
        System.out.println("Recently Remove Name is "+RemoveContact);
    }
    public void RemoveContact(String name)
    {
        int position=FindContact(name);
        RemoveContact(position);
    }
    public void PrintContact()
    {
        for (int i=0;i<Contact.size();i++)
        {
            System.out.println((i+1)+". "+Contact.get(i));
        }
    }
    public int FindContact(String  PersonName)
    {
        int Position=Contact.indexOf(PersonName);
        FindContact(Position, PersonName);
        return Position;
    }
    private void FindContact(int position,String PersonName)
    {
        Scanner s=new Scanner(System.in);
        String choice="yes";
        if (position>=0)
        {
            System.out.println(PersonName+" is Already in Your Contact ");
        }
        else
        {
            System.out.println("\t You have only "+Contact.size()+" in Your Name ");
            System.out.println("\t No Contact with name "+PersonName);

            while (choice.equals("yes"))
            {
                System.out.println("Do you want to Add this Contact Name----->yes/no ");
                choice=s.next();
                AddContact(PersonName);
            }
        }
    }
    public void UpdateExistingContact(String PersonName)
    {
        int Position=FindContact(PersonName);
        UpdateExistingContact(Position,PersonName);
    }
    private void UpdateExistingContact(int position,String PersonName)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Change Existing Name "+PersonName);
        String NewName=s.next();
        Contact.set(position,NewName);
    }
}

