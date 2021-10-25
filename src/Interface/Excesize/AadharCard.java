package Interface.Excesize;

import java.util.ArrayList;
import java.util.List;

public class AadharCard implements Saveble{

    private int age;
    private String name;
    private String address;
    private String number;

    public AadharCard() {
        this(-1,"unknown","unknown","404");
    }

    public AadharCard(int age, String name, String address, String number) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.number = number;
        saveData();

    }

    @Override
    public void readValues(List<String> data) {
        if (data.size()>0 )
        {
            this.age = Integer.parseInt(data.get(0));
            this.name = data.get(1);
            this.address = data.get(2);
            this.number =(data.get(3));
        }
    }

    @Override
    public List<String> saveData() {
        List<String> userSaveData = new ArrayList<>();
        userSaveData.add(0,""+this.age);
        userSaveData.add(1,this.name);
        userSaveData.add(2,this.address);
        userSaveData.add(3,""+this.number);
        return userSaveData;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String  getNumber() {
        return number;
    }
}
