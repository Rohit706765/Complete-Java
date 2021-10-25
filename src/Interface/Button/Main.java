package Interface.Button;

public class Main {
    static Button helloBtn = new Button("hello button");

    public static void main(String[] args) {
        class ClickListener implements Button.onClick
        {
            public ClickListener() {
                System.out.println("i have been attached ");
            }

            @Override
            public void onItemClick(String title) {
                System.out.println("hii i am just called ");
            }
        }
        helloBtn.setClickListener(new Button.onClick() {
            @Override
            public void onItemClick(String title) {

            }
        });
        helloBtn.setClickListener(new ClickListener());
        helloBtn.listen();
    }

}
