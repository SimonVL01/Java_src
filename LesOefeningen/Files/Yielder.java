package LesOefeningen.Files;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Yielder {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //new NiceThread.start();
        }
    }
}

class NiceThread extends Thread {
    @Override public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
