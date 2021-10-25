package BankExcersize;

import java.util.ArrayList;

public class Customer1 {
        private String name;
        private  ArrayList<Double> Transaction;
        private  double TotalTransaction;
        private double TransactionLimit=100000;
    public Customer1(String name, double Transaction) {
        this.name = name;
        this.Transaction=new ArrayList<>();
        AddTransaction(Transaction);
    }
    public void AddTransaction(double InitialAmount)
    {
        this.Transaction.add(InitialAmount);
    }
    public void ShowBalance()
    {
        for (int i=0;i<Transaction.size();i++)
        {
            TotalTransaction+=Transaction.get(i);
        }
        System.out.println("Total Transaction "+TotalTransaction);
        if(TotalTransaction>=100000)
        {
            System.out.println("You Just Cross Your Monthly Transaction Limit ");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return Transaction;
    }
}

























/*
    *   this code fully work you can also try
    *   this code run on Arraylist concept
    *   simple banking Application which have many facility
    * */


    /*private String CustomeName;
    private ArrayList<Double> Transaction;

    public Customer(String customeName,double Transaction) {
        CustomeName = customeName;
        this.Transaction=new ArrayList<Double>();
        AddTransaction(Transaction);
    }
    public void AddTransaction(double InitialAmount)
    {
        this.Transaction.add(InitialAmount);
    }

    public String getCustomeName() {
        return CustomeName;
    }

    public ArrayList<Double> getTransaction() {
        return Transaction;
    }
}

*/





















    /*
     *   this class Used by Arraylist Autoboxing and unboxing challenge
     *
     * */
   /* private String CustomerName;
    private ArrayList<Double> TransactionList;
    private double Transaction;

    public Customer(String customerName,double Transaction) {
        this.CustomerName = customerName;
        TransactionList=new ArrayList<Double>();
        this.Transaction=Transaction;

    }
    public void addTransaction(Customer customer)
    {
        this.Transaction=customer.Transaction;
        this.TransactionList.add(this.Transaction);
    }

    public ArrayList<Double> getTransactionList() {
        return TransactionList;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public static Customer CreateCustomer(String customerName,double transaction)
    {
        return new Customer(customerName,transaction);
    }
}
*/