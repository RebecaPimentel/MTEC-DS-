
public class Main {
    public static void main(String[] args) {
    	
        // cliente comum
        Cliente clienteComum = new Cliente("Felipe", 30, "Cidade Tiradentes", 100.0, 0.0);
        System.out.println("Detalhes do pedido do cliente comum:");
        clienteComum.calculaDesconto(); 

        System.out.println();

        // cliente premium
        ClientePremium clientePremium = new ClientePremium("Amanda", 20, "Itaquera", 200.0, 0.0);
        System.out.println("Detalhes do pedido do cliente premium:");
        clientePremium.calculaDesconto(); 
        
    }
}
