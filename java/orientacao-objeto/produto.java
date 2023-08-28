import java.util.Scanner;

public class produto {
    private int id;
    private String nome;
    private double preco;
    private int qtEstoque;

    public void Produto(int id, String nome, double preco, int qtEstoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtEstoque = qtEstoque;
    }

    public double calculaValor(){
        return preco * qtEstoque;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtEstoque() {
        return qtEstoque;
    }

    public void setQtEstoque(int qtEstoque) {
        this.qtEstoque = qtEstoque;
    }
    @Override

	public String toString() {

		return "Id: "+id+"\nNome: "+nome+"\nPreco: "+preco+"\nQtde: "+qtEstoque;

	}	
 public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);
	produto produto = new Produto(id,nome,preco,qtEstoque);

    System.out.print("Digite Nome : ");
    String nome=entrada.nextLine();

    System.out.print("Digite Id : ");
    int id=entrada.nextInt();

    System.out.print("Digite Preco : ");
    double preco=entrada.nextDouble();

    System.out.print("Digite Quantidade : ");
    int qtdeEst=entrada.nextInt();


 }

}
