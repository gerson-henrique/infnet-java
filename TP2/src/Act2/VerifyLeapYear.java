package Act2;

import java.util.Scanner;

public class VerifyLeapYear {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano para verificar se é bissexto: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println("O ano " + year + " é bissexto.");
        } else {
            System.out.println("O ano " + year + " não é bissexto.");
        }
    }
}
