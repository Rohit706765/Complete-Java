package AllChallengeRough;

import java.util.ArrayList;
import java.util.Scanner;

public class All_challenge {

    //TODO You job is to create a simple banking application.
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

}

class bank {
    ArrayList<Branch> branches;
    private String bankName;

    Scanner s = new Scanner(System.in);

    public bank(String bankName) {
        this.bankName = bankName;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        } else {
            System.out.println("Already existed branch ");
        }

        return false;
    }

    public boolean addCustomerToBranch(String branchName, String CustomerName, double initialAmt) {
        Branch branch = findBranches(branchName);

        if (branch == null) {
            return branch.AddCustomer(CustomerName, initialAmt);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String CustomerName, double amt) {
        Branch branch = findBranches(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(CustomerName, amt);
        }
        return false;
    }

    public boolean showCustomer(String branchName, boolean showTransaction) {
        Branch branch = findBranches(branchName);
        if (branch != null) {
            System.out.println("Customer Details for Branch " + branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);

                System.out.println("#" + (i + 1) + " Customer name " + branchCustomers.get(i).getName());
                if (showTransaction) {
                    ArrayList<Double> transaction = customer.getTransactions();
                    for (int j = 0; j < transaction.size(); j++) {
                        System.out.println("#" + (j + 1) + " Amount " + transaction.get(j));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Branch findBranches(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public String findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);

            if (branch.getBranchName().equals(branchName)) {
                return branch.getBranchName();
            }
        }
        return null;
    }

}

class Branch {
    private String branchName;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.branchName = name;
        customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean AddCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amt) {
        Customer existingCustomer = findCustomers(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(amt);
            return true;
        }
        return false;
    }

    private String findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            String temp = customers.get(i).getName();

            if (temp.equals(customerName)) {
                return temp;
            }
        }
        return null;
    }

    private Customer findCustomers(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);

            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    private String name;
    private ArrayList<Double> Transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        Transactions = new ArrayList<>();
        addTransactions(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public void addTransactions(double transaction) {
        Transactions.add(transaction);
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }
}



   /* //TODO challenge is here
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    static Mobile m = new Mobile("45421545");
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        printInstruction();
        boolean flag = false;
        int choice ;
        while (!flag)
        {
            System.out.println("\n enter your choice ");
            choice =  s.nextInt();

            switch (choice)
            {
                case 0:
                    flag=true;
                    break;
                case 1:
                    addNewContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    printInstruction();
                    break;
                case 4:
                  removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printContact();
                    break;
                default:
                    System.out.println("Error ");
                    break;
            }
        }
    }

    public static void printInstruction()
    {
        System.out.println("press ");
        System.out.println("\t\t\t"+"0. for exit ");
        System.out.println("\t\t\t"+"1. for Add new Contact ");
        System.out.println("\t\t\t"+"2. for Update Your Contact ");
        System.out.println("\t\t\t"+"3. for Print Instruction ");
        System.out.println("\t\t\t"+"4. for Remove  Your Contact ");
        System.out.println("\t\t\t"+"5. for Find/Search  Your Contact ");
        System.out.println("\t\t\t"+"6. for Print  Your Contact ");
    }
    public static void removeContact()
    {
        System.out.println("enter name for delete ");
        String delName = s.next();
        Contact contact = m.queryContact(delName);

        if (m.removeContact(contact))
        {
            System.out.println("Successfully removed ");
        }
        else
        {
            System.out.println("no contact find ");
        }
    }
    public static void addNewContact()
    {
        Contact contact;
        System.out.println("Enter Your name  ");
        String name = s.next();
        System.out.println("Enter Your number ");
        String number = s.next();
        contact = Contact.createContact(name,number);

        if (m.addNewContact(contact))
        {
            System.out.println("successfully Added "+contact.getName());
        }
        else
        {
            System.out.println("this contact already in file ");
        }
    }
    public static void searchContact()
    {
        System.out.println("enter name for search ");
        String name = s.next();
        Contact contact = m.queryContact(name);
         m.searchContact(contact);
    }
    public static void updateContact()
    {
        System.out.println("Enter Your old name  ");
        String name = s.next();
        Contact existingContact = m.queryContact(name);
        if (existingContact==null)
        {
            System.out.println("no record found ");
            return;
        }
        System.out.println("Enter your new name ");
        String newName = s.next();
        System.out.println("Enter you new number ");
        String newNumber = s.next();
        Contact newContact = Contact.createContact(newName,newNumber);

        if (m.updateContact(existingContact,newContact))
        {
            System.out.println("Successfully updated record ");
        }
        else
        {
            System.out.println("nothing update ");
        }
    }
    public static void printContact()
    {
        m.printContact();
    }


}

class Mobile
{
    static Scanner s = new Scanner(System.in);
    static ArrayList<Contact> contactlist;

    private String myNumber;

    public Mobile(String myNumber)
    {
        this.myNumber = myNumber;
        contactlist = new ArrayList<>();
    }

    public boolean removeContact(Contact contact)
    {
        int position = findContact(contact);
        if (position>=0)
        {
            contactlist.remove(position);
            return true;
        }
        else
        {
            System.out.println("no contact find ");
            return false;
        }
    }
    public  boolean searchContact(Contact contact)
    {
        *//*System.out.println("enter name for search ");
        String name = s.next();*//*

        int position = findContact(contact);
        if (position>=0)
        {
            System.out.println("find "+contact.getName()+" in your contact ");
            return true;
        }
        else
        {
            System.out.println("No record find in your contact ");
            return false;
        }
    }
    public  boolean updateContact(Contact oldContact ,Contact newContact)
    {
        int position = findContact(oldContact);
        if (position<0)
        {
            System.out.println("no contact find ");
            return false;
        }
        contactlist.set(position,newContact);
    return true;
    }
    //TODO addNewContact
    public  boolean addNewContact(Contact contact)
    {
        if (findContact(contact.getName())>=0)
        {
            System.out.println("Already added contact ");
            return false;
        }
        else
        {
            contactlist.add(contact);
            return true;
        }
    }
    public  Contact queryContact(String name)
    {
        int pos = findContact(name);
        if (pos>=0)
        {
            return contactlist.get(pos);
        }
        return null;
    }
    public  void printContact()
    {
        for (int i=0;i<contactlist.size();i++)
        {
            System.out.println("#"+(i+1)+". "+contactlist.get(i).getName() + "  "+contactlist.get(i).getNumber());
        }
    }


    public  int findContact(String name)
    {
        for (int i=0;i<contactlist.size();i++)
        {
           Contact contact =  contactlist.get(i);
           if (contact.getName().equals(name))
           {
               return i;
           }
        }
        return -1;
    }
    public  int findContact(Contact contact) {

        //        contactlist.contains(contact);  it return boolean value
        //        contactlist.indexOf(contact);  it return integer value

        return contactlist.indexOf(contact);
    }
}
class Contact
{
    private String name="";
    private String number="";
    public Contact(String name,String number)
    {
        this.name = name;
        this.number = number;
    }
    public static Contact createContact(String name,String number)
    {
        return new Contact(name,number);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

*/


