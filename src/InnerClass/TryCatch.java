package InnerClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TryCatch {

    public static void main(String[] args) {

        int[] a=new int[3];

        try
        {
            for (int i=0;i<4;i++)
            {
                a[i]=i;
            }

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound ");
        }
        catch (Exception e)
        {
            System.out.println("Problem occur ");
        }
        System.out.println(Arrays.toString(a));
    }
}
