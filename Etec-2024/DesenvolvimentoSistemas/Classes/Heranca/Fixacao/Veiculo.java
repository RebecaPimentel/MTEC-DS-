
public class Veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	
	public Veiculo(String modelo,double valorTabela,String cor,String combustivel) {
		 this.modelo = modelo;
		 this.valorTabela = valorTabela;
		 this.cor = cor;
		 this.combustivel = combustivel;
		 this.ipva = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValorTabela() {
		return valorTabela;
	}

	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	public double calculaIpva () {
		double valor = this.getValorTabela()*0.00;
		return valor;
	}
	
	public String imprimirFicha () {
		String mensagem = "Os dados do veiculo são: \n Modelo: "+getModelo()+"\n ValorTabela:"+getValorTabela()+"\n Cor:"+getCor()+"\n Combustivel:"+getCombustivel()+"\n Ipva: "+getIpva();
		return mensagem;
	}
}
