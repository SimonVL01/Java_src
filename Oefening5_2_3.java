import java.util.Scanner;

public class Oefening5_2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geef de naam van de werknemer 1, 2 en 3 in.");
        String employeeName1 = s.next();
        String employeeName2 = s.next();
        String employeeName3 = s.next();

        System.out.println("Geef het aantal gewerkte uren voor werknemer 1, 2 en 3 in.");
        int numHours1 = s.nextInt();
        int numHours2 = s.nextInt();
        int numHours3 = s.nextInt();
        int maxHours = 40;

        int overHours1 = 0;
        int overHours2 = 0;
        int overHours3 = 0;

        System.out.println("Geef het loon per uur in.");
        double salary = s.nextDouble();
        double overHourSalary = salary * 1.5d;
        double totalSalary1 = 0d;
        double totalSalary2 = 0d;
        double totalSalary3 = 0d;

        if(numHours1 > maxHours) {
            overHours1 = numHours1 - maxHours;
            numHours1 = maxHours;
            totalSalary1 = (numHours1 * salary) + (overHours1 * overHourSalary);
        } else {
            totalSalary1 = numHours1 * salary;
        }

        if(numHours2 > maxHours) {
            overHours2 = numHours2 - maxHours;
            numHours2 = maxHours;
            totalSalary2 = (numHours2 * salary) + (overHours2 * overHourSalary);
        } else {
            totalSalary2 = numHours2 * salary;
        }

        if(numHours3 > maxHours) {
            overHours3 = numHours3 - maxHours;
            numHours3 = maxHours;
            totalSalary3 = (numHours3 * salary) + (overHours3 * overHourSalary);
        } else {
            totalSalary3 = numHours2 * salary;
        }

        System.out.println("Loon van " + employeeName1 + " = " + totalSalary1 + " Loon van " + employeeName2 + " = "
                + totalSalary2 + " Loon van " + employeeName3 + " = " + totalSalary3);

    }
}