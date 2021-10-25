package Abstract;

public class AnimalActivity {
    public static void main(String[] args) {
        Dog tommy = new Dog("tommy");
        tommy.eat();
        tommy.breathe();

        Parrot parrot = new Parrot("Indian Parrot ");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguinn moto = new Penguinn("American Penguin");
        moto.fly();

    }
}
