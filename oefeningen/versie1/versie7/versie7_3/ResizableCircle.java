package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ResizableCircle extends Circle implements Oefening7_3_3, Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        double total = (getRadius() * percent) / 100;
        setRadius(total);
    }

}
