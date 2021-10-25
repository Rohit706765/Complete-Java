package ConstructorExample;

public class Details
{
    private int age;
    private String name;
    private String Address;
    private String Gender;
    private double income;
    public Details()
    {
        this(25,"Defalut_name","Defalut_Address","unknown",404);
        System.out.println("Sorry this details required");
        getName();
        getAddress();
        getAge();
        getGender();
        getIncome();

    }
    public Details(int age,String name,String Address,String gender,double income)
    {
        System.out.println("Thanks for Details");
        this.age=age;
        this.name=name;
        this.Address=Address;
        this.Gender=gender;
        this.income=income;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return Gender;
    }

    public double getIncome() {
        return income;
    }
}
