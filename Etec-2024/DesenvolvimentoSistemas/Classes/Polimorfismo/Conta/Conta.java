
public class Conta {
	private String nome;
	private String cpf; 
	private int numeroConta;
	private double saldo;
	
	public Conta(String nome,String cpf,int numeroConta, double saldo) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.numeroConta = numeroConta;
		 this.saldo = saldo;
	}
	
	public double depositar(double quantia) {
		this.saldo = this.saldo + quantia;
		return saldo;
	}
	
	public double sacar(double quantia) {
		if(quantia>saldo) {
			this.saldo = this.saldo - quantia;
			System.out.println("Seu saldo esta negativo");
			return saldo;
		}else {
			this.saldo = this.saldo - quantia;
			return saldo;
		}
		
	}
	
	public String imprimirSaldo () {
		String mensagem = "O Saldo atual é de: \n" + getSaldo();
		return mensagem;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	// GET e SET das informações pessoais
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