//TODO Arraylist all functionaltiy added here add,remove,set,get,findItem,contain,indexOf, how to copy one Arraylist to other
//TODO Arraylist to array
/*
    static Scanner s = new Scanner(System.in);
   static grocerrylist listItem = new grocerrylist();


    public static void main(String[] args)
    {
        int choice = 0;
        boolean flag = false;
        printInstruction();
        while (!flag)
        {
            System.out.println("");
            System.out.println("enter your choice ");
            choice = s.nextInt();
            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    changeItem();
                    break;
                case 3:
                    deleteItem();
                    break;
                case 4:
                    printItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    flag=true;
                    break;
                case 7:
                    listItem.proceeslist();
                    break;
                default:
                    System.out.println("error ");
                    flag = true;
                    break;
            }
        }
    }
    public static void addItem()
    {
        System.out.println("Add item in your Cart ");
        String item = s.next();
       listItem.addItemInList(item);
    }
    public static void changeItem()
    {
        System.out.println("name of item to replace ");
        String changeItem = s.next();
        System.out.println("enter new Item name ");
        String newItem = s.next();
        int pos = listItem.findPosition(changeItem);
       listItem.setItemInlist(newItem,pos);
    }
    public static void searchItem()
    {
        System.out.println("enter name of item ");
        String itemName = s.next();
        s.nextLine();

        System.out.println(listItem.findItem(itemName));
    }
    public static void deleteItem()
    {
        System.out.println("enter name of item You want to delete ");
        String name = s.next();
        int pos =  listItem.findPosition(name);
        listItem.removeItem(pos);
    }
    public static void printItem()
    {
        listItem.printList();
    }
    public static void printInstruction()
    {
        System.out.println("0. press for print Instruction ");
        System.out.println("1. press for Add Item ");
        System.out.println("2. press for Set Item ");
        System.out.println("3. press for Remove Item ");
        System.out.println("4. press for print All Item ");
        System.out.println("5. press for search item in list ");
        System.out.println("6. press for exit ");
    }
    // TODO basic arrayList concept element


class grocerrylist
{
    static ArrayList<String> grocerylist = new ArrayList<>();

    public static ArrayList<String> getGrocerylist() {
        return grocerylist;
    }

    public  void printList()
    {
        System.out.println("you have "+grocerylist.size()+" item in your list ");
        for (int i=0;i<grocerylist.size();i++)
        {
            System.out.println("#"+(i+1)+". "+grocerylist.get(i));
        }
    }
    public  void addItemInList(String item)
    {
        if (grocerylist.contains(item))
        {
            System.out.println("Already added item ");
        }
        else
        {
            grocerylist.add(item);
        }

    }
    public  void setItemInlist(String item,int position)
    {
        if (position>=0)
        {
            grocerylist.set(position,item);
        }
        else
        {
            System.out.println("no item found ");
        }

    }
    public int findPosition(String item)
    {
        if (grocerrylist.grocerylist.contains(item))
        {
            int position  = grocerylist.indexOf(item);

            return position;
        }
       return -1;
    }
    public  void removeItem(int index)
    {
        if (index>=0)
        {
            System.out.println("total number of item in list is "+grocerylist.size());
            String item = grocerylist.get(index);
            grocerylist.remove(item);
            System.out.println("Now total number of item in list is "+grocerylist.size());
        }
        else {
            System.out.println("no item name found ");
        }

    }
    public void proceeslist()
    {
        //  TODO faster way to copy one Arraylist to another arraylist
        ArrayList<String> data = new ArrayList<>();
        data.addAll(getGrocerylist());

        //TODO second way
        ArrayList<String> mydata = new ArrayList<>(getGrocerylist()); // copy data

        // TODO copy ArrayString to Array
        String[] value = new String[getGrocerylist().size()];
        value = getGrocerylist().toArray(value);
    }
    public String findItem(String item)
    {
        if (grocerylist.contains(item))
        {
            return "found "+item+" in your list";
        }
        else
        {
            return "no item found ";
        }
    }
}*/
/************************************************************************************************************************/
    /*
      // TODO reversed  array element
   static Scanner s = new Scanner(System.in);
    static int[] newArray;
    static int temp = 0 ;

    public static void main(String[] args)
    {
        int[] mydata = new int[5];
        newArray = new int[mydata.length];

        for (int i=0;i<mydata.length;i++)
        {
           mydata[i] = s.nextInt();
        }
        newArray = reverseArray(mydata);
        printArray(newArray);
    }
    public static void printArray(int[] newArray)
    {
        for (int i=0;i< newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }
    }
    public static int[] reverseArray(int[] array)
    {

        int MaxIndex = array.length-1;
        int halfIndex = (array.length-1)/2;

        for (int i=0;i<halfIndex;i++)
        {
            temp=array[i];
            array[i]=array[MaxIndex-i];
            array[MaxIndex-i]=temp;
        }
        return array;
    }*/
