package oefeningen.versie1.Versie10;



public class Oefening10_2 {
    private String street = "straatnaam";
    private int number = 0;
    private int postalCode = 0000;
    private String city = "stadsnaam";
    private String country = "landnaam";
    private boolean active = true;

    public Oefening10_2(String street, int number, int postalCode, String city, String country, boolean active) {
            this.street = street;
            this.number = number;
            this.postalCode = postalCode;
            this.city = city;
            this.country = country;
            this.active = active;
    }

    public String getStreet() {
        return street;
    }
    public int getNumber() {
        return number;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public boolean getActive() {
        return active;
    }

    public void setStreet(String street) {
        this.street = street;

    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

}
