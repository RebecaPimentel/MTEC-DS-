

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], i, n,r=0, p=9;
		a = new int[TAM];

		for(i=0; i<TAM; i++) { 
			System.out.println("Digite o "+(i+1)+" valor do vetor A"); 
			a[i]= ler.nextInt();

		}
		
		for(n=0; n<5; n++) {
			if(a[n]==a[p]) {
				p--;
				r++;
			}
		}
		if(r==5) {
			System.out.println("Este é um número palindromo");
		} else {
			System.out.println("Este não é um número palindromo");
		}
		
		
		ler.close();

	}

}