/************************************************************************************************************************/
/*
        // TODO Print min and max value in array

        System.out.println("how much size you want of array ");
        int count = s.nextInt();
        int[] myArray = new int[count];

        myArray = readInteger(count);

        int minVaule = findMin(myArray);
        System.out.println("min value in "+Arrays.toString(myArray) + " is "+minVaule);


        int maxValue = findMax(myArray);
        System.out.println("max value in "+Arrays.toString(myArray) + " is "+maxValue);

    public static int[] readInteger(int count)
    {
        int[] myArray = new int[count];

        for (int i=0;i<count;i++)
        {
            System.out.println("#"+i+" value in array ");
            myArray[i]=s.nextInt();
        }
        return myArray;
    }
    public static int findMax(int[] array)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]>max)
            {
                max = array[i];
            }
        }
        return max;

    }
    public static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;


        for (int i=0;i<array.length-1;i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    }*/
/**************************************************************************************************/
//TODO value type variable
/**************************************************************************************************/

    /*   int a = 10;
        int b = a; // value type
        System.out.println("value of "+a);
        System.out.println("value of "+b);

        System.out.println("after increment ");
        b++;
        System.out.println("value of "+a);
        System.out.println("value of "+b);

        //TODO reference type variable

        int[] mydata = new int[5];
        int[] otherData = mydata;

        System.out.println("mydata Value "+ Arrays.toString(mydata));
        System.out.println("otherData Value "+Arrays.toString(otherData));

        otherData[0]=2;

        System.out.println("mydata Value "+ Arrays.toString(mydata));
        System.out.println("otherData Value "+Arrays.toString(otherData));
*/

/**************************************************************************************************/
//TODO     how to sort array in java
/***************************************************************************************************/

/*
    /* System.out.println("how many element you want in array ");
        int length =  s.nextInt();
        s.nextLine();

        int[] newArray =  getInteger(length);  // it create array and allows user to add value

        int[] sortedArray = sortArray(newArray);
        printArray(sortedArray);


    public static int[] getInteger(int length)
    {
        int[] myArray = new int[length];
        for (int i=0;i<myArray.length;i++)
        {
            myArray[i] = s.nextInt();
        }
        return myArray;
    }
    public static void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("#"+i+" value is "+array[i]);
        }
    }
    public static int[] sortArray(int[] unSort)
    {
        int[] backUpArray = new int[unSort.length];
        for (int i=0;i< unSort.length-1;i++)
        {
            backUpArray[i]=unSort[i];
        }
        boolean flag =true;
        while (flag)
        {
            int temp;
            flag=false;
            for (int i=0;i<= backUpArray.length-1;i++) // 106 25 81 8 5 15
            {                                       // 106 81 25 8 15 5

                if (backUpArray[i]<backUpArray[i+1])
                {
                    temp = backUpArray[i];
                    backUpArray[i]=backUpArray[i+1];
                    backUpArray[i+1]=temp;
                }
            }
        }
        return backUpArray;
    }
*/


/* * ************************************************************************************************/
//TODO      how to pass array as parameter and return as parameter
/* * *************************************************************************************************/

/*
    public static void main(String[] args) {

        int[] data = new int[10]; //run time
        int[] myarray = {1,2,3,4,5,6,7}; // compile time
        for (int i=0;i<data.length;i++)
        {
            data[i]=(i+10);
        }
        printArray(data); // pass array as parameter
        data = changeArray(data); // return array
        System.out.println("after change in array  ");
        for (int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }
        System.out.println("sum of all elemnt in array ");
        System.out.println("Average of element "+getAvg(data));
    }
    public static void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("my array "+array[i]);
        }
    }
    public static int[] changeArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            array[i]=(i*20);
        }
        return array;
    }
    public static double getAvg(int[] array)
    {
        int sum = 0;
        for (int i=0;i<array.length;i++)
        {
            sum += array[i];
        }
        return sum/array.length;
    }*/





/* * ************************************************************************************************/
//TODO      humberger example (OOP CHALLENGE )
/* * *************************************************************************************************/


