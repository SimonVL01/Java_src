package oefeningen.versie1.versie7.versie7_2;

import oefeningen.versie1.versie7.versie7_2.Oefening7_2_3;

/**
 * Created by simon on 18/06/17.
 */
public class TestMyTriangle {
    public static void main(String[] args) {
        Oefening7_2_3 triangle = new Oefening7_2_3(40, 35, 21, 67, 98, 54);
        System.out.println(triangle.toString());
        triangle.getPerimeter();
        triangle.printType();
    }
}
