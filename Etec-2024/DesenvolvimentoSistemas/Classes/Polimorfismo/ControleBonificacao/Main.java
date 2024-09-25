public class Main {
	public static void main(String[] args) { 
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Doni");
		f1.setCpf("44444.3333.4");
		f1.setSalario(2500);
		System.out.println(f1.getNome()); 
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		Gerente g1 = new Gerente();
		g1.setNome("PEDRO");
		g1.setCpf("32323232");
		g1.setSalario(2500);
		g1.setSenha(2222);
		System.out.println("----------------------------------------------");
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf()); 
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica (2222)); 
		Coodernador c1= new Coodernador();
		c1.setNome("Coord");
		c1.setCpf("32323232");
		c1.setSalario(3600);
		System.out.println("----------------------------------------------");
		System.out.println(c1.getNome());
		System.out.println(c1.getCpf());
		System.out.println(c1.getSalario());
		
		System.out.println("----------------------------------------------");
		ControleBonificacao control = new ControleBonificacao();
		
		control.registra(f1);
		
		control.registra(g1);
		
		control.registra(c1);
		
		System.out.println("Gastos com bonificação "+control.getSoma());
	}
}
