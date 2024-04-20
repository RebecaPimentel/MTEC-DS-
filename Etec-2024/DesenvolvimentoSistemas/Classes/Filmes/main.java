import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		
		String r;
		
		// 1º filme
		Filmes filme1 = new Filmes();
		
		filme1.setTitulo("Os Vingadores");
		filme1.setDuracaoEmMinutos(142);
		
		System.out.println("O filme "+filme1.getTitulo()+" possui: " +filme1.exibirDuracaoEmHoras()+ " horas\n");
		
		// 2º filme
		Filmes filme2 = new Filmes();
				
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
				
		System.out.println("O filme "+filme2.getTitulo()+" possui: " +filme2.exibirDuracaoEmHoras()+ " horas\n");
		
		
		// 3º filme
		Filmes filme3 = new Filmes();
					
		filme3.setTitulo("Avatar(2009)");
		filme3.setDuracaoEmMinutos(162);
						
		System.out.println("O filme "+filme3.getTitulo()+" possui: " +filme3.exibirDuracaoEmHoras()+ " horas\n");
			

		// 4º filme
		Filmes filme4 = new Filmes();
					
		filme4.setTitulo("Duna(2021)");
		filme4.setDuracaoEmMinutos(155);
						
		System.out.println("O filme "+filme4.getTitulo()+" possui: " +filme4.exibirDuracaoEmHoras()+ " horas\n");
		

		// 5º filme
		Filmes filme5 = new Filmes();
					
		filme5.setTitulo("Maze Runner: A Cura Mortal");
		filme5.setDuracaoEmMinutos(93);
						
		System.out.println("O filme "+filme5.getTitulo()+" possui: " +filme5.exibirDuracaoEmHoras()+ " horas\n");
		
		

		// 6º filme
		Filmes filme6 = new Filmes();
							
		filme6.setTitulo("Vermelho, Branco e Sangue Azul");
		filme6.setDuracaoEmMinutos(118);
							
		System.out.println("O filme "+filme6.getTitulo()+" possui: " +filme6.exibirDuracaoEmHoras()+ " horas\n");
		
		
		// 7º filme
		Filmes filme7 = new Filmes();
									
		filme7.setTitulo("Com Amor, Simon");
		filme7.setDuracaoEmMinutos(110);
									
		System.out.println("O filme "+filme7.getTitulo()+" possui: " +filme7.exibirDuracaoEmHoras()+ " horas\n");
		
		
		// 8º filme
		Filmes filme8 = new Filmes();
											
		filme8.setTitulo("Uma Garota de Muita Sorte");
		filme8.setDuracaoEmMinutos(115);
											
		System.out.println("O filme "+filme8.getTitulo()+" possui: " +filme8.exibirDuracaoEmHoras()+ " horas\n");
		
		
		// 9º filme
		Filmes filme9 = new Filmes();
												
		filme9.setTitulo("Onde Está Segunda?");
		filme9.setDuracaoEmMinutos(123);
													
		System.out.println("O filme "+filme9.getTitulo()+" possui: " +filme9.exibirDuracaoEmHoras()+ " horas\n");
		
		
		// 10º filme
		Filmes filme10 = new Filmes();
														
		filme10.setTitulo("Alguém Avisa?");
		filme10.setDuracaoEmMinutos(102);
															
		System.out.println("O filme "+filme10.getTitulo()+" possui: " +filme10.exibirDuracaoEmHoras()+ " horas\n\n\n");
		
		
		System.out.println("Os filmes em cartaz são "+filme1.getTitulo()+", "+filme2.getTitulo()+", "+filme3.getTitulo()+", "+filme4.getTitulo()+", "+filme5.getTitulo()+", "+filme6.getTitulo()+", "+filme7.getTitulo()+", "+filme8.getTitulo()+", "+filme9.getTitulo()+" e "+filme10.getTitulo()+".\n");
		
		
		
		System.out.println("Deseja ver os outros ultimos 40 filmes que estiveram em cartazes?");
		r = ler.next();
		if (r.equalsIgnoreCase("Sim")) {
			Informacoes.informacoes();
		} else {
			System.out.println("Volte sempre.");
		}
		
		ler.close();
		
	}
	
	
	

}
