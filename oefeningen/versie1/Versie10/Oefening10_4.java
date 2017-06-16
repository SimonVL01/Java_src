package oefeningen.versie1.Versie10;

/**
 * Created by simon on 16/06/17.
 */

import java.util.Date;

public class Oefening10_4 {
    final private int id = 0;
    private String firstName = "John";
    private String lastName = "Doe";
    final private Date creationDate = new Date(01/01/1970);

    public Oefening10_4() {

    }

    public Oefening10_4(int id, String firstName,
                        String lastName, Date creationDate) {
        //this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.creationDate = creationDate;

    }

    public int getId() {
        return id;
    }
    /*public void setId(int id) {
        this.id = id;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
