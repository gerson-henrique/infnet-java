import java.util.Scanner;
import Act1.RegistryUser;
import Act1.CalculateGrades;
import Act1.ConvertCurrency;
import Act1.CalculateAgeInDays;
import Act2.CalculateFiscalComplaiment;
import Act2.CalculatePromotionProgressive;
import Act2.VerifyLeapYear;
import Act2.VerifyTriangle;
import Act3.CountWord;
import Act3.FindNumeralSequence;
import Act3.GuessGame;
import Act3.VerifyPassword;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void show() {
        int option;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - exercícios 1 ~ 4 ");
            System.out.println("2 - exercícios 5 ~ 8");
            System.out.println("3 - exercícios 9 ~ 12");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> showAct1Menu();
                case 2 -> showAct2Menu();
                case 3 -> showAct3Menu();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }
    private static void showAct1Menu() {
        int option;

        do {
            System.out.println("\n--- Etapa 1 ---");
            System.out.println("1 - Cadastro e Calculo de nome");
            System.out.println("2 - Calculadora de Média de Notas");
            System.out.println("3 - Conversor de Moedas");
            System.out.println("4 - Calculadora de Idade em Dias");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> RegistryUser.run();
                case 2 -> CalculateGrades.run();
                case 3 -> ConvertCurrency.run();
                case 4 -> CalculateAgeInDays.run();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    private static void showAct2Menu() {
        int option;

        do {
            System.out.println("\n--- Etapa 2 ---");
            System.out.println("1 - Calculadora de Descontos Progressivos");
            System.out.println("2 - Verificador de Ano Bissexto");
            System.out.println("3 - Calculadora de Imposto de Renda");
            System.out.println("4 - Classificação de Triângulos");
            System.out.println("O - Voltar");

            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> CalculatePromotionProgressive.run();
                case 2 -> VerifyLeapYear.run();
                case 3 -> CalculateFiscalComplaiment.run();
                case 4 -> VerifyTriangle.run();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    private static void showAct3Menu() {
        int option;

        do {
            System.out.println("\n--- Etapa 2 ---");
            System.out.println("1 - Validador de Senha ");
            System.out.println("2 - Jogo de Adivinhação");
            System.out.println("3 - Sequência Numérica Personalizada");
            System.out.println("4 - Contagem de Palavras");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> VerifyPassword.run();
                case 2 -> GuessGame.run();
                case 3 -> FindNumeralSequence.run();
                case 4 -> CountWord.run();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }
}
