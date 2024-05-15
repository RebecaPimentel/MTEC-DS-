
public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	public Veiculo(String marca,String modelo,String cor,int ano) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.cor = cor;
		 this.ano = ano;
	}
	
	// Get
	String getMarca () {
		return this.marca;
	}
	
	String getModelo () {
		return this.modelo;
	}
	
	String getCor () {
		return this.cor;
	}
	
	int getAno () {
		return this.ano;
	}
	
	// Set
	
	
	//Metodo
	
	public String apresentar () {
		
		
		String mensagem = "Os dados do veiculo são: "+marca+", "+modelo+", "+cor+" e "+ano+". ";
		
		return mensagem;
	}

}

