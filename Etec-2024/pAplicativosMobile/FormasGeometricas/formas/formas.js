
/* Formas
* 
*     
*/


const button = document.querySelector("button");
const img = document.querySelector("img");
const input = document.querySelector("#n");

const nomeElement = document.querySelector(".nomes");
const ladoElement = document.querySelector(".lado");
const arestaElement = document.querySelector(".aresta");
const verticeElement = document.querySelector(".vertice");

button.onclick = (event) => {
  event.preventDefault();

  const dado = Number(input.value);

  if (dado === 0) {
    img.setAttribute("src", "imagens/Formas/nulo.png");
    nomeElement.textContent = "Nome";
    ladoElement.textContent = "0";
    arestaElement.textContent = "0";
    verticeElement.textContent = "0";

  } else if (dado === 3) {
    img.setAttribute("src", "imagens/Formas/triangulo.png");
    nomeElement.textContent = "Triangulo";
    ladoElement.textContent = "3";
    arestaElement.textContent = "3";
    verticeElement.textContent = "3";

  } else if (dado === 4) {
    img.setAttribute("src", "imagens/Formas/quadrado.png");
    nomeElement.textContent = "Quadrado";
    ladoElement.textContent = "4";
    arestaElement.textContent = "4";
    verticeElement.textContent = "4";

  } else if (dado === 5) {
    img.setAttribute("src", "imagens/Formas/pentagono.png");
    nomeElement.textContent = "Pentagono";
    ladoElement.textContent = "5";
    arestaElement.textContent = "5";
    verticeElement.textContent = "5";

  } else if (dado === 6) {
    img.setAttribute("src", "imagens/Formas/hexagono.png");
    nomeElement.textContent = "Hexagono";
    ladoElement.textContent = "6";
    arestaElement.textContent = "6";
    verticeElement.textContent = "6";

  } else if (dado === 7) {
    img.setAttribute("src", "imagens/Formas/heptagono.png");
    nomeElement.textContent = "Heptagono";
    ladoElement.textContent = "7";
    arestaElement.textContent = "7";
    verticeElement.textContent = "7";

  } else if (dado === 8) {
    img.setAttribute("src", "imagens/Formas/octagon.png");
    nomeElement.textContent = "Octagono";
    ladoElement.textContent = "8";
    arestaElement.textContent = "8";
    verticeElement.textContent = "8";

  } else if (dado === 9) {
    img.setAttribute("src", "imagens/Formas/eneagono.png");
    nomeElement.textContent = "Eneagono";
    ladoElement.textContent = "9";
    arestaElement.textContent = "9";
    verticeElement.textContent = "9";

  } else if (dado === 10) {
    img.setAttribute("src", "imagens/Formas/decagono.png");
    nomeElement.textContent = "Decagono";
    ladoElement.textContent = "10";
    arestaElement.textContent = "10";
    verticeElement.textContent = "10";

  } else {
    img.setAttribute("src", "imagens/Formas/nulo.png");
    nomeElement.textContent = "Nome";
    ladoElement.textContent = "0";
    arestaElement.textContent = "0";
    verticeElement.textContent = "0";
  }
};

