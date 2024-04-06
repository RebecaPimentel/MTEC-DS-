import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int expo, base, r=1, p = 0;
		
		System.out.print("Digite o número da base: ");
		base = ler.nextInt();
		System.out.print("Digite o número do expoente: ");
		expo = ler.nextInt();
		p=base;
		
		while (expo>1) {
			p=p*base;
			expo--;
		}
		System.out.print(base+" elevado a "+(expo+1)+ " = "+p);
	}
}
