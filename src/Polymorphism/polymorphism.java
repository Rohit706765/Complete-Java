package Polymorphism;

public class polymorphism {
    public static void main(String[] args) {
        car car=new car(4,2,"honda",4);
        Audi audi=new Audi();
        audi.StartEngine();
        audi.Accelrate(10,2);
        audi.Break(1);

        System.out.println("");
        audi.stopEngine();
        System.out.println("");

        bmw bmw =new bmw();
        bmw.Accelrate(50,10);
        bmw.Break(60);
        System.out.println("");
    }

}
class car
{
    private int wheels;
    private int cyliner;
    private String engine;
    private int door;
    private int currentVelocity=0;
    private int currentDirection=0;
    public car(int wheels, int cyliner, String engine, int door) {
        this.wheels = wheels;
        this.cyliner = cyliner;
        this.engine = engine;
        this.door = door;
        this.currentVelocity=0;
        this.currentDirection=0;
    }
    public void stopEngine()
    {
        this.currentVelocity=0;
        System.out.println("Car is stopped "+"Current speed is "+this.currentVelocity+" km/h");
    }
    public void StartEngine()
    {
        System.out.println("Car engine is started ");
    }
    public int Break(int Breakrate)
    {
        currentVelocity-=Breakrate;
        if(this.currentVelocity<=0)
        {
            System.out.println("Your vehicle is stopped ");
            this.currentVelocity=0;
        }
        System.out.println("Current speed "+currentVelocity+" speed reduce--->"+Breakrate+" km/h");
        return currentVelocity;
    }
    public void Accelrate(int rate,int direction)
    {
        currentVelocity+=rate;
        currentDirection+=direction;
        System.out.println("Vehicle is moving at "+currentVelocity+" km/h"+" in "+currentDirection+" Degree ");
    }
    public int getWheels() {
        return wheels;
    }

    public int getCyliner() {
        return cyliner;
    }

    public String getEngine() {
        return engine;
    }

    public int getDoor() {
        return door;
    }
}
class Audi extends car
{
    private String name;
    public Audi() {
        super(4, 2, "Acer", 2);
        this.name="Audi";
    }

    @Override
    public void StartEngine() {
        System.out.println("Audi System enable ");
        super.StartEngine();
    }

    @Override
    public int Break(int Breakrate) {
        System.out.println("Audi car break system enable ");
        return super.Break(Breakrate);
    }

    @Override
    public void Accelrate(int rate, int direction) {
        System.out.println("Audi car Accelrate system enable ");
        super.Accelrate(rate, direction);
    }
}
class Nano extends car
{
    private String name;
    public Nano() {
        super(4, 2, "hindustan Limited", 2);
        this.name="nano";
    }

    @Override
    public void StartEngine() {
        System.out.println("Nano car System enable ");
        super.StartEngine();
    }

    @Override
    public int Break(int Breakrate) {
        System.out.println("Nano  car break system enable ");
        return super.Break(Breakrate);
    }

    @Override
    public void Accelrate(int rate, int direction) {
        System.out.println("Nano car Accelrate system enable ");
        super.Accelrate(rate, direction);
    }
}
class bmw extends car
{
    private String name;
    public bmw() {
        super(4, 2, "hindustan Limited", 2);
        this.name="BMW";
    }

    @Override
    public void StartEngine() {
        System.out.println("BMW car System enable ");
        super.StartEngine();
    }

    @Override
    public int Break(int Breakrate) {
        System.out.println("BMW  car break system enable ");
        return super.Break(Breakrate);
    }

    @Override
    public void Accelrate(int rate, int direction) {
        System.out.println("BMW car Accelrate system enable ");
        super.Accelrate(rate, direction);
    }
}



/*
 *   Movie concept apply here using polymophism
 * */


   /* public static void main(String[] args) {
        for (int i=0;i<11;i++)
        {
            Movie movie=random();
            System.out.println("movie #"+i+": "+movie.getName()+" \n "+" Title "+movie.plot());
        }
    }
    public static Movie random()
    {
        int randomNumber=(int )(Math.random()*5)+1;
        System.out.println("random number generated was "+randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new Pk();


            case 2:
                return new main_hu();


            case 3:
                return new ready();


            case 4:
                return new Man_of_the_house();

            case 5:
                return new Slut();
            case 6:
                return new Golmal();

            default:
                return null;

        }
    }
}
class Movie
{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot()
    {
        return "no title is here";
    }

    public String getName() {
        return this.name;
    }
}
class Pk extends Movie
{
    public Pk() {
        super("pk");
    }

    @Override
    public String plot() {
        return "pk thing";
    }
}
class main_hu extends Movie {
    public main_hu() {
        super("main_hu");
    }

    @Override
    public String plot() {
        return "main_hu";
    }
}

class ready extends Movie {
    public ready() {
        super("ready");
    }

    @Override
    public String plot() {
        return "fucking crazy man";
    }
}

class Man_of_the_house extends Movie {
    public Man_of_the_house() {
        super("Man_of_the_house");
    }

    @Override
    public String plot() {
        return "Man_of_the_house";
    }
}
class Slut extends Movie
{
    public Slut( ) {
        super("Slut");
    }
}
class Golmal extends Movie
{
    public Golmal( ) {
        super("Golmal");
    }

    @Override
    public String plot() {
        return "Golmal";
    }
}*/



/*
*   Movie concept apply here using polymophism
* */


   /* public static void main(String[] args) {
        for (int i=0;i<11;i++)
        {
            Movie movie=random();
            System.out.println("movie #"+i+": "+movie.getName()+" \n "+" Title "+movie.plot());
        }
    }
    public static Movie random()
    {
        int randomNumber=(int )(Math.random()*5)+1;
        System.out.println("random number generated was "+randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new Pk();


            case 2:
                return new main_hu();


            case 3:
                return new ready();


            case 4:
                return new Man_of_the_house();

            case 5:
                return new Slut();
            case 6:
                return new Golmal();

            default:
                return null;

        }
    }
}
class Movie
{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot()
    {
        return "no title is here";
    }

    public String getName() {
        return this.name;
    }
}
class Pk extends Movie
{
    public Pk() {
        super("pk");
    }

    @Override
    public String plot() {
        return "pk thing";
    }
}
class main_hu extends Movie {
    public main_hu() {
        super("main_hu");
    }

    @Override
    public String plot() {
        return "main_hu";
    }
}

class ready extends Movie {
    public ready() {
        super("ready");
    }

    @Override
    public String plot() {
        return "fucking crazy man";
    }
}

class Man_of_the_house extends Movie {
    public Man_of_the_house() {
        super("Man_of_the_house");
    }

    @Override
    public String plot() {
        return "Man_of_the_house";
    }
}
class Slut extends Movie
{
    public Slut( ) {
        super("Slut");
    }
}
class Golmal extends Movie
{
    public Golmal( ) {
        super("Golmal");
    }

    @Override
    public String plot() {
        return "Golmal";
    }
}*/