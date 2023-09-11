package projeto2;

public class AgregaProp {
    public static void main(String[] args) {

		// TODO Auto-generated method stub

		Empresa minhaEmpresa = new Empresa("Minha Empresa");

 

		Funcionario funcionario1 = new Funcionario("João", 1);

		Funcionario funcionario2 = new Funcionario("Maria", 2);

 

		minhaEmpresa.contratarFuncionario(funcionario1);

		minhaEmpresa.contratarFuncionario(funcionario2);

 

		System.out.println("Saida 1 --> Funcionarios da " + minhaEmpresa.getNome() + ":");

		for (Funcionario funcionario : minhaEmpresa.getFuncionarios()) {

		    System.out.println("Nome: " + funcionario.getNome() + ", ID: " + funcionario.getId());

		}

 

		minhaEmpresa.demitirFuncionario(funcionario1);

 

		System.out.println("Saida 2 --> Funcionarios da " + minhaEmpresa.getNome() + " após a demissão:");

		for (Funcionario funcionario : minhaEmpresa.getFuncionarios()) {

		    System.out.println("Nome: " + funcionario.getNome() + ", ID: " + funcionario.getId());

		}
 

	}
}
