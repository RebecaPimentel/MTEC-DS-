package campo;
import java.util.Scanner;
public class Inteiro{
	public static void main(String args[]) {
		// criar objeto scanner
		Scanner ler = new Scanner (System.in);
		int n;
		System.out.println("Escreva o número:");
		n = ler.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O número é PAR");
		} else {
			System.out.println("O número é IMPAR ");
			ler.close();
		}
	}
}