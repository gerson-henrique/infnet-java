package Act2;

import java.util.Scanner;

public class CalculateFiscalComplaiment {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual (R$): ");
        double grossIncome = scanner.nextDouble();

        double tax;

        if (grossIncome <= 22847.76) {
            tax = 0.0; // Isento
        } else if (grossIncome <= 33919.80) {
            tax = (grossIncome - 22847.76) * 0.075;
        } else if (grossIncome <= 45012.60) {
            tax = (33919.80 - 22847.76) * 0.075
                    + (grossIncome - 33919.80) * 0.15;
        } else if (grossIncome <= 55976.16) {
            tax = (33919.80 - 22847.76) * 0.075
                    + (45012.60 - 33919.80) * 0.15
                    + (grossIncome - 45012.60) * 0.225;
        } else {
            tax = (33919.80 - 22847.76) * 0.075
                    + (45012.60 - 33919.80) * 0.15
                    + (55976.16 - 45012.60) * 0.225
                    + (grossIncome - 55976.16) * 0.275;
        }

        double netIncome = grossIncome - tax;

        System.out.println("\n=== CÁLCULO DO IMPOSTO DE RENDA ===");
        System.out.printf("Salário bruto anual: R$ %.2f%n", grossIncome);
        System.out.printf("Imposto a pagar: R$ %.2f%n", tax);
        System.out.printf("Salário líquido anual: R$ %.2f%n", netIncome);
    }
}
