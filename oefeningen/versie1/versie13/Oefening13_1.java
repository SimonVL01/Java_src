package oefeningen.versie1.versie13;

import java.util.ArrayList;

public class Oefening13_1 implements Comparable<Oefening13_1> {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int compareTo(Oefening13_1 o) {
        if (this.x != o.x) {
            return (int) (this.x - o.x);
        } else {
            return (int) (this.y - o.y);
        }

    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }

    public Oefening13_1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    }