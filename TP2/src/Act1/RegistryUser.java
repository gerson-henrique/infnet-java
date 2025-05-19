package Act1;

import java.util.Scanner;

public class RegistryUser {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String userName = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String motherName = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String fatherName = scanner.nextLine();

        System.out.println("\n=== INFORMAÇÕES DIGITADAS ===");
        System.out.println("Nome: " + userName);
        System.out.println("Idade: " + age + " anos");
        System.out.println("Nome da mãe: " + motherName);
        System.out.println("Nome do pai: " + fatherName);

        int userLength = userName.length();
        int motherLength = motherName.length();
        int fatherLength = fatherName.length();

        System.out.println("\n=== COMPARAÇÃO DE NOMES ===");

        if (userLength > motherLength || userLength > fatherLength) {
            System.out.println("O seu nome é maior que o nome da sua mãe ou do seu pai.");
        } else {
            System.out.println("O seu nome não é maior que o nome da sua mãe nem do seu pai.");
        }
    }
}
