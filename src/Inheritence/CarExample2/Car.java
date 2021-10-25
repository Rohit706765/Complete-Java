package Inheritence.CarExample2;

public class Car extends Vehicle {
    // this class work on inheritance concept
    private int door;
    private int wheels;
    private String color;
    private boolean IsAutomatic=false;
    private boolean FastEngine;
    private int CurrentGear;
    public Car(String name, String size, int door, int wheels, String color, boolean isAutomatic, boolean fastEngine) {
        super(name, size);
        this.door = door;
        this.wheels = wheels;
        this.color = color;
        IsAutomatic = isAutomatic;
        FastEngine = fastEngine;
    }
    public void ChangeGear(int GearValue)
    {
        CurrentGear=GearValue;
        System.out.println("current gear is "+CurrentGear);
    }
    public void ChanegDirection(int NewDirection)
    {
        Steer(NewDirection);
    }
    public void ChangeVelocity(int rate,int direction)
    {
        int newVelocity=getCurrentVelocity()+rate;
        if(newVelocity<=0)
        {
            stop();
        }
        else  if(newVelocity<=10)
        {
            ChangeGear(1);
        }
        else  if(newVelocity<=20)
        {
            ChangeGear(2);
        }
        else  if(newVelocity<=30)
        {
            ChangeGear(3);
        }
        else  if(newVelocity<=40)
        {
            ChangeGear(4);
        }
        else  if(newVelocity <50)
        {
            ChangeGear(5);
            System.out.println("Max Gear");
        }
        else
        {
            System.out.println(" System Error !! ");
        }
        move(direction,newVelocity);
    }

    @Override
    public int Break(int BreakRate) {
        return super.Break(BreakRate);
    }
}
