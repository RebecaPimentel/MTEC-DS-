import java.util.Scanner;
public class If1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o n�mero: ");
		num = ler.nextInt();
		
		if(num<0) {
			System.out.println("Este n�mero � negativo");
		}else {
			System.out.println("Este n�mero n�o � negativo");
		}
		ler.close();
	}
}

//Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva