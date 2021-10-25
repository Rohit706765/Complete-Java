package ArraylistConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Concept
{
    private static Scanner s=new Scanner(System.in);
    private static Bank bank=new Bank("Default");
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int choice;
        boolean quit=false;
        printAction();
        while (!quit)
        {
            System.out.println("\n"+"Enter Your Choice ");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    AddBranch();
                    break;
                case 2:
                    AddCustomer();
                    break;
                case 3:
                    AddTransaction();
                    break;
                case 4:
                    ListCustomer();
                    break;
                case 5:
                    UpdateCustomer();;
                    break;
                case 6:
                    printAction();
                    break;
                default:
                    System.out.println(" mismatch at choice ");
                    break;
            }
        }

    }

    public static void printAction()
    {
        System.out.println("press");
        System.out.println("0. Exit ");
        System.out.println("1. Add New Branch ");
        System.out.println("2. Add new Customer ");
        System.out.println("3. Add Transaction to Customer");
        System.out.println("4. List of customer ");
        System.out.println("5. Update Customer  ");
        System.out.println("6. Print Action ");
        System.out.println("\n"+"choose All Available 6 Action ");
    }
    public static void UpdateCustomer()
    {

        System.out.println("Enter Branch name ");
        String BranchName=s.next();
        s.nextLine();
        System.out.println("Enter old Customer name ");
        String oldCustomerName=s.next();
        s.nextLine();
        System.out.println("Enter new Customer name ");
        String newCustomerName=s.next();
        s.nextLine();
        System.out.println("Enter Customer Initial Amount  ");
        double Transaction=s.nextInt();
        bank.UpdateCustomer(BranchName,oldCustomerName,newCustomerName,Transaction);
    }
    public static void ListCustomer()
    {
        System.out.println("Enter Branch name ");
        String BranchName=s.next();
        s.nextLine();
        System.out.println("Are you want to show Transaction True/falase ");
        boolean ShowTransaction=s.nextBoolean();
        bank.ShowAllCustomer(BranchName,ShowTransaction);
    }
    public static void AddTransaction()
    {

        System.out.println("Enter Branch name ");
        String BranchName=s.next();
        s.nextLine();
        System.out.println("Enter Customer name ");
        String CustomerName=s.next();
        System.out.println("Enter Customer  Amount  ");
        double Transaction=s.nextInt();
       boolean check= bank.UpdateCustomerTransaction(BranchName,CustomerName,Transaction);
        if (check)
        {
            System.out.println("Successfully Add customer transaction ");
        }
        else
        {
            System.out.println("Failed ");
        }
    }
    public static void AddCustomer()
    {
        System.out.println("Enter Branch name ");
        String BranchName=s.next();
        s.nextLine();
        System.out.println("Enter Customer name ");
        String NewCustomerName=s.next();
        System.out.println("Enter Customer Initial Amount  ");
        double Transaction=s.nextInt();
        s.nextLine();
        bank.AddCustomerInBranch(BranchName,NewCustomerName,Transaction);

    }
    public static void AddBranch()
    {
        System.out.println("Enter Branch name ");
        String BranchName=s.next();
        s.nextLine();
        bank.AddBranch(BranchName);

    }
}
class Bank
{
    private Branch branch=new Branch("Default");
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean AddBranch(String BranchName)
    {
        Branch branch=FindBranch(BranchName);
        if (branch!=null)
        {
            System.out.println(BranchName+" Branch is already Exist ");
            return false;
        }
        branch=new Branch(BranchName);
        branches.add(branch);
        System.out.println("successfully Added "+branch.getName()+" branch");
        return true;
    }
    public boolean AddCustomerInBranch(String BranchName,String name,double Transaction)
    {
        Branch branch=FindBranch(BranchName);
        if (branch!=null)
        {
            return branch.AddCustomer(name,Transaction);
        }
        System.out.println("This Branch "+BranchName+" Does not Exist");
        return false;
    }

