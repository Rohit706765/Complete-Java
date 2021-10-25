package Excersize;

public class Perfect {

    public static void main(String ar[])
    {
        int cnt=0;
        for (int x=1;x<50;x++)
        {
            if (cnt==10)
            {
                break;
            }
            if (IsPerfect(x))
            {
                ++cnt;
                System.out.println(x+" is perfect number");
            }
        }

    }

    public static boolean IsPerfect(int Number)
    {
        if(Number<0)
        {
            System.out.println("Not Allow here ");
        }
        int sum=0;
        for (int i=1;i<=Number/2;i++)
        {
            if(Number%i==0)
            {
                sum+=i;
            }
        }


        if (sum==Number)
        {
            //System.out.println(Number+" is perfect number");
            return true;
        }
        else {
            return false;
        }
    }
}
