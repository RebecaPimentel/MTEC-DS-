
const { Conta, gerarContas } = require ("./model/Conta.js");
const {ContaCorrente} = require ('./model/ContaCorrente.js');

const express = require ('express');
gerarContas()

const app = express()

app.use(
    express.urlencoded({
        extended: true
    })
)

app.use(express.json())

app.get('/contas', function (req, res){
    let contas = Conta.contas
    res.json(Conta.contas)
})

app.post('/consultar_saldo', function (req, res){
      //obter da requisição os dados
     let agencia = parseInt(req.body.agencia)
     let numero = parseInt(req.body.numero)
     let senha = parseInt(req.body.senha)
     
     let retorno = Conta.autenticar(agencia, numero, senha)
    //console.log(retorno)
     try {
        let resp = (retorno.conta).visualizarSaldo(retorno.acesso)
        res.json(
            {
                "msg": "Seu valor em saldo é: ", 
                "valor" : "R$ " + resp.saldo
            })
     } catch (error) {
        res.json(
            {
                "msg": "Acesso negado ",
            })
     }
 })

app.get('/contas/:acima', (req, res)=>{
    let acima = parseFloat(req.params.acima)
    
    let contas = Conta.contas
    console.log(contas)
    let contasAcima = contas.filter((conta) => conta.saldo > acima )
    
    res.json(contasAcima)
})

app.post('/conta/saque', (req, res)=>{
      //obter da requisição os dados
      let agencia = parseInt(req.body.agencia)
      let numero = parseInt(req.body.numero)
      let senha = parseInt(req.body.senha)
      let valor = parseFloat(req.body.valor)
      
      let retorno = Conta.autenticar(agencia, numero, senha)

      try {
        let resp = (retorno.conta).saque(valor, retorno.acesso)
        res.json(
            {
                "msg": resp.saque
            })
     } catch (error) {
        res.json(
            {
                "msg": "Acesso Negado"
            })
     }
})

app.post('/conta/deposito', (req, res)=>{
    //obter da requisição os dados
    let agencia = parseInt(req.body.agencia)
    let numero = parseInt(req.body.numero)
    let senha = parseInt(req.body.senha)
    let valor = parseFloat(req.body.valor)
    
    let retorno = Conta.autenticar(agencia, numero, senha)

    try {
      let resp = (retorno.conta).depositar(valor, retorno.acesso)
      res.json(
          {
              "msg": resp.deposito
          })
   } catch (error) {
      res.json(
          {
              "msg": "Acesso Negado"
          })
   }
})

app.get('/contasCC/', (req, res)=>{    
    ContaCorrente.gerarContasCorrentes()
    let contasCC = ContaCorrente.contasCC
    res.json(contasCC)
})


const porta = 3000
app.listen(porta, ()=>{
    console.log(`Operando na porta ${porta}`)
})


