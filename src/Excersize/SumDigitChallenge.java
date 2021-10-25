package Excersize;

public class SumDigitChallenge {
    public static void main(String ar[])
    {
        // Ex if you give 125 number then total value will be 1+2+5=8
        SumDigit(111);
    }
    public static void SumDigit(int num)
    {
        if(num<10)
        {
            System.out.println(" less than 10 not allow here !! so check your ass @@");
        }
        int temp=0;
        int remind=0;

        while (num>=10)
        {
            while(num!=0)
            {
                temp += num % 10;
                num /= 10;
            }
        }
        System.out.println(temp);

    }
}
