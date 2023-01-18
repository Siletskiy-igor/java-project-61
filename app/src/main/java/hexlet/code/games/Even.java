package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void start() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionAndAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var number = getRandomNumber();
            var question = Integer.toString(number);
            var correctAnswer = isEven(number);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }

    public static int getRandomNumber() {
        var min = 0;
        var max = 100;
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static String isEven(int userAnswer) {
        return userAnswer % 2 == 0 ? "yes" : "no";
    }
}