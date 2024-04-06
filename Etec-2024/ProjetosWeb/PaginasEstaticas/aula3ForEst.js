/* For
* 
*     Criar um programa que conte de 1 a 100 e a cada múltiplo de 10 emita uma mensagem: "Múltiplo de 10".
* 
*/

import http from 'http'

http.createServer((req, res) => {
    
    for(let i = 0; i<101; i++) {
    
        if(i % 10 == 0) {
            res.write(`${i}, Multiplo de 10\n`)
        } else {
            res.write(`${i}\n`) 
        }
    }
    
    res.end()  
}).listen(5000, () => {console.log('app rodando')})