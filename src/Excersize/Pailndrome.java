package Excersize;

import java.util.Scanner;
public class Pailndrome {

    public static void main(String arg[])
    {
        int len=0,Number=0;
        boolean IsPalidrome=false;
        String NumberHolder="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        NumberHolder=s.next();
        len=NumberHolder.length();
        Number=Integer.parseInt(NumberHolder);
        IsPalidrome=IsPalindrome(Number,len);
        System.out.println("Your number "+Number+" is Palindrome "+IsPalidrome);
    }
    public static boolean IsPalindrome(int Number,int len)
    {
        String Continue="";
        Scanner s=new Scanner(System.in);
        System.out.println("Do you want to Continue "+'\n'+" yes---no ");
        Continue=s.next();
        Continue=Continue.toLowerCase();
       while (Continue.equals("yes"))
       {
           int OriginalCopy=Number;
           int rev=0,LastDigit,sum=0;
           if(len>=2)
           {
               while (Number>0)
               {
                   LastDigit=Number%10;
                   rev*=10;
                   rev+=LastDigit;
                   Number/=10;
               }
               if(rev==OriginalCopy)
               {
                   return true;
               }

           }
           else {
               return false;
           }
       }

        return false;
    }

    /**
 *
 * */
     /*
    public static void main(String ar[])

        {
            int count=0;
            System.out.println("First 1000 Prime number is here ");
            for(int i=0;i<1000;i++)
            {
                if(IsPrime(i))
                {
                    count++;
                    System.out.println(" Prime value is :"+i);
                }
                if(count==50)
                {
                    break;
                }
            }

        }
        public static boolean IsPrime(int Num)
        {
            if(Num<=0 || Num==1)
            {
                System.out.println("Negative and one value is not allow here ");
                return false;
            }
            for(int i=2;i<=Num/2;i++)
            {
                if(Num%2==0)
                {
                    return false;
                }


            };
            return true;
        }*/

    /**
     *
     *      Create code in which sum of all number who are divide by 5 ,3
     * */

    /*public static void main(String ar[])
    {
        int sum=0,count=0;
        for (int i=0;i<150;i++)
        {
            if(Check_sum(i))
            {
                count++;
                if(count==10)
                {
                    break;
                }
                System.out.println(" Number Divide by 3 && 5 is "+i);
                sum+=i;
            }
        }
        System.out.println("Total sum of number "+sum);

    }
    public static boolean Check_sum(int a)
    {
        if((a % 3 == 0)&& (a % 5==0))
        {
            return  true;
        }
        return false;
    }*/


    /**
     *
     *  first and last digit checker
     *
     * */

   /* public static void main(String ar[])
    {
        String ConvertNumber="";
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your number ");
        ConvertNumber=sc.next();
        int Number=Integer.parseInt(ConvertNumber);
        int OriginalCopyNumber=Number;
        int len=ConvertNumber.length();
        if(len>0)
        {
            int[] a =new int[len];
            if(Number<0)
            {
                System.out.println(" Negative value not allowed ");
            }
            for (int i=0;i<len;i++)
            {
                a[i]=Number%10;
                Number=Number/10;
               // Number=Number*10;
            }
            System.out.println("First Digit in "+OriginalCopyNumber +" is "+ a[2]+" Last digit in "+OriginalCopyNumber+" is "+a[0]);
        }
    }
*/


    /**
     *  Palindrome means 121 is Palindrome number okay
     * */

    /*public static void main(String ar[])
    {
        IsPalindrome(121);
        IsPalindrome(222);

    }
    public static boolean IsPalindrome(int a)
    {
        int reverse=0,Lastdigit=0;
        int OriginalCopy=a;
        if(a<0)
        {
            System.out.println(" Negative value is not allow here ");
        }
        while(a>0)
            {
                Lastdigit=a%10;
                reverse*=10;
                reverse+=Lastdigit;
                a=a/10;
            }
        System.out.println(reverse);
        if(reverse==OriginalCopy)
        {
            System.out.println("Reverse Number "+reverse+" Original number "+OriginalCopy);
            System.out.println("both are same ");
            return true;
        }
        else
        {
            return false;
        }


    }*/

