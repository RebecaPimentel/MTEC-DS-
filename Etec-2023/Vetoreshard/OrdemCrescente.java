
import java.util.Scanner;
public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int vetorA[], vetorB[], i, t, m;
		vetorA = new int[TAM];
		vetorB = new int[TAM];
		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
			vetorB[i] = vetorA[i];
	    }
		
		
		for(i=0; i<TAM; i++) { 
			for(m=0; m<TAM-1; m++) { 
				 if (vetorB[m]>vetorB[m+1]) {
	                    t=vetorB[m];
	                    vetorB[m]=vetorB[m+1];
	                    vetorB[m+1]=t;
	                }
			}
		}
		
		System.out.print("\nB = ");
		System.out.print(" [ ");
		for(i=0; i<TAM; i++) { 
			if (i<(TAM-1)) {
				System.out.print(vetorB[i]+", ");
			}else {
				System.out.print(vetorB[i]+" ");
			}
		}
		System.out.print(" ]");
		
		ler.close();

	}

}
