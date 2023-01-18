package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Prime {
    public static void start() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionAndAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var number = General.getRandomNumber(0, 100);
            var question = Integer.toString(number);
            var correctAnswer = General.isPrime(number);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
}
