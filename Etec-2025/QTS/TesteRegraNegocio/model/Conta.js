class Conta {
  constructor(agencia, numero, senha, saldo = 0) {
    this.agencia = agencia;
    this.numero = numero;
    this.senha = senha;
    this.saldo = saldo;
  }

  autenticar(agencia, numero, senha) {
    return (
      this.agencia === agencia &&
      this.numero === numero &&
      this.senha === senha
    );
  }

  consultarSaldo(agencia, numero, senha) {
    if (!this.autenticar(agencia, numero, senha)) {
      throw new Error('Autenticação inválida');
    }
    return this.saldo;
  }

  sacar(agencia, numero, senha, valor) {
    if (!this.autenticar(agencia, numero, senha)) {
      throw new Error('Autenticação inválida');
    }
    if (valor > this.saldo) {
      throw new Error('Saldo insuficiente');
    }
    this.saldo -= valor;
  }

  depositar(agencia, numero, senha, valor) {
    if (!this.autenticar(agencia, numero, senha)) {
      throw new Error('Autenticação inválida');
    }
    this.saldo += valor;
  }
}

module.exports = Conta;