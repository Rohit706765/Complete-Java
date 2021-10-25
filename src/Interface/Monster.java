package Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int health;

    public Monster(String name, int hitPoints, int health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> write() {
        int index=0;
        List<String> Myvalue= new ArrayList<String>();
        Myvalue.add(index,this.name);
        ++index;
        Myvalue.add(index,""+this.health);
        ++index;
        Myvalue.add(index,""+this.hitPoints);

        return Myvalue;
    }

    @Override
    public void read(List<String> a) {
        if (a!=null && a.size()>0)
        {
            this.name=a.get(0);
            this.health=Integer.parseInt(a.get(1));
            this.hitPoints=Integer.parseInt(a.get(2));
        }
    }
}
