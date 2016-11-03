/**
 * Created by levente on 2016.11.02..
 */

public class Match {

    static int homeboost = (int)(Math.random() * 8 + 1);

    public static double chanceToWin(Team team){
        return team.chance = team.attack + team.defence;
    }

    public static void boostHome(Team team) {
        double luck = (double) Math.random() + 1;
        double homeAdvantage = Match.homeboost;
        team.chance += homeAdvantage;
        team.chance *= luck;
    }

    public static void luckAway(Team team) {
        double luck = (double)Math.random() +1 ;
        team.chance *= luck;
    }

    public static String theMatch(Team t1, Team t2) {
        int turns = 0;
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
        System.out.println("Score = "+ t1.goal + " "+ t2.goal);
//        return "Score = "+ t1.goal + " "+ t2.goal;
        return "done";
        }



    public static void main(String[] args) {

        Team bse = new Team("Ferencváros", 50, 50);
        Team ifi = new Team("Újpest", 50, 50);

        Match elso = new Match();
        String x = elso.theMatch(bse,ifi);
        System.out.println("a " +bse.chance);
        System.out.println("b  " +ifi.chance);

        System.out.println(x);

    }
}