    public boolean UpdateCustomer(String BranchName,String oldname,String newName,double newAmount)
    {
        Branch branch=FindBranch(BranchName);
        if (branch!=null)
        {
            branch.UpdateCustomer(oldname,newName,newAmount);
            return true;
        }
        return false;
    }
    public boolean UpdateCustomerTransaction(String BranchName,String name,double newAmount)
    {
        Branch branch=FindBranch(BranchName);
        if (branch!=null)
        {
            return branch.AddTransation(name,newAmount);
        }
        return false;
    }
    public void ShowAllCustomer(String BranchName, boolean ShowTransaction)
    {
        Branch branch=FindBranch(BranchName);
        if (branch!=null)
        {
            System.out.println("Customer list of "+branch.getName()+" Branch ");
            ArrayList<Customer> customer=branch.getCustomers();
            for (int i=0;i<customer.size();i++)
            {
                Customer customer1=customer.get(i);
                System.out.println((i+1)+" Name---> "+customer1.getName()+"\n");
                if (ShowTransaction)
                {

                    System.out.println(" Transaction List ");
                    ArrayList<Double> Transaction=customer1.getTransaction();
                    for (int j=0;j<Transaction.size();j++)
                    {
                        System.out.println("\n"
                                +(j+1)+". "+"Amount "+Transaction.get(j));
                    }
                }
            }
        }
    }

    public Branch FindBranch(String BranchName)
    {
        for (int i=0;i<branches.size();i++)
        {
            Branch branch=branches.get(i);
            if (branch.getName().equals(BranchName))
            {
               return branch;
            }
        }
        return null;
    }
}
class Branch
{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean AddCustomer(String name, double Amount)
    {
       Customer customer= findCustomer(name);
       if (customer==null)
       {
           Customer Newcustomer=new Customer(name,Amount);
           customers.add(Newcustomer);
           System.out.println("Successfully Added New Customer "+name+" with Initial Amount "+Amount);
           return true;
       }
        System.out.println("Failed to save the this customer ");
       return false;
    }

    public boolean AddTransation(String name,double NewAmount)
    {
            Customer existingCustomer=findCustomer(name);
            if (existingCustomer!=null)
            {
                existingCustomer.AddInitialTransaction(NewAmount);
                return true;
            }
        System.out.println("Customer "+name+" is not exist ");
            return false;
    }
    public boolean UpdateCustomer(String oldName ,String newName,double amount)
    {
        Customer customer=findCustomer(oldName);
        int position=findCustomer(customer);
        System.out.println("Position "+position);
        if (position>=0)
        {
            Customer existingCustomer=new Customer(newName,amount);
            customers.set(position,existingCustomer);
            System.out.println("Successfully "+oldName+" changed by "+newName);
            return true;
        }
        System.out.println("Failed to update customer ");
        return false;
    }

    public int findCustomer(Customer customer)
    {
        return this.customers.indexOf(customer);
    }
    public Customer findCustomer(String name)
    {
        for (int i=0;i<customers.size();i++)
        {
            Customer customer=customers.get(i);
            if (customer.getName().equals(name))
            {
                return customer;
            }
        }
        return null;
    }
}
class Customer
{
    private String name;
    private final ArrayList<Double> Transaction;

    public Customer(String name,double Amount) {
        this.name = name;
        Transaction=new ArrayList<>();

        AddInitialTransaction(Amount);
    }
    public void AddInitialTransaction(double amount)
    {
        Transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return Transaction;
    }
}





























/*

public class Arraylist_Concept
{
    */
