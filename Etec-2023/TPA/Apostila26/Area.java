import java.util.Scanner;

public class Area {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		double larg1, larg2, comp, area;
		
		System.out.println("Insira a largura da primeira parede:");
		larg1 = ler.nextDouble();
		 
		System.out.println("Insira a largura da segunda parede:");
		larg2 = ler.nextDouble();
		
		System.out.println("Insira o comprimento da sala:");
		comp = ler.nextDouble();
		
		area = (larg1+larg2)*comp;
		
		System.out.println("A area da sala é: "+area);
		ler.close();
	}


}
