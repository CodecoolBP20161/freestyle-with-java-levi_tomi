import java.util.*;

import static java.util.Collections.*;

/**
 * Created by levente on 2016.11.03..
 */
public class Printer {

    private static void printer() {

        Team teamOne = new Team("A", 50, 50);
        Team teamTwo = new Team("B", 50, 50);
        Team teamThree = new Team("C", 50, 50);
        Team teamFour = new Team("D", 55, 50);
        Team teamFive = new Team("E", 50, 50);
        Team teamSix = new Team("F", 50, 50);


        ArrayList<Team> teamList = new ArrayList<Team>();
        teamList.add(teamFour);
        teamList.add(teamOne);
        teamList.add(teamTwo);
        teamList.add(teamThree);
        teamList.add(teamFive);
        teamList.add(teamSix);


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

        String day1a = one.theMatch(teamOne,teamFour);
        String day1b = two.theMatch(teamTwo,teamThree);
        String day2a = three.theMatch(teamFour,teamTwo);
        String day2b = four.theMatch(teamOne,teamThree);
        String day3a = five.theMatch(teamTwo,teamOne);
        String day3b = six.theMatch(teamThree,teamFour);

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
            System.out.println(count+".) "+ teamList.get(i).toString());
            count++;
        }

//        System.out.println(count+".) Team: "+teamList.get(i).name + " with "+teamList.get(i).points + " points.");


    }

    public static void main(String[] args) {
        Printer.printer();
    }
}
