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
        System.out.println("l --"+luck);
        double homeAdvantage = Match.homeboost;
        team.chance += homeAdvantage;
        team.chance *= luck;
    }

    public static void luckAway(Team team) {
        double luck = (double)Math.random() +1 ;
        System.out.println("l2 --"+luck);
        team.chance *= luck;
    }

    public static String theMatch(Team t1, Team t2) {
        Match.chanceToWin(t1);
        Match.chanceToWin(t2);
        Match.boostHome(t1);
        Match.luckAway(t2);
        // MATH ABS????!
        if (Math.abs(t1.chance - t2.chance) > 15) {
            if (t1.chance > t2.chance){
                return t1.name + " has won the game.";
            }
            return t2.name + " caused an upset, and won the game away!";
        }
        return t1.name + " and " + t2.name + " played a draw...";
    }



    public static void main(String[] args) {

        Team bse = new Team("A", 50, 50);
        Team ifi = new Team("B", 50, 50);

        Match elso = new Match();
        String x = elso.theMatch(bse,ifi);
        System.out.println("a " +bse.chance);
        System.out.println("b  " +ifi.chance);

        System.out.println(x);
//        System.out.println(bse.goal);



    }
}


// may'll be useful later... Line 34
//if (Math.abs(t1.chance - t2.chance) > 15) {
//        t1.goal += 1;
//        return t1.name +" won the match";
//
//        } else if (t1.chance < t2.chance){
//        t2.goal += 1;
//        return t2.name +" won the match";
//        }
//        return "Draw ";