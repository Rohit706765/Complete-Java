package InnerClass.ButtonExample;

import java.util.ArrayList;

public class GearBox {
    private int currentGear = 0;
    private ArrayList<Gear> gears;
    private int maxGear;
    private boolean clutchIsIn ;

    public GearBox(int maxGear) {
        gears  = new ArrayList<Gear>();
        this.maxGear = maxGear;
        Gear gear = new Gear(0,0);
        gears.add(gear);
    }

    public void operateClutch(boolean isOperating)
    {
        this.clutchIsIn = isOperating;
    }
    public void addGear(int number, double ratio)
    {
        if (number>0 && maxGear<=number)
        {
            this.gears.add(new Gear(number,ratio));
        }
    }
    public void changeGear(int number )
    {
        if (number>=0 && number<gears.size() && clutchIsIn)
        {
            this.currentGear = number;
            System.out.println("Gear "+number+" is selected ");
        }
        else
        {
            System.out.println("Grind !");
        }
    }
    public double wheelSpeed(int rev)
    {
        if (clutchIsIn)
        {
            System.out.println("Scream !!");
            return 0.0;
        }
        return rev * gears.get(currentGear).getRatio() ;
    }

    private class Gear {
        private int gearNumber ;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs)
        {
            return ratio * revs;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
