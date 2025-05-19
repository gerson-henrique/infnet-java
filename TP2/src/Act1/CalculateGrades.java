package Act1;

import java.util.Scanner;

public class CalculateGrades {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[4];
        double sum = 0;

        System.out.println("Digite as suas quatro notas bimestrais:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        double average = sum / 4;

        System.out.println("\nSua média foi: " + String.format("%.2f", average));

        if (average >= 7.0) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (average >= 5.0) {
            System.out.println("Atenção! Você está em recuperação.");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }
    }
}
