
public class Main {
	
	public static void main(String[] args) {		
		
		Calculadora calculadora1 = new Calculadora("Calculadora");
		
		System.out.println("|| Equações de Adições: ");
        System.out.println("Soma de inteiros: " + calculadora1.Soma(5, 3));
        System.out.println("Soma de decimais: " + calculadora1.Soma(5.5, 3.7));
        System.out.println("Soma de array inteiros: " + calculadora1.Soma(new int[]{1, 3, 5}));
        System.out.println("Soma de array decimais: " + calculadora1.Soma(new double[]{1.5, 3.8, 5.5})+"\n");
        
        System.out.println("|| Equações de Subtração: ");
        System.out.println("Subtração de inteiros: " + calculadora1.Subtracao(5, 3));
        System.out.println("Subtração de decimais: " + calculadora1.Subtracao(5.5, 3.7));
        System.out.println("Subtração de array inteiros: " + calculadora1.Subtracao(new int[]{1, 3, 5}));
        System.out.println("Subtração de array decimais: " + calculadora1.Subtracao(new double[]{1.5, 3.8, 5.5})+"\n");
        
        System.out.println("|| Equações de Multiplicação: ");
        System.out.println("Multiplicação de inteiros: " + calculadora1.Multiplicacao(5, 3));
        System.out.println("Multiplicação de decimais: " + calculadora1.Multiplicacao(5.5, 3.7));
        System.out.println("Multiplicação de array inteiros: " + calculadora1.Multiplicacao(new int[]{1, 3, 5}));
        System.out.println("Multiplicação de array decimais: " + calculadora1.Multiplicacao(new double[]{1.5, 3.8, 5.5})+"\n");
        
        System.out.println("|| Equações de Divisão: ");
        System.out.println("Divisão de inteiros: " + calculadora1.Divisao(5, 3));
        System.out.println("Divisão de decimais: " + calculadora1.Divisao(5.5, 3.7));
        System.out.println("Divisão de array inteiros: " + calculadora1.Divisao(new int[]{10, 2, 5}));
        System.out.println("Divisão de array decimais: " + calculadora1.Divisao(new double[]{1.5, 3.8, 5.5})+"\n");
	}
	
}
