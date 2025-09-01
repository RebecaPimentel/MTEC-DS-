const Conta = require('./Conta');  // Importando a classe Conta

class ContaCorrente extends Conta {
  sacar(agencia, numero, senha, valor) {
    const taxa = 20;
    if (!this.autenticar(agencia, numero, senha)) {
      throw new Error('Autenticação inválida');
    }
    const total = valor + taxa;
    if (total > this.saldo) {
      throw new Error('Saldo insuficiente para saque e taxa');
    }
    this.saldo -= total;
  }
}

module.exports = ContaCorrente;
