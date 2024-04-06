import java.util.Scanner;
public class Pares {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0;
		
		do {
			System.out.println(+i);
			i = i+2;
			
		}while(i<501);
		
		ler.close();
	}

}
