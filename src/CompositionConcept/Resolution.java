package CompositionConcept;

public class Resolution {
    private int width;
    private int height;

    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void checkResolution()
    {
        System.out.println("Your screen Resolution is "+width+" * "+height);
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
