
public class Serie extends Conteudo{
	private double duracao;
	private int quantEpisodios;
	private int quantTemps;
	
	public Serie (String titulo,String categoria, double duracao, int quantEpisodios, int quantTemps) {
		super(titulo, categoria);
		 this.duracao = duracao;
		 this.quantEpisodios = quantEpisodios;
		 this.quantTemps = quantTemps;
	}
	
	
	public String descricao() {
		String mensagem = "Titulo do filme: "+getTitulo()+"\n Categoria é: "+ getCategoria()+"\n Duração: "+getDuracao()+"\n Quantidade de episódios: "+getQuantEpisodios()+"\n Quantidade de temporadas: "+getQuantTemps();
		return mensagem;
	}


	public double getDuracao() {
		return duracao;
	}


	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}


	public int getQuantEpisodios() {
		return quantEpisodios;
	}


	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}


	public int getQuantTemps() {
		return quantTemps;
	}


	public void setQuantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
	
	

}

