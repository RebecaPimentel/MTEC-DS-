import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double sal, div;
		System.out.println("insira o valor do salário");
		sal = ler.nextDouble();
		
		div = 30*sal/100;
		System.out.println("O valor das divididas calculadas é:"+div);
	}
	
}
