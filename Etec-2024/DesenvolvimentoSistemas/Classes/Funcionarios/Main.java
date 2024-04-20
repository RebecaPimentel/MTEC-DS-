import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		double aumento;
		String pergunta;
		
		System.out.println("Quem é você? ");
		pergunta = ler.next();
		
		switch (pergunta) {
		case "pedro":
			Funcionario pedro = new Funcionario();
			pedro.salarioBruto = 1020;
			pedro.imposto = 100;
			System.out.println("O sálario liquido de Pedro é: "+pedro.salarioLiquido());
			
			System.out.println("Informe o valor a ser aumentado: ");
			aumento = ler.nextDouble();
			
			
			System.out.println("O sálario liquido de Vagner é: "+pedro.aumentoSalario(aumento));
			
			break;
		case "vagner":
			Funcionario vagner = new Funcionario();
			vagner.salarioBruto = 1200;
			vagner.imposto = 80;
			System.out.println("O sálario liquido de Vagner é: "+vagner.salarioLiquido());
			
			System.out.println("Informe o valor a ser aumentado: ");
			aumento = ler.nextDouble();
			
			
			System.out.println("O sálario liquido de Vagner é: "+vagner.aumentoSalario(aumento));
			break;

		default:
			
		}
		ler.close();
		
		
		
		
		
	}

}
