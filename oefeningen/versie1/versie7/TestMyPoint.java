package oefeningen.versie1.versie7;

/**
 * Created by simon on 18/06/17.
 */


public class TestMyPoint {
    public static void main(String[] args) {
        Oefening7_2_1 point = new Oefening7_2_1(25, 46);
        point.setX(75);
        System.out.println(point.getX());
        System.out.println(point.toString());
        point.distance(108, 305);
        point.distanceOverload(15, 20, 59, 95);

    }
}
