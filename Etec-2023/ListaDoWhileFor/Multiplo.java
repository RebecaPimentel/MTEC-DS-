import java.util.Scanner;
public class Multiplo {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		
		for (i=1;i<=100;i++) {
			
			
			if (i % 10 == 0) {
				System.out.print(+i);
				System.out.println("     Multiplo de 10");
			} else {
				System.out.println(+i);
			}
		}
	}

}
