package projeto1;

public class Fornecedor {
    private String nome;
    private String endereco;
    
    public Fornecedor(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}