import java.util.ArrayList;

/**
 * Created by levente on 2016.11.03..
 */
public class Printer {

    public static void printer() {

        Team bse = new Team("Ferencváros", 50, 50);
        Team a = new Team("Újpest", 50, 50);
        Team b = new Team("Boldog", 50, 50);
        Team ifi = new Team("Vasas", 55, 50);


        Match elso = new Match();
        Match masodik = new Match();
        Match harm = new Match();
        Match negy = new Match();
        Match ot = new Match();
        Match hat = new Match();

        String day1a = elso.theMatch(bse,ifi);
        String day1b = masodik.theMatch(a,b);
        String day2a = harm.theMatch(ifi,a);
        String day2b = negy.theMatch(bse,b);
        String day3a = ot.theMatch(a,bse);
        String day3b = hat.theMatch(b,ifi);

        ArrayList matches = new ArrayList();
        matches.add(day1a);
        matches.add(day1b);
        matches.add(day2a);
        matches.add(day2b);
        matches.add(day3a);
        matches.add(day3b);

        for (int i = 0; i < matches.size(); i++) {
            System.out.println(matches.get(i));
        }

    }

    public static void main(String[] args) {
        Printer.printer();
    }
}
