package Act3;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("O número secreto é maior.");
            } else if (guess > secretNumber) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }

        } while (guess != secretNumber);
    }
}
