package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static final int MAX_OPERATOR_NUMBER = 3;
    public static final int MIN_OPERATOR_NUMBER = 0;
    public static void start(String task, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + " !");
        System.out.println(task);

        for (var questionAndAnswer: questionsAndAnswers) {
            var question = questionAndAnswer[0];
            var correctAnswer = questionAndAnswer[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer +  " is wrong answer ;(. Correct answer was " + correctAnswer + "\n"
                        + "Let's try again, " + userName + "!");
                return;
            } else {
                System.out.println("Correct");
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
