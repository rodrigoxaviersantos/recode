// Ler a idade de uma pessoa e dizer se ela é
// ou não maior de idade. A maioridade se dá com
// idade igual ou superior a 18 anos

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite idade: ");
        int idade = entrada.nextInt();
        if (idade >=18) System.out.println("A pessoa eh maior de idade");
        else System.out.println("A pessoa eh menor de idade");
        entrada.close();
         }
}
        