    /**
     *
     *   Check a word that Palindrome or not such as
     *   Rar , Pop , Mom etc
     *
     * */
    /*public static void main(String ar[])
    {
        String NameNumber,Reverse="";
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter Any string or number ");
        NameNumber=s.nextLine();
        int Length=NameNumber.length();

        for ( int i=Length-1;i>=0;i--)
        {
            Reverse+=NameNumber.charAt(i);
        }

        if (Reverse.equals(NameNumber))
        {
            System.out.println("Both are Same ");
        }
        else
        {
            System.out.println(" Not equal");
        }
    }*/

    /**
     *    Perfect number is    6=1+2+3  means sum of all divisor equal to the number
     *
     * */
/*
    public static void main(String ar[])
    {
            IsPerfect(6);
            IsPerfect(10);
            IsPerfect(12);
            IsPerfect(28);
            IsPerfect(2);
    }
    public static void IsPerfect(int a)
    {
        int temp=0;

        for(int i=1;i<=a/2;i++)
        {
            if(a % i==0)
            {
                temp+=i;
            }
        }
        if(temp==a)
        {
            System.out.println(temp+" Number is Perfect Number");
        }
        else
        {
            System.out.println(temp+" Number is not Perfect ");
        }
    }*/

    /**
     *
     *  Number to word
     * */
        /*public static void main(String ar[])
        {
            System.out.println(" Number to word Here ");
            NumberToWord(6);
        }
        public static boolean NumberToWord(int a)
        {
            int Remind=0;
            String Number[]={"","one","two","Three","four","five","six","seven","eight","nine","ten"};
            //int num[]=new int[3];// Dynamic type of array
            if(a<0)
            {
                System.out.println(" Negative value is not allow ");
            }
            else if(a>0)
            {
                while(a>0)
                {
                    Remind=a%10;
                    System.out.println(Number[Remind]);
                    return true;

                }
            }
            return false;
        }*/
/**
 *
 *      Largest prime factor checker 6 = 2*3 then 3 is largest prime factor
 *
 * */

/*
        public static void main(String ar[])
        {
            IsPrimeFactor(25);
        }
        public static void IsPrimeFactor(int num)
        {
            int[] Prime =new int[25];
            int cnt=0;
            if(num<0)
            {
                System.out.println(" Error ");
            }
            for (int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    Prime[cnt]=i;
                    System.out.println(Prime[cnt]);
                    cnt++;
                }
            }
            for (int j=0;j<=cnt;j++)
            {
                if(Prime[j]>Prime[j++])
                {
                    System.out.println("Greater: "+Prime[j]);
                }
                else
                {
                    System.out.println("Greater Prime factor is :"+Prime[j++]);
                }

            }

        }
*/

/**
 *
 *  Print Diagonal star using pattern
 *
 * */
        /*public static void pattern(int n)
        {
            // Loop denoting rows
            for (int i = 0; i < n; i++) {

                // Loop denoting columns
                for (int j = 0; j < n; j++) {

                    // Checking boundary conditions
                    // and main diagonal and
                    // secondary diagonal conditions
                    if (i == 0 || j == 0 || i == j
                            || i == n - 1 || j == n - 1
                            || i + j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        // Driver function
        public static void main(String argc[]){

            // n denotes size which should be odd
            int n = 7;

            // Function calling
            pattern(n);
        }
*/


    /**
     *          check the shared  digit between number
     * */
           /* public static void main(String a[])
            {
                Scanner s=new Scanner(System.in);
                System.out.println(" Enter Any number / String ");
                String number=s.next();
                int len=number.length();
                IsShared(number,len);

            }
            public static int IsShared(String a,int len)
            {
                String[] Array=new String[len];
                if(len<0)
                {
                    return -1;
                }
                for (int i=0;i<len;i++)
                {
                    Array[i]= String.valueOf(a.charAt(i));
                    //System.out.println(Array[i]);
                    if(Array[i]==Array[i++])
                    {
                        System.out.println(" Shared digit between "+a+" is "+Array[i]);
                    }
                }
            return 1;
            }*/

    /**
     *
     * ALL factor code in java
     * */
/*
    public static void main(String ar[])
    {
        int a=60;
        for(int i=1;i<=a;++i)
        {
          //  System.out.println("");
            if(a%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }*/
}

