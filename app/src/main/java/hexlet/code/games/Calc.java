package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

    public static void start() {
        var task = "What is the result of the expression?";

        generateRoundData();
        Engine.start(task, questionAndAnswer);
    }

    public static char getRandomOperator() {
        final int max = 2;
        final int min = 0;
        var randomNumber = (int) (Math.random() * ((max - min) + 1) + min);

        return switch (randomNumber) {
            case 0 -> '*';
            case 1 -> '+';
            case 2 -> '-';
            default -> throw new Error("Incorrect operator");
        };
    }

    public static int calculate(char operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case '*' -> firstNumber * secondNumber;
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            default -> throw new Error("Incorrect operator");
        };
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var secondNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var operator = getRandomOperator();
            var question = firstNumber + " " + operator + " " + secondNumber;
            var correctAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));

            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
    }
}
