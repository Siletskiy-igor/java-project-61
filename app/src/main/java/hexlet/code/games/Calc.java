package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Calc {
    public static void start() {
        var task = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = General.getRandomNumber(Engine.MIN_OPERATOR_NUMBER, Engine.MAX_OPERATOR_NUMBER);
            var secondNumber = General.getRandomNumber(Engine.MIN_OPERATOR_NUMBER, Engine.MAX_OPERATOR_NUMBER);
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
