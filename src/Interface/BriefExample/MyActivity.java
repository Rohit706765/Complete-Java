package Interface.BriefExample;

import Interface.BriefExample.interfaceCon.AfternoonActivity;
import Interface.BriefExample.interfaceCon.EveningActivity;
import Interface.BriefExample.interfaceCon.MorningActivity;

public class MyActivity implements MorningActivity, AfternoonActivity, EveningActivity {

    private String personName;
    private boolean isTyping = false;
    private boolean isPlayingTennis = false;
    private boolean isCompletingLaunch = false;

    public static void main(String[] args) {
        MyActivity rohit = new MyActivity("rohit");

        rohit.isTyping(true);
        rohit.isPlayingTennis(true);
        rohit.isCompletingLanuch(true);
    }

    @Override
    public boolean isTyping(boolean typing) {
        isTyping = typing;
        if (isTyping)
        {
            System.out.println("I'm typing now ");
            isTyping = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isPlayingTennis(boolean playingTennis) {
        isPlayingTennis = playingTennis;
        if (isPlayingTennis)
        {
            System.out.println("i'm playing tennis right now ");
            isPlayingTennis = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isCompletingLanuch(boolean completingLanuch) {
        isCompletingLaunch = completingLanuch;
        if (isCompletingLaunch)
        {
            System.out.println("I'm Doing Launch at this time ");
            return true;
        }
        return false;
    }

    @Override
    public boolean isCompletingTask(boolean completingTask) {
        return false;
    }


    public MyActivity(String personName) {
        this.personName = personName;
    }

    @Override
    public boolean iswake() {
        return false;
    }

    @Override
    public boolean isExcersize() {
        return false;
    }

    @Override
    public boolean enjoyingTea() {
        return false;
    }

    @Override
    public boolean walking() {
        return false;
    }

    @Override
    public boolean isFresh() {
        return false;
    }

    @Override
    public boolean isWalking() {
        return false;
    }

    @Override
    public boolean ReportDone() {
        return false;
    }

    @Override
    public boolean playingTennis() {
        return false;
    }
}
