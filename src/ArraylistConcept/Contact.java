package ArraylistConcept;

public class Contact {
    /*
    *   this class use by Arraylist Program Challenge
    * */
    private String ContactNumber;
    private String name;

    public Contact(String contactNumber, String name) {
        this.ContactNumber = contactNumber;
        this.name = name;
    }

    public String  getContactNumber() {
        return ContactNumber;
    }

    public String getName() {
        return name;
    }
    public static Contact CreateContact(String ContactNumber,String name)
    {
        return new Contact(ContactNumber,name);
    }
}
