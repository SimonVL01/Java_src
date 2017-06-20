package oefeningen.versie1.versie7.versie7_3;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Oefening7_3_1 {
    private String color;
    private boolean filled;

    public Oefening7_3_1() {
        this("red", true);
    }

    public Oefening7_3_1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String ToString(String color, boolean filled) {
        return("A Shape with color of " + color + " and " + (!filled ? "not" : "") + "filled");

    }
}
