/* Switch
*
* criar um programa que leia o último número da placa de um veículo e informe 
* qual dia da semana o veículo  não pode circular em São Paulo.
*/ 

import chalk from "chalk";
import inquirer from "inquirer";

const question =[
    {
        type: "input",
        name: "placa",
        message:"digite o último número da placa: ",
}
]

inquirer.prompt(question).then(answers => {
    const p = parseInt(answers.placa);

    switch (p) {
        case 1:
        case 2 :
            console.log("Não circulam na segunda-feira")
            break;
        case 3:
        case 4:
            console.log("Não circulam na terça-feira")
            break;
        case 5:
        case 6:
            console.log("Não circulam na quarta-feira")
            break;
        case 7:
        case 8:
            console.log("Não circulam na quinta-feira")
            break;
        case 9:
        case 0:
            console.log("Não circulam na quinta-feira")
            break;
        default:
            console.log("Data inválida")
            break;
    }
});

  



