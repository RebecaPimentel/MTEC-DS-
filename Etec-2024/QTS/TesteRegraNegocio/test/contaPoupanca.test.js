const ContaPoupanca = require('../model/ContaPoupanca');
 
describe('ContaPoupanca', () => {
  let cp;
 
  beforeEach(() => {
    cp = new ContaPoupanca('001', '1234', 'senha123', 500);
  });
 
  test('herda autenticação da Conta base', () => {
    expect(cp.autenticar('001', '1234', 'senha123')).toBe(true);
  });
 
  test('herda consulta de saldo', () => {
    expect(cp.consultarSaldo('001', '1234', 'senha123')).toBe(500);
  });
 
  test('herda método de saque sem taxa', () => {
    cp.sacar('001', '1234', 'senha123', 200);
    expect(cp.consultarSaldo('001', '1234', 'senha123')).toBe(300);
  });
 
  test('herda depósito normalmente', () => {
    cp.depositar('001', '1234', 'senha123', 100);
    expect(cp.consultarSaldo('001', '1234', 'senha123')).toBe(600);
  });
});