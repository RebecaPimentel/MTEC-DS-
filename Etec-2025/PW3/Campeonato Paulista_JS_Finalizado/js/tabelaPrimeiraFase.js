function criarQuadrante() {
    return `
        <div class="quadrante">
          <div class="classes">
            <h1>Grupo A</h1>
          </div>
        </div>
    `;
}
function criarVariosQuadrantes(qtd) {
    let conteudo = '';
    for (let i = 0; i < qtd; i++) {
        conteudo += criarQuadrante();
    }
    return conteudo;
}
const tabela = document.querySelector('.tabelas');
tabela.innerHTML = criarVariosQuadrantes(4);

/********************************************************** */

function criarTabelas() {
    return `
      <table border="1">
        <thead>
          <tr>
            <th>Posição</th>
            <th>Brasão</th>
            <th>Time</th>
            <th>MP</th>
            <th>W</th>
            <th>D</th>
            <th>L</th>
            <th>GF</th>
            <th>GA</th>
            <th>GD</th>
            <th>Pts</th>
            <th>%</th>
          </tr>
        </thead>
        <tbody></tbody>
      </table>
    `;
}

// Para os 4 quadrantes
const quadrantes = document.querySelectorAll('.quadrante');

quadrantes.forEach((quadrante, index) => {
// Adiciona a tabela HTML dentro de cada quadrante
    quadrante.innerHTML = criarTabelas();
});

/********************************************************** */

function criarTBody() {
    return `
        <tr>
            <td>1</td> <!-- Posição -->
            <td><img src="" alt=""></td>
            <td></td> <!-- Club -->
            <td></td> <!-- MP -->
            <td></td> <!-- W -->
            <td></td> <!-- D -->
            <td></td> <!-- L -->
            <td></td> <!-- GF -->
            <td></td> <!-- GA -->
            <td></td> <!-- GD -->
            <td></td> <!-- Pts -->
            <td></td>
        </tr>
    `;
}

const tbodys = document.querySelectorAll('tbody');

tbodys.forEach((tbody, index) => {
    let linhas = '';
    for (let i = 1; i <= 4; i++) {
      linhas += criarTBody(i);
    }
    tbody.innerHTML = linhas;
  });