/**
 * Created by levente on 2016.11.03..
 */
public class Referee extends Modifier {

    public static double scum() {
        Referee x = new Referee();
        double t = x.effect;
        return t;
    }

    public static boolean hasEffect() {
        if (scum() > 0.92){
            return true;
        }
        return false;
    }

}
