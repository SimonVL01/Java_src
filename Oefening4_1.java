public class Oefening4_1 {
    public static void main(String[] args) {
        int birthRate = 7;
        int deathRate = 13;
        int immigrantRate = 45;

        int birthCount;
        int deathCount;
        int immigrantCount;

        for (birthCount = 0; birthRate < 60; birthCount++ ) {
            birthRate = birthRate + 7;
        }

        for (deathCount = 0; deathRate < 60; deathCount++ ) {
            deathRate = deathRate + 13;
        }

        for (immigrantCount = 0; immigrantRate < 60; immigrantCount++ ) {
            immigrantRate = immigrantRate + 45;
        }

        long birthCountTotal = birthCount * 60 * 24 * 365 * 5;
        long deathCountTotal = deathCount * 60 * 24 * 365 * 5;
        long immigrantCountTotal = immigrantCount * 60 * 24 * 365 * 5;

        System.out.println("In five years, there are " + birthCountTotal + " babies born.");
        System.out.println("In five years, " + deathCountTotal + " people will have died.");
        System.out.println("In five years, there will be " + immigrantCountTotal + " immigrants.");
    }

}