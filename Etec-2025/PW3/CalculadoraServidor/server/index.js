const express = require('express')
const app = express()
var cors = require('cors')
const funtions = require('./funtions');

app.use(cors({
    origin: '*'
}));

app.use(
    express.urlencoded({
        extended: true
    })
)

app.use(express.json())


app.get('/', function (req, res) {
  const retorno = {
      resp: "Hello World"
  }
  
    res.send(retorno)
})


app.post('/calc', (req, res)=>{
    let resul = req.body.visor; 
    let button = req.body.button; 
    let digito = req.body.digito; 
    
    if(button === "zero") {
        resul = funtions.zero(resul);
    } 
    if (button === "resul"){
        resul = funtions.resul(resul);
    }
    if (button === "delete"){
        resul = funtions.del(resul);
    }
    if (button === "apagarTd"){
        resul = funtions.apagarTudo();
    }
    if (button === "digitos"){
        resul = funtions.ad(resul, digito);
    }
    
    
    const retorno = {resul}
    res.send(retorno)


})

const port = 3000

app.listen(port, () =>{
     console.log(`Operando na porta ${port}`)
} )

