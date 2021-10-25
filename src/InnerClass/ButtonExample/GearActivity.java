package InnerClass.ButtonExample;

import java.util.Scanner;

public class GearActivity {


    private static Scanner s = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {

       /* local class concept is here*/
      /*  class ClickListner implements  Button.OnclickListner
        {
            ClickListner()
            {
                System.out.println("I'm attached successfully ");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked ");
            }
        }
      */

        /* Anonymous class concept is here*/

        button.setOnclickListner(new Button.OnclickListner() {
            @Override
            public void onClick(String title) {

            }
        });
        listen();

    }
    public static void listen()
    {
        boolean quit = false;
        while (!quit)
        {
            int action = s.nextInt();
            switch (action)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
                    break;
            }
        }
    }
}





/*GearBox audi = new GearBox(6);
        audi.addGear(1,5.3);
        audi.addGear(2,10.6);
        audi.addGear(3,15.6);
        audi.operateClutch(true);
        audi.changeGear(2);
        audi.operateClutch(false);
        System.out.println(audi.wheelSpeed(1000));
        audi.operateClutch(true);*/

/*  Local class concept here*/