public class Funcionario {

	

	    private String nome;

	    private int idade;

	    private double salario;

 

	    public Funcionario(String nome, int idade, double salario) {

	        this.nome = nome;

	        this.idade = idade;

	        this.salario = salario;

	    }

 

	    public String getNome() {

	        return nome;

	    }

 

	    public int getIdade() {

	        return idade;

	    }

 

	    public double getSalario() {

	        return salario;

	    }

 

	    public void aumentarSalario(double percentual) {

	        salario += salario * (percentual / 100);

	    }

 

	    @Override

	    public String toString() {

	        return "Nome: " + nome + ", Idade: " + idade + ", Salario: " + salario;

	    }

	

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		// Instanciei a super classe Funcionario

		Funcionario func = new Funcionario("Jose Teixeira",25,55000);

		System.out.println(func.toString());		

		

		// Instanciei a sub classe Gerente

		Gerente ger = new Gerente ("Gerente Jose",55,80000,"Depto Financeiro");

		System.out.println(ger.toString());

	}

 

}

 

 

    class Gerente extends Funcionario {

        private String departamento;

    

        public Gerente(String nome, int idade, double salario, String departamento) {

            super(nome, idade, salario);

            this.departamento = departamento;

        }

    

        public String getDepartamento() {

            return departamento;

        }

    

        @Override

        public String toString() {

            return "Gerente - " + super.toString() + ", Departamento: " + departamento;

        }

    }


