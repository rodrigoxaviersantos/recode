import java.util.Scanner;

public class calculadora {


   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    System.exit(1); // Encerra o programa com código de erro
                }
                break;
            default:
                System.out.println("Operador inválido.");
                System.exit(1); // Encerra o programa com código de erro
        }
        
        System.out.println("Resultado: " + result);
        
        scanner.close();
    }
}

 