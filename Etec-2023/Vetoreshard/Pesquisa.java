
import java.util.Scanner;

public class Pesquisa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i, n, r=0;
		a = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();

		}
		
		System.out.println("Escreva o valor a ser procurado:");
		n = ler.nextInt();
		
		for(i=0; i<TAM; i++) {
			if(a[i]==n) {
				r++;
				i=9;
				
			}
		}
		
		if(r==1) {
			System.out.println("Este numero esta no vetor A");
		} else {
			System.out.println("Este numero NÃO esta no vetor A");
		}
		
		
		ler.close();

	}

}
