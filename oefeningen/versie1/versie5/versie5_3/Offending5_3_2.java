package oefeningen.versie1.versie5.versie5_3;

public class Offending5_3_2 {
    public static void main(String[] args) {
        int iX = 1;
        int iY = 1;
        int iTotal = 1;

        while(iX <= 10) {
            iTotal = iX * iY;
            System.out.print("\t" + iTotal + "\t");
            iY++;
            if(iY > 10) {
                iY = 1;
                System.out.println();
                iX++;
            }
        }
    }
}