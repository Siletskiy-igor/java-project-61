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
            var operator = getRandomOperator();
            var question = firstNumber + " " + operator + " " + secondNumber;
            var correctAnswer = Integer.toString(calculate(operator, firstNumber, secondNumber));
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
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
