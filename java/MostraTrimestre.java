// Ler um número, que represente um dos 12 meses do ano. Mostrar a que
// trimestre o mês pertence.

import java.util.Scanner;
public class MostraTrimestre {
public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
System.out.print("Digite o mes (1 a 12):8 ");
int mes = entrada.nextInt();
switch (mes) {
case 1:
case 2:
    case 3: System.out.println("O Mes "+mes+" pertence ao PRIMEIRO trimestre");
    break;
case 4:
case 5:
    case 6: System.out.println("O Mes "+mes+" pertence ao SEGUNDO trimestre");
    break;
case 7:
case 8:
    case 9: System.out.println("O Mes "+mes+" pertence ao TERCEIRO trimestre");
    break;
case 10:
case 11:
    case 12: System.out.println("O Mes "+mes+" pertence ao QUARTO trimestre");
    break;
 default: System.out.println("O mes digitado eh INVALIDO");

}
entrada.close();
 }
}
