package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        var gameSelection = scanner.nextInt();

        switch (gameSelection) {
            case 1 -> Greet.greeting();
            case 2 -> Even.start();
            default -> scanner.close();
        }
    }

}
