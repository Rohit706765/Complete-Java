package ControlLoop;

public class for_loop {
    /*public static void main(String arg[]) {
       /* double amt,interest=0;
        System.out.println("Enter Amount ");
        Scanner s=new Scanner(System.in);
        amt=s.nextDouble();
        for (double i=0;i<9;i++)
        {
            System.out.println(i+" Interest of "+ amt+" is "+String.format("%.2f",Find_interest(amt,i)));
            //%.2f means it will return only two precision value of decimal point
        }
        System.out.println("*********************************************");
        System.out.println(" Enter Amount ");
        amt=s.nextDouble();
        for (double i=10;i>2;i--)
        {
            System.out.println(i+" Interest of "+ amt+" is "+String.format("%.2f",Find_interest(amt,i)));
            //%.2f means it will return only two precision value of decimal point
        }
    }
    public static double Find_interest(double amt,double interest)
    {
        return (amt*(interest/100));
    }*/

        /// Prime number

        /*int a=4;
        boolean Check_prime=false;
        System.out.println(" Is Your number "+a+" Prime : "+ Isprime(a));
        System.out.println(" Is Your number "+a+" Prime : "+ Isprime(a));

    }
    public static boolean Isprime(int a)
    {
        if(a==0)

        {
            System.out.println(" Not Prime !!");
        }
        for(int i=2;i<=a/2;i++)
        {
           // System.out.println("Prime ");
            return true;
        }
        return false;
    }*/
/*
    public static void main(String a[])
    {
        int count=0;
        for(int i=1;i<150;i++)
        {
            if(Isprime(i))
            {
                count++;
                System.out.println("Number  "+i+" is Prime value ");
            }

            if(count==10)
            {
                break;
            }
        }
    }
    public static boolean Isprime(int num)
    {
        if( num==1)
        {
            System.out.println(" Not Prime  !!" );
        }
        for(int i=2;i <= num/2;i++)
        {
            if(num%i==0)
            {
                return false;

            }

        }
        return true;
    }*/
    // Challenge 3 amd 5
/*
    public static void main(String ag[])
    {
        int temp=0;
        int cnt=0;
        System.out.println("");
        for(int i=0;i<1000;i++)
        {


            if((i%3==0)&&(i%5==0))
            {
                cnt++;
                temp+=i;

                System.out.println("total sum is :"+temp);
                System.out.println(" No :"+i);
            }
            if(cnt==5)
            {
                break;
            }
        }
        System.out.println(cnt);
    }*/
    public static void main(String ar[])
    {
        int even=0,cnt=0,odd=0;

        for(int i=0;i<1000;i++)
        {
            if(cnt==10)
            {
                break;
            }
            if(i%2==0)
            {
                System.out.println(" Even no is :"+i);
                cnt++;
                even+=i;
            }
            else
            {
                System.out.println(" Odd  No is :"+i);
                cnt++;
                odd+=i;
            }

        }
        System.out.println(" Even sum :"+even);
        System.out.println(" odd sum :"+odd);

    }

}
