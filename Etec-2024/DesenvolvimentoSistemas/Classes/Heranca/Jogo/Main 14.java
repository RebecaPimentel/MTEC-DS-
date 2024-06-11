import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome, distribuidora, pergunta;
		double preco;
		
		System.out.println("Qual é o nome do jogo?");
		nome = ler.next();
		
		System.out.println("Qual é o preço do jogo?");
		preco = ler.nextDouble();
		
		System.out.println("Qual é a distribuidora do jogo?");
		distribuidora = ler.next();
		
		Jogo FreeFire = new Jogo (nome, preco, distribuidora);
		
		System.out.println("Deseja ver as informações de qual tipo de jogo? (JogoFisico ou JogoEletronico)");
		pergunta = ler.next();
		
		if(pergunta.equalsIgnoreCase("JogoEletronico")) {
			String plataforma, genero;
			
			System.out.println("Qual é a plataforma do jogo?");
			plataforma = ler.next();
			
			System.out.println("Qual é o gênero do jogo?\n");
			genero = ler.next();
			
			JogoEletronico jogoUm = new JogoEletronico(nome, preco, distribuidora, plataforma, genero);
			
			System.out.println("Qual é a quantidade de jogadores do jogo?\n");
			int jogadores = ler.nextInt();
			
			System.out.println(jogoUm.jogarOnline(jogadores)+"\n ");
			
			System.out.println(jogoUm.exibirDetalhes()+"\n ");
			
		}else if(pergunta.equalsIgnoreCase("JogoFisico")) {
			int quantJogadores;
			double tempoPartida;
			
			System.out.println("Qual é a quantidade de jogadores?");
			quantJogadores = ler.nextInt();
			
			System.out.println("Qual é o tempo da partida?\n");
			tempoPartida = ler.nextDouble();
			
			JogoFisico jogoDois = new JogoFisico(nome, preco, distribuidora, quantJogadores, tempoPartida);
			
			System.out.println("Qual é a quantidade de partidas do jogo?\n");
			int quantPartidas = ler.nextInt();
			
			System.out.println(jogoDois.calcularTempoPartida(quantPartidas)+"\n ");
			System.out.println(jogoDois.exibirDetalhes()+"\n ");
			
		}else {	
			System.out.println("Somente responda JogoEletronico ou JogoFisico");
		}
	}
}
