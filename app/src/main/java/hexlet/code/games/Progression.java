package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX = 10;
    public static final int STEP_MIN = 1;
    public static String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

    public static void start() {
        var task = "What number is missing in the progression?";

        generateRoundData();
        Engine.start(task, questionAndAnswer);
    }

    public static String[] getProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }

    public static void generateRoundData() {
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = Utils.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var step = Utils.getRandomNumber(STEP_MIN, STEP_MAX);
            String[] progression = getProgression(firstNumber, step, PROGRESSION_LENGTH);
            var hiddenNumberIndex = Utils.getRandomNumber(0, PROGRESSION_LENGTH - 1);
            var correctAnswer = progression[hiddenNumberIndex];
            progression[hiddenNumberIndex] = "..";
            var question = String.join(" ", progression);

            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
    }
}
