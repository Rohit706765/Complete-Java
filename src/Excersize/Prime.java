package Excersize;

public class Prime {
    public static void  main(String ar[])
    {
        int cnt=1;
        for (int i=2;i<50;i++)
        {
            if(cnt == 10)
            {
                break;
            }
            if(Isprime(i))
            {
                ++cnt;
                System.out.println("Number "+i+" is prime number ");
            }
        }
    }
    public static boolean Isprime(int num)
    {
        if(num==1 || num<0)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }
        else if(num%2==0)
        {
                return false;
        }
        else
        {
                return true;
        }

    }
}
