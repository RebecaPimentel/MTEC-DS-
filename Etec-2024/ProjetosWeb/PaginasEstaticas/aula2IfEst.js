/* If else
* 
*     Criar um programa que leia o salário de uma pessoa, calcule e apresente o valor do imposto de renda devido.
* 
*/

import http from 'http'

http.createServer((req, res) => {
    var imp = 0
    var sal = 2024

    if (sal< 1903.98) {
        imp=0;
        res.write(`seu imposto de renda é de:R$ ${imp}\n`)
        
    } else if(sal <=2826.65) {
        imp=sal/100*7.5-142.80;
        res.write(`seu imposto de renda é de:R$ ${imp}\n`)
        
    } else if(sal <=3751.05) {
        imp=sal/100*15.0-354.80;
        res.write(`seu imposto de renda é de:R$ ${imp}\n`)
        
    } else if(sal <= 4664.68) {
            imp=sal/100*22.5-636.13; 
            res.write(`seu imposto de renda é de:R$ ${imp}\n`)
            
    } else {
        imp = sal/100*27.5-869.36;
        res.write(`seu imposto de renda é de:R$ ${imp}\n`)
    }     

    res.end()  
}).listen(5000, () => {console.log('app rodando')})