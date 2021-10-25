package Abstract;

public class Dog extends Animal{

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating ");
    }

    @Override
    public void breathe() {
        System.out.println(" Brethe in and Breathe out");
    }
}
