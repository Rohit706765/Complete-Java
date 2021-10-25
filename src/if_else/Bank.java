package if_else;

// this class for Constructor example
public class Bank
{
    private String name;
    private double balance;
    private String mobileNumber;
    private String AccountNumber;
    private String AccountType;

    Bank(String name,double initialAmount , String mobileNumber,String AccountNumber)
    {
        this.name = name;
        if (initialAmount>500)
        {
         this.AccountType="Saving";
        }
        else if(initialAmount>20000)
        {
            this.AccountType="Current";
        }
        else {
            this.AccountType="Zero";
        }

        this.balance = initialAmount;

        this.mobileNumber = mobileNumber;
        this.AccountNumber = AccountNumber;
    }
    Bank(double initialAmount , String mobileNumber,String AccountNumber)
    {
        this("unknown",initialAmount,mobileNumber,AccountNumber);
    }
    public void depositAmount(double amt)
    {
        if (AccountType.equals("Zero"))
        {
            if (amt>25000)
            {
                System.out.println("You Reached your Limit Amount (Zero Account Type )");
            }
            else {
                if (this.balance>=0)
                {
                    this.balance+=amt;
                    System.out.println(this.name+" your new Balance is "+this.balance);
                }
                else
                {
                    System.out.println("Current balance is "+this.balance);
                }
            }
        }
        else if (AccountType.equals("Saving"))
        {
            if (amt>100000)
            {
                System.out.println("You Reached your Limit Amount (Saving Account Type )");
            }
            else {
                if (this.balance>=0)
                {
                    this.balance+=amt;
                    System.out.println(this.name+" Your new Balance is "+this.balance);
                }
                else
                {
                    System.out.println("Current balance is "+this.balance);
                }
            }
        }
        else
        {

            if (amt>200000)
            {
                System.out.println("You Reached your Limit Amount (Current Account Type )");
            }
            else {
                if (this.balance>=0)
                {
                    this.balance+=amt;
                    System.out.println(this.name+" Your new Balance is "+this.balance);
                }
                else
                {
                    System.out.println("Current balance is "+this.balance);
                }
            }
        }
    }
    public void withDraw(double amt)
    {
        if (this.balance-amt>=0)
        {
            this.balance-=amt;
            System.out.println("Successfully withdraw "+amt+" now Remaining balance in "+this.name +" Account is "+ this.balance);
        }
        else
        {
            System.out.println(this.name+" Your  Balance is "+this.balance+" not Enough  ");
        }
    }
    public void accountType()
    {
        System.out.println(this.name+" your Account type is "+this.AccountType);
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }
}
