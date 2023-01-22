package hexlet.code;

public class General {
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    public static String isEven(int userAnswer) {
        return userAnswer % 2 == 0 ? "yes" : "no";
    }

    public static char getRandomOperator() {
        final int max = 3;
        final int min = 0;
        var randomNumber = (int) (Math.random() * ((max - min) + 1)
                + min);
        return switch (randomNumber) {
            case 0 -> '*';
            case 1 -> '+';
            default -> '-';
        };
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

    public static String isPrime(int number) {
        if (number <= 1) {
            return "no";
        } else if (number == 2) {
            return "yes";
        } else {
            for (var divider = number - 1; divider > 1; divider--) {
                if (number % divider == 0) {
                    return "no";
                }
            }
            return "yes";
        }
    }

    public static String[] getProgression(int number, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(number);
            number += step;
        }
        return progression;
    }
}
