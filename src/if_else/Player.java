package if_else;

public class Player {
    private String PlayerName;
    private int healthPoint=100;
    private String weapon="Sword";
    private int level=0;
    private int score=0;
    private boolean Gameover=true;
    public Player(String playerName, int healthPoint,String weapon) {
        PlayerName = playerName;
        if(healthPoint>0 && healthPoint<=100)
        {
            this.healthPoint = healthPoint;
        }
        if(weapon.equals("sword"))
        {

            this.weapon=weapon;
        }
        else
        {
            System.out.println(" Atleast you have atleat 1st level for another weapon  ");
            this.weapon="sword";
        }
    }
    public boolean play()
    {

        if (score==0)
        {
            System.out.println(Gameover+" Game over ");
        }
        if (getHealthPoint()<=0)
        {
            System.out.println("Dear "+this.PlayerName+" Sorry You are knocked out ");
            return false;
        }
        else
        {
            level++;
            if (level==0)
            {
                this.weapon="sword";
            }
            else if(level>0 && level<=10)
            {
                this.weapon="Gun";

                System.out.println(" You are allow to access only "+this.weapon);
            }
            else
            {
                this.weapon="Machine Gun && Sniper";
                System.out.println("You are allow to access only "+this.weapon);
            }
            return true;
        }



    }
    public boolean LoseHealth(int damage)
    {
        this.healthPoint-=damage;
        if(this.healthPoint<=0)
        {
            System.out.println(this.PlayerName+" is knocked out !! ");
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
