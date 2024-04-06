import java.util.Scanner; 
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
		int n, f=1, r=1; String pergunta;
		
		System.out.print("Digite numero que sera feito o fatorial: ");
		n = ler.nextInt();
		f=n;
		while(n>=1) {

			r = r*n;

			n=n-1;
		}
		System.out.println("O fatorial do numero é "+r);

		System.out.print("Deseja ver a conta do fatorial? "); pergunta = ler.next();

		if (pergunta.equalsIgnoreCase("Sim")) { 
			while(f>=1) {
				System.out.print(f+" * ");

				f=f-1;

				}
			System.out.print("= "+r);
		} else {

			System.out.println("Processo Encerrado");

			}
		 ler.close();
	}
}
