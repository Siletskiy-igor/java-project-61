package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void start() {
        var task = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var firstNumber = Engine.getRandomNumber();
            var secondNumber = Engine.getRandomNumber();
            var question = firstNumber + " " + secondNumber;
            var gcd = getGCD(firstNumber, secondNumber);
            var correctAnswer = Integer.toString(gcd);
            questionAndAnswer[i] = new String[] {question, correctAnswer};
        }
        Engine.start(task, questionAndAnswer);
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
}
