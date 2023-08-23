// A CEF concederá um crédito especial com juros de 2%
//  aos seus clientes de acordo com o saldo médio no último ano.
//   Faça um programa em JAVA que leia uma lista com saldo médio
//    dos clientes e calcule o valor do crédito de acordo com a tabela
//     a seguir. Imprimir uma mensagem informando o saldo médio e o valor
//      de crédito. A lista termina com um saldo negativo.

// *Saldo médio*
// De 0 a 500 
// De 501 a 1000
// De 1001 a 3000
// Acima de 3001

// *Percentual*
// Nenhum crédito
// 30% do valor do saldo médio 
// 40% do valor do saldo médio
// 50% do valor do saldo médio

import java.util.Scanner;

public class CalculaCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a lista de saldos médios dos clientes (termine com um saldo negativo):");
        
        double saldoMedio;
        
        while (true) {
            System.out.print("Saldo médio do cliente: ");
            saldoMedio = scanner.nextDouble();
            
            if (saldoMedio < 0) {
                break;
            }
            
            double valorCredito = 0;
            
            if (saldoMedio <= 500) {
                valorCredito = 0;
            } else if (saldoMedio <= 1000) {
                valorCredito = saldoMedio * 0.3;
            } else if (saldoMedio <= 3000) {
                valorCredito = saldoMedio * 0.4;
            } else {
                valorCredito = saldoMedio * 0.5;
            }
            
            System.out.println("Saldo médio: " + saldoMedio);
            System.out.println("Valor do crédito: " + valorCredito);
        }
        
        scanner.close();
    }
}
