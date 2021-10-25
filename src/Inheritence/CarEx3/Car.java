package Inheritence.CarEx3;

public class Car extends Vehicle {
    private int door;
    private int wheel;
    private int gear;
    private boolean IsManual=false;
    private int CurrentGear=0;

    public Car(String name, int size, int door, int wheel, int gear, boolean isManual, int currentGear) {
        super(name, size);
        this.door = door;
        this.wheel = wheel;
        this.gear = gear;
        IsManual = isManual;
        CurrentGear = currentGear;
    }
    public void stop()
    {
        System.out.println(" Car is Stop ");
        ChangeVelocity(0,0);
    }

    public void ChangeGear(int CurrentGear)
    {
        this.CurrentGear=CurrentGear;
        System.out.println("Current gear is "+this.CurrentGear);
    }
    public void ChangeVelocity(int speed ,int direction)
    {
        move(direction,speed);
        System.out.println("Car is move at "+speed+" Speed At "+direction+" direction");
    }
}
