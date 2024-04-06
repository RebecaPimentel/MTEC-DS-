/* Modulos
* 
*   Escreva um programa em Node.js que permita ao usuário converter entre Fahrenheit e Celsius. O programa deve fornecer duas opções:
*
*   Converter de Fahrenheit para Celsius.
*   Converter de Celsius para Fahrenheit.
* 
*/

import chalk from "chalk";
import inquirer from "inquirer";

import fahrenheit from "./fahrenheit.js";
import celsius from "./celsius.js";

inquirer.prompt([
    {
        type: "input",
        name: "numero",
        message: `Digite o valor a ser convertido:`,
    },
    {  
        type: "list",
        name: "conv",
        message: `Que tipo de conversão você deseja?`,
        choices: ["Converter de Fahrenheit para Celsiust", "Converter de Celsius para Fahrenheit"]
    }
])
.then(function (answers) {
    const numero = parseInt(answers.numero);
    switch(answers.conv) {
        case "Converter de Celsius para Fahrenheit":
            console.log(fahrenheit(numero))
            break;
        case "Converter de Fahrenheit para Celsiust":
            console.log(celsius(numero))
            break;
        default:
            console.log("Error")
    }e
})
.catch((error) => {
    console.log('Ocorreu um erro:', error);
});
