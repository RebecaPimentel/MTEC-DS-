/* Funções
* 
*     Escreva um programa em Node.js que solicite ao usuário que insira um número.
*     Em seguida, o programa deve calcular a tabuada desse número, de 0 a 10, e imprimir os resultados.
* 
*/

import http from 'http'

http.createServer((req, res) => {
    
    function tabuada(numero){
        var tabuada = new Array(); 
        for (let i = 0; i <= 10; i++) {
            tabuada.push(`${numero} x ${i} = ${numero * i}`);
        }
        return tabuada;
    }

    const numero = 5
    const resultados = tabuada(numero);

    resultados.forEach((element) => {
        res.write(`${element}\n`);
    });
    
    res.end()  
}).listen(5000, () => {console.log('app rodando')})