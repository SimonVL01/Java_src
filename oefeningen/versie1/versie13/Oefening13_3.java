package oefeningen.versie1.versie13;

import java.util.*;

public class Oefening13_3 {
        private static long userCounter;
        private long id;
        private final String name;

        public Oefening13_3(String name) {
            this.id = userCounter++;
            this.name = name;
        }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User(id:" + id + ", name: " + name + ")";
    }

}

//retainall
//removeall
