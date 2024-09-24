
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome, cpf;
		int numeroConta, pergunta, r=1, m;
		double quantia, saldo;
		
		System.out.println("Qual é o seu NOME?");
		nome = ler.next();
		
		System.out.println("Qual e seu CPF?");
		cpf = ler.next();
		
		System.out.println("Qual é o NUMERO DA CONTA?");
		numeroConta = ler.nextInt();
		
		System.out.println("Qual é a quantia do SALDO?");
		saldo = ler.nextDouble();
		
		Conta cont = new Conta(nome, cpf, numeroConta, saldo);

		
		do {
			System.out.println("O que deseja fazer hoje " +nome+": \n(1-Sacar | 2-Depositar | 3-Conta Poupança | 4-Conta Corrente | 5-Lucros | 6-Ver Saldo Atual | 7-Finalizar Atividade)");
			pergunta = ler.nextInt();
			
			if(pergunta==1) {
				System.out.println("Qual é o quantia que deseja SACAR?");
				quantia = ler.nextDouble();
				
				System.out.println(cont.sacar(quantia)+"\n");
				
			}else  if(pergunta==2){
				System.out.println("Qual é o quantia que deseja DEPOSITAR?");
				quantia = ler.nextDouble();
				
				System.out.println(cont.depositar(quantia)+"\n");
				
			}else  if(pergunta==3){
				ContaPoupanca contPou = new ContaPoupanca(nome, cpf, numeroConta, saldo);
				System.out.println(contPou.atualizarSaldo()+"\n");
				
			}else  if(pergunta==4){
				System.out.println("Por quanto tempo deseja utilizar a CONTA CORRENTE?");
				m = ler.nextInt();
				
				ContaCorrente contCor = new ContaCorrente(m);
				System.out.println(contCor.quantiadadePagar()+"\n");
				
			}else  if(pergunta==5){
				Lucros lucro = new Lucros(nome, cpf, numeroConta, saldo);
				System.out.println(lucro.registra()+"\n");
				
			}else  if(pergunta==6){
				System.out.println(cont.imprimirSaldo()+"\n");
				
			}else  if(pergunta==7){
				r++;
				System.out.println("Obrigado pela sua atenção");
			}
		}while(r==1);
	    
		ler.close();
		
	}
}
