package CompositionConcept.Best;

public class Roomsize {
    private int x;
    private int y;

    public Roomsize(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculateSize(int x,int y)
    {
        System.out.println(" Width of Room  is "+x + " && "+"Height of Room "+y);
        System.out.println('\n');
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
