package Generic_concept;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {

    public static void main(String[] args) {
        BaseBallPlayer sonal = new BaseBallPlayer("sonal");
        FootballPlayer kajal = new FootballPlayer("kajal");
        SoccerPlayer rohit = new SoccerPlayer("kajal");

        List<Team> allTeam = new ArrayList<>();

        Team<BaseBallPlayer> india = new Team<>("india");
        india.addPlayer(sonal);

        Team<FootballPlayer> PSG = new Team<>("PSG");
        PSG.addPlayer(kajal);

        Team<FootballPlayer> ajax = new Team<>("ajax");

        FootballPlayer raju = new FootballPlayer("raju");
        ajax.addPlayer(raju);

        PSG.matchResult(ajax, 45, 10);
        ajax.matchResult(PSG, 35, 55);

     /*   System.out.println("Ranking");
        System.out.println(PSG.getName() + " : " + PSG.ranking());
        System.out.println(ajax.getName() + " : " + ajax.ranking());

        System.out.println(PSG.compareTo(ajax));
        System.out.println(ajax.compareTo(PSG));

        allTeam.add(india);
        allTeam.add(PSG);
        allTeam.add(ajax);*/

        League<Team<FootballPlayer>> fifa = new League<>("FIFA");
        fifa.addToLeague(PSG);
        fifa.addToLeague(ajax);

        System.out.println("Team  in " + fifa.getLeagueName() + " League ");
        fifa.allLeagueTeam();

        /*Collections.sort(allTeam);
        showTeam(allTeam);*/

    }
}
