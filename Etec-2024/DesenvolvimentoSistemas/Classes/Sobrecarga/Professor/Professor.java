
public class Professor {
	private int codigo;
	private String nome;
	private String disciplina;
	private String turno;
	

	
	public Professor( int cod, String nom) {
		 this.codigo = cod;
		 this.nome = nom;
	}
	
	public Professor( int cod, String nom, String dis, String tur) {
		 this.codigo = cod;
		 this.nome = nom;
		 this.disciplina = dis;
		 this.turno = tur;
	}
	
	
	int getCodigo () {
		return this.codigo;
	}
	
	String getNome () {
		return this.nome;
	}
	
	String getDisciplina () {
		return this.disciplina;
	}
	String getTurno () {
		return this.turno;
	}

}


