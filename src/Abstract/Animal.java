package Abstract;

public abstract class Animal {
   private String name;

    public Animal(String animal) {
        this.name = animal;
    }
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
