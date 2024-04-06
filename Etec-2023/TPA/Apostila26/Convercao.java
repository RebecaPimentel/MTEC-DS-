import java.util.Scanner;
public class Convercao {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double grausF, grausC;
		
		System.out.println("Insira o valor da temperatura em Faherenheit:");
		grausF = ler.nextDouble();
		 
		grausC = (grausF-32)*5/9;
		
		System.out.printf("A temperatura convertida em graus Celsius é %.2fºC", grausC);
		ler.close();
	}

}
