
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		
		String r;
		
		// 1º filme
		Filme filme1 = new Filme("Os Vingadores","Ação",142);	
		System.out.println(filme1.descricao()+"\n");
		
		// 2º filme
		Filme filme2 = new Filme("Hotel Transilvânia","Comédia",93);			
		System.out.println(filme2.descricao()+"\n");
		
		
		// 3º filme
		Filme filme3 = new Filme("Avatar(2009)","FIcção ciêntifica",162);			
		System.out.println(filme3.descricao()+"\n");	

		// 4º filme
		Filme filme4 = new Filme("Duna(2021)", "FIcção ciêntifica", 155);
		System.out.println(filme4.descricao()+"\n");
		
		// 5º filme
		Filme filme5 = new Filme("Vermelho, Branco e Sangue Azul", "Romance", 118);
		System.out.println(filme5.descricao()+"\n");

		// 6º Série
		Serie serie6 = new Serie("Era Uma Vez", "Fantasia",43,128,7);
		System.out.println(serie6.descricao()+"\n");
		
		// 7º Série
		Serie serie7 = new Serie("Doctor Who", "Ficção ciêntifica",45,694,26);
		System.out.println(serie7.descricao()+"\n");
		
		// 8º Série
		Serie serie8 = new Serie("A Casa da Coruja", "Aventura",22,43,3);
		System.out.println(serie8.descricao()+"\n");				
		
		// 9º Série
		Serie serie9 = new Serie("Os Thundermans", "Sitcom",23,104,4);
		System.out.println(serie9.descricao()+"\n");
		
		// 10º Série
		Serie serie10 = new Serie("O Mentalista", "Drama",43,151,7);
		System.out.println(serie10.descricao()+"\n");
		
		
		System.out.println("Deseja ver os outros ultimos 40 filmes que estiveram em cartazes?");
		r = ler.next();
		if (r.equalsIgnoreCase("Sim")) {
			Catalogo.Catalogo();
		} else {
			System.out.println("Deseja ver as outras ultimas 40 Series que estiveram em cartazes?");
			r = ler.next();
			if (r.equalsIgnoreCase("Sim")) {
				Catalogo.CatalogoSerie();
			} else {
				System.out.println("Volte sempre.");
			}
		}
		
		ler.close();
		
	}
	
	
	

}
