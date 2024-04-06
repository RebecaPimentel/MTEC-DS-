import java.util.Scanner;
public class SalarioProfessor {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double hora, desc, salLiquido, salBruto;
		int inss, aulas;
		
		System.out.println("Insira as horas de aula:");
		hora = ler.nextDouble();
		
		System.out.println("Insira as aulas do mês:");
		aulas = ler.nextInt();
		
		System.out.println("Insira o percentual de desconto do inss:");
		inss = ler.nextInt();
		 
		salBruto = hora*aulas;
		desc = salBruto/100*inss;
		
		salLiquido = (hora*aulas)-desc;
		
		System.out.println("Seu salário é: "+salLiquido);
		ler.close();
	}


}
