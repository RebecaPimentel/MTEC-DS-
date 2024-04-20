
public class Produto {

	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	// Nome //
	String getNome () {
		return this.nome;
	}
	
	void setNome (String nome) {
		 this.nome=nome;
	}
	
	
	
	// PrecoCusto
	double getPrecoCusto () {
		return this.precoCusto;
	}
		
	void setPrecoCusto (double precoCusto) {
		 this.precoCusto=precoCusto;
	}
	
	// PrecoVenda
		double getPrecoVenda () {
			return this.precoVenda;
		}
		
		void setPrecoVenda (double precoVenda) {
			 this.precoVenda=precoVenda;
			 if ( precoVenda< precoCusto) {
				 System.out.println("Aviso: senhor(a) "+nome+", o preço de venda é inferior ao preço da compra, você não terá lucro.");
			} else  if( precoVenda==precoCusto) {
				 System.out.println("\"Aviso: senhor(a) "+nome+", o preço de venda é igual ao preço da compra, você não terá lucro.\"");
			} else {
				 System.out.println("");
			}
			 this.precoVenda=precoVenda;
		}
		
		
		
	// Margem de lucro
	double getMargemLucro () {
		return this.margemLucro;
	}
		
	void setMargemLucro (double margemLucro) {
		 this.margemLucro=margemLucro;
	}
	
	
	double calcularMargemLucro () {
		this.margemLucro = this.precoVenda - this.precoCusto;
        	return this.margemLucro;
	}
	
	
	
	
	double calcularMargemLucroPorcentagem () {
		double	porc = (this.margemLucro/this.precoVenda)*100;
			 return porc;
	}

}
