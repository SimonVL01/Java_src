package oefeningen.versie1.versie13;

import java.util.Comparator;

public class YFirstComparator implements Comparator<Oefening13_1> {

    public int compare(Oefening13_1 a, Oefening13_1 b) {
        if (a.getY() != b.getY()) {
            return compare(a, b);
        } else {
            return ((int) a.getY() - (int) b.getY());
        }
    }
}
