package oefeningen.versie1.versie9;

import java.util.LinkedList;

public class Oefening9_3 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Data> list = new LinkedList<>();
        while(true) {
            list.addFirst(new Data());
            list.addFirst(new Data());
            list.removeLast();
            Thread.sleep(100);
        }
    }
}

class Data {
    public static final int MEGABYTES = 1;
    private static int counter = 0;

    private byte[] data = new byte[MEGABYTES * 1024 * 1024];

    public Data() {
        System.out.println("Creating " + MEGABYTES + "MB of data " + counter++);
    }
}
