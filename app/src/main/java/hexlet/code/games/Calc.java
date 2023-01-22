package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static void start() {
        var task = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = General.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var secondNumber = General.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var operator = General.getRandomOperator();
            var question = firstNumber + " " + operator + " " + secondNumber;
            var correctAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
    public static int calculate(char operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case '*' -> firstNumber * secondNumber;
            case '+' -> firstNumber + secondNumber;
            default -> firstNumber - secondNumber;
        };
    }
}
