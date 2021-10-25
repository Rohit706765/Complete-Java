package CompositionConcept;

public class Case {
    private String model;
    private String manufacture;
    private int powersupply;
    Case_Dimension dimension;


    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */
    public Case(String model, String manufacture, int powersupply, Case_Dimension dimension) {
        this.model = model;
        this.manufacture = manufacture;
        this.powersupply = powersupply;
        this.dimension = dimension;
    }
    public void PressPoweButton()
    {
        System.out.println("Power button pressed ");
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getPowersupply() {
        return powersupply;
    }
}
