// Ler 10 números e mostrar a soma
// desses números.

import java.util.Scanner;

public class MostraSoma {
    public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

int ind;
int numero;
int soma=0;

for (ind=1;ind<=5;ind++) {
    System.out.print("Digite Numero: ");
    numero=entrada.nextInt();
    soma=soma+numero;
    }
    System.out.print("A soma dos 10 numeros lidos foi: "+soma);
    entrada.close();
    }
}

