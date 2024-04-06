import java.util.Scanner;
public class Coelhos {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double custos;
		int nCoelhos;
		
		System.out.println("Insira o numero de coelhos:");
		nCoelhos = ler.nextInt();
		 
		custos = (nCoelhos*0.60)/18+10;
		
		System.out.printf("O custo para criar coelhos é:%.2f reais ",custos);
		ler.close();
	}

}
