package CompositionConcept;

public class Motherboard {
    private String name;
    private String Manufacture;
    private int Ramsolots;
    private int Cardslot;
    private String bios;

    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */

    public Motherboard(String name, String manufacture, int ramsolots, int cardslot, String bios) {
        this.name = name;
        Manufacture = manufacture;
        Ramsolots = ramsolots;
        Cardslot = cardslot;
        this.bios = bios;
    }
    public void powerUp()
    {
        System.out.println("Program Successfully Loaded ");
    }
    public String getName() {
        return name;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public int getRamsolots() {
        return Ramsolots;
    }

    public int getCardslot() {
        return Cardslot;
    }

    public String getBios() {
        return bios;
    }
}
