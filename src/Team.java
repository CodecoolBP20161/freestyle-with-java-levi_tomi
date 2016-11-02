/**
 * Created by levente on 2016.11.02..
 */
public class Team {
    public String name;
    public int attack;
    public int defence;
    public int points;
    public int goal;
    public int chance;

    public Team(String name, int attack, int defence, int points) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.points = points;
        this.goal = 0;
        this.chance = (attack + defence);
    }



}
//    public static String theMatch(Team t1, Team t2) {
//        Match.boostHome(t1);
//        Match.luckAway(t2);
//        if (t1.attack > t2.attack) {
//            return t1.name +" won the match";
//        } else if (t1.attack < t2.attack){
//            return t2.name +" won the match";
//        }
//        return "Draw ";
//    }
