
public class ContaPoupanca extends Conta {
    private double percentualRendimento;

    public ContaPoupanca(String nome, String cpf, int numeroConta, double saldo) {
        super(nome, cpf, numeroConta, saldo);
        this.percentualRendimento = 0.01;
    }

    public double atualizarSaldo() {
        double saldoAtualizado = getSaldo() + (getSaldo() * percentualRendimento);
        setSaldo(saldoAtualizado);
        return getSaldo();
    }
    
    public double getPercentualRendimento() {
        return percentualRendimento;
    }
}
