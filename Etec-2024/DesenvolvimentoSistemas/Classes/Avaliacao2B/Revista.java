
public class Revista extends Publicacao{

	private int numEdicao;
	private String mesPublicacao;
	
	public Revista (String titulo, String autor , int anoPublicacao, int numEdicao, String mesPublicacao) {
        super( titulo, autor, anoPublicacao);
        this.numEdicao = numEdicao;
	    this.mesPublicacao = mesPublicacao;
    }
	
	// Métodos getters e setters
	
	public int getNumEdicao() {
        return numEdicao;
    }
 
	void setNumEdicao (int numEdicao) {
	 this.numEdicao=numEdicao;
	}
 
	public String getMesPublicacao() {
        return mesPublicacao;
    }
 
	void setMesPublicacao (String mesPublicacao) {
	 this.mesPublicacao=mesPublicacao;
	}
	
	
	// Sobreescrita do método
 
	@Override
	public void exibirDetalhes() {
		System.out.println("Edição:  " + numEdicao + "  Mês de publicação:  " + mesPublicacao);
	}
	
	public void exibirDetalhes(boolean incluirM) {
        if (incluirM) {
            System.out.println("Título: " + geTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + getAnoPublicacao() +
                     " \n Número da edição: " + numEdicao + "   Mês de publicação:  " + mesPublicacao );
        } else {
        	System.out.println("Título: " + geTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + getAnoPublicacao() +
                     "\n Número da edição: " + numEdicao );
        }
    }

}
