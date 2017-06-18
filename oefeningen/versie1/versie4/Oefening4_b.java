package oefeningen.versie1.versie4;

/**
 * Created by simon on 16/06/17.
 */
public class Oefening4_b {
    private String depthName = "Depthname";
    private String location = "location";
    private String manager = "managerName";
    private boolean employee = true;

    public Oefening4_b(String depthName, String location, String manager, boolean employee) {
    this.depthName = depthName;
    this.location = location;
    this.manager = manager;
    this.employee = employee;
    }

    public String getDepthName() {
        return depthName;
    }

    public void setDepthName(String depthName) {
        this.depthName = depthName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public boolean getEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public String toString(String manager, String employee) {

        manager += employee;

        return manager;
    }

    public void printDetails() {
        System.out.println(depthName);
        System.out.println(location);
        System.out.println(manager);
        System.out.println(employee);
    }

    public void setManager(boolean employee) {
        if (employee) {
        System.out.println("You have become the new manager");
        }
    }

}

