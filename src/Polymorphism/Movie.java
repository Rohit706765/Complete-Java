package Polymorphism;

class main{
    public static void main(String ar[])
    {
        for (int i=1;i<11;i++)
        {

            Movie m=RandomMovie();
            System.out.println("Movie #"+i+ " : "+m.getName()+'\n'+" Plot is :"+m.Plot());
        }
    }
    public static Movie  RandomMovie()
    {
        int Random=(int)(Math.random()*5)+1;
        System.out.println(" Random Number Generated was "+Random);
        switch (Random)
        {
            case 1:
                return new pk("pk");

            case 2:
                return new Tanhaji("Tanhaji");
            case 3:
                return new Panga("panga");
            case 4:
                return new Bhahubali("Bhahubali");
            case 5:
                return new Dil("Dill");
        }
        return null;
    }
}
public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  String Plot()
    {
        return "No Plot here ";
    }

}
class pk extends Movie
{
    public pk(String name) {
        super("pk");
    }

    public  String Plot()
    {
        return "Alien  Man come to earth and try to find their remote ";
    }
}
class Tanhaji extends Movie
{
    public Tanhaji(String name) {
        super("Tanhaji");
    }
    public  String Plot()
    {
        return "Full movie about Tanhaji Warrior And full of Thirller";
    }
}
class  Panga extends Movie
{
    public Panga(String name) {
        super("Panga");
    }
    public  String Plot()
    {
        return "Brave woman try to complete their Dream but Today society Try to stop her in old Religious Thinking";
    }
}
class Bhahubali extends Movie
{
    public Bhahubali(String name) {
        super("Bhahubali");
    }
    public  String Plot()
    {
        return "A story about Bhahubali, how he try to impress their people and about kingdom about bhahubali";
    }
}

class Dil extends Movie
{
    public Dil(String name) {
        super("Dill");
    }


}

