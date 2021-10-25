package CompositionConcept.Best;

public class Motheboard {
    private String Manufacture;
    private int RamSlot;
    private String model;
    private int CardSlot;
    private String bios;

    public Motheboard(String manufacture, int ramSlot, String model, int cardSlot, String bios) {
        Manufacture = manufacture;
        RamSlot = ramSlot;
        this.model = model;
        CardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgram(String ProgramName)
    {
        System.out.println(" Loaded Program is "+ProgramName);
    }

    public String getManufacture() {
        return Manufacture;
    }

    public int getRamSlot() {
        return RamSlot;
    }

    public String getModel() {
        return model;
    }

    public int getCardSlot() {
        return CardSlot;
    }

    public String getBios() {
        return bios;
    }
}
