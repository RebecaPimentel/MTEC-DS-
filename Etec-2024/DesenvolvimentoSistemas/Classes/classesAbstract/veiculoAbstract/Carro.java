
public class Carro extends Veiculo {
	
	public Carro (String modelo,double valorTabela,String cor,String combustivel) {
		super(modelo,valorTabela, cor, combustivel);
	}
	
	@Override
	public double calculaIpva () {
		double valor = this.getValorTabela()*0.04;
		return valor;
	}

}