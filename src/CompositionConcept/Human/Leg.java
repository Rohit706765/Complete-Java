package CompositionConcept.Human;

public class Leg {
    int LegNumber;
    int size;

    public Leg(int legNumber, int size) {
        LegNumber = legNumber;
        this.size = size;
    }
    public void Movement()
    {
        System.out.println("leg.Movement() is called ");
    }

    public int getLegNumber() {
        return LegNumber;
    }

    public int getSize() {
        return size;
    }
}
