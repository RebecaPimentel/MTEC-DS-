
public class Pessoa {
	String nome;
	int idade;
	double peso;
	double altura;
	
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

