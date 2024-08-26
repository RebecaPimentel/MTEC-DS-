
public class Triangulo {
	private Ponto vertice;
	private double base;
	private double altura;
	
	public Triangulo (Ponto p, double b, double a) {
		vertice = p;
		base = b;
		altura = a;
	}
	
	public String forma() {
		double area = base * altura/2;
		return "vertice = " + vertice.forma() +
				"\nAltura = " + altura + 
				"\nBase = " + base +
				"\nArea do Tri�ngulo = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}


