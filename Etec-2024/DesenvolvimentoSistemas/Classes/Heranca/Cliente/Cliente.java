public class Cliente {
	
    private String nome;
    private int idade;
    private String endereco;
    private double valor_pedido;
    private double valor_promocional;

    public Cliente(String nome, int idade, String endereco, double valor_pedido, double valor_promocional) {
    	
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.valor_pedido = valor_pedido;
        this.valor_promocional = valor_promocional;
        
    }

    public String getNome() {
        return nome;
    }

    public double getValor_pedido() {
        return valor_pedido;
    }

    public double getValor_promocional() {
        return valor_promocional;
    }

    public void calculaDesconto() {
        double desconto = valor_pedido * 0.1;
        double valorDesconto = valor_pedido - desconto;
        System.out.println(nome + " tem direito a um desconto de 10%: R$" + desconto);
        System.out.println("Valor do pedido com desconto: R$" + valorDesconto);
    }
}


