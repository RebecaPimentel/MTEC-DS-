
/* Vetores
* 
*     Escreva um programa em Node.js que solicite ao usuário que insira 10 valores no vetor A. Em seguida,
*     o programa deve calcular o quadrado de cada valor inserido e armazená-los no vetor B. 
*     Por fim, o programa deve imprimir os quadrados dos valores inseridos no vetor B.
* 
*/
import chalk from "chalk";
import inquirer from "inquirer";

var vetorA = new Array() 
var vetorB = new Array() 

function utilizar(i) {
    if (i < 10) {
        inquirer.prompt([
            {  
                type: "input",
                name: "numero",
                message: `Digite o ${i+1}º valor do vetor A:`,
            }, 
        ])
        .then(function (answers) {
            const numero = parseInt(answers.numero);
            vetorA.push(numero);
            vetorB.push(numero*numero);
            return utilizar(i + 1);
        })
        .catch((error) => {
            console.log('Ocorreu um erro:', error);
        });
    } else {
        vetorB.forEach((element) => {
            console.log(element);
        });
    }
}
utilizar(0);

