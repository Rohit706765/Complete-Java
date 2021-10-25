package LinkedList.Excersize;

public class FoodModel {
    private double price;
    private String name;

    public FoodModel( String name,double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "price = " + price +
                " name = " + name;
    }
}
