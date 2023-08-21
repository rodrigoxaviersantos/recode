// Faça um programa em JAVA que leia dados e
//  armazene uma matriz 5x5 de inteiros e escreva
//  A) A Soma dos números impares fornecidos;
//  B) A soma de cada uma das 5 colunas;
//  C) A soma de cada uma das 5 linhas; 

import java.util.Scanner;

public class  ArmazenaMatrix {
    public static void main(String[] args) {
        // Definindo as dimensões da matriz
        int rows = 5;
        int cols = 5;

         // Criando a matriz
        int[][] matrix = new int[rows][cols];
        
        // Criando um Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);
        
         // Lendo os dados e preenchendo a matriz
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Digite um número para a posição [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

           // Calculando e exibindo a soma dos números ímpares
           int oddSum = 0;
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                   if (matrix[i][j] % 2 != 0) {
                       oddSum += matrix[i][j];
                   }
               }
           }

            System.out.println("A soma dos números ímpares é: " + oddSum);
        
        // Calculando e exibindo a soma de cada coluna
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("A soma da coluna " + j + " é: " + colSum);
        }

           // Calculando e exibindo a soma de cada linha
           for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("A soma da linha " + i + " é: " + rowSum);
        }
        
        // Fechando o Scanner
        scanner.close();
    }
}
