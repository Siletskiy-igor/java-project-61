package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Progression {
    public static void start() {
        var task = "What number is missing in the progression?";
        var progressionLength = 10;

        String[][] answerAndQuestion = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var firstNumber = General.getRandomNumber(0, 100);
            var step = General.getRandomNumber(1, 10);
            String[] progression = General.getProgression(firstNumber, step, progressionLength);
            var hiddenNumberIndex = General.getRandomNumber(0, 9);
            var correctAnswer = progression[hiddenNumberIndex];
            progression[hiddenNumberIndex] = "..";
            var question = String.join(" ", progression);
            answerAndQuestion[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, answerAndQuestion);
    }
}
