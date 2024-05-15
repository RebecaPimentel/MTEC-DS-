/*Atividade Herança
 * 
 * Crie uma classe "Veículo" que tenha as propriedades "marca", "modelo", "ano" e "cor".
 * Em seguida, crie duas subclasses chamadas "Carro" e "Moto", que herdam as propriedades da classe "Veículo".
 * A classe "Carro" deve ter a propriedade adicional "quantidade de portas", enquanto a classe "Moto" deve ter a propriedade adicional "cilindrada".
 * 
 * Em seguida, crie dois objetos, um do tipo "Carro" e outro do tipo "Moto", atribuindo valores às suas propriedades.
 * Por fim, exiba as informações de cada objeto utilizando um método.
 * Certifique-se de que a informação adicional de cada classe (quantidade de portas ou cilindrada) também esteja incluída.
 * 
 * 
 */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String marca, modelo, cor, pergunta;
		int ano, r=1, i=0;
		
		do {
			System.out.println("Qual é a marca do veículo?");
			marca = ler.next();
			
			System.out.println("Qual é o modelo do veículo?");
			modelo = ler.next();
			
			System.out.println("Qual é a cor do veículo?");
			cor = ler.next();
			
			System.out.println("Qual é o ano do veículo?\n");
			ano = ler.nextInt();
			
			Veiculo veiculo = new Veiculo(marca, modelo, cor, ano);
			
			System.out.println("Dados: " + veiculo.apresentar()+"\n ");
			
			System.out.println("Deseja ver as informações de veiculos especificos?  (sim - 1 / nao - 2) ");
			i = ler.nextInt();
			
			if(i == 1) {
				System.out.println("Deseja ver as informações de qual veiculo? (carro / moto)  ");
				pergunta = ler.next();
				
				if(pergunta.equalsIgnoreCase("CARRO")) {
					int quantPortas;
					
					System.out.println("Qual é a quantidade de portas?");
					quantPortas = ler.nextInt();
					
					Carro carro = new Carro(marca, modelo, cor, ano, quantPortas);
					System.out.println("Dados: " + carro.apresentar()+"\n ");
					
					
				}else if (pergunta.equalsIgnoreCase("MOTO")) {
					
					int cilindrada;
					
					System.out.println("Qual é a cilindrada da moto??");
					cilindrada = ler.nextInt();
					
					Moto moto = new Moto(marca, modelo, cor, ano, cilindrada);
					System.out.println("Dados: " + moto.apresentar()+"\n ");
				}
				
			}else {}

			System.out.println("Deseja listar outro veiculo?  (sim - 1 / nao - 2) ");
			r = ler.nextInt();
				
		}while(r==1);
    
		ler.close();
	}	
}

/*
 * Feito por:
 * Barbara Samira Santiesteban Saravia 
 * Rebeca Elaine Pimentel da Silva
 * */
