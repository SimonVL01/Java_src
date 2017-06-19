package object.bees;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Bee extends Insect {
    protected String name;

    public void fly() {
        System.out.println("It flies!");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
