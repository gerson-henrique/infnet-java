package Act3;

import java.util.Scanner;

public class VerifyPassword {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");
        String registeredPassword = scanner.nextLine();

        String enteredPassword;
        do {
            System.out.print("Digite sua senha: ");
            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(registeredPassword)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!enteredPassword.equals(registeredPassword));

        System.out.println("Senha correta! Acesso concedido.");
    }
}
