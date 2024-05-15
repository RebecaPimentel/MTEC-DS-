

public class Moto extends Veiculo {
	
	//Atributos
	private int cilindrada;
	
	public Moto (String marca,String modelo,String cor,int ano, int cilindrada) {
		super(marca, modelo, cor, ano);
		this.cilindrada = cilindrada;
	}
	
	//Get
	int getCilindrada () {
		return this.cilindrada;
	} 
	
	//Metodo
	public String apresentar () {
			
		String mensagem = "Os dados do veiculo são: "+getMarca()+", "+getModelo()+", "+getCor()+", "+getAno()+" e "+cilindrada+". ";	
		return mensagem;
	}
}
