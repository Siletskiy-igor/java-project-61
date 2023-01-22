package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Gcd {
    public static void start() {
        var task = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < 3; i++) {
            var firstNumber = General.getRandomNumber(Engine.MIN_OPERATOR_NUMBER, Engine.MAX_OPERATOR_NUMBER);
            var secondNumber = General.getRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var question = firstNumber + " " + secondNumber;
            var gcd = General.getGCD(firstNumber, secondNumber);
            var correctAnswer = Integer.toString(gcd);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
}
