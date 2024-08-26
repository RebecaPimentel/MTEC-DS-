
public class Octogono {
	private double ladosp ;
	private double altura ;
	private double apo;
	
	public Octogono (double ap, double b, double a) {
		apo = ap;
		ladosp  = b;
		altura  = a;
	}
	
	public String forma() {
		double perimetro = 8 * ladosp;
		double area = perimetro * apo /2;
		
		return "Apotema = "+ apo +
		"\nlados = " + ladosp + 
		"\nAltura = " + altura + 
		"\nPerímetro = " + perimetro + 
		"\nArea do Octogono = " + area+"\n";
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
