
public class ContaCorrente{
	private double tarifaMensal;
	private int m;
	
	public ContaCorrente(int m) {
        this.m = m;
        tarifaMensal = 28.00;
    }
	
	public double quantiadadePagar() {
        double tarifa = m * tarifaMensal;
        return tarifa;
    }
}
