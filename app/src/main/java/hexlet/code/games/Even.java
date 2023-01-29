package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

    public static void start() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        generateRoundData();
        Engine.start(task, questionAndAnswer);
    }

    public static boolean isEven(int userAnswer) {
        return userAnswer % 2 == 0;
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var question = Integer.toString(number);
            var correctAnswer = isEven(number) ? "yes" : "no";

            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
    }
}
