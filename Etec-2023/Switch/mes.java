import java.util.Scanner;
public class Mes {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int m;
		
		System.out.println("Insira o numero do mês: ");
		m = ler.nextInt();
		
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Dias");
			break;
		case 2:
			System.out.println("28 Dias");
			break;
		default:
			System.out.println("Mês invalido");
		}
	ler.close();
	}
	

}
