
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=15;
		int a[], b[], n=1, i;
		a = new int[TAM];
		b = new int[TAM];
		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" vAlor do vetor A"); 
			a[i]= ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) { 
			while(a[i]>=1) { 
				n=a[i]*n;
				a[i]--;
			}
			b[i]=n;
			n=1;
		}
		
		
		System.out.print("\nB = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			if (i<(TAM-1)) {
				System.out.print(b[i]+", ");
			}else {
				System.out.print(b[i]+" ");
			}
		}
		System.out.print(" ]");
		
		ler.close();

	}

}
