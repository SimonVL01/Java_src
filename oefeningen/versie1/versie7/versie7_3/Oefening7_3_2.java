package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */

public class Oefening7_3_2 {
    private double height = 11.2;
    private Circle base; // Composition or aggregation

    public Oefening7_3_2() {
    }

    public  Oefening7_3_2(double height, Circle base) {
        this.height = height;
        this.base = base;
    }
    public Oefening7_3_2(double height, double radius) {
        this.height = height;
        this.base = new Circle(radius);
    }

    public double volume() {
        return base.calculateArea();
    }
}
