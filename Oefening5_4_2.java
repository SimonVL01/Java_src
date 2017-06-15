import java.util.*;

public class Oefening5_4_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Geef het aantal grades in.");
        int amountOfGrades = s.nextInt();

        int amountOfStudents = amountOfGrades;
        System.out.println("Number of students: " + amountOfStudents);

        int[] grades = new int[amountOfGrades];
        int average = 0;
        int maxNumber = 0;
        int minNumber = 100;


        for(int i = 0; i < grades.length; i++) {

        int studentNumber = i + 1;

            System.out.println("Geef student " + studentNumber + " zijn/haar score op.");
            int currentGrade = s.nextInt();

            if (currentGrade == -1) {
                i = grades.length;
                System.out.println("Cancelled by user");
            } else {

                grades[i] = currentGrade;
                System.out.println("Enter the grade for Student "
                        + studentNumber + ": " + currentGrade);

                average += currentGrade;

                if(currentGrade > maxNumber) {
                    maxNumber = currentGrade;
                }

                if (currentGrade < minNumber) {
                    minNumber = currentGrade;
                }
            }

        }

        average = average / amountOfGrades;
        System.out.println("Totaalgegevens: \n" + "\nAverage: "
                + average + "\nMaximum: "
                + maxNumber + "\nMinimum: " + minNumber);
    }
}