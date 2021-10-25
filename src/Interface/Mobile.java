package Interface;

public class Mobile implements ITelephone {
    boolean IsRing=false;
    int MyNumber;
    boolean Ison=false;

    public Mobile( int myNumber) {
        MyNumber = myNumber;
    }
    @Override
    public void start() {
        Ison=true;
        System.out.println("Calling is on in Mobile phone ");
    }

    @Override
    public void dial(int phoneNumber) {
        if (Ison) {
            System.out.println("Now Dial Number " + phoneNumber);
        }
        else
        {
            System.out.println("Your phone is switched off ");
        }
    }

    @Override
    public void answer() {
        if (IsRing)
        {
            System.out.println("Answering the mobile phone ");
            IsRing=false;
        }
    }

    @Override
    public boolean callphone(int phoneNumber) {
        if(MyNumber==phoneNumber && Ison)
        {
            IsRing=true;
            System.out.println("Senorita ring ");
        }
        else {
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
}

