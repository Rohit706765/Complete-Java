package InnerClass.ButtonExample;

public class Button {
    private String title;
    private OnclickListner onclickListner;
    public Button(String title)
    {
        this.title = title;
    }
    public void setOnclickListner(OnclickListner onclickListner)
    {
        this.onclickListner = onclickListner;
    }
    public void onClick()
    {
        onclickListner.onClick(this.title);
    }

    public interface OnclickListner
    {
        void onClick(String title);
    }
}
