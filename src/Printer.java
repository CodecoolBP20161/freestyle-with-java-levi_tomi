import java.util.*;

import static java.util.Collections.*;

/**
 * Created by levente on 2016.11.03..
 */
public class Printer {

    private static void printer() {

        Team teamOne = new Team("Ferencváros", 50, 50);
        Team teamTwo = new Team("Újpest", 50, 50);
        Team teamThree = new Team("Boldog", 50, 50);
        Team teamFour = new Team("Vasas", 55, 50);

        ArrayList<Team> teamList = new ArrayList<Team>();
        teamList.add(teamFour);
        teamList.add(teamOne);
        teamList.add(teamTwo);
        teamList.add(teamThree);


        Match elso = new Match();
        Match masodik = new Match();
        Match harm = new Match();
        Match negy = new Match();
        Match ot = new Match();
        Match hat = new Match();

        String day1a = elso.theMatch(teamOne,teamFour);
        String day1b = masodik.theMatch(teamTwo,teamThree);
        String day2a = harm.theMatch(teamFour,teamTwo);
        String day2b = negy.theMatch(teamOne,teamThree);
        String day3a = ot.theMatch(teamTwo,teamOne);
        String day3b = hat.theMatch(teamThree,teamFour);

        ArrayList matches = new ArrayList();
        matches.add(day1a);
        matches.add(day1b);
        matches.add(day2a);
        matches.add(day2b);
        matches.add(day3a);
        matches.add(day3b);

        for (int i = 0; i < matches.size(); i++) {
            System.out.println(matches.get(i));
        }

        Collections.sort(teamList, new Comparator<Team>() {
            public int compare(Team o1, Team o2) {
                return Integer.valueOf(o2.points).compareTo(o1.points);
            }
        });

        int count = 1;
        System.out.println("\n\nFinal Result:\n");
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(count+".) Team: "+teamList.get(i).name + " with "+teamList.get(i).points + " points.");
            count++;
        }



    }

    public static void main(String[] args) {
        Printer.printer();
    }
}
