import java.util.Scanner;

public class SomaNumerosFloat {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número decimal: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número decimal: ");
        float numero2 = scanner.nextFloat();

        float soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
