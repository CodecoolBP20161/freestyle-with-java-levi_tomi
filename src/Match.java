/**
 * Created by levente on 2016.11.02..
 */
import org.omg.CORBA.Object;
import java.util.Arrays;
import java.util.ArrayList;

public class Match {

    private static int homeBoost = (int)(Math.random() * 10 + 1);

    public static double chanceToWin(Team team){
        return team.chance = team.attack + team.defence;
    }

    public static void boostHome(Team team) {
        double luck = (double) Math.random() + 1;
        double homeAdvantage = Match.homeBoost;
        team.chance += homeAdvantage;
        team.chance *= luck;
        if (Referee.hasEffect()){
            System.out.println("The referee having a bad day");
            team.chance *= 0.7;
        }
    }

    public static void luckAway(Team team) {
        double luck = (double)Math.random() +1 ;
        team.chance *= luck;
        if (Referee.hasEffect()){
            team.chance *= 0.6;
        }
    }

    public static String theMatch(Team t1, Team t2) {
        t2.goal = 0;
        t1.goal = 0;
        int turns = 0;
        System.out.println("-------------");
        while (turns != 5) {
            Match.chanceToWin(t1);
            Match.chanceToWin(t2);
            Match.boostHome(t1);
            Match.luckAway(t2);
            if (Math.abs(t1.chance - t2.chance) > 20) {
                if (t1.chance > t2.chance) {
                    turns++;
                    t1.goal += 1;
                    System.out.println(t1.name + " has scored.");
                } else {
                    turns++;
                    t2.goal += 1;
                    System.out.println(t2.name + " has scored.");
                }
            }else {
                turns++;
                System.out.println(t1.name + " and " + t2.name + " missed");
            }
        }
        System.out.println("Score = "+ t1.name+" "+ t1.goal + " : "+ t2.name +" "+ t2.goal);
        if (t1.goal > t2.goal) {
            t1.points += 3;
        }

        else if (t1.goal < t2.goal) {
            t2.points += 3;
        }
        else {
            t1.points += 1;
            t2.points += 1;
        }
        return "Match Finished";
    }

    public static void main(String[] args) {

    }
}
