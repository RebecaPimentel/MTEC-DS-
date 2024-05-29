
public class Publicacao {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	// Construtor
	
	 public Publicacao(String titulo, String autor, int anoPublicacao ) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.anoPublicacao = anoPublicacao;
	    }
	
	 // Métodos getters e setters
	 
	 public String geTitulo() {
	        return titulo;
	    }
	 
	 void setTitulo (String titulo) {
		 this.titulo=titulo;
	}
	 
	 
	 public String getAutor() {
	        return autor;
	    }
	 
	 void setAutor (String autor) {
		 this.autor=autor;
	}
	 
	 
	 public int getAnoPublicacao() {
	        return anoPublicacao;
	    }
	 
	 void setAnoPublicacao (int anoPublicacao) {
		 this.anoPublicacao=anoPublicacao;
	}
	 
	 
	// Método
	 
	 public void exibirDetalhes() {
	        System.out.println("Titulo:  " + titulo + "  Autor:  " + autor + "  Data de publicação:  " + anoPublicacao);
	    }
}


