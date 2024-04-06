import java.util.Scanner;
public class Prestação {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double valor, taxa, tempo, prest;
		
		System.out.println("Insira o valor da prestação:");
		valor = ler.nextDouble();
		
		System.out.println("Insira o valor da taxa:");
		taxa = ler.nextDouble();
		
		System.out.println("Insira o tempo:");
		tempo = ler.nextDouble();
		 
		prest = valor+(valor*(taxa/100)*tempo);
		
		System.out.println("O valor da prestação é: "+prest);
		ler.close();
	}


}
