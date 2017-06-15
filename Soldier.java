/**
 * Created by vdabcursist on 15/06/2017.
 */
import java.util.*;

public class Soldier {
    public String name = "name";
    private int health = 100;
    private int armour = 100;
    private String[] availableWeapons = new String[] {"Stinger", "Chainsaw", "bazooka"};
    private int selectedWeaponIndex;

    public Soldier(String name,int health, int armour, int selectedWeaponIndex) {
        this.name = name;
        this.health = health;
        this.armour = armour;
        this.selectedWeaponIndex = selectedWeaponIndex;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDefeated() {
        if (health > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void attack(Soldier opponent) {
        Random sting = new Random();
        int damage = sting.nextInt(20);
        opponent.health -= damage;
        System.out.println(name + " is struck by " + opponent + " for " + damage + " damage.");
    }

    private int defend(int health) {
        health -= 10;
        if(health <= 0) {
            System.out.println("The bee died.");
        }
        return health;
    }

    public String getWeapon() {
        return availableWeapons[selectedWeaponIndex];
    }
}
