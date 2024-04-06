
import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" vAlor do vetor A"); 
			a[i]= ler.nextInt();
		}
		

		for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+" valor do vetor B"); 
		b[i]= ler.nextInt();

		c[i]=a[i]+b[i];
		
		} 
		System.out.print("\nC = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			System.out.print(c[i]+" ");
		}
		System.out.print(" ]");

	}

}
