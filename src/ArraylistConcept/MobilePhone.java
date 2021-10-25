package ArraylistConcept;

import java.util.ArrayList;

public class MobilePhone {
    /*
    *   this class use by Arraylist program Challenge
    * */
    private String Mynumber;
    private ArrayList<Contact> Mycontact;

    public MobilePhone(String mynumber) {
        Mynumber = mynumber;
        this.Mycontact = new ArrayList<Contact>();
    }
    public void printContact()
    {
        System.out.println("Contact List ");
        for (int i=0;i<Mycontact.size();i++)
        {
            System.out.println((i+1)+"."+Mycontact.get(i).getName()+"-->"+this.Mycontact.get(i).getContactNumber());
        }
    }

    public boolean AddContact(Contact contact)
    {
        if(findContact(contact.getName())>=0)
        {
            System.out.println(contact.getName()+" is Already on file ");
            return false;
        }
        Mycontact.add(contact);
        return true;
    }

    private int findContact(String ContactName)
    {
        for (int i=0;i<Mycontact.size();i++)
        {
            Contact contact=this.Mycontact.get(i);
            if(contact.getName().equals(ContactName))
            {
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contact contact)
    {
        return  this.Mycontact.indexOf(contact);
    }
    public boolean UpdateContact(Contact oldContact,Contact NewContact)
    {
        int foundPosition=findContact(oldContact);
        if(foundPosition<0)
        {
            System.out.println(oldContact.getName()+" was not found in contact ");
            return false;
        }
        else if(findContact(NewContact.getName())!= -1)
        {
            System.out.println("Contact with name "+NewContact.getName()+" Already Exits in Contact list \n"+" Update Not Successful ");
        }
        else

            Mycontact.set(foundPosition,NewContact);
            System.out.println(oldContact.getName()+" was Replaced with "+NewContact.getName());
            return true;


    }
    public boolean RemoveContact(Contact contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition<0)
        {
            System.out.println(contact.getName()+" was not in your contact ");
            return false;
        }
        Mycontact.remove(foundPosition);
        System.out.println((foundPosition+1)+" Record "+contact.getName()+" was Deleted ");
        return true;
    }
    public Contact QueryContact(String name)
    {
        int FindPosition=findContact(name);
        if (FindPosition>=0)
        {
            return this.Mycontact.get(FindPosition);
        }
        return null;
    }

    public String QueryContact(Contact contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition>=0)
        {
            return contact.getName();
        }
        return null;
    }

}

// Void main code is here

/*  private static Scanner s=new Scanner(System.in);
   private static MobilePhone mobilePhone=new MobilePhone("45124510");
    public static void main(String ar[])
    {
        boolean quit=false;

        int choice;
        StartingPhone();
        printAction();
        while (!quit)
        {
            System.out.println("\n Enter Action (6 Available Action )");
            choice=s.nextInt();
            switch (choice)
            {
                case 0:
                    quit=true;
                    break;
                case 1:
                    printAllContact();
                    break;
                case 2:
                    AddNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    QueryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }
    public static void QueryContact()
    {
        System.out.println("Enter Existing Contact Name ");
        String name=s.next();
        Contact contact=mobilePhone.QueryContact(name);
        if(contact==null)
        {
            System.out.println("No contact found with this "+contact.getName()+" name");
            return;
        }
        System.out.println("Name :"+contact.getName()+" Phone Number :"+contact.getContactNumber());
    }
    public static void removeContact()
    {
        System.out.println("Enter Existing Contact Name ");
        String ExistingName=s.next();
        Contact contact=mobilePhone.QueryContact(ExistingName);
        if (contact==null)
        {
            System.out.println("No Contact find with this "+contact.getName());
            return;
        }
        if (mobilePhone.RemoveContact(contact))
        {
            System.out.println("Successfully Deleted This Contact");
        }
        else {
            System.out.println("Error to Deleting This Contact ");
        }
    }
    public static void updateContact()
    {
        System.out.println("Enter Existing Contact Name ");
        String name=s.next();
        Contact OldContact=mobilePhone.QueryContact(name);
        if (OldContact==null)
        {
            System.out.println("No Record Found ");
            return;
        }
        System.out.println("Enter New Contact Name ");
        String NewContactName=s.next();
        System.out.println("Enter New Contact Number ");
        String ContactNumber=s.next();
        Contact Newcontact=Contact.CreateContact(ContactNumber,NewContactName);

        if(mobilePhone.UpdateContact(OldContact,Newcontact))
        {
            System.out.println(OldContact.getName()+" was Replaced by "+Newcontact.getName());
            System.out.println("Successfully Updated Contact ");
        }
        else
        {
            System.out.println("Error occured !!");
        }
    }
    public static void AddNewContact()
    {
        String name;
        String  number;
        System.out.println("Enter Your Name ");
        name=s.next();
        System.out.println("Enter Number ");
        number=s.next();
        Contact contact=Contact.CreateContact(number,name);
        if(mobilePhone.AddContact(contact))
        {
            System.out.println("Successfully Added Name = "+contact.getName()+" Number "+contact.getContactNumber()+"in your list");
        }
        else
        {
            System.out.println("Already Exist "+contact.getName()+" contact in your list ");
        }
    }
    public static void printAllContact()
    {
        System.out.println("All Contact in Your phone Here \n");
        mobilePhone.printContact();
    }

    public static void StartingPhone()
    {
        System.out.println("Phone Starting............");
    }
    public static void printAction()
    {
        System.out.println("0. ShutDown Phone     \n"+
                            "1. Print All Contact  \n"+
                            "2. To Add New Contact \n"+
                            "3. To Update Existing Contact \n"+
                            "4. To Remove Contact \n"+
                            "5. Query If You Have \n"+
                            "6. Print All Statement ");
        System.out.println("Enter Your Action--->");
    }
  */
