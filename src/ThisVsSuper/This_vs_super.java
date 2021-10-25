package ThisVsSuper;

public class This_vs_super {
    private int a=10;
    private int b=20;
    private int sum=0;

    public This_vs_super(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double calculate()
    {
        this.sum=this.a+this.b;
        return this.sum;
    }
}

