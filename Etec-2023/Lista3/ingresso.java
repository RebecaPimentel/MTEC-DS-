import java.util.Scanner;
public class Ingresso {
	public static void main(String[] args) {
		// criar objeto Scanner 
		Scanner ler = new Scanner (System.in);
		String r;
		double i, vM;
		
		System.out.println("Qual o valor do ingresso? ");
		i = ler.nextDouble();
		
		System.out.println("Você é estudante?");
		r = ler.next();
		
		if (r.equalsIgnoreCase("Sim")) {
			vM = i/2;
			System.out.println("Você paga meia, o a valor é: "+vM);
			
		} else {
			System.out.println("Você paga o valor integral, que é: "+i);
			
		}
		ler.close();
		
		
	}
}
