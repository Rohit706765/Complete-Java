package CompositionConcept.Best;

public class Table {
    private String TypeOfTable;
    private int width;
    private int height;
    private int PriceOfTable=0;

    public Table(String typeOfTable, int width, int height, int priceOfTable) {
        TypeOfTable = typeOfTable;
        this.width = width;
        this.height = height;
        PriceOfTable = priceOfTable;
    }

    public String getTypeOfTable() {
        return TypeOfTable;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPriceOfTable() {
        return PriceOfTable;
    }
}
