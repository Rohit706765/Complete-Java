package Inheritence.ManEx;

public class Man extends human {
    String property;
    int child;
    double income;
    String Behaviour;
    public Man(String name, int age, String status, String qualification, String saving, String property,int child,double income,String Behaviour) {
        super(name, age, qualification);
        this.property=property;
        this.child=child;
        this.income=income;
        this.Behaviour=Behaviour;
    }


    public void biscep()
    {
        System.out.println("Man.biscep is called ");
    }
    @Override
    public void BodyStructure() {
        System.out.println("Man.bodyStructure() is called ");
        biscep();
        super.BodyStructure();
    }

    public String getProperty() {
        return property;
    }

    public int getChild() {
        return child;
    }

    public double getIncome() {
        return income;
    }

    public String getBehaviour() {
        return Behaviour;
    }
}
