
public class ClientePremium extends Cliente {
	
	public ClientePremium(String nome, int idade, String endereco, double valor_pedido, double valor_promocional) {
        super(nome, idade, endereco, valor_pedido, valor_promocional);
    }

    @Override
    public void calculaDesconto() {
        double desconto = getValor_pedido() * 0.15;
        double valorDesconto = getValor_pedido() - desconto;
        System.out.println(getNome() + " tem direito a um desconto de 15%: R$" + desconto);
        System.out.println("Valor do pedido com desconto: R$" + valorDesconto);
    }
    
}


