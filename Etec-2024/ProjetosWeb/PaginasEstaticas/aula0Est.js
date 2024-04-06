import http from 'http'

http.createServer((req, res) => {
    var num1 = 8
    var num2 = 2
    var resulAd
    resulAd = num1+num2
    res.write(`O resultado da adicão dos números ${num1} e ${num2}`)
    res.write(` = ${resulAd}\n`)

    var resulSub
    resulSub = num1-num2
    res.write(`O resultado da subtracão dos números ${num1} e ${num2}`)
    res.write(` = ${resulSub}\n`)

    var resulMulti
    resulMulti = num1*num2
    res.write(`O resultado da multiplicacão dos números ${num1} e ${num2}`)
    res.write(` = ${resulMulti}\n`)

    var resulDiv
    resulDiv = num1/num2
    res.write(`O resultado da Divisão dos números ${num1} e ${num2}`)
    res.write(` = ${resulDiv}\n`)



    res.end()  
}).listen(5000, () => {console.log('app rodando')})