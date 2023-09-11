package projeto2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    	private String nome;

    private List<Funcionario> funcionarios;

 

    public Empresa(String nome) {

        this.nome = nome;

        this.funcionarios = new ArrayList<>();

    }

 

    public String getNome() {

        return nome;

    }

 

    public void contratarFuncionario(Funcionario funcionario) {

        funcionarios.add(funcionario);

    }

 

    public void demitirFuncionario(Funcionario funcionario) {

        funcionarios.remove(funcionario);

    }

 

    public List<Funcionario> getFuncionarios() {

        return funcionarios;

    }

 

 

}