/*

        Hamburger basic = new Hamburger("basic","sausage","white",3.56);
        basic.AdditionItem1("lettuce",2.5);
        basic.AdditionItem2("carrot",0.5);

        healthyBurger healthyBurger = new healthyBurger("bacon",5.2);
        healthyBurger.addExtraAddition1("egg",3.5);
        healthyBurger.addExtraAddition2("cheese",5.2);
        System.out.println(String.format("%.2f",healthyBurger.BurgerPrice()));

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        System.out.println(deluxeBurger.BurgerPrice());
    }
}

class Hamburger
{
    private String name;
    private String meat;
    private String rollType;
    private double price;

    private String additionName1;
    private double price1;
    private String additionName2;
    private double price2;
    private String additionName3;
    private double price3;
    private String additionName4;
    private double price4;

    public Hamburger(String name, String meat, String rollType, double price) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
        this.price = price;
    }
    public void AdditionItem1(String name,double price)
    {
        this.additionName1=name;
        this.price1=price;
    }
    public void AdditionItem2(String name,double price)
    {
        this.additionName2=name;
        this.price2=price;
    }
    public void AdditionItem3(String name,double price)
    {
        this.additionName3=name;
        this.price3=price;
    }
    public void AdditionItem4(String name,double price)
    {
        this.additionName4=name;
        this.price4=price;
    }
    public double BurgerPrice()
    {
        System.out.println(this.name+" burger on "+this.rollType+" roll with price "+this.price);
        double burgerPrice = this.price;
        if (additionName1!=null)
        {
            burgerPrice+=price1;
            System.out.println("Added "+additionName1+" for an extra "+price1);
        }
        if (additionName2!=null)
        {
            burgerPrice+=price2;
            System.out.println("Added "+additionName2+" for an extra "+price2);
        }if (additionName3!=null)
        {
            burgerPrice+=price3;
            System.out.println("Added "+additionName3+" for an extra "+price3);
        }if (additionName4!=null)
        {
            burgerPrice+=price4;
            System.out.println("Added "+additionName4+" for an extra "+price4);
        }
        burgerPrice = Double.parseDouble(String.format("%.2f",burgerPrice));
        return burgerPrice;
    }

}
class healthyBurger extends Hamburger
{

    private String extraAddition1;
    private double extraPrice1;
    private String extraAddition2;
    private double extraPrice2;

    public healthyBurger( String meat,  double price) {
        super("healthyBurger", meat, "black", price);
    }
    public void addExtraAddition1(String name,double price)
    {
        extraAddition1=name;
        extraPrice1=price;
    }
    public void addExtraAddition2(String name,double price)
    {
        extraAddition2=name;
        extraPrice2=price;
    }

    @Override
    public double BurgerPrice() {
        double healtyBurger = super.BurgerPrice();
        if (extraAddition1!=null)
        {
            healtyBurger+=extraPrice1;
            System.out.println("Added "+extraAddition1+" on extra "+extraPrice1);
        }
        if (extraAddition2!=null)
        {
            healtyBurger+=extraPrice2;
            System.out.println("Added "+extraAddition2+" on extra "+extraPrice2);
        }
        return healtyBurger;
    }
}
class DeluxeBurger extends Hamburger
{

    public DeluxeBurger() {
        super("DeluxeBurger", "brown", "white", 14.5);
        super.AdditionItem1("drinks",4.5);
        super.AdditionItem2("chips",5.5);
    }
    @Override
    public void AdditionItem1(String name, double price) {
        super.AdditionItem1(name, price);
    }

    @Override
    public void AdditionItem2(String name, double price) {
        super.AdditionItem2(name, price);
    }

    @Override
    public void AdditionItem3(String name, double price) {
        System.out.println("WE can't add new items here ");
    }

    @Override
    public void AdditionItem4(String name, double price) {
        System.out.println("WE can't add new items here ");
    }


}
*/














/* * ************************************************************************************************/
// TODO     humberger example (OOP CHALLENGE )
/* * *************************************************************************************************/

/*
class humberger
{
    private String rollType;
    private String meat;
    private boolean isLettuce;
    private boolean tomato;
    private boolean carrot;

    private String additionName1;
    private double price1;
    private String additionName2;
    private double price2;
    private String additionName3;
    private double price3;
    private String additionName4;
    private double price4;
    private double totalPrice =0;
    private int cnt=0;

    Scanner s = new Scanner(System.in);
    public humberger(String rollType, String meat) {
        this.rollType = rollType;
        this.meat = meat;
        this.isLettuce = false;
        this.tomato = false;
        this.carrot = false;
    }
    public void addItem()
    {

        boolean over=false;
        while (!over)
        {
            System.out.println("1. 0.5$ Add lettuce ");
            System.out.println("2. 2$ Add tomato ");
            System.out.println("3. 4$ Add Carrot ");
            System.out.println("4. 2.5$ Add meat ");
            System.out.println("5. complete to add item ");

            System.out.println("");

            System.out.println("Enter Any Item Or Go to main Page ");
            int choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    additionName1="lettuce";
                    price1+=0.5;
                    ++cnt;
                    break;
                case 2:
                    additionName2="Tomato";
                    price2+=2;
                    ++cnt;
                    break;
                case 3:
                    additionName3="Carrot";
                    price3+=4;
                    ++cnt;
                    break;
                case 4:
                    additionName4="Meat";
                    price4+=2.5;
                    ++cnt;
                    break;
                case 5 :
                    over=true;
                    break;
            }
        }
    }
    public void showBill()
    {

        System.out.println("Total Added food in Burger");
        System.out.println("************************************************");
        System.out.println("Added Food is Here ");
        if (additionName1!=null)
        {
            System.out.println("New Added Food "+additionName1+" price is "+price1);
        }if (additionName2!=null)
        {
            System.out.println("New Added Food "+additionName2+" price is "+price2);
        }if (additionName3!=null)
        {
            System.out.println("New Added Food "+additionName3+ " price is "+price3);
        }if (additionName4!=null)
        {
            System.out.println("New Added Food "+additionName4+" price is "+price4);
        }
        System.out.println("**********************************************************");
        System.out.println("Total Added Food is "+cnt);

        System.out.println("**********************************************************");
        System.out.println("Total Amount of Bill "+(price1+price2+price3+price4));
    }
    public void removeItem()
    {
        int removeNumber =0;
        System.out.println("Which item you want to remove ");
        System.out.println("****************************************************");
        System.out.println("1. 0.5$ Add lettuce ");
        System.out.println("2. 2$ Add tomato ");
        System.out.println("3. 4$ Add Carrot ");
        System.out.println("4. 2.5$ Add meat ");

        System.out.println("enter number here ");
        int removeItem = s.nextInt();

        if (removeItem==1)
        {
            additionName1 = null;
            price1 = 0;
            ++removeNumber;

        }
        else if (removeItem==2)
        {
            additionName2 = null;
            price2 = 0;
            ++removeNumber;
        }
        else if (removeItem==3)
        {
            additionName3 = null;
            price3 = 0;
            ++removeNumber;
        }
        else if (removeItem==4)
        {
            additionName4 = null;
            price4 = 0;
            ++removeNumber;
        }
        else
        {
            System.out.println("error ");;
        }

        System.out.println("Total Removed Item "+removeNumber);

    }

}
class healthyBurger extends humbergur
{
    public healthyBurger(String rollType, String meat) {
        super(rollType, meat);
    }
}

*/

