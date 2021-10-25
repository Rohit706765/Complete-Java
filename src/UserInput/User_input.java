package UserInput;

import java.util.Scanner;
public class User_input {
           public static void main(String a[])
            {
                int User_date=0;
                String name="";
                Scanner s=new Scanner(System.in);
                System.out.println(" Enter your birth Date ");
                boolean Check_int= s.hasNextInt();

                    if(Check_int)
                    {
                        User_date=s.nextInt();
                        s.nextLine();
                        if(User_date<0)
                        {
                            System.out.println(" Negative value  not allow ");
                        }
                        System.out.println(" Enter your name :");
                        name=s.next();
                        int age=2020-User_date;

                        if (age>0 && age<=100)
                        {
                            System.out.println("Hii Mr/Mrs "+name+" You are "+age+" old");

                        }
                        else {
                            System.out.println(" Negative value not allow here ");
                        }

                    }
                    else
                    {
                        System.out.println(" Unable to parse value ");
                    }

            }
}
