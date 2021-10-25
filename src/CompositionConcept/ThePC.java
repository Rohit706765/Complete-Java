package CompositionConcept;

public class ThePC {
    private Motherboard motherboard;
    private Case aCase;
    private Monitor monitor;

    /*
     *   this class fully used by Composition concept
     *   class name motherboard ,Monitor, Case ,Case_Dimension, Resolution
     * */

    public ThePC(Motherboard motherboard, Case aCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.aCase = aCase;
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
