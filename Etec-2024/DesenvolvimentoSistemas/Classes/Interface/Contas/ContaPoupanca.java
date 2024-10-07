public class ContaPoupanca implements Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private double percentualRendimento;

    public ContaPoupanca(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.percentualRendimento = 0.01;
    }

    @Override
    public double depositar(double quantia) {
        this.saldo += quantia;
        return saldo;
    }

    @Override
    public double sacar(double quantia) {
        if (quantia > saldo) {
            saldo -= quantia;
            System.out.println("Seu saldo está negativo");
        } else {
            saldo -= quantia;
        }
        return saldo;
    }

    @Override
    public String verificar() {
        return "O Saldo atual é de: \n" + saldo;
    }

    public double atualizarSaldo() {
        saldo += saldo * percentualRendimento;
        return saldo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getPercentualRendimento() {
        return percentualRendimento;
    }
}
