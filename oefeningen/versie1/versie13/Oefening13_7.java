/*

package oefeningen.versie1.versie13;

import java.util.*;

public class Oefening13_7 {

    private Map<Integer, Character> answers = new TreeMap<>();

    private Collection<StudentAttempt> attempts = new TreeSet<StudentAttempt>();

    public Oefening13_7() {
        answers.put(1, 'B');
        answers.put(2, 'D');
        answers.put(3, 'A');
        answers.put(4, 'A');
        answers.put(5, 'C');
        answers.put(6, 'B');
        answers.put(7, 'C');
        answers.put(8, 'C');
        answers.put(9, 'A');
        answers.put(10, 'C');

    }

    public void addAttempt(StudentAttempt attempt) {

    }

    public boolean isPassed(String studentName) {
        for (StudentAttempt attempt : attempts) {
            if(attempt.getName().equals(StudentName)) {
               return attempt.passed(correctAnswers);
            }
        }
        throw new IllegalArgumentException("This is not a valid student");
    }

}

*/