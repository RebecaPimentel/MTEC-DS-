import java.util.Scanner;
public class If1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o número: ");
		num = ler.nextInt();
		
		if(num<0) {
			System.out.println("Este número é negativo");
		}else {
			System.out.println("Este número não é negativo");
		}
		ler.close();
	}
}

//Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva