/* Vetores
* 
*     Escreva um programa em Node.js que solicite ao usuário que insira 10 valores no vetor A. Em seguida,
*     o programa deve calcular o quadrado de cada valor inserido e armazená-los no vetor B. 
*     Por fim, o programa deve imprimir os quadrados dos valores inseridos no vetor B.
* 
*/

import http from 'http'

http.createServer((req, res) => {
    var vetorA = new Array() 
    var vetorB = new Array() 

    for(let i = 1; i<11; i++) {
        var numero = i
        vetorA.push(numero)
        vetorB.push(numero*numero)
    }

    res.write(`vetorA = `)
    res.write(` [ `)
    vetorA.forEach((element) => {
        res.write(`${element} `)
    });

    res.write(`]\n`)


    res.write(`vetorB = `)
    res.write(` [ `)
    vetorB.forEach((element) => {
        res.write(`${element} `)
    });

    res.write(`]`)

    res.end()  
}).listen(5000, () => {console.log('app rodando')})