
import java.util.Scanner;
public class While1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha;
		int aux=0;
		
		
		
		while(aux<1) {
			
			System.out.print("Digite o número: ");
			senha = ler.nextInt();
			
			if(senha==2002) {
				System.out.println("Senha Valida");
				aux=1;
			}else {
				System.out.println("Senha Invalida");
			}
		}
		ler.close();
	}
}

//Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva