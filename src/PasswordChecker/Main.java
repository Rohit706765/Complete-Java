package PasswordChecker;

public class Main {
    public static void main(String ar[])
    {
        PasswordChecker Rajan=new PasswordChecker("rs","Rohit@1232");
       // Rajan.ChangeOwnerName("123");
        PasswordChecker sonal=new PasswordChecker("ss","Rohit@1232");
        PasswordChecker kajal=new PasswordChecker("ks","Rohit@1232");
        System.out.println(Rajan.getOwnerName());
        System.out.println(sonal.getOwnerName());
        System.out.println( kajal.getOwnerName());

    }

}
