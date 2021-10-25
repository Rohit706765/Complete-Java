package PasswordChecker;

import java.util.Scanner;
public class PasswordChecker {
    private String OwnerName="";
    private String pwd="0000000";
    private int  cnt=0;
    private String Tempname="";
    private String Check="no";
    private  String temp;
    public PasswordChecker(String ownerName, String pwd) {
        this.OwnerName = ownerName;
        this.pwd = pwd;

    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getPwd() {
        return pwd;
    }

    public void ChangeOwnerName(String pwd)
    {
        while (cnt!=2)
        {
            ++cnt;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter your name ");
            Tempname=s.next();
            if(OwnerName.equals(Tempname))
            {

                System.out.println("Enter your password For confirmation ");
                temp=s.next();
                if(this.pwd.equals(pwd))
                {
                    System.out.println(" Are You sure !! You Want to Change this !! Yes// No");
                    if(Check.equals("yes")||Check.equals("Yes"))
                    {
                        System.out.println("Enter New Owner name :");
                        OwnerName=s.next();
                        System.out.println(" Our New Owner is "+OwnerName);

                    }
                    else
                    {
                        System.out.println(" Sorry For this problem ");
                    }
                }
                else
                {
                    if(cnt==2)
                    {
                        System.out.println("Not Allow to Access it ");
                    }

                }
            }
        }

    }
}
