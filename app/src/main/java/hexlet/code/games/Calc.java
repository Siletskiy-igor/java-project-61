package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Calc {
    public static void start() {
        var task = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var firstNumber = General.getRandomNumber(0, 100);
            var secondNumber = General.getRandomNumber(0, 100);
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
