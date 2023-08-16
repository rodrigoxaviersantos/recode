import java.util.Scanner;

public class totalHorasFuncionario {
    public static void main(String[] args) {

		float totalHoras,salarioHora,salarioAtual,percAumento,novoSalario;

		String nomeFunc;

		Scanner dadosent = new Scanner(System.in);

		// leitura do nome do funcionario

		System.out.print ("Nome do funcionario: ");

		nomeFunc = dadosent.nextLine();

		// leitura do total de hotas trabalhadas

		System.out.print ("Total de Horas Trabalhadas: ");

		totalHoras = dadosent.nextFloat();

		// leitura do salario hora

		System.out.print ("Salário Hora: ");

		salarioHora= dadosent.nextFloat();

		// leitura do % de aumento do salario

		System.out.print ("% aumento : ");

		percAumento = dadosent.nextFloat();

		// calculo do salario atual

		salarioAtual = salarioHora * totalHoras;

		// calculo do novo salario

		novoSalario = salarioAtual + (salarioAtual  * percAumento/100);

		// exibição dos dados

		System.out.println ("Os salarios atual e novo de  = "+nomeFunc);

	    System.out.printf ("Salario Aual = %.2f%n",salarioAtual);

		System.out.printf ("Novo Salario = %.2f%n",novoSalario);

		dadosent.close(); 	

	}

 
}
