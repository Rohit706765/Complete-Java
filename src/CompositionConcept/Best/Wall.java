package CompositionConcept.Best;

public class Wall {
    private String color;
    private  String WallQuality;
    private String DecorationType;

    public Wall(String color, String wallQuality, String decorationType) {
        this.color = color;
        WallQuality = wallQuality;
        DecorationType = decorationType;
    }

    public String getColor() {
        return color;
    }

    public String getWallQuality() {
        return WallQuality;
    }

    public String getDecorationType() {
        return DecorationType;
    }
}
