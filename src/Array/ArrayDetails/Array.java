package Array.ArrayDetails;

public class Array {
    public  static void main(String ar[]) {
        int num=0;
        int[] number={4,5,6,7,8,9,10,11,12,13};
        System.out.println("sum of number "+SumOfNumber(number));
    }
    public  static int SumOfNumber(int number[])
    {
        int sum=0;
        for(int i:number) //for each loop
        { 
            sum+=i;
        }
        return sum;
    }
}
 /*
        *** This is Example of Array *****

        int[] MyintArray=getInteger(5);
        System.out.println("Array Element is here");
        for (int i=0;i<MyintArray.length;i++)
        * {
            System.out.println("Element is "+MyintArray[i]);
        }
         */

       /*

        ** this function Check Next value is integer **

        int Number;
        Scanner s=new Scanner(System.in);

        String Repeat="y";
        while (Repeat.equals("y"))
        {
            System.out.println("enter Number");
            boolean IsInteger=s.hasNextInt();
            Number=s.nextInt();
            if(IsInteger)
            {
                System.out.println("Welcome "+Number+" Time");
            }
            else {
                System.out.println("Invalid");
            }

            System.out.println("Do you Want Continue y/n");
            Repeat=s.next();
        */

            /*
             *    This Function Return Array and pass value as Parameter
             * */
            /*
            public static int[] getInteger(int value)
            {
                Scanner s=new Scanner(System.in);
                System.out.println("enter "+value+" number of element ");
                int Array[]=new int[value];
                for (int i=0;i<Array.length;i++)
                 {
                        Array[i]=s.nextInt();
                  }
              return Array;
    }
    */


            // String[] Family={"sonal","kajal","Rohit","papa","mummy"};

        /*
        int MyIntArray[]={2,4,5,6,8,7,9,10,45,};
        int len=MyIntArray.length;
        System.out.println(MyIntArray[1]);
        System.out.println(MyIntArray[2]);
        System.out.println(MyIntArray[3]);
        for(int i=0;i<5;i++)
        {
           MyIntArray[i]=i*10;
        }
        for (int i=0;i<len;i++)
        {
            System.out.println("value of "+MyIntArray[i]);
        }*/
            //  PrintFamilyArray(Family);

    /*public static void PrintFamilyArray(String Family[])
    {
        for (int i=0;i<Family.length;i++)
        {
            System.out.println(Family[i]);
        }
    }*/