/* * ************************************************************************************************/
// TODO     polymophishm example by car
/* * *************************************************************************************************/

/*
        car acar = new car(4,4,"null",4,"null");
        bmw abmw = new bmw();
        abmw.acclerate(10);
        abmw.acclerate(20);

        pazero pazero = new pazero();
        pazero.acclerate(20);
class car
{
    private  int wheel;
    private int door;
    private String engine;
    private int cylinders;
    private String name;
    private int gear;
    private int currentVelocity ,currentDirection;

    public car(int wheel, int door, String engine, int cylinders, String name) {
        this.wheel = wheel;
        this.door = door;
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
    }
    public void acclerate(int rate)
    {

        this.currentVelocity = this.getCurrentVelocity() +rate;
        if (this.currentVelocity>=10 && this.currentVelocity<20)
        {
            gear=1;

        } else if (this.currentVelocity>=20 && this.currentVelocity<30)
        {
            gear=2;
        } else if (this.currentVelocity>=30 && this.currentVelocity<50)
        {
            gear=3;
        } else if (this.currentVelocity>=50 && this.currentVelocity<70)
        {
            gear=4;
        }
        else
        {
            gear=5;
        }
            System.out.println("New speed added "+rate+" Current speed is "+this.currentVelocity+" km/h"+"\n"+" current gear is "+this.gear);
    }
    public void Break(int rate)
    {
        this.currentVelocity = getCurrentVelocity()-rate;
        System.out.println("Speed Reduce "+rate+" km/h "+" current speed is "+this.currentVelocity+" km/h");
    }
    public void steer(int currentDirection,int currentVelocity)
    {
        this.currentDirection+=currentDirection;
        this.currentVelocity+=currentVelocity;
        System.out.println("Your car is moving in "+this.currentDirection+" direction at "+this.currentVelocity+" km/h");
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
class pazero extends car
{
    private int serviceMonth;

    public pazero() {
        super(4, 4, "tesla", 2, "pazero");
        serviceMonth = 1;
    }

    @Override
    public void acclerate(int rate) {

        super.acclerate(rate);
    }

    @Override
    public void Break(int rate) {
        super.Break(rate);
    }

    @Override
    public void steer(int currentDirection, int currentVelocity) {
        super.steer(currentDirection, currentVelocity);
    }

    public int getServiceMonth() {
        return serviceMonth;
    }
}
class bmw extends car
{
    public bmw() {
        super(4, 4, "YUITU", 4, "BMW");
    }

}
*/


/* * ************************************************************************************************/
//TODO polymophism example by RANDOM MOVIE CODE
/* * *************************************************************************************************/


/*  public static void main(String[] args)
    {

        for (int i=0;i<11;i++)
        {
           movie m =  RandomMovie();
            System.out.println("#"+i+" movie is "+m.getName()+" plot is "+m.plot());
        }
    }
    public static movie RandomMovie()
    {

        int n = (int) (Math.random()*3)+1;
        System.out.println("random number generated was "+n);
        switch (n)
        {
            case 1:
                return new pk();
            case 2:
                return new conjuring();
            case 3:
                return new simbaa();
            default:
                return null;
        }
    }
}
class movie
{
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot()
    {
        return "no plot is here";
    }
}
class pk extends movie
{
    public pk() {
        super("pk");
    }

    @Override
    public String plot() {
        return "made movie about salman ";
    }
}
class conjuring extends  movie
{
    public conjuring() {
        super("conjuring");
    }

    @Override
    public String plot() {
        return "horror movie";
    }
}
class simbaa extends movie
{
    public simbaa() {
        super("simbaa");
    }

    @Override
    public String plot() {
        return "bakwass movie ";
    }
}
*/

// encapsulation tips is here
/*
 *   make our variable private
 *   use only getter for access a variable
 *   helpful for solving conflict
 * */

/* * ************************************************************************************************/
//TODO this is Composition example (Lot to learn about that )
// use of this and super
/* * *************************************************************************************************/

/*

        motherBoard motherBoard = new motherBoard("x45ty","windows",4);
        Resolution resolution = new Resolution(450,120);
        monitor monitor = new monitor("RYT78","korea",resolution);
        Case  acase = new Case("ERTY78","Nokia",12);
        pc mainPc = new pc(monitor,motherBoard,acase);
        mainPc.getMonitor().drawPixelAt(1200,1200,"Orange");

class pc
{
    private monitor monitor;
    private motherBoard motherBoard;
    private Case aCase;

    public pc(monitor monitor, motherBoard motherBoard, Case aCase) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.aCase = aCase;
    }

    public monitor getMonitor() {
        return monitor;
    }

    public motherBoard getMotherBoard() {
        return motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }
}
class motherBoard
{
    private String model;
    private String manufacture;
    private int cardSlot;

    public motherBoard(String model, String manufacture, int cardSlot) {
        this.model = model;
        this.manufacture = manufacture;
        this.cardSlot = cardSlot;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getCardSlot() {
        return cardSlot;
    }
}
class monitor
{
    private String model;
    private String manufactue;
    private Resolution resolution;

    public monitor(String model, String manufactue, Resolution resolution) {
        this.model = model;
        this.manufactue = manufactue;
        this.resolution = resolution;
    }
    public void drawPixelAt(int width,int height, String color)
    {
        System.out.println("Drawing logo at "+width + " * "+height+" using "+color+" color");
    }
    public String getModel() {
        return model;
    }

    public String getManufactue() {
        return manufactue;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
class Resolution
{
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class Case
{
    private String model;
    private String manufacture;
    private int powerSupply;

    public Case(String model, String manufacture, int powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(boolean press)
    {
        if (press)
        {
            System.out.println("System on ");
        }
        else {
            System.out.println("System off ");
        }

    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}

*/


