import java.util.Scanner;

public class Primos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i,r=0,p;
		a = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();

		}
		
		for(i=0; i<TAM; i++) {
			for(p=1; p<=a[i]; p++) {
				if(a[i]%p==0) {
					r++;
					
				}
			}
			if (r<3) {
				System.out.println(a[i]+"    Este número e primo");
			} else {
				System.out.println(a[i]); 
			}
			r=0;
		}
		
		
		
		ler.close();

	}

}