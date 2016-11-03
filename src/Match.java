/**
 * Created by levente on 2016.11.02..
 */
import org.omg.CORBA.Object;

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
            System.out.println("The ref is a scumbag");
            team.chance *= 0.6;
        }
    }

    public static void luckAway(Team team) {
        double luck = (double)Math.random() +1 ;
        team.chance *= luck;
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
//            System.out.println("home " +t1.chance);
//            System.out.println("b  " +t2.chance);
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
        return "Score = "+ t1.name+" "+ t1.goal + " : "+ t2.name +" "+ t2.goal+"\n-------------";
    }



    public static void main(String[] args) {

//        Team bse = new Team("Ferencváros", 50, 50);
//        Team a = new Team("Újpest", 50, 50);
//        Team b = new Team("Boldog", 50, 50);
//        Team ifi = new Team("Vasas", 55, 50);
//
//
//        Match elso = new Match();
//        Match masodik = new Match();
//        Match harm = new Match();
//        Match negy = new Match();
//        Match ot = new Match();
//        Match hat = new Match();
//
//        String day1a = elso.theMatch(bse,ifi);
//        String day1b = masodik.theMatch(a,b);
//        String day2a = harm.theMatch(ifi,a);
//        String day2b = negy.theMatch(bse,b);
//        String day3a = ot.theMatch(a,bse);
//        String day3b = hat.theMatch(b,ifi);
//
//        ArrayList matches = new ArrayList();
//        matches.add(day1a);
//        matches.add(day1b);
//        matches.add(day2a);
//        matches.add(day2b);
//        matches.add(day3a);
//        matches.add(day3b);

//        System.out.println(x);
//        System.out.println(xa);
//        System.out.println(xb);
//        System.out.println(xc);
//        System.out.println(xd);
//        System.out.println(xe);
//
//        System.out.println("Fradi " +bse.points);
//        System.out.println("ute " +ifi.points);
//        System.out.println("vasas " +a.points);
//        System.out.println("Boldog " +b.points);


    }
}
