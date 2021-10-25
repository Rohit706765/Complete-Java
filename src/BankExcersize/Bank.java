package BankExcersize;




import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
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

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<>();
    }
    public boolean AddBranch(String name)
    {
        Branch branch=findBranch(name);
        if(branch!=null)
        {
            System.out.println("This Branch "+branch.getName()+" is Already Exist ");
            return false;
        }
        return this.branches.add(new Branch(name));
    }
    public boolean AddCustomer(String BranchName,String CustomerName, double Amount)
    {
        Branch branch=findBranch(BranchName);
        if (branch!=null)
        {
            return branch.AddCustomer(CustomerName,Amount);
        }
        else
         {
             System.out.println("\n");
            System.out.println("Branch "+ BranchName + " is not exist !!! ");
            return false;
        }
    }
    public boolean AddCustomerTransaction(String BranchName,String CustomerName,double Amount)
    {
        Branch branch=findBranch(BranchName);
        if (branch!=null)
        {
            return branch.AddCustomerTransaction(CustomerName,Amount);
        }
        else {
            System.out.println("Branch"+ branch.getName()+ " is not exist ");
            return false;
        }

    }
    private Branch findBranch(String name)
    {
        for (int i=0;i<branches.size();i++)
        {
            Branch branch=branches.get(i);
            if (branch.getName().equals(name))
            {
                return branch;
            }
        }
        return null;
    }
    public boolean CustomerList(String BranchName,boolean TransactionList)
    {
        Branch branch=findBranch(BranchName);
        if(branch!=null)
        {
            System.out.println("Customer list For "+branch.getName()+" Branch ");
            ArrayList<Customer1> BranchCustomer=branch.getCustomers();
            for (int i=0;i<BranchCustomer.size();i++)
            {
                Customer1 customer=BranchCustomer.get(i);
                System.out.println("Customer :"+customer.getName()+" ["+(i+1)+"]");
                if(TransactionList)
                {
                    ArrayList<Double> Transaction=customer.getTransaction();
                    System.out.println("Transaction ");
                    for (int j=0;j<Transaction.size();j++)
                    {
                        System.out.println("[ "+(j+1)+" ]"+" Amount "+Transaction.get(j));
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}

    /*
     *   this code fully work you can also try
     *   this code run on Arraylist concept
     *   simple banking Application which have many facility
     * */

    /*private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<>();
    }
    public boolean AddBranch(String name)
    {
        if(findBranch(name)==null)
        {
            branches.add(new Branch(name));
            return true;
        }
        else
        {
            System.out.println("Already Exist This Branch  "+name);
            return false;
        }
    }
    public boolean AddCustomer(String BranchName,String name,double InitialAmount )
    {
        Branch branch=findBranch(BranchName);
        if (branch!=null)
        {
            return branch.AddCustomer(name,InitialAmount);
        }
        return false;
    }
    public boolean AddCustomerTransaction(String BranchName, String name,double Amount)
    {
        Branch branch=findBranch(BranchName);
        if (branch!=null)
        {
           return branch.AddCustomerTransaction(name,Amount);
        }
        return false;
    }
    private Branch findBranch(String name)
    {
        for (int i=0;i<branches.size();i++)
        {
            Branch branch=branches.get(i);
            if (branch.getBranchName().equals(name))
            {
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomer(String BranchName,boolean showTransaction)
    {
        Branch branch=findBranch(BranchName);
        if(branch!=null)
        {
            System.out.println("Customer for Branch "+branch.getBranchName());
            ArrayList<Customer> BranchCustomer=branch.getCustomer();
            for (int i=0;i<BranchCustomer.size();i++)
            {
                Customer BranchCustomers=BranchCustomer.get(i);
                System.out.println("Customer : "+BranchCustomers.getCustomeName()+" ["+(i+1)+"]");
                if(showTransaction)
                {
                    System.out.println("Transaction");
                    ArrayList<Double> CustomerTransaction=BranchCustomers.getTransaction();
                    for (int j=0;j<CustomerTransaction.size();j++)
                    {
                        System.out.println("[ "+(j+1)+" ]"+" Amount "+CustomerTransaction.get(j));
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}



*/

/**
 *  this class Used by Arraylist Autoboxing and unboxing challenge  {@link Bank}
 * */

/*
    private static String BranchName;
    private static Customer customer=new Customer("unknown ",0);
    private static Scanner s=new Scanner(System.in);
    private static ArrayList<Branch> MyBranch=new ArrayList<>();
    private static Branch branch=new Branch(BranchName);

    public static ArrayList<Branch> getMyBranch() {
        return MyBranch;
    }

    public static void main(String ar[])
    {
        boolean quit=false;
        int choice=1;
        printStatement();
        while (!quit)
        {
            System.out.println("Enter Action :");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Branch List ");
                    PrintAllBranch();
                    break;
                case 2:
                    System.out.println("Enter Branch Name ");
                    String BranchName=s.next();
                    if(AddBranch(BranchName))
                    {
                        System.out.println("Successfully Added "+BranchName);
                    }
                    break;
                case 3:
                    AddCustomer();
                    break;
                case 4:
                    printStatement();
                    break;
                case 5:
                    PrintAll();
                    break;
                case 6:
                    PrintAllCustomer();
                    break;
                default:
                    System.out.println("Mismatch ");
                    break;
            }
        }
    }
    private static void printStatement()
    {
        System.out.println("0. Exit Now \n"+
                            "1. Print All Branch \n"+
                           "2. Add Branch \n"+
                            "3. Add Customer \n"+
                            "4. Print All Statement \n"+
                           "5. Print Branch With Customer And Transaction \n"+
                            "6. Print All Customer with Transaction \n");
        System.out.println("enter Avaliable (7 Action)");
    }

    private static void PrintAll()
    {
        for (int i=0;i<Branch.getMyCustomer().size();i++)
        {
            System.out.println((i+1)+". Branch Name ---> "+getMyBranch().get(i).getBranchName()+"\n"+(i+2)+". Customer Name ---> "+Branch.getMyCustomer().get(i).getCustomerName()+"\n"+(i+3)+" Initial Amount --->"+Branch.getMyCustomer().get(i).getTransactionList());
        }
    }
    private static void PrintAllBranch()
    {
        for(int i=0;i<MyBranch.size();i++)
        {
            System.out.println((i+1)+". "+MyBranch.get(i).getBranchName());
        }
    }
    private static void PrintAllCustomer()
    {
        for (int i=0;i<Branch.getMyCustomer().size();i++)
        {
            System.out.println((i+1)+" Customer Name---> "+Branch.getMyCustomer().get(i).getCustomerName()+" Transaction---> "+Branch.getMyCustomer().get(i).getTransactionList());
        }
    }
    private static void AddCustomer()
    {
        System.out.println("Enter Customer Name ");
        String CustomerName=s.next();
        System.out.println("Enter Customer Initial Transaction ");
        double Transaction=s.nextDouble();
        System.out.println(Transaction);

        Customer customer= Customer.CreateCustomer(CustomerName,Transaction);
        customer.addTransaction(customer);
        if (Branch.AddCustomer(customer))
        {
            System.out.println("Successfully Added "+customer.getCustomerName()+" Initial Amount "+customer.getTransactionList());
        }
        else {
            System.out.println(" Error ");
        }
    }
    private static boolean AddBranch(String BranchName)
    {
        int foundPosition=FindBranch(BranchName);
        if (foundPosition>=0)
        {
            System.out.println(BranchName+" is Already Exist ");
            return false;
        }
        Branch branch=Branch.CreateBranch(BranchName);
        MyBranch.add(branch);
        return true;
    }
    private static int FindBranch(String BranchName)
    {
        for (int i=0;i<MyBranch.size();i++)
        {
            Branch branch=MyBranch.get(i);
            if (branch.getBranchName().equals(BranchName))
            {
                return i;
            }
        }
        return -1;
    }
    private static int FindBranch(Branch branch)
    {
        return MyBranch.indexOf(branch);
    }
}



*/


    /*
    private static ArrayList<Branch> Mybank=new ArrayList<>();
    private static Scanner s=new Scanner(System.in);
    public static void main(String ar[])
    {
        int choice=1;
        boolean quit=false;
        System.out.println("1. Add Branch ");
        System.out.println("2. Print All Branch ");
        System.out.println("3. Add customer  ");
        while (!quit)
        {
            System.out.println("Enter Action");
            choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter Branch Name ");
                    String BranchName=s.next();
                    Branch branch1=Branch.CreateBranch(BranchName);
                    if (AddBranch(branch1))
                    {
                        System.out.println("Successfully Added "+branch1.getBranchName());
                    }
                    break;
                case 2:
                    PrintAllBranch();
                    break;
                case 3:
                    System.out.println("Enter Customer Name ");
                    String CustomerName=s.next();
                    System.out.println("Enter Initial Transaction Amount ");
                    double Transaction=s.nextDouble();
                    Customer customer=Customer.CreateCustomer(CustomerName,Transaction);

                    if(branch1.AddCustomer(customer))
                    {
                        System.out.println("Successfully Added "+customer.getCustomerName()+" in "+branch.getBranchName());
                    }
                    break;
                default:
                    System.out.println("MisMatch at Choice ");
                    break;
            }
        }
    }
    private static boolean AddBranch(Branch branch)
    {
        int Position=FindBranch(branch.getBranchName());
        int pos1=FindBranch(branch);
        System.out.println("Entire record "+pos1);

        if(Position>=0)
        {
            System.out.println(branch.getBranchName()+" Branch is Already Exist ");
            return false;
        }
        Mybank.add(branch);

        return true;
    }

    private static void PrintAllBranch()
    {
        for (int i=0;i<Mybank.size();i++)
        {
            System.out.println((i+1)+" Branch Name---> "+Mybank.get(i).getBranchName());
        }
    }
    private static int FindBranch(Branch branch)
    {
        return Mybank.indexOf(branch);
    }
    private static int FindBranch(String BranchName)
    {
        for (int i=0;i<Mybank.size();i++)
        {
            Branch branch1=Mybank.get(i);
            if(branch1.getBranchName().equals(BranchName))
            {
                return i;
            }
        }
        return -1;
    }
}
class Branch
{
    private String BranchName;
    private static ArrayList<Customer> MyCustomer=new ArrayList<>();

    public Branch(String branchName) {
        BranchName = branchName;
    }
    public static boolean AddCustomer(Customer customer)
    {
        int foundPosition=findCustomer(customer.getCustomerName());
        if((foundPosition)>=0)
        {
            System.out.println("This Customer "+customer.getCustomerName()+ "Is Already Our Customer ");
            return false;
        }
        MyCustomer.add(customer);
        return true;
    }
    public static int findCustomer(String CustomerName)
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
    public static Branch CreateBranch(String branchName)
    {
        return new Branch(branchName);
    }
}
class Customer
{
    private String CustomerName;
    private ArrayList<Transation> MyTransation=new ArrayList<Transation>();
    private double Transaction;
    public Customer(String customerName, double Transaction) {
        CustomerName = customerName;
        this.Transaction=Transaction;
    }

    public ArrayList<Transation> getMyTransation() {
        return MyTransation;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public static Customer CreateCustomer(String CustomerName,Double Transaction)
    {
        return new Customer(CustomerName,Transaction);
    }
}
class Transation
{
    private  double Transaction;

    public Transation(double transaction) {
        Transaction = transaction;
    }

    public double getTransaction() {
        return Transaction;
    }
}
*/