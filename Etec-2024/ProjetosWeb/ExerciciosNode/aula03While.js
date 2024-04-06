/* While
* 
*     Criar um programa que calcule o fatorial de um número inteiro apresentado pelo usuário.
* 
*/

import chalk from "chalk";
import inquirer from "inquirer";


var i=0
var f=1
var r=1

inquirer.prompt([
    {  
        type: "input",
        name: "n",
        message: `Digite o número para ser feito o fatorial:`,
    }
])
.then(function (answers) {
    var n = parseInt(answers.n);
    f=n;
    var fatorial = '';

    while (n>=1) {
        r = r*n;
        n = n-1;
    }

    console.log(`O fatorial de ${f} é: ${r}`);
})
.catch((error) => {
    console.log('Ocorreu um erro:', error);
});
