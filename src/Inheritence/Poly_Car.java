package Inheritence;

public class Poly_Car {
    private String name;
    private int wheels;
    private int doors;
    private boolean IsHighEngine=true;
    private int NumberOfCylinder=2;
    private int Gear;
    private int CurrentGear;
    private int CurrentVelocity=0,CurrentDirection=0;

    public Poly_Car(String name,int wheels, int doors, boolean isHighEngine, int numberOfCylinder, int gear) {
        this.name=name;
        this.wheels = wheels;
        this.doors = doors;
        IsHighEngine = isHighEngine;
        NumberOfCylinder = numberOfCylinder;
        Gear = gear;
        CurrentGear = 0;
        CurrentVelocity = 0;
        CurrentDirection = 0;
    }
    public void Accelrate(int rate)
    {
        int NewVelocity=getCurrentVelocity()+rate;
        this.CurrentVelocity=NewVelocity;
        System.out.println("Car is move at "+this.CurrentVelocity+" Speed ");
    }
    public void stop()
    {
        this.CurrentVelocity=0;
        System.out.println("Car is stop "+'\n'+"Current Speed is "+getCurrentVelocity());
    }
    public void StartEngine()
    {
        System.out.println(getName()+" Engine start !! okay now Slowly Slowly Accelrate");
    }
    public void Break(int BreakAmount)
    {
        int Break=getCurrentVelocity()-BreakAmount;
        this.CurrentVelocity=Break;
        if(Break<=0)
        {
            stop();
        }
        else {
            System.out.println("Current Speed is " + getCurrentVelocity());
        }
    }

    public String getName() {
        return name;
    }

    public int getGear() {
        return Gear;
    }

    public int getCurrentGear() {
        return CurrentGear;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }
}
class Audi extends Poly_Car{
    private int ServiceRate;

    public Audi(int serviceRate) {
        super("Audi",4, 4, true, 2, 4);
        ServiceRate = serviceRate;
    }
}
class Maruti extends Poly_Car
{
    int Rate;

    public Maruti( int rate) {
        super("Maruti", 4, 4, false, 1, 4);
        Rate = rate;
    }
    public String FuelConsumption(String FuelType)
    {
        if(FuelType.equals("Disel"))
        {
            return " Too low Fuel Consumption";
        }
        else
        {
            return " Too hight Fuel Consumption";
        }

    }
}
class Honda extends Poly_Car
{
    String design;

    public Honda( String design) {
        super("Honda", 4, 4, false, 2, 5);
        this.design = design;
    }

}
class Test
{
    public static void main(String ar[])
    {
        Audi audi=new Audi(15000);
        audi.StartEngine();
        audi.Accelrate(20);
        audi.Accelrate(30);
        audi.Accelrate(30);
        audi.Break(90);
        Maruti maruti=new Maruti(100000);
        String FuelReport=maruti.FuelConsumption("Disel");
        System.out.println("Fuel Report of "+maruti.getName()+" Engine is "+FuelReport);
        maruti.StartEngine();
        maruti.Accelrate(20);
        maruti.stop();

    }

}
