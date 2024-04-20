
public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	
	double salarioLiquido () {
		 double salario = salarioBruto-imposto;
		 return salario;
	}
	
	double aumentoSalario (double aumento ) {
		
		salarioBruto = salarioBruto+aumento;
		 return salarioBruto;
	}
}