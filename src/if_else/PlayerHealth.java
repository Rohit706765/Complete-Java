package if_else;

import javafx.geometry.Pos;

public class PlayerHealth {
    private String name="xyz";
    private double Bonus=100;
    private double Score;
    private int Health=0;
    private int Damage;

    public PlayerHealth(String name, double bonus, double score, int health) {
        this.name = name;
        this.Bonus = bonus;
        this.Score = score;
        if(this.Health>=0 || this.Health<100)
        {
            this.Health = health;
        }
    }
    public int PlayerPosition(int score)
    {

        int Position=1;
        this.Score=score;
        this.Score=score+this.Bonus;


            if(this.Score>4500)
            {
                Position=1;
                return Position;
            }
            else if(this.Score>3500)
            {
                Position=2;
                return Position;
            }
            else if(this.Score>2500)
            {
                Position=3;
                return Position;
            }
            else if(this.Score>1000)
            {
                Position=4;
                return Position;
            }
            else
            {
                System.out.println(this.name+" You get No position Okay !!");
                return -1;
            }
    }
    public double CalculateScore(int score)
    {
        System.out.println("***********Score Board is *****************"+'\n');
        if(score>0)
        {
            this.Score=score+Bonus;
            System.out.println(this.name+" Your Total Score is "+this.Score);

        }
        return this.Score;
    }
    public void loseHealth(int Damage)
    {
        if(this.Damage>=0)
        {
            this.Health=this.Health-Damage;// this.damage-=this.health;
            System.out.println("Your health is "+this.Health);

            if(this.Health<=0)
            {
                System.out.println(this.name+" is knocked out ");
            }
        }

    }

    public int getHealth() {
        return this.Health;
    }
}
