package CompositionConcept.Human;

public class Man {

    public static void main(String agr[])
    {
        Hand h=new Hand(2,false,10);
        Leg l=new Leg(2,3);
        Eye e=new Eye(2,1);
        human TheHuman=new human("Rohit",5,e,l,h);
        System.out.println(" Rohit is here ");
       TheHuman.visibility(1);
       TheHuman.move();
       TheHuman.Iswork();

    }
}
