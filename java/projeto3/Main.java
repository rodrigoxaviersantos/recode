package projeto3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        // Pedido 1
        System.out.println("Pedido 1:");
        System.out.print("Número do Pedido: ");
        int numeroPedido1 = scanner.nextInt();
        scanner.nextLine(); // Quebra de linha
        System.out.print("Data do Pedido (dd/MM/yyyy): ");
        String dataPedido1Str = scanner.nextLine();
        Date dataPedido1;
        try {
            dataPedido1 = dateFormat.parse(dataPedido1Str);
        } catch (Exception e) {
            System.out.println("Erro ao ler a data do pedido.");
            return;
        }
        
        Pedido pedido1 = new Pedido(numeroPedido1, dataPedido1);
        
        // Itens do Pedido 1
        ItemPedido item1Pedido1 = new ItemPedido("Caneta", 2.00, 4);
        ItemPedido item2Pedido1 = new ItemPedido("Borracha", 4.50, 5);
        
        pedido1.adicionarItem(item1Pedido1);
        pedido1.adicionarItem(item2Pedido1);
        
        // Pedido 2
        System.out.println("\nPedido 2:");
        System.out.print("Número do Pedido: ");
        int numeroPedido2 = scanner.nextInt();
        scanner.nextLine(); // Quebra de linha
        System.out.print("Data do Pedido (dd/MM/yyyy): ");
        String dataPedido2Str = scanner.nextLine();
        Date dataPedido2;
        try {
            dataPedido2 = dateFormat.parse(dataPedido2Str);
        } catch (Exception e) {
            System.out.println("Erro ao ler a data do pedido.");
            return;
        }
        
        Pedido pedido2 = new Pedido(numeroPedido2, dataPedido2);
        
        // Itens do Pedido 2
        ItemPedido item1Pedido2 = new ItemPedido("Régua", 5.89, 10);
        
        pedido2.adicionarItem(item1Pedido2);
        
        // Calcular total dos pedidos
        double totalPedido1 = pedido1.calcularTotal();
        double totalPedido2 = pedido2.calcularTotal();
        
        // Exibir resultados
        System.out.println("\nResumo do Pedido 1:");
        System.out.println("Número do Pedido: " + pedido1.getNumeroPedido());
        System.out.println("Data do Pedido: " + dateFormat.format(pedido1.getDataPedido()));
        System.out.println("Itens:");
        for (ItemPedido item : pedido1.getItens()) {
            System.out.println(" - Descrição: " + item.getDescricao());
            System.out.println("   Preço Unitário: R$" + item.getPreco());
            System.out.println("   Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total do Pedido: R$" + totalPedido1);
        
        System.out.println("\nResumo do Pedido 2:");
        System.out.println("Número do Pedido: " + pedido2.getNumeroPedido());
        System.out.println("Data do Pedido: " + dateFormat.format(pedido2.getDataPedido()));
        System.out.println("Itens:");
        for (ItemPedido item : pedido2.getItens()) {
            System.out.println(" - Descrição: " + item.getDescricao());
            System.out.println("   Preço Unitário: R$" + item.getPreco());
            System.out.println("   Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total do Pedido: R$" + totalPedido2);
        
        // Fechar o scanner
        scanner.close();
    }
}
