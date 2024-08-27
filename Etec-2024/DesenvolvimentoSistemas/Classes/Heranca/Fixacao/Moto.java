
public class Moto extends Veiculo {
	
	public Moto (String modelo,double valorTabela,String cor,String combustivel) {
		super(modelo,valorTabela, cor, combustivel);
	}
	
	@Override
	public double calculaIpva () {
		double valor = this.getValorTabela()*0.02;
		return valor;
	}
}