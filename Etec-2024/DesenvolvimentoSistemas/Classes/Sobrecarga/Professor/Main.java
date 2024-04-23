import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		String nome, disc, turno;
		int cod;
		
		System.out.println("Qual é o seu Código?");
		cod = ler.nextInt();
		
		System.out.println("Qual é o seu Nome?");
		nome = ler.next();
		
		System.out.println("Qual é a sua Disciplina?");
		disc = ler.next();
		
		System.out.println("Qual é o seu Turno?");
		turno = ler.next();
	
		Professor professor1 = new Professor(cod,nome,disc,turno);
		
		
		
		System.out.println(" " +professor1.getCodigo()+","+professor1.getNome()+","+professor1.getDisciplina()+","+professor1.getTurno());
		
		
		ler.close();
		
	}
	
	
	

}