/* * ************************************************************************************************/
// TODO this is Inheritance example (Lot to learn about that )
// use of this and super
/* * *************************************************************************************************/

/*
    Vehicle v = new Vehicle(10,"v");
    car audi = new car(10,"audi",4,4,false,"tesla");
        audi.move(10);
                audi.steer(20,5);
                audi.steer(50,5);
                audi.Break(10);
                audi.Break(60);*/
/*
class Vehicle
{
    private int size;
    private String name;

    private  int currentVelocity = 0;
    private  int currentDirection =0;

    public Vehicle(int size,String name)
    {
        this.size=size;
        this.name=name;
        currentVelocity = 0;
         currentDirection =0;
    }
    public void move(int currentDirection)
    {
        this.currentDirection +=this.getCurrentDirection()+ currentDirection;
        System.out.println("Your vehicle is moving at "+this.currentDirection+" direction ");
    }
    public void steer(int currentDirection,int velocity)
    {
        this.currentDirection= this.getCurrentDirection()+currentDirection;
        this.currentVelocity = this.getCurrentVelocity()+velocity;

        System.out.println("Your vehicle is Steer  at "+this.currentVelocity+" km/h at "+this.currentDirection);
    }
    public void Break(int rate)
    {
        this.currentVelocity-=rate;
        System.out.println("Reduce "+rate+" Km/h in your vehicle ");
        System.out.println("Current speed is  "+this.currentVelocity+" Km/h  ");
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
class car extends Vehicle
{
    private int door;
    private int wheel;
    private boolean Automatic;
    private String engine;
    private int gear = 0;
    public car(int size, String name, int door, int wheel, boolean automatic, String engine) {
        super(size, name);
        this.door = door;
        this.wheel = wheel;
        Automatic = automatic;
        this.engine = engine;
    }
    public void move(int currentDirection)
    {
        super.move(currentDirection);
    }
    public void steer(int rate,int currentDirection)
    {
        super.steer(currentDirection,rate);

        System.out.println(super.getCurrentVelocity());
    }
    */
/*public void Break(int rate)
    {
        super.Break(rate);
    }*//*

}
*/

/* * ************************************************************************************************/
//  Constructor good example (how to call overload constructor in java)
// use of this and super
/* * *************************************************************************************************/

/*
    private String name;
    private int leg;
    private int eyes;
    private int brain;
    public Animal()
    {
        this("unknown ",-1,-1);  // -1 is error or null
    }
    public Animal(String name,int leg,int eyes)
    {
        this(name,leg,eyes,-1);
    }
    public Animal(String name,int leg,int eyes,int brain)
    {
        this.name = name;
        this.leg = leg;
        this.eyes = eyes;
        this.brain = brain;
    }*/

/**************************************************************************************************/
//TODO  reference , object , instance etc
/***************************************************************************************************/

    /*
    public static void main(String[] args) {
        NatureColor green = new NatureColor("green",1500.12);


*//*          NatureColor yellow = green; //  yellow reference of green
        System.out.println(green.getPrice());
        System.out.println(yellow.getPrice());
*//*

        System.out.println(green.getPrice());
        System.out.println(green.getColor());

        green = new NatureColor("yellow ",25000); // here we De-referencing the green

        System.out.println(green.getPrice());
        System.out.println(green.getColor());

      //  green.reference(yellow); // passing refere
    }
}
class NatureColor
{
    private String color;
    private double price;

    public NatureColor(String color, double price) {
        this.color = color;
        this.price = price;
    }
    public void reference (NatureColor natureColor)
    {
        System.out.println("reference variable is "+natureColor);
    }
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
*/
/**************************************************************************************************/
//TODO  Inheritance concept 1
/***************************************************************************************************/
/*
        Dog tommy = new Dog("5");

        System.out.println("my dog name is "+tommy.getName());
        System.out.println("my dog have "+tommy.getEyes());
        System.out.println("my dog have  "+tommy.getLeg());
        System.out.println("my dog have  "+tommy.getBrain());
        System.out.println("my dog have  "+tommy.getLifeSpan());

        tommy.eat();
        tommy.move();
        tommy.chew();
    }
}
class  Animal
{

    private String name;
    private int leg;
    private int eyes;
    private int brain;
    private String type;
    public  Animal( String name, int leg, int eyes , int brain,String type)
    {
        this.name = name;
        this.leg = leg;
        this.eyes = eyes;
        this.brain = brain;
        this.type = type;
    }
    public void eat ()
    {
        System.out.println("Animal.eat() is called ");
    }
    public void move()
    {
        System.out.println("Animal.move() is called ");
    }

    public String getName() {
        return name;
    }

    public int getLeg() {
        return leg;
    }

    public int getEyes() {
        return eyes;
    }

    public int getBrain() {
        return brain;
    }

    public String getType() {
        return type;
    }
}
class Dog extends Animal
{
    String lifeSpan;
    public Dog(String lifeSpan) {
        super("dog",4,2,2,"German type");
        this.lifeSpan = lifeSpan;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void chew()
    {
        eat();
        System.out.println("dog is chewing now ");
    }
}
*/


/**************************************************************************************************/
//  Class and object
/***************************************************************************************************/

/*        Car rohit = new Car();
        rohit.setPrice(100000.0);
        rohit.setDoor(4);
        rohit.setWheel(4);
        rohit.setEngine(2);

        System.out.println("rohit car price is "+rohit.getPrice());*/

/**************************************************************************************************/
//  print ten number from user another method
/***************************************************************************************************/

/*boolean isRun =true;
        boolean hasNextInt;
        Scanner s =new Scanner(System.in);

        int min = 0 ,max = 0, number=0;

        while (isRun)
        {

            hasNextInt = s.hasNextInt();
            if (hasNextInt)
            {
                number = s.nextInt();
                if (number>max)
                {
                    max = number;
                }
                else
                {
                    min = number;
                }
                System.out.println("max number is "+max + " min number is "+min);
            }
            else {

                isRun=false;
            }
        }*/

