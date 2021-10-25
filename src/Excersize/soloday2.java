package Excersize;

public class soloday2 {
    // for enhance loop (for each loop)
    public static void main(String a[])
    {
        /*int[] arr={1,2,3,4,5};
        for(int i:arr)
        {
            System.out.println(i);//

        }*/
     /*   String lang[]={"java","c++","c#","html","css","python"};
        int len=lang.length;
        System.out.println("This "+len+" language are very important ");

        for(String n:lang)
        {
            System.out.println(n);
        }*/

        /*int arr[]={2,5,6,8,9};
        System.out.println(" Array count here ");
        if(arr.length<0)
        {
            System.out.println(" Please enter some value ");
        }
        else
        {
            for (int i=0;i<arr.length;i++)
            {
                System.out.println(" No "+i+" Element is "+arr[i]);

            }
        }
        // enhance for loop or also known as for each loop
        for(int t:arr)
        {
            System.out.println(t);
        }*/

        // Multi dimensional array
/*

        int b[][]={{1,2,3},{4,5,6}};
        System.out.println(" Multi dimensional array is here ");
        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
        System.out.println(b[1][2]);
        System.out.println(" Array is end here ");
*/
       /* String stock[][]={{"mango","banana","apple"},{"meat","chicken","egg","boil egg"},{"water","bear","wine"}};
        System.out.println("Available stock are here ");
        System.out.println(stock[0][1]);
        System.out.println(stock[1][1]);
        System.out.println(stock[2][1]);
        for(String[] availble :stock)
        {
            for (String c:availble)
            {
                System.out.println(c);
            }

        }
*/

       /* int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int Num[]:num)
        {
            for (int x:Num)
            {
                System.out.println(" Element is :"+x);
            }
        }*/
        /*int num[][]={{1,2,3},{4},{8,9,10}};
        System.out.println(" before set the value ");
        System.out.println(num[1][0]);
        System.out.println(" After set the value ");
        num[1][0]=45;
        System.out.println(num[1][0]);
*/
        String name[][]={{"rohit","kajal","sonal","mahesh"},{"roja","kamlesh","swag"}};
        for (int i=0;i<name.length;i++)
        {
            for (int j=0;j<name[i].length;j++)
            {
                System.out.println(" index for "+name[i][j]+" is ["+ i +"]"+"["+j+"]");
            }
        }

    }
}
