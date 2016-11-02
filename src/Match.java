/**
 * Created by levente on 2016.11.02..
 */

public class Match {

    static int luck = (int)(Math.random() * 10 + 1);
    static int homeboost = (int)(Math.random() * 8 + 1);

    public static void boostHome(Team team) {
        double extra = (Match.homeboost + Match.luck) * 0.7;
        System.out.println(luck);
        System.out.println(homeboost);
        System.out.println(extra);
        team.attack += extra;
        team.defence += extra;

    }

    public static void luckAway(Team team) {

        team.attack += Match.luck;
        team.defence += Match.luck;
    }

//    public static double chanceToWin(Team team){
//        double team.chance = team.attack + team.defence;
//    }

    public static String theMatch(Team t1, Team t2) {
        Match.boostHome(t1);
        Match.luckAway(t2);
        if (t1.attack > t2.attack) {
            t1.goal += 1;
            return t1.name +" won the match";

        } else if (t1.attack < t2.attack){
            t2.goal += 1;
            return t2.name +" won the match";
        }
        return "Draw ";
    }


//    public static

    public static void main(String[] args) {

        Team ifi = new Team("B", 50, 50, 0);
        Team bse = new Team("A", 50, 50, 0);


        Match elso = new Match();
        String x = elso.theMatch(bse,ifi);
        System.out.println("a " +bse.attack);
        System.out.println("b  " +ifi.attack);

        System.out.println(x);
        System.out.println(bse.goal);



    }
}
