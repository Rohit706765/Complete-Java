package Inheritence.CarExample2;

public class Vehicle {
    // this class work on inheritance concept
    private String name;
    private String size;
    private int CurrentVelocity;
    private int CurrentDirection;
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        CurrentVelocity=0;
        CurrentDirection=0;
    }
    public void move(int direction, int speed)
    {
        this.CurrentDirection+=direction;
        this.CurrentVelocity+=speed;
        System.out.println("Vehicle is moving at "+this.CurrentDirection+" Degree at "+this.CurrentVelocity+" km/h");
    }
    public void stop()
    {
        System.out.println("Your vehicle is stop now ");
    }
    public void Steer(int direction)
    {
        this.CurrentDirection+=direction;
        System.out.println("vehicle is moving at "+this.CurrentDirection+" Degree ");
    }

    public int Break(int BreakRate)
    {
        System.out.println("Break System Enable ");
        this.CurrentVelocity-=BreakRate;
        if(this.CurrentVelocity<=0)
        {
            stop();
            return -1;
        }
        System.out.println(BreakRate+" km/h speed reduce "+" Now current speed "+this.CurrentVelocity+" km/h");
        return this.CurrentVelocity;
    }
    public int getCurrentVelocity() {
        return this.CurrentVelocity;
    }

    public int getCurrentDirection() {
        return this.CurrentDirection;
    }
}
