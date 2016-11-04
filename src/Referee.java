/**
 * Created by levente on 2016.11.03..
 */
public class Referee extends Modifier {
    // as a random factor, we used the referee, if the parent class throws a certain num, the referee makes mistakes
    private static double scum() {
        Referee x = new Referee();
        double t = x.effect;
        return t;
    }
// This gets passed to the Match class
    public static boolean hasEffect() {
        if (scum() > 0.92){
            return true;
        }
        return false;
    }

}
