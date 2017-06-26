package oefeningen.versie1.versie9;

import java.util.*;

public class Cat {
    private String name;
    private int lives;

    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat that = (Cat)obj;
        return this.name.equals(that.name) && this.lives == that.lives;
    }

    public static void main(String[] args) {
        /*Cat[] asiel = new Cat[5];

        asiel[0] = new Cat("Dots", 6);
        asiel[1] = new Cat("Spark", 9);
        asiel[2] = new Cat("Agamemnon", 0);
        asiel[3] = new Cat("Achilles", 7);
        asiel[4] = new Cat("Spotted", 6);*/

        List cats = new LinkedList();
        cats.add(new Cat("Dots", 6));
        cats.add(new Cat("Spark", 9));
        cats.add(new Cat("Agamemnon", 0));
        cats.add(new Cat("Achilles", 7));
        cats.add(new Cat("Spotted", 6));
        cats.add(new Cat("Satan", 666));

        cats.set(0, new Cat("Missie", 8));
        cats.set(1, new Cat("Cleopatra", 21));
        cats.remove(new Cat("Satan", 666));
        cats.size();

        /*try {
            asiel[5] = new Cat("Satan", 666);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Het asiel zit vol. Er kan geen zesde kat bij");
        }*/


    }
}
