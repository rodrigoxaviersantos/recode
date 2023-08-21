// Faça um programa em JAVA que Mostra
//  0s 50 primeiros números inteiros e positivos

public class First50Numbers {
    public static void main(String[] args) {
        int count = 50; // Quantidade de números a serem exibidos
        
        System.out.println("Os primeiros 50 números inteiros e positivos são:");
        
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}