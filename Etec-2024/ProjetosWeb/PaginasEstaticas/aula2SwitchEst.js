/* Switch
*
* criar um programa que leia o último número da placa de um veículo e informe 
* qual dia da semana o veículo  não pode circular em São Paulo.
*/

import http from 'http'

http.createServer((req, res) => {
    const p = 8
    
    switch (p) {
        case 1:
        case 2 :
            res.write(`Não circulam na segunda-feira`)
            break;
        case 3:
        case 4:
            res.write(`Não circulam na terça-feira`)
            break;
        case 5:
        case 6:
            res.write(`Não circulam na quarta-feira`)
            break;
        case 7:
        case 8:
            res.write(`Não circulam na quinta-feira`)
            break;
        case 9:
        case 0:
            res.write(`Não circulam na quinta-feira`)
            break;
        default:
            console.log("Data inválida")
            break;
    }     

    res.end()  
}).listen(5000, () => {console.log('app rodando')})