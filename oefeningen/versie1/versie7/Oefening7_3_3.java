

package oefeningen.versie1.versie7;

public class Oefening7_3_3 {
    Oefening7_2_1 v1 = new Oefening7_2_1(50, 76);
    Oefening7_2_1 v2 = new Oefening7_2_1(43, 64);
    Oefening7_2_1 v3 = new Oefening7_2_1(44, 32);

    public Oefening7_3_3(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);

    }


    public String toString() {
        return "Triangle: " + "\nx & y value1\n" + v1 + "\nx & y value2\n" + v2
                + "\nx & y value3\n" + v3;
    }
    public void getPerimeter() {
        v1.distanceOverload(v1.getX(), v1.getY(), 60, 36);
        v2.distanceOverload(v2.getX(), v2.getY(), 45, 24);
        v3.distanceOverload(v3.getX(), v3.getY(), 75, 32);

    }
    public void printType() {
        if(((v1.getX() == v2.getX()) && (v2.getX() == v3.getX())
           && (v1.getY() == v2.getY()) && (v2.getY() == v3.getY()))) {
            System.out.println("equilateral");
        } else if (((v1.getX() == v2.getX()) && (v2.getX() == v3.getX())
                || (v1.getY() == v2.getY()) && (v2.getY() == v3.getY()))) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}

