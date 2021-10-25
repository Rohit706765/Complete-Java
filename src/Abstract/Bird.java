package Abstract;

public abstract class Bird extends Animal{

    public Bird(String animal) {
        super(animal);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking ");
    }
    @Override
    public void breathe() {
        System.out.println(" Breathe In , Breathe Out and Repeat ");
    }
    public abstract void fly();
}
