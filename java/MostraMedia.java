// Faça um programaq JAVA que leia 10 números
//  e mostre todos que forem maior que a media dos números

import java.util.Scanner;

public class MostraMedia {
    public static void main(String[] args) {
        final int TAM=10;
        int[] numeros = new int[TAM];
        int numero,i,soma=0,media;
        try (Scanner entrada = new Scanner(System.in)) {
            for (i=0;i < TAM;i++){
                System.out.print("Digite um número: ");
                numero = entrada.nextInt();
                numeros[i]=numero;
                soma=soma+numeros[i];
            }
            media=soma/TAM;
            System.out.println("A mádia dos elemento do vetor = "+media);
            i=0;
            while (i<TAM){
                if(numeros[i]>media) System.out.println("Elemento: "+i+" = "+numeros[i]);
                i++;
            }
            entrada.close();
        }
    }
}

