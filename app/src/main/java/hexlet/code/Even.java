package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    private static final int ROUNDS = 3;

    public static void evenChecker() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");


        for ( int i = 0; i < ROUNDS; i++) {
            int number = randomMath();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userResponse = scanner.nextLine().toLowerCase();


            boolean isEven = number % 2 == 0;

            String correctAnswer = isEven ? "yes" : "no";

            if (userResponse.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userResponse + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }



    private static int randomMath() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
