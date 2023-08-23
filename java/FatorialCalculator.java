// Escreva um programa JAVA que leia um número
//  e na sequência calcule e mostre o fatorial desses número.
// 5! = 5 * 4 * 3 * 2 * 1
// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1

import java.util.Scanner;

public class FatorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        scanner.close();
    }
}
