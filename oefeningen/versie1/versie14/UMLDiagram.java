package oefeningen.versie1.versie14;

public class UMLDiagram {

    public static void main(String[] args) {
    Oefening14_2 calc = new Oefening14_2();

    calc.start();
    calc.stop();

    calc.getElapsedTime();
        System.out.println("Start time: " + calc.getstartTime() + "\nEnd time: "
                + calc.getEndTime() + "\nElapsed Time: " + calc.getElapsedTime());

    }
}
