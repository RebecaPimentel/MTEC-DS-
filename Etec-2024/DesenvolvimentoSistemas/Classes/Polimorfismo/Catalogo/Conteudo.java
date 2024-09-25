
public class Conteudo {

	private String titulo;
	private String categoria;
	
	public Conteudo(String titulo,String categoria) {
		 this.titulo = titulo;
		 this.categoria = categoria;
	}
	
	public String descricao() {
		String mensagem = "Titulo: "+getTitulo()+"\n Categoria é: "+ getCategoria();
		return mensagem;
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
	
	

}