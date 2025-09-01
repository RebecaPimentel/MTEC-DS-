class Titular {
    static titulares = []; // Array para armazenar os titulares
  
    static gerarTitulares() {
      // Criando 20 titulares fictícios
      for (let i = 0; i < 20; i++) {
        Titular.titulares.push({
          nome: `Titular ${i + 1}`,
          cpf: `123.456.789-0${i}`,
          endereco: `Rua ${i + 1}`,
          telefone: `11 90000-000${i}`,
          email: `email${i}@exemplo.com`,
          dataNasc: `01.01.19${i + 90}`
        });
      }
    }
  }
  
  module.exports = { Titular };
  