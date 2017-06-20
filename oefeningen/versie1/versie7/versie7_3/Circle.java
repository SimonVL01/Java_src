package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */

public class Circle extends Oefening7_3_1 implements Oefening7_3_3 {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Area is betere term.

    public double calculateArea() {
        return radius * radius * Math.PI; //straal * straal * pi
    }

    public double calculatePerimeter() {
        return radius * radius;
    }

    public String toString() {
        return "This is a circle with radius " + radius + " and color " + getColor() + " and filled " + isFilled();
    }
}

