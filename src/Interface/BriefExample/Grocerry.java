package Interface.BriefExample;

import Interface.BriefExample.interfaceCon.IStroageMedium;
import interface_introduction_for_Rajan.Isavable;

import java.util.ArrayList;
import java.util.List;

public class Grocerry  implements IStroageMedium {

    private int itm_quantity;
    private String itm_name;
    private double itm_price;
    private double itm_discount_price;

    public Grocerry(int itm_quantity, String itm_name, double itm_price) {
        this.itm_quantity = itm_quantity;
        this.itm_name = itm_name;
        this.itm_price = itm_price;
        this.itm_discount_price  = 50;
    }

    @Override
    public String toString() {
        return "Grocerry{" +
                "itm_quantity=" + itm_quantity +
                ", itm_name='" + itm_name + '\'' +
                ", itm_price=" + itm_price +
                ", itm_discount_price=" + itm_discount_price +
                '}';
    }

    @Override
    public void readValue(List<String> data) {
        if (data !=null && data.size()>0)
        {
            this.itm_name = data.get(0);
            this.itm_quantity = Integer.parseInt(data.get(1));
            this.itm_discount_price  = Integer.parseInt(data.get(3));
            this.itm_price = Double.parseDouble(data.get(2));
        }
    }

    @Override
    public List<String> writeValue() {
        List<String> data = new ArrayList<>();
        data.add(0,this.itm_name);
        data.add(1," "+this.itm_quantity);
        data.add(2," "+this.itm_price);
        data.add(3," "+this.itm_discount_price);
        return data;
    }
}
