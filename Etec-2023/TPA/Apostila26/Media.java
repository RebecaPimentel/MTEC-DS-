import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, media;
		
		System.out.println("Insira a primeira nota:");
		n1 = ler.nextInt();
		
		System.out.println("Insira a segunda nota:");
		n2 = ler.nextInt();
		
		System.out.println("Insira a terceira nota:");
		n3 = ler.nextInt();
		
		System.out.println("Insira a quarta nota:");
		n4 = ler.nextInt();
		
		media = (n1+n2+n3+n4)/4;
		System.out.println("Sua média é: "+media);
		ler.close();
	}

}
