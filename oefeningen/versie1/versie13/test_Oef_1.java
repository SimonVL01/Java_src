package oefeningen.versie1.versie13;

import java.util.TreeSet;
import java.util.*;

public class test_Oef_1 {
    public static void main(String[] args) {
        Comparator<Oefening13_1> sortingCriterium = new YFirstComparator();
        Set<Oefening13_1> points = new TreeSet<>(sortingCriterium);
        points.add(new Oefening13_1(1, 3));
        points.add(new Oefening13_1(5, 4));

        for (Oefening13_1 p : points) {
            System.out.println(p);
        }
    }
}
