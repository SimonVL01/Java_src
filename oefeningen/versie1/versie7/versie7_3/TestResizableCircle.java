package oefeningen.versie1.versie7.versie7_3;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle c = new ResizableCircle(60);
        System.out.println(c);
        c.calculateArea();
        c.calculatePerimeter();
        c.resize(60);
        System.out.println(c);
    }

}