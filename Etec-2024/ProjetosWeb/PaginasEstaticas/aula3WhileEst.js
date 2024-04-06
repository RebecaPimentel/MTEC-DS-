/* While
* 
*     Criar um programa que calcule o fatorial de um número inteiro apresentado pelo usuário.
* 
*/

import http from 'http'

http.createServer((req, res) => {
    var f=1
    var r=1

    var n = 5
    f=n;

    while (n>=1) {
        r = r*n;
        n = n-1;
    }

    res.write(`O fatorial de ${f} e: ${r}\n`);

    while(f>=1) {
        if(f<=1) {
            res.write(`${f}`)
        } else {
            res.write(`${f} * `)
        }
        f=f-1
    }
    res.write(` = ${r}`)    
    res.end()  
}).listen(5000, () => {console.log('app rodando')})