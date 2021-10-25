package InnerClass.GearBox;

public class Main {
    public static void main(String[] args) {
        Gearbox audi = new Gearbox(6);

        audi.setOperateClutchIn(true);
        audi.changeGear(1);
        audi.setOperateClutchIn(false);
        System.out.println(audi.driveSpeed(1000));
        audi.changeGear(2);

        System.out.println(audi.driveSpeed(5000));
    }
}
