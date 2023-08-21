// Faça um programa de consulta de telefones a partir
//  de um nome informado por uma chave de dados: 
//  leia nomes de pessoas com seus respectivos telefones,
//   sendo a quantidade determinada pelo usuário. Em seguida
//    pergunte ao usuário qual o nome que ele deseja consultar
//     o telefone. Após sua resposta, exiba o telefone da pessoa
//      procurada. Informe também se o nome é inexistente no vetor.

import java.util.Scanner;

public class ConsultaPhone {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas para cadastrar: ");
        int totalEntries = scanner.nextInt();

        String[] names = new String[totalEntries];
        String[] phones = new String[totalEntries];

        // Preenchendo o vetor com nomes e telefones
        for (int i = 0; i < totalEntries; i++) {
            scanner.nextLine(); // Limpar o buffer após a leitura do número
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Digite o telefone de " + names[i] + ": ");
            phones[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome da pessoa que deseja consultar o telefone: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < totalEntries; i++) {
            if (searchName.equalsIgnoreCase(names[i])) {
                System.out.println("Telefone de " + names[i] + ": " + phones[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nome inexistente no vetor.");
        }

        scanner.close();
    }
}
