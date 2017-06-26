package oefeningen.versie1.versie9;

public class Printer extends Paper implements PrintJob {
    private int y = 50;

    public Printer(int y) {
        print(y);
    }

    public static void main(String[] args) {
        Printer a = new Printer(50);
        a.print(100);
    }
}