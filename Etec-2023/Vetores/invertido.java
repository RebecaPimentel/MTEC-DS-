import java.util.Scanner;

public class Invertido {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], b[], i, t=0;
		a = new int[TAM]; 
		b = new int[TAM];

		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();

		}
		for(i=0; i<TAM; i++) { 
			t=9-i;
			b[i]= a[t];

		}

		System.out.print("\nB = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			System.out.print(b[i]+" ");
		}
		System.out.print("]");

	}

}
