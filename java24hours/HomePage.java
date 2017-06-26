package java24hours;

import java.net.*;

public class HomePage {
    String owner;
    URL address;
    String category = "none";

    public HomePage(String inOwner, String inAdress)
            throws MalformedURLException {

            owner = inOwner;
            address = new URL(inAdress);
    }

    public HomePage(String inOwner, String inAdress, String inCategory)
        throws MalformedURLException {

        this(inOwner, inAdress);
        category = inCategory;
    }
}
