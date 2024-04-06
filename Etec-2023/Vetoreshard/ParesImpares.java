import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], b[], i, p=0, t=0;
		a = new int[TAM]; 
		b = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();
			
			if (i % 2 == 0) {
				b[p] = a[i];
				
			}else {
				t= TAM-t;
				b[t] = a[i];
				t++;
			}
		}
		ler.close();
	}

}
