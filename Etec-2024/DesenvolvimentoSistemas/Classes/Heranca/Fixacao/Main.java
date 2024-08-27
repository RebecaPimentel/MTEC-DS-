import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String modelo, cor, pergunta,combustivel;
		double valorTabela, ipva;
		int i =1, r=1;
		
		do {
			
			System.out.println("Deseja ver as informações de qual veiculo? (carro / moto)  ");
			pergunta = ler.next();
			
			System.out.println("Qual é o modelo do veiculo "+pergunta+"?");
			modelo = ler.next();
			
			System.out.println("Qual é a valor da tabela do veículo "+pergunta+"?");
			valorTabela = ler.nextDouble();
			
			System.out.println("Qual é a cor do veículo "+pergunta+"?");
			cor = ler.next();
			
			System.out.println("Qual é o combustivel do veículo "+pergunta+"?");
			combustivel = ler.next();
			
				
			if(pergunta.equalsIgnoreCase("CARRO")) {
				Carro carro = new Carro(modelo,valorTabela, cor, combustivel);
				carro.setIpva(carro.calculaIpva());
				System.out.println(carro.imprimirFicha()+"\n ");
			}else if (pergunta.equalsIgnoreCase("MOTO")) {
				Moto moto = new Moto(modelo,valorTabela, cor, combustivel);
				moto.setIpva(moto.calculaIpva());
				System.out.println(moto.imprimirFicha()+"\n ");
			} else {
				System.out.println(" Nome invalido do veiculo ");
			}

			System.out.println("Deseja listar outro veiculo?  (sim - 1 / nao - 2) ");
			r = ler.nextInt();
			
			if (r == 1) {
				i++;
			}else if(r == 2) {
				System.out.println("Você concluiu "+i+" preenchimento de dados");
			}
				
		}while(r==1);
    
		ler.close();
	}	
}
