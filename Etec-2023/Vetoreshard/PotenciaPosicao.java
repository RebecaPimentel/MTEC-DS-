
import java.util.Scanner;

public class PotenciaPosicao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=11;
		int vetorA[], i, expo ,p;
		vetorA = new int[TAM];

		for(i=0; i<TAM; i++) { 
			p=2;
			if(i==0) {
				p=0;
			}else {
				for(expo=i;expo>1;expo--) {
					p=p*2;
				}
			}
			
			
			vetorA[i]=p;
			

		}
		
		
		System.out.print("\nA = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			if (i<(TAM-1)) {
				System.out.print(vetorA[i]+", ");
			}else {
				System.out.print(vetorA[i]+" ");
			}
		}
		System.out.print(" ]");
		
		
		ler.close();

	}

}
