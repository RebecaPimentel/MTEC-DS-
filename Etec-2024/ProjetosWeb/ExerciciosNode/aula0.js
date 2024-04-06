/* ferramentas
*
* Criar um programa que leia dois numeros e pregunte ao usuario qual equação ele deseja fazer e depois apresente
*/ 

import chalk from "chalk";
import inquirer from "inquirer";

  inquirer.prompt([
    {
        type: "input", 
        name: "num1",
        message:"Insira o 1º numero : "
    },
    {
        type: "input", 
        name: "num2",
        message:"Insira o 2º numero : "
    },
    {
        type: "list", 
        name: "equaçao",
        choices: ["adição", "subtração", "multiplicação", "divisão", "SAIR"]
    }
])
.then((answers) => {
    var num1 = parseInt(answers.num1);
    var num2 = parseInt(answers.num2);
    var resul
    switch (answers["equaçao"]) {
        case "adição":
            resul = num1+num2
            console.log(resul)
            break;
        case "subtração":
            resul = num1-num2
            console.log(resul)
            break;
        case "multiplicação":
            resul = num1*num2
            console.log(resul)
            break;
        case "divisão":
            resul = num1/num2
            console.log(resul)
            break;
        case "SAIR":
            console.log(chalk.bgGreen.bold("Obrigado"))
            break;
        default:
            console.log(chalk.bgRed.bold("Digite uma opção válida"))
            break;
    }
})
.catch((error) => {
    console.log(error)
  });
