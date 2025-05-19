package Act1;

import java.util.Scanner;

public class ConvertCurrency {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Taxas de câmbio fixas
        final double usdRate = 5.10;   // Dólar
        final double eurRate = 5.50;   // Euro
        final double gbpRate = 6.20;   // Libra

        System.out.print("Digite o valor em reais (R$): ");
        double amountInBRL = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a moeda de destino (dólar, euro ou libra): ");
        String currency = scanner.nextLine().trim().toLowerCase();

        double convertedAmount;
        String currencySymbol;

        switch (currency) {
            case "dólar", "dolar":
                convertedAmount = amountInBRL / usdRate;
                currencySymbol = "US$";
                break;
            case "euro":
                convertedAmount = amountInBRL / eurRate;
                currencySymbol = "€";
                break;
            case "libra":
                convertedAmount = amountInBRL / gbpRate;
                currencySymbol = "£";
                break;
            default:
                System.out.println("Moeda inválida! Use: dólar, euro ou libra.");
                return;
        }

        System.out.printf("Valor convertido: %s %.2f%n", currencySymbol, convertedAmount);
    }
}
