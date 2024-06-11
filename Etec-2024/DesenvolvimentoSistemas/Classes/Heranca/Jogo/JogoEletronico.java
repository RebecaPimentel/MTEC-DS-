
public class JogoEletronico extends Jogo{
	private String plataforma;
	private String genero;
	
	public JogoEletronico (String nome, double preco, String distribuidora, String plataforma, String genero) {
		super(nome, preco, distribuidora);
		this.plataforma = plataforma;
		this.genero = genero;
	}
	
	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String jogarOnline (int jogadores) {
		String mensagem = "Jogando online com: " + jogadores + "jogadores.";
		return mensagem;
	}
	
	@Override
	public String exibirDetalhes() {	
		
			String mensagem = "Os dados da publicação são: "+getNome()+", "+getPreco()+", "+getDistribuidora()+", "+getPlataforma()+" e "+getGenero()+".";
			return mensagem;
		
	}
}
