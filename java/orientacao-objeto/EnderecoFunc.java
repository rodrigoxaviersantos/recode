public class EnderecoFunc {

	

		private int matricula;

		private String nome;

	    private String endereco;

 

	    public EnderecoFunc(int matricula,String nome, String endereco) {

	        this.nome = nome;

	        this.matricula = matricula;

	        this.endereco = endereco;

	    }

 

	    public String getNome() {

	        return nome;

	    }

 

	    public int getMatricula() {

	        return matricula;

	    }

 

	    public String getEndereco() {

	        return endereco;

	    }

 

	    public void setNome (String nome) {

	    	this.nome=nome;

	    }

	    

	    public void setMatricula (int matricula) {

	    	this.matricula=matricula;

	    }

 

	    public void setEndereco (String endereco) {

	    	this.endereco=endereco;

	    }

 

	    @Override

	    public String toString() {

	        return "Matricula: "+matricula+" Nome: " + nome + ", Endereco: " +endereco;

	    }

	

 

	    public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		// Instanciei a super classe Funcionario

		EnderecoFunc func = new EnderecoFunc(100," Funcionario","Rua da Passagem 66");

		System.out.println(func.toString());		

		

		// Instanciei a sub classe Professor

		Professor prof = new Professor (200," Professor","Rua da Passagem 77","professor TI");

		System.out.println(prof.toString());

		

		// Instanciei a sub classe Secretaria

		Secretaria sec  = new Secretaria (300," Secreatria","Rua da Passagem 88","Login sistema");

		System.out.println(sec.toString());

 

	    }

 

}

 

 

class Professor extends EnderecoFunc {

	private String especialidade;

 

	public Professor (int matricula, String nome, String endereco, String especialidade) {

		super(matricula, nome, endereco);

		this.especialidade = especialidade;

	}

 

	public String getEspecialidade() {

		return especialidade;

			

	}

	

	public void setEspecialidade (String especialidade) {

		this.especialidade = especialidade;

	}

 

	@Override

	public String toString() {

		return "Professor - " + super.toString() + ", Especialidade: " + especialidade;

	}

}

 

class Secretaria extends EnderecoFunc {

	private String login;

 

	public Secretaria (int matricula, String nome, String endereco, String login) {

		super(matricula, nome, endereco);

		this.login = login;

	}	

 

	public String getlogin() {

		return login;

	}

	

	public void setLogin (String login) {

		this.login = login;

	}

 

	@Override

	public String toString() {

		return "Secreatria - " + super.toString() + ", login: " + login;

	}

}