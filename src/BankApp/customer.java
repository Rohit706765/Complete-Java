package BankApp;

import java.util.ArrayList;

public class customer {

    private String customerName;
    private ArrayList<Double> transaction;

    public customer(String customerName,double initialAmount)
    {
        this.customerName = customerName;
        this.transaction = new ArrayList<>();
        addTransaction(initialAmount);
    }
    public boolean addTransaction(double amt)
    {
        if (amt>0)
        {
            this.transaction.add(amt);
            return true;
        }
        return false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
