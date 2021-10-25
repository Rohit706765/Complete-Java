package Inheritence.AnimalClassWithInterface;/*
        Animal animal=new Animal("animal",45,4,12);
        Walk tommy=new Dog();
        tommy.run(10,20);
        ((Dog)tommy).move(); // casting is here
        ((Dog) tommy).smelling();*/


public class Dog extends Animal implements Walk {

    private int leg;
    private int ear;
    private int eyes;

    public Dog() {
        super("tommy", 45, 4, 12);
    }

    @Override
    public void move() {
        System.out.println("Dog.move() is called ");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called ");
    }
    public void smelling()
    {
        System.out.println("Dog.Smelling() is called ");
    }

    @Override
    public void walk(int speed, int direction) {
        System.out.println("Dog is walking "+direction+" degree "+" at "+speed+" km/h");
    }

    @Override
    public void run(int speed, int direction) {
        System.out.println("Dog is running "+direction+" degree "+" at "+speed+" km/h");
    }
}
