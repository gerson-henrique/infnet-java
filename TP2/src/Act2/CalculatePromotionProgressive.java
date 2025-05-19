package Act2;

import java.util.Scanner;

public class CalculatePromotionProgressive {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra (R$): ");
        double purchaseAmount = scanner.nextDouble();

        double discount;
        if (purchaseAmount > 1000) {
            discount = purchaseAmount * 0.10;
        } else if (purchaseAmount >= 500) {
            discount = purchaseAmount * 0.05;
        } else {
            discount = 0.0;
        }

        double finalAmount = purchaseAmount - discount;

        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.printf("Valor original: R$ %.2f%n", purchaseAmount);
        System.out.printf("Desconto aplicado: R$ %.2f%n", discount);
        System.out.printf("Valor final: R$ %.2f%n", finalAmount);
    }
}
