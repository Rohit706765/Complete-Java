package Excersize;

import java.util.Scanner;
public class PolyCar {
        private int Cylinder;
        private boolean engine=false;
        private int wheels;
        public PolyCar(int cylinder,boolean engine,int wheels)
        {
            this.Cylinder=cylinder;
            this.engine=engine;
            this.wheels=wheels;
        }
        public void start()
        {
            System.out.println("Car is start now ");
        }
        public void Accelrate(int rate)
        {
            System.out.println("Car.Accelrate() is called now ");
        }
        public void Break(int b)
        {
            System.out.println("Car.break() is called ");
        }
}
class BMW extends PolyCar
{
    Scanner s=new Scanner(System.in);
    private boolean Booster=false;
   private long ServicePerMonth=0;
    private int CurrentVelocity=0;
    private int CurrentDirection=0;
    private int gear=0;
  private   int CurrentGear=0;
    public BMW(boolean Booster,int currentVelocity,int currentDirection,int gear) {
        super(4, true, 4);
        this.Booster=Booster;
        this.CurrentDirection=0;
        this.CurrentVelocity=0;
        this.gear=gear;
    }

    public void move(int CurrentDirection)
    {

        this.CurrentDirection+=CurrentDirection;
        this.CurrentVelocity=getCurrentVelocity();
        int Reducer= 0;
        String choice="yes";
        System.out.println("At Turning... Are You Want To Apply a Break Yes/No");
        choice=s.next();
        if (choice.equals("yes")|| choice.equals("YES")|| choice.equals("Yes"))
        {
            System.out.println("How much Speed You Want to Reduce ");
            Reducer=s.nextInt();
            Break(Reducer);
        }
        else
        {
            System.out.println(" Ok !! We will continue ");
        }
        System.out.println("Vehicle at "+this.CurrentVelocity+" Speed and moving toward "+this.CurrentDirection+" Direction");
    }
    @Override
    public void start() {
        System.out.println("BMW Engine is Start now ");
        super.start();
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return this.CurrentDirection;
    }


    public void stop()
    {
        System.out.println("Okay Use this Function Only when You have Emergency ");
        this.CurrentVelocity=0;
        System.out.println("Your vehicle is Stop now ");
    }
    @Override
    public void Accelrate(int rate) {
        int Newvelocity=getCurrentVelocity()+rate;
        if (Newvelocity<20)
        {
            ChangeGear(1);
        }
        else if(Newvelocity<=30)
        {
            ChangeGear(2);
        }
        else if(Newvelocity<=50)
        {
            ChangeGear(3);
        }
        else
        {
            ChangeGear(4);
        }
        this.CurrentVelocity=Newvelocity;
    }

    @Override
    public void Break(int Break)
    {
        String choice="yes";
        this.CurrentVelocity=getCurrentVelocity()-Break;
        if(this.CurrentVelocity<0)
        {
            stop();
            System.out.println("Do u want to start engine ");
            choice=s.next();
            if (choice.equals("yes")|| choice.equals("YES")|| choice.equals("Yes"))
            {
                start();
            }
            else
            {
                System.out.println(" Ok !! We will Wait for Your Decision continue ");
            }
        }
        System.out.println("Now Current speed is "+getCurrentVelocity());
    }
    public void ChangeGear(int gear)
    {
        this.CurrentGear=gear;
    }
}
