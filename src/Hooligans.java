/**
 * Created by levente on 2016.11.04..
 */
public class Hooligans extends Modifier {

    private static double riot() {
        Hooligans hate = new Hooligans();
        double fight = hate.effect;
        return fight;
    }
    public static boolean hasEffect() {
        if (riot() > 0.97) {
            return true;
        }
        return false;
    }
}

