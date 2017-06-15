package oefeningen.versie1.versie3;

public class Oefening3_3 {
    public static void main(String[] args) {
        String firstName = "Simon";
        String middleName = "Urbain";
        String lastName = "Vanleeuw";
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Hi! My name is " + firstName + " " +
                middleName + " " + lastName + ". Or for short, " +
                firstInitial + "." + middleInitial + "." + lastInitial + ".");
    }
}