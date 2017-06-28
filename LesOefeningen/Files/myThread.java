package LesOefeningen.Files;

import java.util.*;

public class myThread {

    public static void main(String[] args) throws InterruptedException {
        List<MessengerThread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MessengerThread t = new MessengerThread();
            threads.add(t);
            t.join();
        }

        for (MessengerThread thread : threads) {
            System.out.println("Done.");
        }
    }

    static class MessengerThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                sleepy();
                System.out.println("Thread active " + Thread.currentThread().getName());
            }
        }

        public void sleepy() {
            try {
                Thread.sleep((long) (1000));
            } catch (InterruptedException e) {
                System.out.println("Woken up.");
            }
        }
    }
}