const fases = ['PRIMEIRA FASE', 'QUARTAS DE FINAL', 'SEMIFINAL' ,'FINAL'];

const btnEsquerda = document.querySelector('#btnEsquerda');
const btnDireita = document.querySelector('#btnDireita');
const tituloPrim = document.querySelector('.tituloPrim');

let i = 0;
btnDireita.addEventListener('click', () => {
  if (i < fases.length - 1) i++;
  tituloPrim.textContent = fases[i]; 
});

btnEsquerda.addEventListener('click', () => {
  if (i > 0) {
    i--;
    tituloPrim.textContent = fases[i];
  }
});