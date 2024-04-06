/* Do...While
* 
*     Criar um programa que apresente todos os números pares de 0 a 500
* 
*/

import http from 'http'

http.createServer((req, res) => {
    var cont = 0
    
    do {

        res.write(`${cont}\n`)
        cont = cont+2;
        
    } while (cont <501);

    res.end()  
}).listen(5000, () => {console.log('app rodando')})