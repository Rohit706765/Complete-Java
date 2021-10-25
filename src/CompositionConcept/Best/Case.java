package CompositionConcept.Best;

public class Case {
    private String Manufacturer;
    private int PowerSupply;
    private Dimension dimension;
    private String model;

    public Case(String manufacturer, int powerSupply, Dimension dimension, String model) {
        Manufacturer = manufacturer;
        PowerSupply = powerSupply;
        this.dimension = dimension;
        this.model = model;
    }
    public void powerup()
    {
        System.out.println(" Pc will be Start ");
    }
    public String getManufacturer() {
        return Manufacturer;
    }

    public int getPowerSupply() {
        return PowerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getModel() {
        return model;
    }
}
