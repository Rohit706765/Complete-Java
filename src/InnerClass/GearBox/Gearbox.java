package InnerClass.GearBox;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private int maxGear;
    private List<Gear> gears;
    private int currentGear;
    private boolean operateClutchIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        gears = new ArrayList<>();
        Gear netural = new Gear(0.0,0);
        this.gears.add(netural);

        for (int i = 0 ;i<maxGear;i++)
        {
            addGear(i,5.3*i);
        }
    }
    public void setOperateClutchIn(boolean operateClutchIn)
    {
        this.operateClutchIn = operateClutchIn;
    }
    public void addGear(int gear,double ratio)
    {
        if (gear>0 && gear<= maxGear)
        {
            this.gears.add(new Gear(ratio,gear));
        }
    }
    public void changeGear(int gearNumber)
    {
        if (gearNumber>0  && gearNumber<=gears.size() && operateClutchIn)
        {
            this.currentGear = gearNumber;
            System.out.println("Gear changed to "+this.currentGear);
        }
        else
        {
            System.out.println("Scream engine ");
        }
    }
    public double driveSpeed(int rev)
    {
        if (operateClutchIn)
        {
            System.out.println("scream engine ");
            return 0.0;
        }
        return rev  * this.gears.get(currentGear).getRatio();
    }

    private class Gear
    {
        private double ratio;
        private int gearNumber;

        public Gear(double ratio, int gearNumber) {
            this.ratio = ratio;
            this.gearNumber = gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }
    }
}
