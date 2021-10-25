package GetterSetterConcpet;

/**
 *      This class access by class_info.java
 * */

public class Car {
    private int door;
    private int wheel;
    private String color;
    private String Model;
    private int price;

    public boolean setModel(String Model)
    {
        String validmodel=Model.toLowerCase();
        if(validmodel.equals("suzaki") || validmodel.equals("bmw"))
        {
            this.Model=Model;
            return true;
        }else
        {
            this.Model="Unknown";
            return false;
        }

    }
    public String getModel()
    {

        return this.Model;
    }
    public void setPrice(int price)
    {
        if(setModel(this.Model))
        {
            System.out.println("in "+this.Model +" Service tax Included after Total Payment");
            this.price+=10000;

        }
        else
        {
            //System.out.println("");
            this.price=price;
        }


    }
    public int getPrice()
    {
        return this.price;
    }
}
