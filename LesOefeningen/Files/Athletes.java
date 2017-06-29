
package LesOefeningen.Files;

import java.io.*;

public class Athletes extends Thread {
    private String name;
    private Object signal;

    private Object token = new Object();

    public Athletes(String name) {
        this.name = name;
    }

    public double step() {
        return Math.random() * 6;

    }

    public synchronized void setWinner(String name) {

    }

   /* public void setWinner(String name) {
        synchronized (token) {
            this.winner = name;
        }
    } */

   public void FireStartShot() throws InterruptedException {
       Thread.sleep(1000);
       System.out.println("On your mark.");
       Thread.sleep(1000);
       System.out.println("On start.");
       Thread.sleep(1000);
       System.out.println("Go!");

       synchronized (this) {
           this.notifyAll();
       }

   }

    public void run() {
        int distanceTraveled = 0;
        while(distanceTraveled<100) {
            distanceTraveled += step();
            System.out.println(name + " has covered " + distanceTraveled + " meters.");
            linger();
        }

        System.exit(0);

    }
    public void linger() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Not running.");
        }
    }
}
