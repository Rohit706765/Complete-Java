package Generic_concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String leagueName;
    private List<T> teamList;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teamList = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addToLeague(T teams) {
        if (teamList.contains(teams)) {
            return false;
        }
        teamList.add(teams);
        return true;
    }

    public void allLeagueTeam() {
        Collections.sort(teamList);

        for (T t : teamList)
        {
            System.out.println(t.getName()+" : "+t.ranking());
        }
    }
}
