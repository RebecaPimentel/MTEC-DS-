
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("Rafael", "Rua 10", "(11) 99999-2222", "2344"); aluno.apresentar();
		Professor professor = new Professor("Thayani", "Rua 3", "(11) 98888-2222", "ΤΡΑ"); professor.apresentar();
		
		//Interface não tem construtor e não pode ser instanciado //Pessoa pessoa = new Pessoa();
		
		Pessoa pessoa = new Professor ("Thayani", "Rua 3", "(11) 98888-2222", "ΤΡΑ");
		pessoa.apresentar();
		pessoa = new Aluno("Rafael", "Rua 10", "(11) 99999-2222", "2344");
		pessoa.apresentar();
	}
}
