package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
    public static void start() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        generateRoundData();
        Engine.start(task, questionAndAnswer);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (var divider = number - 1; divider > 1; divider--) {
                if (number % divider == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var question = Integer.toString(number);
            var correctAnswer = isPrime(number) ? "yes" : "no";

            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
    }
}
