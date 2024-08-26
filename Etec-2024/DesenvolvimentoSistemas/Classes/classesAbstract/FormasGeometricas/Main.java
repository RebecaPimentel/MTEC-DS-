import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double xPonto, yPonto, altura, base,ladosp, apo ;
		int reinicializacao=0;
		
		do{
			
			System.out.println("Qual é o valor do ponto X?");
			xPonto = ler.nextDouble();
			
			System.out.println("Qual é o valor do ponto Y?");
			yPonto = ler.nextDouble();
			
			System.out.println("Qual é o valor da altura do Triângulo?");
			altura = ler.nextDouble();
			
			System.out.println("Qual é o valor da base do Triângulo?");
			base = ler.nextDouble();
			
			System.out.println("Qual é o valor do lados do Pentagono?");
			ladosp = ler.nextDouble();
			
			System.out.println("Qual é o valor da Apotema do Pentagono?");
			apo = ler.nextDouble();
			
			Ponto p = new Ponto (xPonto, yPonto );
			Triangulo c = new Triangulo(p, base, altura);
			Quadrado q = new Quadrado (base, altura);
			Pentagono pen = new Pentagono (ladosp, apo);
			Octogono oc = new Octogono (ladosp, altura, apo);
			
			System.out.println("\n>> Ponto X e Y");
			p.mostrar();
			System.out.println("\n>> Triângulo");
			c.mostrar();
			System.out.println("\n>> Quadrado");
			q.mostrar();
			System.out.println("\n>> Pentagono");
			pen.mostrar();
			System.out.println("\n>> Octogono");
			oc.mostrar();
			
			
			System.out.println("Deseja listar outras formas?  (Sim - 1 / Não - 2) ");
			reinicializacao = ler.nextInt();
			
		}while(reinicializacao==1);
		
		
		ler.close();
		

	}
}
