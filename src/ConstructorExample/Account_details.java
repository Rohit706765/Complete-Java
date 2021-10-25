package ConstructorExample;

import java.sql.SQLOutput;
import  java.util.Scanner;
/**
 *  this class access by Bank.java okay!!
 * */

public class Account_details {
/*

    private String CustomerName;
    private double AccountNumber;
    private String CustomerEmail="@gmail.com";
    private double AccountBalance;
    private String PhoneNumber="";

*/
/**
 *  Constructor is special function of class
 *  it start with modifer and end with class name
 *  if you want to call another Constructor so simply Use  "this" keyword to call another function okay
 *  it would be first statement in code block okay
 * *//*

        public Account_details(){
            this("Default",1244545787,"7043809556","xyz@gmail.com");
            System.out.println(" Empty constructor is called ");
        }
        public Account_details(String CustomerName ,double AccountNumber,String phoneNumber,String customerEmail)
        {
            this.CustomerName=CustomerName;
            this.AccountNumber=AccountNumber;
            this.PhoneNumber=phoneNumber;
            this.CustomerEmail=customerEmail;

        }
    public void Deposit(double Amount)
    {
        if(Amount>0)
        {
            this.AccountBalance+=Amount;
            System.out.println(" Your Current Balance Is "+this.AccountBalance);
            System.out.println(" Currently Added Money is "+Amount);
        }

    }
    public void Withdraw(double WithdrawAmount)
    {      double temp=this.AccountBalance-WithdrawAmount;
        if(temp>=0)
        {
            this.AccountBalance=temp;
            System.out.println("AFter withdrawl "+WithdrawAmount+" Balance is "+temp);
        }
        else
        {
            System.out.println("only Balance is "+this.AccountBalance+" So Your Request Money is /n "+WithdrawAmount+" is /n not process");

        }
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public double getAccountBalance() {
        return this.AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
*/

            /**
             *   code is here
             * */
            public static void main(String ar[])
            {
                String name="";
                int Choice=0;
                String Check="no";
                String brand=""; ///
                Scanner s= new Scanner(System.in);
                System.out.println(" Dear User Enter your name :");
                name=s.next();
                System.out.println("Are you interest for showing brand ");
                Check=s.next();
                if(Check.equals("yes")||Check.equals("YES")|| Check.equals("Yes"))
                {
                    System.out.println("our Brand list is here ");
                    System.out.println("1.Audi");
                    System.out.println("2.BMW");
                    System.out.println("3.Bently");
                    System.out.println("4.Ford");
                    System.out.println("5.Honda");
                    System.out.println("6.Hyundai");
                    System.out.println("7.Jaguar");
                    System.out.println("8.Land Rover");
                    System.out.println("Please Enter Any number for more details ");
                    Choice=s.nextInt();
                }
                else
                {
                    System.out.println(" Please say in word OR type Yes For more details ");
                }/*
                String Repeat="yes";
                System.out.println("Are u Want to Show other Car Details ");
                Repeat=s.next();*/
                /*while (Repeat.equals("yes"))
                {*/
                    switch (Choice)
                    {
                        case 1:
                            System.out.println("Thanks for choosing Audi Brand ");
                            System.out.println(" We are most popular Car provider in our country ");
                            System.out.println("Give us a");
                            break;
                        case 2:
                            System.out.println("Thanks for choosing BMW Brand ");
                            System.out.println(" We have 20 car brand in india ");
                            System.out.println(" Are u interested ??????? ");
                            Check=s.next();
                            if(Check.equals("yes"))
                            {
                                System.out.println("One more time Thanks ");
                                System.out.println("www.cardekho.com is our official site ");

                                String CarList[]={"A","B","C","d","G","J","h"};
                                for(int i=0;i<7;i++)
                                {
                                    System.out.println("Recently Add new car "+CarList[i]);
                                }

                            }
                            else
                            {
                                System.out.println("give us one feedback ");
                            }
                            System.out.println("***********************");
                            break;
                        case 3:
                            System.out.println("Thanks for choosing Bently Brand ");
                            System.out.println(" Our Car provide world most Superb Milege  ");
                            System.out.println("Give us a Feedback");
                            break;
                        case 4:
                            System.out.println("Thanks for choosing Ford Brand ");
                            System.out.println(" Naam Toh Sunaa hi hoga !! Ford  ");
                            System.out.println("Give us a Feedback");
                            break;
                        case 5:
                            System.out.println("Thanks for choosing Honda Brand ");
                            System.out.println(" We Make our vehicle for Middle Class Family ");
                            System.out.println("Give us a Feedback");
                            break;
                        case 6:
                            System.out.println("Thanks for choosing Hyundai Brand ");
                            System.out.println(" We are in india  ");
                            System.out.println("Give us a Feedback");
                            break;
                        case 7:
                            System.out.println("Thanks for choosing Jaguar Brand ");
                            System.out.println(" America Most Popular Brand Is here  ");
                            System.out.println("Give us a Feedback");
                            break;
                        default:
                            System.out.println(" You Made Wrong Choice !!!");
                            break;
                    }

                }




}