/*
     *
     *       this program apply the simple contact system  method
     *       in which you can simply add contact
     *       in which you can simply remove contact
     *       in which you can simply find contact
     *       in which you can simply Search contact
     *       in which you can simply update contact
     * *//*



    public static void main(String[] args) {

        Arraylist_info contact=new Arraylist_info("Rohit");
        Scanner s=new Scanner(System.in);
        int choice;
        boolean quit=false;
        printInstruction();
        while (!quit)
        {
            System.out.println("");
            System.out.println("Enter Available 6 Action ");
            System.out.println("Enter Choice ");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("enter person name ");
                    String name=s.next();
                    System.out.println("enter phone number ");
                    String number =s.next();
                    contact.AddContact(name,number);
                    break;

                case 2:
                    System.out.println("Enter your Oldname ");
                    String oldName=s.next();
                    System.out.println("Enter your new ame ");
                    String newName=s.next();
                    System.out.println("Enter your phone number ");
                    number=s.next();
                    contact.updateContact(newName,oldName,number);
                    break;

                case 3:
                    contact.listofContact();
                    break;
                case 4:
                    System.out.println("enter name of Contact for BankExersizeMe.delete ");
                    String DeleteName=s.next();
                    contact.removeContact(DeleteName);
                    break;
                case 5:
                    System.out.println("Enter name of contact for find ");
                    name=s.next();
                    contact.queryContact(name);
                    break;
                case 6:
                    printInstruction();
                    break;
                default:
                    System.out.println("Mismatch in choice ");
                    break;

            }
        }
    }
    public  static void printInstruction()
    {
        System.out.println("Press ");
        System.out.println("0. shutdown ");
        System.out.println("1. Add new contact ");
        System.out.println("2. update contact ");
        System.out.println("3. list of  contact ");
        System.out.println("4. remove  contact ");
        System.out.println("5. find  contact ");

    }

}
class Arraylist_info
{
    ArrayList<Contact_Info> contact;

    public Arraylist_info(String number) {

        this.number = number;
        contact=new ArrayList<>();
    }


    private String number;

    public void listofContact()
    {
        System.out.println("Contact List");
        for (int i=0;i<contact.size();i++)
        {
            System.out.println((i+1)+". "+contact.get(i).getName()+ "---> "+contact.get(i).getPhoneNumber());
        }
    }

    public boolean AddContact(String name,String phone)
    {
        int findPosition=findContact(name);
        if(findPosition>=0)
        {
            System.out.println("This contact Already exits ");
            return false;
        }

        Contact_Info contact_info=new Contact_Info(name,phone);
        contact.add(contact_info);
        System.out.println("Successfully Added "+contact_info.getName());
        return true ;
    }
    public boolean updateContact(String newName , String oldName,String phoneNumber) // we can also send the whole Contact_info newContact
    {
        int position=findContact(oldName);
        if(position<0)
        {
            System.out.println("No Record found with name --- "+oldName);
            return false;
        }
        else if(findContact(newName)!=-1)
        {
            System.out.println("This contact "+newName+" is Already exist in contact");
            return false;
        }
        else if (position>=0)
        {
            Contact_Info contact_info=new Contact_Info(newName, phoneNumber);
            contact.set(position,contact_info);
            System.out.println("Successfully updated "+oldName+" to "+newName);

            return true;
        }
        return false;

    }
    public boolean removeContact(String name)
    {
        int position=findContact(name);
        if (position>=0)
        {
            contact.remove(position);
            System.out.println("Successfully Deleted contact "+name);
            return true;
        }
        System.out.println("Falied to Delete this contact ");
        return false;
    }
    public boolean queryContact(String name)
    {
        Contact_Info contact_info=WholeContact(name);
        if (contact_info!=null)
        {
            System.out.println("Contact name ----" + contact_info.getName());
            System.out.println("Contact number ----" + contact_info.getPhoneNumber());
            return true;
        }
        System.out.println("No contact Found with this name  ");
        return false;
    }
    private Contact_Info WholeContact(String name)
    {
        int position=findContact(name);
        if (position>=0)
        {
            for (Contact_Info contact_info : contact) {
                if (contact_info.getName().equals(name)) {
                    return contact_info;
                }
            }
        }
        return null;
    }
    public int Onfile(String name)
    {
        return findContact(name);
    }

    public int Onfile(Contact_Info contact_info)
    {
        return findContact(contact_info);
    }

    */
