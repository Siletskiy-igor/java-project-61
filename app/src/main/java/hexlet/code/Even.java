package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + " !");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;
        while (i < 3) {
            var question = getRandomNumber();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();
            var correctAnswer = isEven(question);
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer +  "is wrong answer ;(. Correct answer was" + correctAnswer + "\n"
                        + "Let's try again, Bill!");
                i = 0;
            } else {
                System.out.println("Correct");
                i++;
            }
        }
    }

    public static int getRandomNumber() {
        var min = 0;
        var max = 100;
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static String isEven(int userAnswer) {
        return userAnswer % 2 == 0 ? "yes" : "no";
    }
}
