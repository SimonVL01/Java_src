package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Oefening7_3_1 square = new Oefening7_3_1("blue", false);

        Rectangle i = new Rectangle(50, 100);

        Square j = new Square();

        Circle c = new Circle(3.0);
        System.out.println(c.calculateArea());

        //public abstract double calculatePerimeter;
    }
}
