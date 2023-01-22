package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Gcd {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static void start() {
        var task = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = General.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var secondNumber = General.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var question = firstNumber + " " + secondNumber;
            var gcd = General.getGCD(firstNumber, secondNumber);
            var correctAnswer = Integer.toString(gcd);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
}
