package CompositionConcept.Best;

public class Room {
    private String type;
    private Roomsize roomsize;
    private Wall wall;
    private Bed bed;
    private Table table;
    private String size;

    public Room(String type, Roomsize roomsize, Wall wall, Bed bed, Table table, String size) {
        this.type = type;
        this.roomsize = roomsize;
        this.wall = wall;
        this.bed = bed;
        this.table = table;
        this.size = size;
    }
    public void AddItem(String name)
    {
        String Item=name;
        System.out.println("New item added in room is :"+Item);
    }
    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public Roomsize getRoomsize() {
        return roomsize;
    }

    public Wall getWall() {
        return wall;
    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }
}
