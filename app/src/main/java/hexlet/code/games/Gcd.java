package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.ROUNDS_COUNT][2];

    public static void start() {
        var task = "Find the greatest common divisor of given numbers.";

        generateRoundData();
        Engine.start(task, QUESTION_AND_ANSWER);
    }

    public static int getGCD(int firstNumber, int secondNumber) {
        int dividend = Math.max(firstNumber, secondNumber);
        int divider  = Math.min(firstNumber, secondNumber);

        while (divider != 0) {
            var temp = dividend % divider;

            dividend = divider;
            divider = temp;
        }
        return dividend;
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var secondNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var question = firstNumber + " " + secondNumber;
            var gcd = getGCD(firstNumber, secondNumber);
            var correctAnswer = Integer.toString(gcd);

            QUESTION_AND_ANSWER[i] = new String[] {question, correctAnswer};
        }
    }
}
