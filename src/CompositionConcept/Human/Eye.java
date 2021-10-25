package CompositionConcept.Human;

public class Eye {
    int NumberEye;
    int rate;
    public Eye(int Numbereye,int rate)
    {
        this.NumberEye=Numbereye;
        this.rate=rate;
    }
    public void Visibility(int rate)
    {
        this.rate=rate;
        System.out.println(" Eye.Visibility() is called ");
        System.out.println("total visibility is :"+this.rate);
    }

    public int getNumberEye() {
        return NumberEye;
    }

    public int getRate() {
        return rate;
    }
}
