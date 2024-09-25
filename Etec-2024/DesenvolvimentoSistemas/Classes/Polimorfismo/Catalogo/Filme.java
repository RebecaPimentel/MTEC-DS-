
public class Filme extends Conteudo{
	private double duracaoEmMinutos;
	
	public Filme (String titulo,String categoria, double duracaoEmMinutos) {
		super(titulo, categoria);
		 this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	// duracaoEmMinutos
	double getDuracaoEmMinutos () {
		return this.duracaoEmMinutos;
	}
		
	void setDuracaoEmMinutos (double duracaoEmMinutos) {
		this.duracaoEmMinutos=duracaoEmMinutos;	
	}
	
	
	public String descricao() {
		String mensagem = "Titulo do filme: "+getTitulo()+"\n Categoria �: "+ getCategoria()+"\n Dura��o em minutos: "+getDuracaoEmMinutos();
		return mensagem;
	}
	
	

}