/**************************************************************************************************/
//  print ten number from user another method
/***************************************************************************************************/

/* public static void main(String[] args) {
        boolean isRun =true;
        boolean isNextInt;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int cnt=1,order;

        while (isRun)
        {
            order=+cnt;
            System.out.println("enter value #"+order);
            isNextInt = s.hasNextInt();

            if (isNextInt)
            {
                ++cnt;
                int number = s.nextInt();
                sum+=number;
                if (cnt==10)
                {
                    isRun=false;
                }
            }
        }
        System.out.println("sum of "+cnt+" number is "+sum);
    }*/

/**************************************************************************************************/
//TODO  print ten number from user
/***************************************************************************************************/

/*
    public static int cnt=0;
    public static boolean hasNextInt;
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("how many number to you want (sum ex 10n) ");
        int number = s.nextInt();
        System.out.println(sumOF(number));
    }
    public static int sumOF(int a)
    {

        for (int i=1;i<=a;i++)
        {
            System.out.println("enter number #"+i);
            hasNextInt = s.hasNextInt();
            if (hasNextInt)
            {
                cnt+=s.nextInt();
            }
        }
        s.close();
        return cnt;
    }*/

/**************************************************************************************************/
//TODO  how to take user DOB
/***************************************************************************************************/



        /* Scanner s = new Scanner(System.in);

        System.out.println("enter your name ");
        String name = s.nextLine();
        System.out.println("enter your DOB ");
        boolean hasNextInt = s.hasNextInt();
        if (hasNextInt)
        {

            int year = s.nextInt();
            if (year<= 2021 && year >= 1970)
            {
                int age = 2021 - year;

                if (age>0 && age <= 80)
                {
                    System.out.println("your age is "+age);
                }
                else
                {
                    System.out.println("wrong age "+age);
                }

            }else {
                System.out.println("enter your DOB in 1970-2021 Format");
            }
            s.close();
        }*/

/**************************************************************************************************/
//  Parsing values from string
/***************************************************************************************************/

/*        String numberAsString = "2018";
        String temp = numberAsString;
        temp+=1;
        System.out.println("inc.+ in "+temp);

        int number = Integer.parseInt(numberAsString);
        number+=1;
        System.out.println("number.+ in "+number);

        double numberAsDouble = Double.parseDouble(numberAsString);
        numberAsDouble+=0.545;
        System.out.println("double number "+numberAsDouble);*/


/**************************************************************************************************/
//  greater factor
/***************************************************************************************************/

/*   public static void main(String[] args)
    {
        System.out.println(Greatest(123));
    }
    public static int Greatest(int a)
    {
        int cnt=0;
        if(a>0)
        {
            System.out.println("value of a "+a);
            for (int i=1;i<=a;i++)
            {
                if (a%i==0)
                {
                    System.out.println("value of i "+i);
                    cnt+=i;
                  //  return cnt;
                }
            }
            System.out.println(cnt);
        }
        return cnt;
    }*/
/**************************************************************************************************/
//TODO  Greater common divisor
/***************************************************************************************************/

/*    public static int divisor(int a,int b)
    {
        int greater=-1;
        if (a>10 && b>10)
        {
            for(int i=1; (i<a) &&(i<b);i++)
            {
                if ( (a%i==0) && (b%i==0))
                {
                    greater = i;
                }
            }
        }

        return greater;
    }*/


/**************************************************************************************************/
//TODO  first and last digit checker
/***************************************************************************************************/

/*

    public static boolean firstLast(int a) {

        int temp = -1, lastDigit = 0,firstDigit = 0;
        if (a>0)
        {
            lastDigit = a%10;
            while (!(firstDigit<=9 && firstDigit>0) )
            {
                a/=10;
                firstDigit = a;
            }
        }
        if (firstDigit==lastDigit)
        {
            return  true;
        }
        return false;
    }

    public static String  sum(int a)
    {

        int firstDigit=0 ,lastDigit=0, backupValue;
        backupValue = a;

        if (a>0)
        {

            lastDigit = a%10;
            while (a>9)
            {
                a=a/10;
                firstDigit = a;
            }
            return backupValue +" = "+firstDigit+" + "+lastDigit+" = "+(firstDigit+lastDigit);
        }
        else
        {
            System.out.println("check your number ");
        }
        return null;
    }*/
/**************************************************************************************************/
//  Palindrome number is here
/***************************************************************************************************/

/* public static void main(String[] args)
    {
        System.out.println(Palindrome(123));
        System.out.println("hiii rohit ");

    }
    public static boolean Palindrome(int a)
    {
        int newValue = a;
        int lastDigit=0;
        int reversedValue=0;
        if (a>0)
        {
            while (a>0)
            {
                 lastDigit = a%10;
                 a/=10;
                 reversedValue*=10;
                reversedValue+=lastDigit;
            }
        }
        if (reversedValue == newValue )
        {
            System.out.println("this is Palindrome number ");
            return true;
        }
        else
            {
            System.out.println("not palindrome number ");
            return false;
        }
    }*/


/**************************************************************************************************/
//TODO   Method overloading
/***************************************************************************************************/


/* public static void main(String[] args)
    {
        System.out.println(sumDigit(156));
    }
    public static int sumDigit(int a)
    {
        int original = a;
        int temp=0;
        //  a=125
        if (a>=10)
        {
            while (a>0)
            {
                temp += a%10;
                a = a/10;
            }
        }
        System.out.println("answer of "+original+" is :"+temp);
        return temp;
    }*/


/**************************************************************************************************/
//TODO   Method overloading
/***************************************************************************************************/


/*public static int sum = 0;
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

    }
    public static int sum(int a,int b)
    {
        sum = a+b;
        return sum;
    }
    public static int sum(int a,int b,int c)
    {
        sum = a+b+c;
        return sum;
    }
    public static int sum(int a,int b,int c,int d)
    {
        sum = a+b+c+d;
        return sum;
    }*/


