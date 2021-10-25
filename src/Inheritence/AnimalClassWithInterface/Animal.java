package Inheritence.AnimalClassWithInterface;

public class Animal {
    private String name;
    private int weight;
    private int height;
    private int size;

    public Animal(String name, int weight, int height, int size) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.size = size;
    }
    public void move()
    {
        System.out.println("Animal.move() is called ");
    }
    public void eat()
    {
        System.out.println("Animal.eat() is called ");
    }

}
