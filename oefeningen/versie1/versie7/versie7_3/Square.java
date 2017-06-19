package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */

public class Square extends Rectangle {
    private double side = 5.6;
    public Square() {

    }
    public Square(double side, String color, boolean filled) {
        this.side = side * 4;
        super.setColor(color);
        super.setFilled(filled);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString() {
        return "A square with side: " + side + " which is a subclass of " + super.getClass().getSuperclass().getSimpleName();
    }

    public static void main(String[] args) {
        Square vierkant = new Square();
        System.out.println(vierkant.toString());
    }
}
