package Inheritence.CarExample;

public class Vehicle {
    private String name;
    private int size;
    private int CurrentDirection=0;
    private int CurrentVelocity=0;

    public Vehicle(String name, int size,int currentDirection, int currentVelocity) {
        this.name = name;
        this.size = size;
        this.CurrentDirection = currentDirection;
        this.CurrentVelocity = currentVelocity;
    }
    public void steer(int CurrentDirection)
    {
        this.CurrentDirection+=CurrentDirection;
        System.out.println(" Vehicle.move() is called And Vehicle Steer at "+this.CurrentDirection);
    }
    public void move(int currentDirection,int currentVelocity)
    {
        this.CurrentDirection=currentDirection;
        this.CurrentVelocity=currentVelocity;
        System.out.println("Vehicle is move at "+CurrentVelocity+" Speed at "+CurrentDirection+" Direction ");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }
}
