package BankApp;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount)
    {
        if(findCustomer(customerName)==null)
        {
            customers.add(new customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addTransation(String customerName,double Tamount)
    {
        customer existing_customer = findCustomers(customerName);
        if(existing_customer!=null)
        {
            existing_customer.addTransaction(Tamount);
            return true;
        }
        return false;
    }
    public void listOfCustomer()
    {
        System.out.println("Customer in our Branch ");
        for (int i=0;i<customers.size();i++)
        {
            System.out.println("#"+i+" Name : "+customers.get(i).getCustomerName());
        }
    }
    public void showCustomerTransaction(boolean showMyTransaction)
    {
            for (int i=0;i<customers.size();i++)
            {
                System.out.println("#"+(i+1)+" name :"+customers.get(i).getCustomerName());

                if (showMyTransaction)
                {
                    customer customer = customers.get(i);
                    System.out.println("Your Transaction History is Here ");
                    for (int j=0;j<customer.getTransaction().size();j++)
                    {
                        System.out.println("#"+(j+1)+" Transaction "+customer.getTransaction().get(j));
                    }
                }
            }

    }
    //  it return name of the based of name

    private String findCustomer(String customerName)
    {
        for (int i=0;i<customers.size();i++)
        {
            customer tempCustomer = customers.get(i);

            if (tempCustomer.getCustomerName().equals(customerName))
            {
                return customerName;
            }
        }
        return null;
    }

    private customer findCustomers(String customerName)
    {
        for (int i=0;i<customers.size();i++)
        {
            customer existCustomer = customers.get(i);
            if (existCustomer!=null)
            {
                if (existCustomer.getCustomerName().equals(customerName))
                {
                    return existCustomer;
                }
            }
        }
        return null;
    }
}
