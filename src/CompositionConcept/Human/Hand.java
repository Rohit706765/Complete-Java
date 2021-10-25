package CompositionConcept.Human;

public class Hand {
    private int NumberHand;
    private boolean IsAnyProblem=false;
    private int NumberOfFingure;

    public Hand(int numberHand, boolean isAnyProblem, int numberOfFingure) {
        NumberHand = numberHand;
        IsAnyProblem = isAnyProblem;
        NumberOfFingure = numberOfFingure;
    }

    public void workable()
    {
        System.out.println("Hand.workable() is called ");
    }
    public int getNumberHand() {
        return NumberHand;
    }

    public boolean isAnyProblem() {
        return IsAnyProblem;
    }

    public int getNumberOfFingure() {
        return NumberOfFingure;
    }
}