/*  this two method i dont want to show the user so this reason i make them as private *//*


    private int findContact(Contact_Info contact_info)
    {
        return  this.contact.indexOf(contact_info);
    }



    private int findContact(String name)
    {
        for (int i=0;i<contact.size();i++)
        {
            Contact_Info contact_info=contact.get(i);
            if (contact_info.getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
}
class Contact_Info
{
    private String name;
    private String phoneNumber;

    public Contact_Info(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
*/




























    /*
    *
    *       this program apply the simple bucket list method
    *       in which you can simply add item
    *       in which you can simply remove item
    *       in which you can simply find item
    *       in which you can simply Search item
    *       in which you can simply update item
    * */

    /*private static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean quit=false;
        int choice;
        printInstruction();
        System.out.println("");
        while (!quit)
        {

            System.out.println("Enter your choice ");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter item name ");
                    String itemName=s.next();
                    About_Arraylist.Additem(itemName);
                    break;
                case 2:
                    About_Arraylist.ListOfItem();
                    break;
                case 3:
                    System.out.println("enter name of item");
                    String name=s.next();
                    if(About_Arraylist.modifyArraylist(name))
                    {
                        System.out.println("Successfully update "+name);
                    }
                    break;
                case 4:
                    System.out.println("enter position of item (You wnat to Remove )");
                    name=s.next();
                    About_Arraylist.removeList(name);
                    break;
                case 5:
                    System.out.println("Enter item Name (Search query )");
                    name=s.next();
                    int pos=About_Arraylist.OnFile(name);
                    if(pos>=0)
                    {
                        System.out.println("Successfully find item name "+name);
                    }
                    break;
                case 6:
                    printInstruction();
                    break;
                default:
                    System.out.println("mismatch at choice ");
                    break;
            }
        }
    }
    public static void processArraylist()
    {
        ArrayList<String> MyArraylist=new ArrayList<>();
        MyArraylist.addAll(About_Arraylist.getGrocerylist()); // copy one arraylist to other arraylist
    }
    public static void printInstruction()
    {
        System.out.println("");
        System.out.println("0. Exit ");
        System.out.println("1. add item ");
        System.out.println("2. list of item ");
        System.out.println("3. modify item in the list  ");
        System.out.println("4. remove item name you want to remove   ");
        System.out.println("5. enter item name you want to search   ");
        System.out.println("6. print instruction   ");
    }
}
class About_Arraylist
{
    private static ArrayList<String> grocerylist=new ArrayList<>();
    private static Scanner s=new Scanner(System.in);

    public static ArrayList<String> getGrocerylist() {
        return grocerylist;
    }

    public static void Additem(String item)
    {
        grocerylist.add(item);
    }
    public static void ListOfItem()
    {
        System.out.println("Total Added "+grocerylist.size()+"item in List ");

        for (int i=0;i<grocerylist.size();i++)
        {
            System.out.println((i+1)+". "+grocerylist.get(i));
        }
    }
    public static boolean modifyArraylist(String name)
    {
        int findPosition=findItem(name);
        if(findPosition>=0)
        {
            System.out.println("Enter new item name");
            name=s.next();
            grocerylist.set(findPosition,name);
            return true;
        }
        System.out.println("No item found "+name);
        return false;
    }
    private static void modifyArraylist(int position, String ItemName)
    {
        grocerylist.set(position-1,ItemName);

        System.out.println("Grocery item "+(position)+" has been modified ");

        System.out.println("After Modify Item in List  ");
        for (int i=0;i<grocerylist.size();i++)
        {
            System.out.println((i+1)+". "+grocerylist.get(i));
        }
    }

    private static int findItem(String itemName)
    {
        //boolean exist=grocerylist.contains(itemName);
        int position=grocerylist.indexOf(itemName);
        return position;
     }
    public static void removeList(String name)
    {
        int findPosition=findItem(name);

        System.out.println("item "+grocerylist.get(findPosition)+" has been deleted ");
        grocerylist.remove(findPosition);

        System.out.println("");
        ListOfItem();
    }
    public static int OnFile(String name)
    {
        int position=findItem(name);
        return position;
    }
}
*/