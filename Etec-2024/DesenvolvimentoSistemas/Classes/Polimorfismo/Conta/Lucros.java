
public class Lucros extends ContaPoupanca{
	public Lucros(String nome, String cpf, int numeroConta, double saldo) {
        super(nome, cpf, numeroConta, saldo);
    }
	
	public double registra () {
		double lucro = getSaldo() * getPercentualRendimento();
		return lucro;
		
	}
	
    
}
