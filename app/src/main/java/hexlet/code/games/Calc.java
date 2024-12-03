package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATIONS = {'+', '-', '*'};


    public static void calculation() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = number1 + " " + operation + " "+ number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operation));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(GAME_DESCRIPTION, rounds);
    }

    private static int calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected operation: " + operation);
        };
    }
}