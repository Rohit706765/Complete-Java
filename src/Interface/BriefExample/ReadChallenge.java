package Interface.BriefExample;

import Interface.BriefExample.interfaceCon.Isavable;

import java.util.ArrayList;
import java.util.List;

public class ReadChallenge implements Isavable {
    private String name;
    private int hitPoint;
    private int strength;
    private String weapons;



    @Override
    public void readValue(List<String> data)
    {
        if (data!=null)
        {
            this.name = data.get(0);
            this.hitPoint = Integer.parseInt(data.get(1));
            this.strength = Integer.parseInt(data.get(2));
            this.weapons = (data.get(3));
        }
    }

    @Override
    public List<String> writeValue()
    {
            List<String> newData = new ArrayList<>();
            newData.add(0,this.name);
            newData.add(1,"" +this.hitPoint);
            newData.add(2,""+this.strength);
            newData.add(3,this.weapons);
        return newData;
    }

    public ReadChallenge(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
        weapons = "sword";
    }

    @Override
    public String toString() {
        return "ReadChallenge{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                ", weapons='" + weapons + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }


}


// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).
//
// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.