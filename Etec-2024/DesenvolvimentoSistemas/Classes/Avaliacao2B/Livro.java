
public class Livro extends Publicacao {

	private int numPaginas;
	private String editora;
	
	public Livro (String titulo, String autor , int anoPublicacao, int numPaginas, String editora ) {
        super( titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
	    this.editora = editora;
    }
	
	// Métodos getters e setters

	public int getNumPaginas() {
	        return numPaginas;
	    }
	 
	 void setNumPaginas (int numPaginas) {
		 this.numPaginas=numPaginas;
	}
	 
	 public String getEditora() {
	        return editora;
	    }
	 
	 void setEditora (String editora) {
		 this.editora=editora;
	}
	 
	// Sobreescrita do método
	 
	@Override
	public void exibirDetalhes() {
        System.out.println("Editora:  " + editora + "  Número de páginas:  " + numPaginas);
    }
	
	public void exibirDetalhes(boolean incluirE) {
        if (incluirE) {
            System.out.println("Título: " + geTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + getAnoPublicacao() +
                    ", \n Editora: " + editora + ", Número de páginas: " + numPaginas + "\n");
        } else {
            System.out.println("Título: " + geTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + getAnoPublicacao() +
                    ", \n Número de páginas: " + numPaginas + "\n");
        }
    }
	
	
}
