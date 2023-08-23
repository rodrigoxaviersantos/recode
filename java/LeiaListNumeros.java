// Escreva um programa em JAVA que leia uma lista de
//  números terminada em 99. Mostre ou não cada número,
//   conforme as seguintes regras:
// Se ler um número zero (0), para de mostrar os números
// Se ler um número nove (9), passe a mostrar os números

// Obs: os números 0 e 9 não devem ser mostrados.

import java.util.Scanner;

public class LeiaListNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma lista de números terminada em 99:");
        
        int number;
        boolean showNumbers = true; // Inicialmente, mostrar os números
        
        do {
            number = scanner.nextInt();
            
            if (number == 0) {
                showNumbers = false;
            } else if (number == 9) {
                showNumbers = true;
            } else if (showNumbers) {
                System.out.println(number);
            }
        } while (number != 99);
        
        scanner.close();
    }
}
