

public class Pentagono {
	private double ladosp ;
	private double apo;
	
	public Pentagono (double ap, double l) {
		apo = ap;
		ladosp  = l;
	}
	
	public String forma() {
		double perimetro = 5 * ladosp;
		double area = perimetro * apo /2;
		
		return "Apotema = "+ apo +
		"\nlados perímetro = " + perimetro + 
		"\nArea do quadrado = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
