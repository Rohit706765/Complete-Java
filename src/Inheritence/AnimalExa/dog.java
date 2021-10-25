package Inheritence.AnimalExa;

public class dog extends Animal {
    private int teeth;
    private int leg;
    private int SmellingSense;

    public dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    public void chew() {
        System.out.println("dog.chew is called ");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat is called ");
        chew();
        super.eat();
    }
}

