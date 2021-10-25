package Interface.Power;

import java.util.Scanner;

public class Activity {

    static Scanner s = new Scanner(System.in);
    static power_of_interface.TextView textView = new power_of_interface.TextView();

    public static void main(String[] args) {

        class ClickListener implements power_of_interface.TextView.OnTextClickListener
        {
            ClickListener()
            {
                System.out.println("text is ready for click ");
            }
            @Override
            public void onClick(int position, String text)
            {
                System.out.println(position+" . "+text);
            }
        }

        textView.setTextClickListener(new ClickListener());

       /* textView.setTextClickListener(new TextView.OnTextClickListener() {
            @Override
            public void onClick(int position, String text) {

            }
        });*/

        textListen();
    }
    public static void textListen()
    {
        boolean quit = false;
        int action = -1;
        while (!quit)
        {
            action = s.nextInt();
            switch (action)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    textView.onClick();
                    break;
            }
        }
    }
}
