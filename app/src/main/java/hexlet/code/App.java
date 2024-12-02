package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String choise = scanner.nextLine();

        switch (choise) {
            case "1":
                Cli.userName();
                break;
            case "2":
                Even.evenChecker();
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
