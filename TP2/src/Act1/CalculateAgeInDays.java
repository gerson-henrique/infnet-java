package Act1;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAgeInDays {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento:");

        System.out.print("Dia: ");
        int day = scanner.nextInt();

        System.out.print("Mês: ");
        int month = scanner.nextInt();

        System.out.print("Ano: ");
        int year = scanner.nextInt();

        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate today = LocalDate.now();

            if (birthDate.isAfter(today)) {
                System.out.println("Data de nascimento inválida (futura).");
                return;
            }

            long totalDays = java.time.temporal.ChronoUnit.DAYS.between(birthDate, today);

            System.out.println("\nVocê tem aproximadamente " + totalDays + " dias de vida.");
        } catch (Exception e) {
            System.out.println("Data inválida. Verifique os valores digitados.");
        }
    }
}
