package oefeningen.versie1.versie5.versie5_3;


public class Oefening5_3_5 {
    public static void main (String [] args){

        int ntalrijen = 8;
        int begin = 0;



        for (int i = ntalrijen; i > 0; i--) {

            for (int j = 0; j <= i*2; j++) {
                System.out.print(" \t  ");
            }

            for (int j = 0; j<=begin; j++){
                double kwadraat = Math.pow(2,j);
                int kwadraatafgerond = (int) Math.round(kwadraat);
                System.out.print(kwadraatafgerond + " \t  ");
            }

            for (int j = begin-1; j>=0; j--){
                double kwadraat = Math.pow(2,j);
                int kwadraatafgerond = (int) Math.round(kwadraat);
                System.out.print(kwadraatafgerond + " \t  ");
            }

            System.out.println();
            begin++;

        }
    }}
