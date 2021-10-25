package Interface;


public class Deskphone implements ITelephone {

    private int myNumber;
    private boolean isRinging = true;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void start() {
        System.out.println("Desk phone does'nt have power on button ");

    }

    @Override
    public void dial(int number) {
        System.out.println("Now Dial this "+number+" on your phone ");

    }

    @Override
    public void answer()
    {
        if (isRinging)
        {
            System.out.println("answering this phone ");
            System.out.println("ring ring ");
        }
        else
        {
            System.out.println("Check your phone ");
        }
    }

    @Override
    public boolean callphone(int phonenumber) {
        if (phonenumber==myNumber )
        {
            System.out.println("calling this number "+myNumber);
            System.out.println("ring ring ");
        }

        return false;
    }

    @Override
    public boolean ring() {
        if (isRinging)
        {
            System.out.println("your phone is ringing now ");
            isRinging =false;
        }
        else
        {
            isRinging=true;
        }

        return false;
    }

    @Override
    public boolean switchOff() {
        return false;
    }
}
