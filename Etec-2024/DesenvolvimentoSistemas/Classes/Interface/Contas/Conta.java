public interface Conta {
    double depositar(double quantia);
    double sacar(double quantia);
    String verificar();
    
    String getNome();
    void setNome(String nome);
    
    String getCpf();
    void setCpf(String cpf);
    
    double getSaldo();
    void setSaldo(double saldo);
}