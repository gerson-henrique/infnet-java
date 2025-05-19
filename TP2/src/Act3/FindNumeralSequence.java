package Act3;

import java.util.Scanner;

public class FindNumeralSequence {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int start = scanner.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int increment = scanner.nextInt();

        System.out.print("Sequência: ");
        int current = start;

        while (current <= 100) {
            System.out.print(current);
            current += increment;
            if (current <= 100) {
                System.out.print(", ");
            }
        }

        System.out.println(); // Pula linha ao final da sequência
    }
}
