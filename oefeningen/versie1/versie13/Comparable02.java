package oefeningen.versie1.versie13;

import java.util.Comparator;

public class Comparable02 implements Comparator<Oefening13_3> {
    @Override
    public int compare(Oefening13_3 u1, Oefening13_3 u2) {
        return u1.getName().compareTo(u2.getName());
    }
}