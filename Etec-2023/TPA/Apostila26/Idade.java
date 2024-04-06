import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		// criar o objeto Scanner
		Scanner ler = new Scanner (System.in);
		int dataNasc, anoAtual, idade;
		String nome;
		
		System.out.println("Insira o seu nome:");
		nome = ler.next();
		
		System.out.println("Insira sua data de nascimento:");
		dataNasc = ler.nextInt();
		
		System.out.println("insira o ano atual:");
		anoAtual = ler.nextInt();
		
		idade = anoAtual-dataNasc;
		System.out.println(nome+"você tem"+idade+"anos");
		ler.close();
	}
	
}
