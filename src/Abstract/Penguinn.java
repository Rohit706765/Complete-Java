package Abstract;

public class Penguinn extends Bird{
    public Penguinn(String animal) {
        super(animal);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" : "+"I'm not good at this. Can i go by Swim instead of flying ?");
    }
}
