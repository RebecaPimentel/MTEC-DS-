public class Main {

	public static void main(String[] args) {
		Quadrado primeiro = new Quadrado();
		primeiro.base = 20;
		primeiro.altura = 30;
		
		System.out.println("A area do primeiro quadrado é: "+primeiro.calcularArea());
		
		Quadrado segundo = new Quadrado();
		segundo.base = 7;
		segundo.altura = 7;
		
		System.out.println("A area do segundo quadrado é: "+segundo.calcularArea());
		
		

	}

}
