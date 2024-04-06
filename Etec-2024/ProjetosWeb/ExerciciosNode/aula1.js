/* variaveis
*
* Criar um programa que leia o nome, o ano de nascimento e o ano atual, e ao final 
* apresente a seguinte mensagem: “FULANO, VOCÊ TEM X ANOS” onde FULANO é o nome do 
* usuário e X é a idade do mesmo.
*/ 

import chalk from "chalk";
import inquirer from "inquirer";

const questions =[
    {
        type: "input", 
        name: "nasc",
        message:"Insira sua data de nascimento: "
},
{
        type: "input",
        name: "anoAtual",
        message:"insira o ano atual: "
}]

inquirer.prompt(questions)
.then(answers => {
    const nasc = answers["nasc"];
    const anoAtual = parseInt(answers["anoAtual"]);
    let idade = anoAtual-nasc
    console.log(idade)
}); 





