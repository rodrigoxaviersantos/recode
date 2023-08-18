public class calculadora {


public  class Main {

	

	// void indica que a rotina não retorna nenhum valor

	// não precisao de return

	public static void mostraNome(String nome) {

		System.out.println (nome);

	}

		   	

	// aqui, uma função que retorna um valor inteiro e recebe 3 argumentos como parâmetros

	// é uma gunção e precisa do return

	public static int calculadora (int num1, int num2, char oper) {

		int resultado = 0;

		switch (oper) {

		case '+': resultado= (num1+num2);

		          break;

		case '-': resultado= (num1-num2);

		 		  break;

		 		  

		}

		return resultado;

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// chama o procedimento

		mostraNome ("JAVAscript");

		// chama a função

		//int result=calculadora(10,20,'-');

		//System.out.println (result);

		// a linha de codigo abaixo, é o mesmo que as 2 linhas de codigo acima.

		// Usa um OU outra solução

		System.out.println (calculadora(10,20,'-'));

     }

}
}

 