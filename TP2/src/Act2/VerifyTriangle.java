package Act2;

import java.util.Scanner;

public class VerifyTriangle {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os comprimentos dos três lados do triângulo:");

        System.out.print("Lado 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Lado 3: ");
        double side3 = scanner.nextDouble();

        boolean isValid = (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);

        if (!isValid) {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
            return;
        }

        if (side1 == side2 && side2 == side3) {
            System.out.println("O triângulo é equilátero.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
