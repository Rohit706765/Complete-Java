package Inheritence.CarExample;

public class Car extends Vehicle {
    private int wheels;
    private int door;
    private int gear;
    private boolean IsManual=false;
    private int CurrentGear;

    public Car(String name, int size, int currentDirection, int currentVelocity, int wheels, int door, int gear, boolean isManual, int currentGear) {
        super(name, size, currentDirection, currentVelocity);
        this.wheels = wheels;
        this.door = door;
        this.gear = gear;
        IsManual = isManual;
        CurrentGear = currentGear;
    }
    public void ChangeGear(int currentGear)
    {
        this.CurrentGear=currentGear;
        System.out.println(" current Gear is :"+this.CurrentGear);
    }
    public void stop()
    {
        System.out.println(" Car is stop now");
    }

    public void ChangeVelocity(int speed,int direction)
    {
        super.move(direction,speed);
        System.out.println("Vehicle move at "+speed+" At "+direction+" direction ");
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoor() {
        return door;
    }

    public int getGear() {
        return gear;
    }

    public boolean isManual() {
        return IsManual;
    }

    public int getCurrentGear() {
        return CurrentGear;
    }
}
