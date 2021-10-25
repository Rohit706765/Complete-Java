package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable{
    private String name;
    private int hitPoint;
    private String weapon;
    private int health;

    public Player(String name, int hitPoint, int health) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.health = health;
        this.weapon="Sword";
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> write() { /// using list we have many advantage like we can return arraylist linkedlist vector
        List<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1," "+this.hitPoint);
        values.add(2,""+this.health);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> Savedvalue) {
        if (Savedvalue!=null && Savedvalue.size()>0)
        {
            this.name=Savedvalue.get(0);
            this.hitPoint=Integer.parseInt(Savedvalue.get(1));
            this.health=Integer.parseInt(Savedvalue.get(2));
            this.weapon=Savedvalue.get(3);
        }
    }
}
