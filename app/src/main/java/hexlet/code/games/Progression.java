package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Progression {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int STEP_MAX = 10;
    public static final int STEP_MIN = 1;
    public static void start() {
        var task = "What number is missing in the progression?";

        String[][] answerAndQuestion = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = General.getRandomNumber(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            var step = General.getRandomNumber(STEP_MIN, STEP_MAX);
            String[] progression = General.getProgression(firstNumber, step, PROGRESSION_LENGTH);
            var hiddenNumberIndex = General.getRandomNumber(0, PROGRESSION_LENGTH - 1);
            var correctAnswer = progression[hiddenNumberIndex];
            progression[hiddenNumberIndex] = "..";
            var question = String.join(" ", progression);
            answerAndQuestion[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, answerAndQuestion);
    }
}
