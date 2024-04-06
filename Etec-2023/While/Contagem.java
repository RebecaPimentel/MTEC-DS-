import java.util.Scanner;
public class Contagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1;
		
		while(i<101) {
			System.out.println(i);
			i++;
		}
		ler.close();
	}
}	
