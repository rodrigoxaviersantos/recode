// Escreva um programa  em JAVA que leia o valor do salário-mínimo.
//  Na sequência leia o valor do salário de 50 pessoas. Calcule e mostre:
//   a quantidade que cada funcionário ganha em salário mínimo e os salários
//    (em real) maiores que a média salarial dos 50 funcionários. Considere que
//     o salário mínimo esta no valor de R$ 1.320,00?

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1320.00;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        scanner.nextDouble();
        
        System.out.println("Digite os salários dos 2 funcionários:");
        double[] salarios = new double[2];
        
        double somaSalarios = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            somaSalarios += salarios[i];
        }
        
        double mediaSalarial = somaSalarios / 2;
        System.out.println("Média salarial dos funcionários: " + mediaSalarial);
        
        System.out.println("Quantidade de salários em relação ao salário mínimo e salários maiores que a média:");
        for (int i = 0; i < 2; i++) {
            double quantidadeSalarioMinimo = salarios[i] / SALARIO_MINIMO;
            if (salarios[i] > mediaSalarial) {
                System.out.println("Funcionário " + (i + 1) + ": " + quantidadeSalarioMinimo + " salários mínimos | Salário: R$" + salarios[i]);
            }
        }
        
        scanner.close();
    }
}
