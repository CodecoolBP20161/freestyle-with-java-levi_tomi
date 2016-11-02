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

    public Team(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.points = 0;
        this.goal = 0;
        this.chance = 0;
    }



}
