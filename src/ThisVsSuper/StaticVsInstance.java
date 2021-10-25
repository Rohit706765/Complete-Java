package ThisVsSuper;

public class StaticVsInstance {
    public String name="Rajan";
    public StaticVsInstance(String name)
    {
        this.name=name;
    }
    public void PrintName()
    {
        System.out.println(this.name);
    }
}
