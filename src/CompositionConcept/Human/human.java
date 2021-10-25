package CompositionConcept.Human;

public class human {

    private String name="";
    private int size;
    private Eye eyes;  // this is a composition
    private  Leg leg; // this is a composition
    private Hand hand; // this is a composition

    public human(String name, int size, Eye eyes, Leg leg, Hand hand) {
        this.name = name;
        this.size = size;
        this.eyes = eyes;
        this.leg = leg;
        this.hand = hand;
    }

    public Eye getEyes() {
        return eyes;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void move()
    {
        leg.Movement();
    }

    public void Iswork()
    {
        hand.workable();
    }

    public void visibility(int rate)
    {
     eyes.Visibility(rate);

    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

}
