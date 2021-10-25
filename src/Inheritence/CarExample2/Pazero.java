package Inheritence.CarExample2;

public class Pazero extends Car {
   // this class work on inheritance concept
    private int ServicePerMonth;

    public Pazero( int servicePerMonth) {
        super("Pazero", "4wd", 4, 4, "#Yellow", false, true);
        if(ServicePerMonth>=0 && ServicePerMonth<30000)
        {
            this.ServicePerMonth = servicePerMonth;
        }
    }

    @Override
    public int Break(int BreakRate) {
        System.out.println("Welcome sir ");
        System.out.println("Pazero Car Break System Enable ");
        return super.Break(BreakRate);
    }
    public void start()
    {
        System.out.println("Welcome sir ");
        System.out.println("Pazero Car Engine Start our Max Speed( 280 Km/h)");
    }
    @Override
    public void ChangeGear(int GearValue) {
        System.out.println("Pazero Car Gear System Enable ");
        super.ChangeGear(GearValue);
    }

    @Override
    public void ChanegDirection(int NewDirection) {

        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Welcome sir ");
        System.out.println("Pazero Car Steering System Enable ");
        super.ChanegDirection(NewDirection);
    }

    @Override
    public void ChangeVelocity(int rate, int direction) {

        System.out.println("\n"+"************************************************");

        System.out.println("Welcome sir ");
        System.out.println("Pazero Car Accelrate System Enable ");
        super.ChangeVelocity(rate, direction);

        System.out.println("\n"+"************************************************");

    }
}
