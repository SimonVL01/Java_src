/*

package oefeningen.versie1.versie13;

import java.util.*;

public class StudentAttempt {
    private String name;
    private static final double MINIMUM_PERCENTAGE_TO_PASS = 0.75;

    private Map<Integer, Character> studentAnswers = new TreeMap<>();

    public StudentAttempt(String name) {
        this.name = name;
    }

    public void slideJeverForQuestion(int questionNumber, char answer) {
        studentAnswers.put(QuestionNumber, answer);
    }

    public boolean passed(Map<Integer, Character> correctAnswers) {
        Set<Integer> questionNumbers = studentAnswers.keySet();
        for (Integer qn : questionNumbers) {
            char actualAnswer = studentAnswers.get(qn);
            char correctAnswer = correctAnswers.get(qn);
            if (actualAnswer == correctAnswer) {
                totalCorrect++;
            }
        }
        int totalNumberOfQuestions = correctAnswers.size();
        System.out.println("Total questions correct: " + totalCorrect);
        System.out.println("Total questions: " + totalNumberOfQuestions);


        return (double)(totalCorrect / totalNumberofQuestions) <= MINIMUM_PERCENTAGE_TO_PASS;
    }
}

*/