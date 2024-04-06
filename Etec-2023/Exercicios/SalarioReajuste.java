package campo;
import java.util.Scanner;
public class SalarioReajuste {
	public static void main(String args[]) {
		// criar objeto scanner
		Scanner ler = new Scanner (System.in);
		double sal, salRea;
		System.out.println("Escreva seu sálario: ");
		sal = ler.nextDouble();
		if(sal==1212) {
			salRea= sal+(sal*0.05);
			System.out.println("O seu novo salario é: "+salRea);

		} else { if (sal>1212) {
			salRea= sal+(sal*0.035);
			System.out.println("O seu novo salario é: "+salRea+" reais");
			ler.close();
		}
		
		
	}
}
}