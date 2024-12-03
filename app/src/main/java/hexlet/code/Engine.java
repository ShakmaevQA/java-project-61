package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void run (String gameDescription, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);


        // Приветствие пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Описание правил игры
        System.out.println(gameDescription);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
