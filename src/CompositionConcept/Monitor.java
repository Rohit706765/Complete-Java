package CompositionConcept;

public class Monitor {

    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolution;

    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */
    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void DrawPixelAt(int x,int y,String color)
    {
        System.out.println("Draw pixel at "+x + " and "+y+" Color :"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
