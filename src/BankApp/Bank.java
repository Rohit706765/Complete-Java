package BankApp;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches =  new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName)
    {
        if (findBranch(branchName)==null)
        {
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }
    public boolean addCustomerToBranch(String branchName,String customerName,double initialAmt)
    {
        Branch mybranch = findBranchs(branchName);
        if (mybranch!=null)
        {
            return mybranch.addCustomer(customerName,initialAmt);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName , double amount)
    {
        Branch branch = findBranchs(branchName);
        if (branch!=null)
        {
            return branch.addTransation(customerName,amount);
        }
        return false;
    }
    private String findBranch(String name)
    {
        for (int i=0;i<branches.size();i++)
        {
            Branch branch = branches.get(i);

            String branchName = branch.getName();
            if (branchName.equals(name))
            {
                return name;
            }
        }
        return null;
    }

    private Branch findBranchs(String branchName)
    {
        for (int i = 0; i < branches.size(); i++)
        {
            Branch branch = branches.get(i);

            if (branch.getName().equals(branchName))
            {
                return branch;
            }
        }
        return null;
    }
    public boolean showCustomer(boolean transactionHistory,String branch)
    {
        Branch branch1 = findBranchs(branch);
        if (branch1!=null)
        {
            System.out.println("customer of "+branch1.getName()+" branch ");

            ArrayList<customer> customers = branch1.getCustomers();

            for (int i=0;i<customers.size();i++)
            {
                customer branchCustomer = customers.get(i);
                System.out.println("Customer : "+branchCustomer.getCustomerName());
                Scanner s = new Scanner(System.in);

                if (transactionHistory)
                {
                    System.out.println("Transaction ");
                    ArrayList<Double> transaction = branchCustomer.getTransaction();

                    for (int j=0;j<transaction.size();j++)
                    {
                        System.out.println((j+1)+". "+transaction.get(j));
                    }
                }

            }
            return true;
        }
        return false;
    }
}
