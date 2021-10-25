package Interface.Power;

public class TextView {
    private String text;
    private int position = 1;
    OnTextClickListener textClickListener;

    public TextView()
    {
        this.text = "hii we are passing value through interface";
    }

    public void setTextClickListener(OnTextClickListener textClickListener)
    {
        this.textClickListener = textClickListener;
    }
    public void onClick()
    {
        this.textClickListener.onClick(position,text);
    }
    public interface OnTextClickListener
    {
            void onClick(int position,String text);
    }
}
