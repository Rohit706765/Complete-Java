package Inheritence.CarEx3;

public class BMW extends Car {
    private int RoadServiceMonth=0;

    public BMW( boolean isManual, int currentGear, int roadServiceMonth) {
        super("BMW", 15, 4, 4,4 ,false, currentGear);
        RoadServiceMonth = roadServiceMonth;
    }
    public void accelrate(int Accelrate)
    {
        int NewVeloctiy=getCurrentVelocity()+Accelrate;
        if(NewVeloctiy<=0)
        {
            super.stop();

            System.out.println(" Wait for Engine start ");
        }
        else if(NewVeloctiy>0 && NewVeloctiy<=20)
        {
            ChangeGear(1);
        }
        else if(NewVeloctiy>20 && NewVeloctiy<=40)
        {
            ChangeGear(2);
        }
        else if(NewVeloctiy>40 && NewVeloctiy<=60)
        {
            ChangeGear(3);
        }
        else
        {
            ChangeGear(4);
        }
        ChangeVelocity(NewVeloctiy,getCurrentDirection());
    }

}
