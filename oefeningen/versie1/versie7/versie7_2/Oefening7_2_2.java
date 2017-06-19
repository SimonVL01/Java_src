

package oefeningen.versie1.versie7.versie7_2;

public class Oefening7_2_2 {
    private Oefening7_2_1 center = new Oefening7_2_1(50, 75);
    private int radius;


    public Oefening7_2_2(int x, int y) {
        center.setX(x);
        center.setY(y);
        radius = (x + y) / 2;
    }

    public Oefening7_2_1 getCenter() {
        return center;
    }

    public void setCenterX(int x) {
        center.setX(x);
        radius = (x + center.getY()) / 2;
    }

    public void setCenterY(int y) {
        center.setY(y);
        radius = (center.getX() + y) / 2;
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
        radius = (center.getX() + center.getY()) / 2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle of " + center.getX() + " and " + center.getY() + " give a radius of " + getRadius() + ".";
    }
    public void getArea() {
        double xDouble = center.getX();
        double yDouble = center.getY();
        double xyArea = (xDouble * 2) + (yDouble * 2);
        System.out.println("The total area covered is " + xyArea);
    }

}

