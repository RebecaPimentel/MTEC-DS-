const { Titular } = require('../model/Titular.js');

beforeAll(() => {
  Titular.gerarTitulares();  // Gera os titulares antes de rodar os testes
});

test('Testar tamanho da lista de titulares', function () {
  expect(Titular.titulares.length).toBe(20);
});

test('Testar as chaves do primeiro titular', function () {
  expect(Titular.titulares[0]).toHaveProperty('nome');
  expect(Titular.titulares[0]).toHaveProperty('cpf');
  expect(Titular.titulares[0]).toHaveProperty('endereco');
  expect(Titular.titulares[0]).toHaveProperty('telefone');
  expect(Titular.titulares[0]).toHaveProperty('email');
  expect(Titular.titulares[0]).toHaveProperty('dataNasc');
});

test('Testar os valores do primeiro titular', function () {
  expect(Titular.titulares[0]).toHaveProperty('nome', "Titular 1");
  expect(Titular.titulares[0]).toHaveProperty('cpf', '123.456.789-00');
  expect(Titular.titulares[0]).toHaveProperty('endereco', 'Rua 1');
  expect(Titular.titulares[0]).toHaveProperty('telefone', '11 90000-0000');
  expect(Titular.titulares[0]).toHaveProperty('email', 'email0@exemplo.com');
  expect(Titular.titulares[0]).toHaveProperty('dataNasc', '01.01.1990');
});
