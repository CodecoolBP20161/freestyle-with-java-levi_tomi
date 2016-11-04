import java.util.*;

import static java.util.Collections.*;

/**
 * Created by levente on 2016.11.03..
 */
public class Printer {

    private static void printer() {


        Team teamOne = new Team("Arsenal", 82, 70);
        Team teamTwo = new Team("Barcelona", 85, 79);
        Team teamThree = new Team("Real M.", 83, 78);
        Team teamFour = new Team("Bayern M.", 84, 74);
        Team teamFive = new Team("Juventus", 79, 80);
        Team teamSix = new Team("Felcsút", 34, 30);


        ArrayList<Team> teamList = new ArrayList<Team>();
        teamList.add(teamFour);
        teamList.add(teamOne);
        teamList.add(teamTwo);
        teamList.add(teamThree);
        teamList.add(teamFive);
        teamList.add(teamSix);

        // Clean code disgrace (CCD)
        Match one = new Match();
        Match two = new Match();
        Match three = new Match();
        Match four = new Match();
        Match five = new Match();
        Match six = new Match();
        Match seven = new Match();
        Match eight = new Match();
        Match nine = new Match();
        Match ten = new Match();
        Match eleven = new Match();
        Match twelve = new Match();
        Match thirteen = new Match();
        Match fourteen = new Match();
        Match fifteen = new Match();


        String day1a = one.theMatch(teamOne,teamFour);
        String day1b = two.theMatch(teamTwo,teamThree);
        String day2a = three.theMatch(teamFour,teamTwo);

        String day2b = four.theMatch(teamOne,teamThree);
        String day3a = five.theMatch(teamTwo,teamOne);
        String day3b = six.theMatch(teamThree,teamFour);

        String day1c = seven.theMatch(teamOne,teamFive);
        String day2c = eight.theMatch(teamFive,teamThree);
        String day3c = nine.theMatch(teamFive,teamTwo);
        String day4c = ten.theMatch(teamFive,teamSix);

        String day2d = eleven.theMatch(teamOne,teamSix);
        String day1d = twelve.theMatch(teamSix,teamThree);
        String day3d = thirteen.theMatch(teamSix,teamTwo);

        String day3e = fourteen.theMatch(teamFour,teamFive);
        String day3f = fifteen.theMatch(teamSix,teamFour);
        // CCD ends here
        // sorts teams by their points
        Collections.sort(teamList, new Comparator<Team>() {
            public int compare(Team o1, Team o2) {
                return Integer.valueOf(o2.points).compareTo(o1.points);
            }
        });

        int count = 1;
        System.out.println("\n\nFinal Result:\n");
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(count+".) "+ teamList.get(i).toString());
            count++;
        }

    }

    public static void main(String[] args) {
        Printer.printer();
    }
}
