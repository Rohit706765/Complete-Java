package Inheritence.CarEx3;

public class Vehicle {
    private String name;
    private int size;
    private int CurrentVelocity;
    private int CurrentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        CurrentVelocity = 0;
        CurrentDirection = 0;
    }
    public void Steer(int CurrentDirection)
    {
        this.CurrentDirection+=CurrentDirection;
        System.out.println("Vehicle is Steer at "+this.CurrentDirection);
    }
    public void move(int CurrentDirection,int CurrentVelocity)
    {
        this.CurrentDirection=CurrentDirection;
        this.CurrentVelocity=CurrentVelocity;
     //   System.out.println(" Vehicle move at "+CurrentVelocity+" speed at this "+CurrentDirection+" Direction");
    }



    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }
}
