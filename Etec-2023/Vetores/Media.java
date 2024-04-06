import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i;
		double r=0;
		a = new int[TAM]; 

		

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();
			r = a[i]+r;

		}
		r = r/TAM;
		System.out.print("O resultado é: "+r);

	}

}
