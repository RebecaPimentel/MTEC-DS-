const Conta = require('../model/Conta');
 
describe('Conta (classe base)', () => {
  let conta;
 
  beforeEach(() => {
    conta = new Conta('001', '1234', 'senha123', 1000); // exemplo de construtor
  });
 
  test('autentica com dados corretos', () => {
    expect(conta.autenticar('001', '1234', 'senha123')).toBe(true);
  });
 
  test('falha ao autenticar com dados incorretos', () => {
    expect(conta.autenticar('001', '1234', 'senhaErrada')).toBe(false);
  });
 
  test('consulta saldo com credenciais válidas', () => {
    expect(conta.consultarSaldo('001', '1234', 'senha123')).toBe(1000);
  });
 
  test('saca valor menor ou igual ao saldo', () => {
    conta.sacar('001', '1234', 'senha123', 200);
    expect(conta.consultarSaldo('001', '1234', 'senha123')).toBe(800);
  });
 
  test('falha ao sacar valor maior que o saldo', () => {
    expect(() => {
      conta.sacar('001', '1234', 'senha123', 2000);
    }).toThrow('Saldo insuficiente');
  });
 
  test('depositar valor aumenta o saldo', () => {
    conta.depositar('001', '1234', 'senha123', 500);
    expect(conta.consultarSaldo('001', '1234', 'senha123')).toBe(1500);
  });
});