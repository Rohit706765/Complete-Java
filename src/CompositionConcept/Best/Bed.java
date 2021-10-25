package CompositionConcept.Best;

public class Bed {
    private int size;
    private String TypeOfBed;
    private String QualityOfBed="Normal";
    private boolean Bendable=false;

    public Bed(int size, String typeOfBed, String qualityOfBed, boolean bendable) {
        this.size = size;
        TypeOfBed = typeOfBed;
        QualityOfBed = qualityOfBed;
        Bendable = bendable;
    }

    public int getSize() {
        return size;
    }

    public String getTypeOfBed() {
        return TypeOfBed;
    }

    public String getQualityOfBed() {
        return QualityOfBed;
    }

    public boolean isBendable() {
        return Bendable;
    }
}
