package campo;
import java.util.Scanner;
public class Campo {
	public static void main(String args[]) {
		// criar objeto scanner
		Scanner ler = new Scanner (System.in);
		int alt, lar, area;
		System.out.println("escreva a altura do campo:");
		alt = ler.nextInt();
		
		System.out.println("escreva a largura do campo:");
		lar = ler.nextInt();
		area = lar*alt;
		
		System.out.println("A area é: "+area);
		if(area >= 110) {
			System.out.println("O campo está no padrão FIFA");
			
		} else {
			System.out.println("O campo está fora dos padrões FIFA");
			ler.close();
		}
	}

}
