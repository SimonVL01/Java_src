package oefeningen.versie1.Versie10;

/**
 * Created by simon on 16/06/17.
 */
public class Oefening10_2_test {
    public static void main(String[] args) {

        Oefening10_2 adres = new Oefening10_2("Acaciastraat", 48, 3560, "Lummen", "Belgium", true);

        adres.setCountry("Amerika");

        System.out.println(adres.getStreet());

        System.out.println(adres.getStreet() + "\n" + adres.getNumber() + "\n"
        + adres.getPostalCode() + "\n" + adres.getCity() + "\n" + adres.getCountry()
        + "\n" + adres.getActive());
    }
}
