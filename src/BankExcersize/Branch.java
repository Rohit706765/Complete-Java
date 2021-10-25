package BankExcersize;

import java.util.ArrayList;

public class Branch {
    private String  name;
    private ArrayList<Customer1> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer1> getCustomers() {
        return customers;
    }

    public boolean AddCustomer(String name, double initialAmount)
    {
        Customer1 customer=findCustomer(name);
        if(customer!=null)
        {
            System.out.println("This Customer "+customer.getName()+" is Already Exist in branch ");
            return false;
        }

        customers.add(new Customer1(name,initialAmount));
        return true;
    }
    public  boolean AddCustomerTransaction(String name,double InitialAmount)
    {
        Customer1 customer=findCustomer(name);
        if(customer!=null)
        {
            customer.AddTransaction(InitialAmount);
            return true;
        }
        return false;
    }
    private Customer1 findCustomer(String name)
    {
        for (int i=0;i<customers.size();i++)
        {
            Customer1 customer=customers.get(i);
            if(customer.getName().equals(name))
            {
                return customer;
            }
        }
        return null;
    }
}


/*
     *   this code fully work you can also try
     *   this code run on Arraylist concept
     *   simple banking Application which have many facility
     * */
   /* private String BranchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName) {
        BranchName = branchName;
        this.customer = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public String getBranchName() {
        return BranchName;
    }

    public boolean AddCustomer(String name, double Transaction)
    {
        if(findCustomer(name)!=null)
        {
            System.out.println(name+" is Already exit in branch ");
            return false;
        }
        customer.add(new Customer(name,Transaction));// this is the best method to create obj and call constructor
        return true;
    }
    public boolean AddCustomerTransaction(String name,double Amount)
    {
        Customer ExistingCustomer=findCustomer(name);
        if(ExistingCustomer==null)
        {
            System.out.println(" customer "+name+" is not Exist ");
            return false;
        }
        ExistingCustomer.AddTransaction(Amount);
        return true;
    }
    private Customer findCustomer(String name)
    {
        for (int i=0;i<customer.size();i++)
        {
            Customer CheckedCustomer=customer.get(i);
            if(CheckedCustomer.getCustomeName().equals(name))
            {
                return CheckedCustomer;
            }
        }
        return null;
    }

}




*/























    /*
    *   this class Used by Arraylist Autoboxing and unboxing challenge
    *
    * */
  /*  private static ArrayList<Customer> MyCustomer;
    private String BranchName;

    public static ArrayList<Customer> getMyCustomer() {
        return MyCustomer;
    }

    public Branch(String branchName) {
        BranchName = branchName;
        MyCustomer=new ArrayList<Customer>();
    }

    public static Branch CreateBranch(String branchName)
    {
        return new Branch(branchName);
    }
    public static void PrintAllCustomer()
    {
        for (int i=0;i<MyCustomer.size();i++)
        {
            System.out.println((i+1)+". Customer Name ---->"+MyCustomer.get(i).getCustomerName()+" ------> "+MyCustomer.get(i).getTransactionList());
        }
    }
    public static boolean AddCustomer(Customer customer)
    {
        int foundPosition=FindCustomer(customer.getCustomerName());
        if(foundPosition>=0)
        {
            System.out.println("Customer "+customer.getCustomerName()+" is Already in branch ");
            return false;
        }
        MyCustomer.add(customer);
        return true;
    }
    private static boolean AddTransaction(Customer customer)
    {
        int findPosition=FindCustomer(customer.getCustomerName());
        if(findPosition<0)
        {
            System.out.println("No Customer With Name "+customer.getCustomerName());
            return false;
        }
        customer.addTransaction(customer);
        return true;
    }
    private static int FindCustomer(Customer customer)
    {
        return MyCustomer.indexOf(customer);
    }
    private static int FindCustomer(String CustomerName)
    {
        for (int i=0;i<MyCustomer.size();i++)
        {
            Customer customer=MyCustomer.get(i);
            if(customer.getCustomerName().equals(CustomerName))
            {
                return i;
            }
        }
        return -1;
    }

    public String getBranchName() {
        return BranchName;
    }
}
*/