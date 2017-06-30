package LesOefeningen.Files;

public class Athlete {

    public static void main(String[] args) {



            String[] participants = {
                    "Usain Bolt",
                    "Marrison Jones",
                    "Mohammed Ali",
                    "Kevin Sorlee",
                    "Tyson Gay"
            };

        for (int i = 0; i < participants.length; i++) {
            Athletes a = new Athletes (participants[i]);
            System.out.println("Participant: " + participants[i] + " has entered the line");
            a.start();
        }


    }

}


//100 meter in kleine stapjes van een willekeurig getal

//tussen elke step afprinten

//Step + sleep 500ms