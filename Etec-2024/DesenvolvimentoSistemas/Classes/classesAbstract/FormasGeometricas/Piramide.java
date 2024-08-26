
public class Piramide {
	
	private Triangulo base;
	private double compB ;
	private double vertice;
	
	public Piramide (Triangulo b, double v, double a) {
		base = b;
		vertice = v;
		compB = a;
	}
	
	public String forma() {
		double area = vertice * compB/2;
		
		return "Base = " + base.forma() +
				"\nVertice = " + vertice + 
				"\nComprimento da base = " + compB + 
				"\nArea da Piramide = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}


