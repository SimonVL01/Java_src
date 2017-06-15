/**
 * Created by vdabcursist on 15/06/2017.
 */

import java.util.*;

public class Queenbee {
    private String name = "name";
    private int broodingCapacity = 100;
    private int[] laidEggs = new int[]{0, 0, 0};

    public Queenbee(String name, int broodingCapacity) {
        this.name = name;
        this.broodingCapacity = broodingCapacity;
    }

    public boolean haveAllEggsAlreadyComeOut() {
        for (int i = 0; i < laidEggs.length; i++) {
            if(laidEggs[i] < 100) {
                return false;
            }
        }
        return true;
    }

    public void eggGrowth() {
        for (int i = 0; i < laidEggs.length; i++) {
            Random g = new Random(30);
            int fullGrowth = g.nextInt();
            laidEggs[i] += fullGrowth;
            if (laidEggs[i] > 100) {
                Random f = new Random();
                int future = f.nextInt(4);
                if (future == 1) {
                    Soldier soldierex = new Soldier("Soldier1", 80, 90, 1);
                    System.out.println("A new soldier is created");
                } else if (future == 2) {
                    Worker workerex = new Worker("Worker1", 80);
                    System.out.println("A new worker is created");
                } else if (future == 3) {
                    Queenbee newQueen = new Queenbee("Elizabeth II", 80);
                    System.out.println("God save the queen!");
                }
            }
        }
    }

}

//Incubation status 0 tot 100