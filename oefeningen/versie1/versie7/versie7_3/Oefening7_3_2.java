package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Oefening7_3_2 extends Circle {
    private double height = 11.2;

    public Oefening7_3_2() {
    }

    public double Cylinder() {
        double area = super.getArea();
        double surface = area * height;
        return surface;
    }


}
