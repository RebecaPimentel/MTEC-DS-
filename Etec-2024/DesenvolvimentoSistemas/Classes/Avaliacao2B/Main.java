
public class Main {

	public static void main(String[] args) {
		
		 // Publicação
        Publicacao publi = new Publicacao("Turma da Mônica", "Mauricío de Souza", 1970);
        System.out.println("Detalhes da Publicação:");
        publi.exibirDetalhes(); 
        
        
        // Livros 
        Livro livro = new Livro("Turma da Mônica", "Mauricío de Souza", 1970, 123, "MSP");
        System.out.println("Detalhes do Livro:");
        livro.exibirDetalhes(); 
        
        Livro livro1 = new Livro("Alice no país das maravilhas", "Maria Isabel", 1875, 80, "MM");
        livro1.exibirDetalhes(true);
        

        // Revista
        Revista revista = new Revista("Turma da Mônica", "Mauricío de Souza", 1970, 8 , "Outubro");
        System.out.println("Detalhes da Revista:");
        revista.exibirDetalhes(); 
        
        Revista revista1 = new Revista("Cheias de charme", "Ana Fontes", 2002, 60, "G");
        revista1.exibirDetalhes(false);
		
	}

}
