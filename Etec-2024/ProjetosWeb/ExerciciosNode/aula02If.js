/* If else
* 
*     Criar um programa que leia o salário de uma pessoa, calcule e apresente o valor do imposto de renda devido.
* 
*/

import chalk from "chalk";
import inquirer from "inquirer";


var imp

inquirer.prompt([
    {  
        type: "input",
        name: "sal",
        message: `Qual o seu salário:`,
    }
])
.then(function (answers) {
    var sal = parseFloat(answers.sal);

    if (sal<1903.98) {
        imp=0;
        console.log("seu imposto de renda é de:R$",imp);
        
    } else if(sal<=2826.65) {
        imp=sal/100*7.5-142.80;
        console.log("seu imposto de renda é de:R$",imp);
        
    } else if(sal<=3751.05) {
        imp=sal/100*15.0-354.80;
        console.log("seu imposto de renda é de:R$",imp);
        
    } else if(sal<= 4664.68) {
            imp=sal/100*22.5-636.13; 
            console.log("seu imposto de renda é de:R$",imp);
            
    } else {
        imp=sal/100*27.5-869.36;
        console.log("seu imposto de renda é de:R$",imp);
    }     


})
.catch((error) => {
    console.log('Ocorreu um erro:', error);
});
