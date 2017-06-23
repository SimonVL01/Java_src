package oefeningen.versie1.versie9;


public abstract class Cloth implements Oefening9 {

    public void print(int x) {
        System.out.println(x);
    }

    class subClass1 implements Oefening9 {
        public void print() {

        }
    }
}