
public class Quadrado {
	private double altura ;
	private double largura;
	
	public Quadrado (double l, double a) {
		largura = l;
		altura  = a;
	}
	
	public String forma() {
		double area = largura * altura;
		
		return "Largura = "+ largura +
		"\nAltura = " + altura + 
		"\nArea do quadrado = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
