package InnerClass;

public class main {
    public static void main(String[] args) {
        GearBox1 audi=new GearBox1(6);
        GearBox1.Gear first=  audi.new  Gear(1,12.5);

        System.out.println(first.driveSpeed(1000));
    }
}
