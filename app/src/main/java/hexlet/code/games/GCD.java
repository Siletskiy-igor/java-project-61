package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.General;

public class GCD {
    public static void start() {
        var task = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var firstNumber = General.getRandomNumber(0, 100);
            var secondNumber = General.getRandomNumber(0, 100);
            var question = firstNumber + " " + secondNumber;
            var gcd = General.getGCD(firstNumber, secondNumber);
            var correctAnswer = Integer.toString(gcd);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
    }
}
