/* variaveis
*
* Criar um programa que leia o nome, o ano de nascimento e o ano atual, e ao final 
* apresente a seguinte mensagem: “FULANO, VOCÊ TEM X ANOS” onde FULANO é o nome do 
* usuário e X é a idade do mesmo.
*/ 

import http from 'http'

http.createServer((req, res) => {
    var anoNasc = 2002
    var anoAtual = 2024
    var idade
    idade = anoAtual-anoNasc

    res.write(`Ano de nascimento: ${anoNasc}\n`)
    res.write(`Ano atual: ${anoAtual}\n`)
    res.write(`Você tem:  ${idade} anos` )

    res.end()  
}).listen(5000, () => {console.log('app rodando')})