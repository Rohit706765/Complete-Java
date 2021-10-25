package InnerClass;

import java.util.ArrayList;

public class GearBox1 {
    private int MaxGear;
    private int CurrentGear;
    private ArrayList<Gear> gears;

    public GearBox1(int maxGear) {
        MaxGear = maxGear;
        gears=new ArrayList<Gear>();
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);
    }
    public class Gear
    {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs)
        {
            return revs*ratio;
        }
    }
}
