

/********************************************************** */
import times from '../times.js';
const linha = document.querySelectorAll("tbody tr");

for (let i = 0; i < linha.length; i++) {
    const dados = linha[i].children;

    //function pontos()

    let imgElement = dados[1].querySelector('img');
    dados[0].textContent = i+1;
    imgElement.setAttribute("src", times[i].image);
    dados[2].textContent = times[i].club;
    dados[3].textContent = times[i].MP; 
    dados[4].textContent = times[i].W; 
    dados[5].textContent = times[i].D; 
    dados[6].textContent = times[i].L; 
    dados[7].textContent = times[i].GF; 
    dados[8].textContent = times[i].GA; 
    dados[9].textContent = times[i].GD; 
    var pts = times[i].W * 3 + times[i].D * 1;
    dados[10].textContent = pts
    var porc = pts/(times[i].MP * 3) * 100;
    dados[11].textContent = porc.toFixed(0);
}
