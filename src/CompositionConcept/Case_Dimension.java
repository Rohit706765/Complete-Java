package CompositionConcept;

public class Case_Dimension {
    private int width;
    private int height;
    private int depth;

    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */
    public Case_Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

}
