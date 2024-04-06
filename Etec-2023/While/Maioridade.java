import java.util.Scanner;
public class Maioridade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0, maior=0, menor=0, idade;
		
		while(i<10	) {
			System.out.println("Escreva sua idade: ");
			idade = in.nextInt();
			
			if (idade<18) {
				menor = menor+1;
			}else {
				maior = maior+1;
			}
		i++;	
		}
		System.out.println(maior+" pessoas maiores de idade ");
		System.out.println(menor+" pessoas menores de idade");
		in.close();
		
	}
}
