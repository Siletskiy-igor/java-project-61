package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    static final int GREET = 1;
    static final int EVEN = 2;
    static  final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final  int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        var gameSelection = scanner.nextInt();

        switch (gameSelection) {
            case GREET -> Greet.greeting();
            case EVEN -> Even.start();
            case CALC -> Calc.start();
            case GCD -> Gcd.start();
            case PROGRESSION -> Progression.start();
            case PRIME -> Prime.start();
            default -> scanner.close();
        }
    }
}
