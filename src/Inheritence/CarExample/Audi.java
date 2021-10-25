package Inheritence.CarExample;

public class Audi extends Car {
    private int RoadServiceMonth=0;

    public Audi( int currentDirection, int currentVelocity,int currentGear, int roadServiceMonth) {
        super("Audi", 5, currentDirection, currentVelocity, 4, 4, 8, false, currentGear);
        this.RoadServiceMonth = roadServiceMonth;
    }
    public void accelrate(int rate)
    {
        int NewVelocity=getCurrentVelocity()+rate;
        if (NewVelocity==0)
        {
            super.stop();
        }
        else if(NewVelocity>0 && NewVelocity<=10)
        {
            ChangeGear(1);
        }
        else if(NewVelocity>10 && NewVelocity<=20)
        {
            ChangeGear(2);
        }

        else if(NewVelocity>20 && NewVelocity<=30)
        {
            ChangeGear(4);
        }
        else
        {
            ChangeGear(4);
        }

//        if ()


    }
}
