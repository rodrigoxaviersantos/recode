public class Veiculo {

	
	private String modelo;

	private String placa;

	private int anoFabricacao;


	public Veiculo (String modelo, String placa, int anoFabricacao) {

		this.modelo = modelo;

		this.placa=placa;

		this.anoFabricacao=anoFabricacao;

	}	


	public String getModelo() {

		return modelo;

	}

			
	public String getPlaca() {

		return placa;

	}


	public int getanoFabricacao() {

		return anoFabricacao;

	}


	public void setModelo(String modelo) {

		this.modelo=modelo;
	}


	public void setPlaca( String placa) {

		this.placa=placa;
	}


	public void setAnoFabricacao(int anoFabricacao) {

		this.anoFabricacao=anoFabricacao;
	}	
	

	public  int calcularIdadeVeiculo() {

		return 2023-anoFabricacao;
	}	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Veiculo veic = new Veiculo ("Sportage","KYA-5992",2015);

		System.out.println ("Modelo: "+veic.modelo);

		System.out.println ("Placa: "+veic.placa);

		System.out.println ("Ano Fabricacao : "+veic.anoFabricacao);

		int idade = veic.calcularIdadeVeiculo();

		System.out.println ("idade : "+idade);

		

	}

 

}