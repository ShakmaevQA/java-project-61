package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenChecker() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(100);

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = (number % 2 == 0 ? "yes" : "no");
        }
        Engine.run(GAME_DESCRIPTION, rounds);
    }
}