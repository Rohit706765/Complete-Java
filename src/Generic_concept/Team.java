package Generic_concept;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int loss = 0;
    private int tied = 0;

    ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (member.contains(player)) {
            System.out.println(player.getName() + " is already in team ");
            return false;
        }
        member.add(player);
        System.out.println(player.getName() + " successfully added in team ");
        return true;
    }

    public int numberOfPlayer() {
        return member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String msg;

        if (ourScore > theirScore) {
            won++;
            msg = "beat ";
        } else if (ourScore == theirScore) {
            tied++;
            msg = "drew with ";
        } else {
            loss++;
            msg = "loss to";
        }
        if (opponent != null) {
            System.out.println(this.getName() + "  " + msg + "  " + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {

        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }

        return 0;
    }
}
