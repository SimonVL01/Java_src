package oefeningen.versie1.versie13;

import java.util.*;

public class MyPriorityQueue implements Cloneable {
    public MyPriorityQueue() {

    }

    protected Object clone(PriorityQueue names) {

        PriorityQueue clone = new PriorityQueue();

        clone.addAll(names);

        return clone;
    }


    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>(5);

        names.add("Jos");
        names.add("Jake");
        names.add("Blue");
        names.add("Red");
        names.add("Yellow");

        PriorityQueue<String> namesCopy = new PriorityQueue<>(5);

        //namesCopy.clone(names);
    }
}
