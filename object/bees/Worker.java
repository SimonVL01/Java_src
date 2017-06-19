package object.bees;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Worker extends Bee {
    private String name = "Maya";
    private int capacity = 100;
    private int carriage = 0;

    public Worker(String name, int capacity) {
        this(name, capacity, 0);
    }

    public Worker(String name, int capacity, int carriage) {
        super.setName(name);
        this.capacity = capacity;
        this.carriage = carriage;
    }



    public boolean gatherNectar() {
        System.out.println("object.bees.Worker " + name + " is gathering some nectar.");
        carriage += capacity;
        if (carriage == capacity) {
            System.out.println(name + " is Full.");
            return false;
        } else {
            System.out.println(name + " has " + (capacity - carriage) + " left over.");
            return true;
        }
    }


    private void returnHome() {
        if (carriage == capacity) {
            System.out.println(name + " is going home.");
        }

    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        if(newCapacity < 0) {
        capacity = newCapacity;
        }
    }
    public int getCarriage() {
        return carriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
