package BankExersizeMe;

import java.util.ArrayList;

public class Bank_Concept {
    private String AccountNumber;
    private String Name;
    private double Amount;
    private boolean IsTransaction;
    private double balance;
    private String email;
    private double History;
    private int Cnt=0;
    ArrayList<Double> Deposit=new ArrayList<>();
    ArrayList<Double> Withdraw=new ArrayList<>();
    public Bank_Concept(String accountNumber, String name, double amount,boolean IsTransaction,String email) {
        int len=accountNumber.length();

        if(len >10 || len<=0)
        {
            System.out.println("You may be entered Invalid Account Number ");
            return;
        }
        else
        {
            this.AccountNumber = accountNumber;
        }
        this.IsTransaction=IsTransaction;
        Name = name;
        this.Amount = amount;
        this.email = email;
    }
    public void DespositAmount(double amount)
    {
        if(amount<=0)
        {
            return;
        }
        if(IsTransaction)
        {
            ++Cnt;
            this.balance+=amount;
            Deposit.add(amount);
            System.out.println("Added "+amount+" Now Available Balance is "+this.balance);
        }
        else
        {
            System.out.println("You are no doing any Trasaction since 1 month So \n"+" your Account is closed ");
            System.out.println("Fill up Three forms ");
            Form();
        }
    }
    public double withdrawAmount(double WithdrawAmount)
    {
        if(WithdrawAmount<=0)
        {
            System.out.println("Invalid Withdraw amount  ");
            return -1;
        }
        if((this.balance-WithdrawAmount)<0)
        {
            System.out.println("Withdraw not proceess Remaining balance is "+this.balance);
            return -1;
        }
        if ((this.balance-WithdrawAmount)>=0)
        {
            Withdraw.add(WithdrawAmount);
           this.balance-=WithdrawAmount;
            System.out.println("Successfully Withdraw "+WithdrawAmount+" Now Remaining balance is "+this.balance);
            return balance;
        }
        else {
            return -1;
        }
    }
    public void History()
    {
        System.out.println("Your Transaction is here ");
        System.out.println("Deposit Details ");
        for (int i=0;i<Deposit.size();i++)
        {
            System.out.println((i+1)+" Transaction "+" Deposit--->"+Deposit.get(i));
        }
        System.out.println("Withdraw Details ");
        for (int j=0;j<Withdraw.size();j++)
        {
            System.out.println((j+1)+" Transaction "+" Withdraw ---->"+Withdraw.get(j));
        }
    }
    public void Form()
    {
        System.out.println("Form Details ");
        System.out.println("1. Mobile facility ");
        System.out.println("2. Atm card issue  ");
        System.out.println("3. Sms facility  ");

    }
}
