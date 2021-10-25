package ThisVsSuper;

public class ThisVsSub extends This_vs_super {
    int x,y;

    public ThisVsSub(int a, int b, int x, int y) {
        super(a, b);
        this.x = x;
        this.y = y;
    }
        public ThisVsSub()
        {
            this(10,10,10,10);
        }


    public  double WidthCalculator()
    {
        int a=super.getA();
        int b=super.getB();
        return (this.x*this.y*a*b);
    }
}