/**************************************************************************************************/
//TODO   Shared digit
/***************************************************************************************************/


/* public static void main(String[] args) {
        boolean shareDigit = SharedDigit(11,92);
        System.out.println(shareDigit);
    }
    public static boolean SharedDigit(int a,int b)
    {
        if ((a>=10 && a<=99) && (b>=10 && b<=99))
        {
            int temp = a%10;
            int t = a/10;
            int temp1 = b%10;
            int t1 = b/10;
            if (temp==temp1 || temp== t1 || t==temp1 || t==t1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }*/


/**************************************************************************************************/
//TODO   hour minute year calculator
/***************************************************************************************************/

/*public static void main(String[] args) {


        System.out.println(Calculator(518400));

        *//*
 *   1 min = 60 sec
 *   1 hour = 60 minute
 *   1 day = 24 hour
 *   1 month = 30 day
 *   1 year = 12 month
 *   43200 minute  = 1 month
 *   43200*12 = 12 month
 * *//*
    }
    public static String Calculator(int minute)
    {
        if (minute>0)
        {
            int hour = minute/60;
            int remainMinute = hour*60 - minute;
            int day = hour/24;
            int remainHour = day*24 - hour;
            int month = day/30;
            int remainDay= month*30 - day;

              return  "Month  "+month+" Remain Day "+remainDay+" Remain Hour "+ (remainHour>0?remainHour:0)+" day "+day
                +" Remain min  "+reminMin+" hour "+hour;
        }
        else {
            return "error";
        }
    }
*/
/**************************************************************************************************/
// TODO  Equal teen checker
/***************************************************************************************************/

/* public static void main(String[] args)
    {
        boolean hasTenn;

       hasTenn = hasTeen(12,13,15);
        System.out.println(hasTenn);

        hasTenn = hasTeen(22,13,15);
        System.out.println(hasTenn);

        hasTenn = isTeen(10);
        System.out.println(hasTenn);
    }
    public static boolean hasTeen(int a,int b,int c)
    {
        if ((a>=11 && a <=19) && (b>=11 && b <=19) && (c>=11 && c <=19) )
        {
            return true;
        }
            return false;
    }
    public static boolean isTeen(int a)
    {
        if ((a>=11 && a <=19))
        {
            return true;
        }
        return false;
    }*/

/**************************************************************************************************/
//TODO   EqualsumChecker
/***************************************************************************************************/

/*
    public static void main(String[] args) {

            EqualsumChecker(1,1,2);
    }
    public static void EqualsumChecker(int a,int b,int c)
    {
        if (a+b==c)
        {
            System.out.println("number same ");
        }
        else {
            System.out.println("number are not same ");
        }
    }
 */

/**************************************************************************************************/
//TODO   decimal compare
/***************************************************************************************************/

/*public static void main(String[] args) {
         decimalCompare(1.5025,1.5035);
    }
    public static boolean decimalCompare(double one,double two)
    {

        int first = (int) one * 1000;
        int second = (int) two * 1000;

        System.out.println(first+ " "+ second);

        if (first==second)
        {
            System.out.println("number are same ");
            return true;
        }
        else
        {
            System.out.println("number are not same ");
            return false;
        }
    }*/

/**************************************************************************************************/
//TODO Leap year
/***************************************************************************************************/

/*
    public static void main(String[] args) {
        int year=2011;

        if ((year%400==0) || (year%4==0) || (year%100==0))
        {
            System.out.println(year+" is leap year");
        }
        else
        {
            System.out.println("not");
        }
    }
*/


/**************************************************************************************************/
//TODO 4.14 Barking dog challenge
/***************************************************************************************************/


    /*
    public static void main(String[] args) {
        String dogName;
        Scanner s = new Scanner(System.in);

        System.out.println("Your Dog Name ");
        dogName = s.next();

        System.out.println("Temperature in Your Location  ");
        int temp = s.nextInt();

        if (temp>=0)
        {
            boolean bark = HealthChecker(temp);
            if (bark)
            {
                System.out.println(dogName+" will be bark ");
            }
            else
            {
                System.out.println("everthing seems like cool");
            }
        }
        else
        {
            System.out.println("Please Call The Animal Adivosry Number ");
            System.out.println("************ Call on this number 1800-880-956 ******** ");
        }

    }
    public static boolean HealthChecker(int temp)
    {
        if (temp>=35)
        {
            return true;
        }
        else if (temp>=30)
        {
            return true;
        }
        else if (temp>=25)
        {
            return false;
        }
        else if (temp>=20)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
*/


/**************************************************************************************************/
//TODO 4.13 KB TO MB CHALLENGE
/***************************************************************************************************/

/*public static void main(String[] args) {
        int KB, MB;
        boolean repeat=true;
        Scanner s = new Scanner(System.in);


        while (repeat) {
            System.out.println("What Service you Want from us ");
            System.out.println("1. MB to KB ");
            System.out.println("2. KB to MB ");
            System.out.println("3. PRINT LINE ");
            System.out.println(" Enter your choice ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Your MB (** 1 MB)");
                    MB = s.nextInt();
                    KB = MB * 1024;
                    System.out.println("Your TOTAL MB Was IN KB " + KB + " Bytes");
                    break;
                case 2:
                    System.out.println("Enter Your KB (** 1024 KB)");
                    KB = s.nextInt();
                    MB = KB / 1024;
                    System.out.println("Your TOTAL KB Was IN MB " + MB + " Bytes");
                    break;
                case 3:
                    printStatement();
                    break;
                default:
                    repeat=false;
                    break;

            }
        }
    }
    public static void printStatement()
    {
        System.out.println("What Service you Want from us ");
        System.out.println("1. MB to KB ");
        System.out.println("2. KB to MB ");
    }*/