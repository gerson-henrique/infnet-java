package Act3;

import java.util.Scanner;

public class CountWord {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String phrase = scanner.nextLine();

        // Remove espaços extras e divide por espaços
        String[] words = phrase.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("A frase contém " + wordCount + " palavra(s).");
    }
}
