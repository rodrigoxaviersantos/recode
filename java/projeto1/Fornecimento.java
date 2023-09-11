package projeto1;

public class Fornecimento {
    public static void main(String[] args) {
        // Criar objetos de Fornecedor e Produto
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "Rua A");
        Produto produto1 = new Produto("Produto 1", 10.0);
        
        // Exibir informações
        System.out.println("Fornecedor: " + fornecedor1.getNome());
        System.out.println("Endereço do Fornecedor: " + fornecedor1.getEndereco());
        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço do Produto: " + produto1.getPreco());
    }
}
