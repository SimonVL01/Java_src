package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Rectangle extends Oefening7_3_1 {
    private double width = 5.6;
    private double length = 11.2;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double getArea = length * width;
        return getArea;
    }

    public double getPerimeter() {
        double getPerimeter = (length * 2) + (width * 2);
        return getPerimeter;
    }

    public String toString() {
        return "A rectangle with width: " + width + " and length " + length + "which is a subclass of " + super.getClass().getSuperclass().getSimpleName();
    }

}
