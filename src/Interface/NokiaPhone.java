package Interface;

public class NokiaPhone implements ITelephone {
    boolean IsRing=false;
    int MyNumber;
    boolean Ison=false;
    public NokiaPhone( int myNumber) {
        MyNumber = myNumber;
    }

    @Override
    public void start() {
        System.out.println("Your phone Screen is on ");
        Ison=true;
    }

    @Override
    public void dial(int number) {
        if(Ison)
        {
            System.out.println("Dial number is "+number);
            IsRing=true;
        }
    }

    @Override
    public void answer() {
            if (Ison && IsRing)
            {
                System.out.println("Answering the phone ");
                IsRing=false;
            }
    }

    @Override
    public boolean callphone(int phonenumber) {
        if(MyNumber==phonenumber && Ison)
        {
            System.out.println("pick up the phone ");
            IsRing=true;
        }
        else{
            IsRing=false;
        }
        return IsRing;
    }

    @Override
    public boolean switchOff() {
        System.out.println("phone is switch off");
        Ison=false;
        return Ison;
    }

    @Override
    public boolean ring() {
        return IsRing;
    }

    /*
    @Override
    public void Start() {
        System.out.println("Calling is on in desk phone ");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Dial Number "+phoneNumber);
    }

    @Override
    public void answer() {
        if (IsRing)
        {
            System.out.println("Answering the desk phone ");
            IsRing=false;
        }
    }

    @Override
    public boolean Callphone(int phoneNumber) {
        if(MyNumber==phoneNumber)
        {
            IsRing=true;
            System.out.println("Ring ring ");
        }
        else {
            IsRing=false;
        }
        return IsRing;
    }

    @Override
    public boolean Ring() {
        return IsRing;
    }*/
}
