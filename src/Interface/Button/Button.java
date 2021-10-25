package Interface.Button;

public class Button {
    String title;
    onClick clickListener;

    public Button(String title) {
        this.title = title;
    }

    public void setClickListener(onClick clickListener) {
        this.clickListener = clickListener;
    }
    public void listen( )
    {
        this.clickListener.onItemClick(this.title);
    }
    public interface onClick
    {
        void onItemClick(String title);
    }
}
