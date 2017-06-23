package java24hours;

import java.awt.*;
import java.util.*;

public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public Battlepoint() {
        createTargets();
        showMap();
        shoot(7,4);
        shoot(3,3);
        shoot(9,2);
        showMap();
    }

    private void showMap() {
        System.out.println("\n 1 2 3 4 5 6 7 8 9");
        for (int column = 1; column < 10; column++) {
          for (int row = 1; row < 10; row++) {
              if (row == 1) {
                  System.out.print(column + " ");
              }
              System.out.print(" ");
              Point cell = new Point(row, column);
              if (targets.indexOf(cell) > -1) {
                  System.out.print("X");
              } else {
                  System.out.print(".");
              }
              System.out.print(" ");
          }
          System.out.println(" ");
        }
        System.out.println();}

        private void createTargets() {
            Point p1 = new Point(5, 9);
            targets.add(p1);
            Point p2 = new Point(3, 5);
            targets.add(p2);
            Point p3 = new Point(9, 2);
            targets.add(p3);
        }

        private void shoot(int x, int y) {
            Point shot = new Point(x, y);
            System.out.print("Firing at (" + x + "," + y + ") ... ");
            if (targets.indexOf(shot) > -1) {
                System.out.println("You sank my battlepoint!");
                targets.remove(shot);
            } else {
                System.out.println("miss");
            }
        }

    public static void main(String[] args) {
        new Battlepoint();
    }
}
