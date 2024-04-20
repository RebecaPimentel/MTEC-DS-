import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		String nome ;
		int idade;
		double peso;
		double altura;
		
		
		Pessoa primeira = new Pessoa();
		
		System.out.println("Qual é o seu nome? ");
		primeira.nome = nome = ler.next();
		
		System.out.println("Qual é a sua altura? ");
		primeira.altura =  altura = ler.nextDouble(); 
		
		

		System.out.println("Quantos anos você tem? ");
		primeira.idade = idade = ler.nextInt();
		
		System.out.println("Qual é o seu peso? ");
		primeira.peso= peso = ler.nextDouble();
		
		System.out.println(primeira.calcularImc());
		
		
		ler.close();
		
	}

}
