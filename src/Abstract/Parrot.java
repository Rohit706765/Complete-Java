package Abstract;

public class Parrot extends Bird{
    public Parrot(String animal) {
        super(animal);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is sitting from one brach to another ");
    }
}
