
public class ImcEncap {
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	// Nome //
	String getNome () {
		return this.nome;
	}
	
	void setNome (String nome) {
		 this.nome=nome;
	}
	
	
	// Idade//
	int getIdade () {
		return this.idade;
	}
	
	void setIdade (int idade) {
		 this.idade=idade;
	}
	
	
	// Peso 
	double getPeso () {
		return this.peso;
	}
		
	void setPeso (double peso) {
		 this.peso=peso;
	}
	
	
	// Altura
	double getAltura () {
		return this.altura;
	}
		
	void setAltura (double altura) {
		 this.altura=altura;
	}
	
	
	double calcularImc () {
	double	imc = peso/(altura*altura);
		if ( imc< 18.5) {
			 System.out.println(nome+" seu IMC é:"+imc+ ", Abaixo do peso");
		} else if (imc<24.9){
			 System.out.println(nome+" seu IMC é: "+imc+ ", Peso normal");
		} else if (imc<=29.9){
			 System.out.println(nome+" seu IMC é: "+imc+ ", Sobre peso");
		} else if (imc<=34.9){
			 System.out.println(nome+" seu IMC é:"+imc+ ", Obesidade grau 1");
		} else if (imc<=39.9){
			 System.out.println(nome+" seu IMC é: "+imc+ ", Obesidade grau 2");
		} else if (imc>= 40){
			 System.out.println(nome+" seu IMC é: "+imc+ ", Obesidade grau 3");
		}
		 return imc;
	}
}
