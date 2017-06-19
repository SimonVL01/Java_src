package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */

public class Circle extends Oefening7_3_1 {
    private double radius = 1.0;
    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI; //straal * straal * pi
    }

    public double getPerimeter() {
        return radius * radius;
    }
}

