package oefeningen.versie1.versie13;

import java.util.PriorityQueue;

/**
 * Created by simon on 27/06/17.
 */
public class PriorityEx {

    public static void main(String[] args) {

        PriorityQueue<Oefening13_3> queue
                = new PriorityQueue<>(new Comparable02());
        queue.add(new Oefening13_3("George"));
        queue.add(new Oefening13_3("Jim"));
        queue.add(new Oefening13_3("John"));
        queue.add(new Oefening13_3("Blake"));
        queue.add(new Oefening13_3("Kevin"));
        queue.add(new Oefening13_3("Michael"));

        while (!queue.isEmpty()) {
            System.out.printf("Handling: %s%n", queue.remove());
        }

        PriorityQueue<Oefening13_3> queue2
                = new PriorityQueue<>(new Comparable02());
        queue2.add(new Oefening13_3("George"));
        queue2.add(new Oefening13_3("Katie"));
        queue2.add(new Oefening13_3("Kevin"));
        queue2.add(new Oefening13_3("Blake"));
        queue2.add(new Oefening13_3("Michelle"));
        queue2.add(new Oefening13_3("Ryan"));

        queue.add(queue2.element());

        while (!queue2.isEmpty()) {
            System.out.printf("Handling: %s%n", queue2.remove());
        }
    }
}
