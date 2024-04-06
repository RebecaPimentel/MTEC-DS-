
import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int vetorA[],vetorB[],vetorC[], t=0, i,p,n,o=1,r=0;
		vetorA = new int[TAM];
		vetorB = new int[TAM];
		vetorC = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			vetorA[i]= ler.nextInt();

		}
		
		System.out.println("Digite os valores do vetor B"); 

		for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+" valor do vetor B"); 
		vetorB[i]= ler.nextInt();
		}
		
		for(n=0; n<TAM; n++) {
			for(p=0; p<TAM; p++) {
				if(vetorA[n]==vetorB[p]) {
					p=TAM;
					
				} else {
					o++;
				}
			}
			if(o>TAM) {
				vetorC[t]=vetorA[n];
				t++;
				r++;
			}
			o=1;
		}
		
		if (r==0) {
			System.out.println("N�O � possivel criar o vetor com a diferen�a dos conjuntos devido a n�o possuir valores diferentes. ");
		}else {
			System.out.print("\nC = ");
			System.out.print(" [ ");
			for(t=0; t<r; t++) { 
				if (t<(r-1)) {
					System.out.print(vetorC[t]+", ");
				}else {
					System.out.print(vetorC[t]+" ");
				}
			}
			System.out.print("]");
		}
		
		
		ler.close();

	}

}
