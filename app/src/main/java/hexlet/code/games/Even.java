package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class Even {
    public static void start() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = General.getRandomNumber(Engine.MIN_OPERATOR_NUMBER, Engine.MAX_OPERATOR_NUMBER);
            var question = Integer.toString(number);
            var correctAnswer = General.isEven(number);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
}
