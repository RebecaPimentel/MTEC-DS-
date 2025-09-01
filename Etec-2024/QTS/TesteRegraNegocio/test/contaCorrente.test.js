const Conta = require('../model/Conta'); // Importando Conta
const ContaCorrente = require('../model/ContaCorrente'); 

describe('ContaCorrente', () => {
  let cc;

  beforeEach(() => {
    cc = new ContaCorrente('001', '1234', 'senha123', 1000);
  });

  test('falha ao sacar quando saldo cobre apenas o valor, mas não a taxa', () => {
    expect(() => {
      cc.sacar('001', '1234', 'senha123', 990); 
    }).toThrow('Saldo insuficiente para saque e taxa');
  });

  test('saca com sucesso e aplica taxa corretamente', () => {
    cc.sacar('001', '1234', 'senha123', 200); 
    expect(cc.consultarSaldo('001', '1234', 'senha123')).toBe(780); 
  });
});
