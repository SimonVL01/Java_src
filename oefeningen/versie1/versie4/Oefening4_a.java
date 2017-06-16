package oefeningen.versie1.versie4;

/**
 * Created by simon on 16/06/17.
 */

import java.util.Date;

public class Oefening4_a {
    private String firstName = "John";
    private String lastName = "Doe";
    private Date birthDate = new Date();
    private double salary = 100.0;
    private String email = "johndoe@outlook.com";

    public Oefening4_a(String firstName, String lastName, Date birthDate,
                       double salary, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getemail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void toString(String employeeFirstName, String employeeLastName) {
        System.out.println("This is our employee, " + employeeFirstName + " "
                + employeeLastName);
    }

    public void printDetails() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthDate);
        System.out.println(salary);
    }
}
