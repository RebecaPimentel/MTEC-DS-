
public class Carro extends Veiculo {
	
	//Atributos
	private int quantPortas;
	
	public Carro (String marca,String modelo,String cor,int ano, int quantPortas) {
		super(marca, modelo, cor, ano);
		this.quantPortas = quantPortas;
	}
	
	//Get
	int getQuantPortas () {
		return this.quantPortas;
	} 
	
	//Metodo
	public String apresentar () {
			
		String mensagem = "Os dados do veiculo são: "+getMarca()+", "+getModelo()+", "+getCor()+", "+getAno()+" e "+quantPortas+". ";	
		return mensagem;
	}
}