public class Funcionario {
	private String nome;
	private String cpf; 
	protected int salario;
	
	public String getNome() { return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	 //M�todo que retorna o valor da bonifca��o do funcionario 
		public double getBonificacao() {
			return salario * 0.10;
	}

}