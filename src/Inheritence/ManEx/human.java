package Inheritence.ManEx;

public class human {
    private String name;
    private int age;
    private String Qualification;
    private String saving;
    private String status;

    public human(String name, int age,String status, String qualification, String saving) {
        this.name = name;
        this.age = age;
        this.status=status;
        Qualification = qualification;
        this.saving = saving;
    }
    public human(String name,int age ,String qualification)
    {
        this(name,age,"unknown",qualification,"Unknown");
    }

    public void BodyStructure()
    {
        System.out.println("Man.BodyStructure() is called ");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getQualification() {
        return Qualification;
    }

    public String getSaving() {
        return saving;
    }

    public String getStatus() {
        return status;
    }
}
