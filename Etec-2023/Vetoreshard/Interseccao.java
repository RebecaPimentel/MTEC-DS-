import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[],b[],c[], i,r=0,p,n,o=0;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();

		}
		
		System.out.println("Digite os valores do vetor B"); 

		for(i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+" valor do vetor B"); 
		b[i]= ler.nextInt();
		}
		
		for(n=0; n<TAM; n++) {
			for(p=0; p<TAM; p++) {
				if(a[n]==b[p]) {
					c[o]=a[n];
					o++;
					r++;
				}
			
			}
		}
			
		System.out.print("\nC = ");
		System.out.print(" [ ");
		for(o=0; o<r; o++) { 
			if (o<(r-1)) {
				System.out.print(c[o]+", ");
			}else {
				System.out.print(c[o]+" ");
			}
		}
		System.out.print(" ]");
		
		ler.close();
		
		

	}

}