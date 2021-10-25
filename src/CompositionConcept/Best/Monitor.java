package CompositionConcept.Best;

public class Monitor {
    private int size;
    private String model;
    private String Manufacture;
    private Resolution resolve;

    public Monitor(int size, String model, String manufacture, Resolution resolve) {
        this.size = size;
        this.model = model;
        Manufacture = manufacture;
        this.resolve = resolve;
    }
    public void DrawPixelat(int x,int y,String color)
    {
        System.out.println(" Draw logo at "+x +  " " +y+ " at  color "+color);
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public Resolution getResolve() {
        return resolve;
    }
}
