

package object.bees; /**
 * Created by vdabcursist on 15/06/2017.
 */
import java.util.*;

public class BeeHive {
    public static void main(String[] args) {
        Worker w1 = new Worker("Maya", 70);
        Worker w2 = new Worker("Jimi", 40);
        Worker w3 = new Worker("Amy", 60);

        Soldier ares = new Soldier("Ares",100, 100, 0);
        Soldier athena = new Soldier("Athena", 130, 100, 1);

        Queenbee elizabeth = new Queenbee("Elizabeth", 100);

        while(ares.isDefeated() == false && athena.isDefeated() == false) {
            ares.attack(athena);
            athena.attack(ares);
            System.out.println("Ares: " + ares.getHealth());
            System.out.println("Athena: " + athena.getHealth());
        }
        //System.out.println(w1.getCarriage());
        //w1.gatherNectar();

        while(!elizabeth.haveAllEggsAlreadyComeOut()) {
            System.out.println("Keep growing these eggs");
            elizabeth.eggGrowth();
        }

        //while(w1.gatherNectar()) {
          //  w1.gatherNectar();
        //}
    }
}
