/* Funções
* 
*     Escreva um programa em Node.js que solicite ao usuário que insira um número.
*     Em seguida, o programa deve calcular a tabuada desse número, de 0 a 10, e imprimir os resultados.
* 
*/

import chalk from "chalk";
import inquirer from "inquirer";

function tabuada(numero){
    var tabuada = new Array(); 
    for (let i = 0; i <= 10; i++) {
        tabuada.push(`${numero} x ${i} = ${numero * i}`);
    }
    return tabuada;
}

inquirer.prompt([
    {
        type: "input",
        name: "numero",
        message: `Digite o número:`,
    }, 
])
.then(function (answers){
    const numero = parseInt(answers.numero);
    console.log(tabuada(numero));
})
.catch((error) => {
    console.log('Ocorreu um erro:', error);
});
