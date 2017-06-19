

package oefeningen.versie1.versie7.versie7_2;


public class TestMyCircle {
    public static void main(String[] args) {
        Oefening7_2_2 circle = new Oefening7_2_2(50, 75);
        circle.setCenterXY(45, 32);
        System.out.println("radius: " + circle.getRadius());
        System.out.println(circle.getCenter());
        System.out.println(circle.toString());
        circle.getArea();
    }
}

