import java.util.Scanner;
public class Placa {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int p;
		
		System.out.println("Escreva o número da placa:");
		p = ler.nextInt();
		
		switch(p) {
		case 1:
		case 2:
			System.out.println("Não circulam na segunda-feira");
			break;
			
		case 3:
		case 4:
			System.out.println("Não circulam na terça-feira");
			break;
			
		case 5 :
		case 6:
			System.out.println("Não circulam na quarta-feira");
			break;
			
		case 7:
		case 8:
			System.out.println("Não circulam na quinta-feira");
			break;
			
		case 9:
		case 0:
			System.out.println("Não circula na sexta-feira");
			break;
			
		default:
			System.out.println("Data inválida");
		}
		ler.close();
	
	}
}
