package oefeningen.versie1.versie9;

import java.lang.Object;

public class Oefening9_4 {
    private static int createCount;
    private static int finalizeCount;

    public int getCreateCount() {
        return createCount;
    }

    public int getFinalizeCount() {
        return finalizeCount;
    }

    public static void printStatistics(int x, int y) {
        System.out.println("Created: " + x + "\nfinalized: " + y);
    }

    protected void finalize() {
    finalizeCount++;
    }

    public Oefening9_4() {
    createCount++;
    }


}
