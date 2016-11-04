/**
 * Created by levente on 2016.11.02..
 */
public class Team {

    public String name;
    public int attack;
    public int defence;
    public int points;
    public int goal;
    public double chance;
    public int match;
// Constructor for the teams, where we can set 3 attr's
    public Team(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.match = 0;
        this.points = 0;
        this.goal = 0;
        this.chance = 0;
    }
// The toString was the key to solve issues with the Comparator
    public String toString() {
        return "Team: "+this.name +"\t | Played: "+this.match+"\t | Points: \t"+this.points;
    }
}
