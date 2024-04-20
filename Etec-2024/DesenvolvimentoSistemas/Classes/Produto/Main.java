import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		String nome ;
		double precoCusto;
		double precoVenda;
		
		
		Produto primeiro = new Produto();
		
		System.out.println("Qual é o seu nome? ");
		nome = ler.next();
		primeiro.setNome(nome);
		
		System.out.println("Qual é o custo do produto? ");
		precoCusto = ler.nextDouble();
		primeiro.setPrecoCusto(precoCusto);
		
		System.out.println("Qual é o preço da venda do produto? ");
		precoVenda = ler.nextDouble();
		primeiro.setPrecoVenda(precoVenda);
		
		
		
		System.out.println("Margem de lucro: " +primeiro.calcularMargemLucro());
		System.out.println("Margem de lucro (%): "+primeiro.calcularMargemLucroPorcentagem()+"%");
		
		ler.close();
		
	}

}
