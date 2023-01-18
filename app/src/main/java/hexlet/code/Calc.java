package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + " !");
        System.out.println("What is the result of the expression?");

        var i = 0;
        while (i < 3) {
            var firstNumber = getRandomNumber();
            var secondNumber = getRandomNumber();
            var operator = getRandomOperator();
            var question = firstNumber + " " + operator + " " + secondNumber;
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();
            var correctAnswer = calculate(operator, firstNumber, secondNumber);
            if (!userAnswer.equals(Integer.toString(correctAnswer))) {
                System.out.println(userAnswer +  "is wrong answer ;(. Correct answer was" + correctAnswer + "\n"
                        + "Let's try again,! " + userName);
                i = 0;
            } else {
                System.out.println("Correct!");
                i++;
            }
        }
    }

    public static int getRandomNumber() {
        var min = 0;
        var max = 100;
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static char getRandomOperator() {
        var min = 0;
        var max = 3;
        var randomNumber = (int) (Math.random() * ((max - min) + 1) + min);
        switch (randomNumber) {
            case 0:
                return '*';
            case 1:
                return '+';
            case 2:
                return '/';
            default:
                return '-';
        }
    }

    public static int calculate(char operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case '*':
                return firstNumber * secondNumber;
            case '+':
                return firstNumber + secondNumber;
            default:
                return firstNumber - secondNumber;
        }
    }
}
