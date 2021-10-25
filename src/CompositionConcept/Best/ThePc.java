package CompositionConcept.Best;

public class ThePc {
    private Case TheCase;
    private Motheboard TheMotherBoard;
    private Monitor TheMonitor;

    public ThePc(Case theCase, Motheboard theMotherBoard, Monitor theMonitor) {
        TheCase = theCase;
        TheMotherBoard = theMotherBoard;
        TheMonitor = theMonitor;
    }

    public Case getTheCase() {
        return TheCase;
    }
    public void powerup()
    {
        TheCase.powerup();
    }
    public void Drawlogo()
    {
        TheMonitor.DrawPixelat(45,35,"blue");
    }
    public void loadprogram()
    {
        TheMotherBoard.loadProgram("Start-Up");
    }

    public Motheboard getTheMotherBoard() {
        return TheMotherBoard;
    }

    public Monitor getTheMonitor() {
        return TheMonitor;
    }
}
