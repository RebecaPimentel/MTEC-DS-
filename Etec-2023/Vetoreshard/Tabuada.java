import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i, r, p;
		a = new int[TAM]; 

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println(" "); 
			for(p=0;p<TAM;p++) {
				r = a[p]*(i+1);
				System.out.println((i+1)+" x "+a[p]+" = "+r);
			}

		}
		ler.close();
	}

}
