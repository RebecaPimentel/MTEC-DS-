import java.util.Scanner;
public class If2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o n�mero: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Este n�mero � par");
		}else {
			System.out.println("Este n�mero � impar");
		}
		ler.close();
	}
	
}

// Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva