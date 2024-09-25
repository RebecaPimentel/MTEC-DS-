
public class Professor implements Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String materia;
	
	public Professor (String nome, String endereco, String telefone, String materia) {
	this.nome=nome;
	this.endereco=endereco;
	this.telefone=telefone;
	this.materia = materia;
	}
	
	public String getNome() {
	return nome;
	}
	
	public void setNome (String nome) {
	this.nome=nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String setEndereco(String endereco) {
	return this.endereco=endereco;
	}
	
	public String getTelefone() {
	return telefone;
	}
	
	public String setTelefone (String telefone) {
	return this.telefone = telefone;
	}
	
	public String getMateria() {
	return materia;
	}
	
	public String setMateria(String materia) {
	return this.materia=materia;
	}
	
	public void apresentar() {
	System.out.println("Nome: " + this.getNome()); 
	System.out.println("Endereco: " + this.getEndereco()); 
	System.out.println("Telefone: " + this.getTelefone());
	System.out.println("Materia: " + this.getMateria());
	}
}