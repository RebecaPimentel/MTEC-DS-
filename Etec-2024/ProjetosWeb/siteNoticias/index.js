//import modulo externo
import express from 'express'

// import modulo interno
import path from 'path'

// iniciei o express
const app = express()

app.use(express.static('public'))

// primeira rota
app.get('/', function (req, res) {
  let end = path.resolve('./view/index.html')
    res.sendFile(end)
})

// segunda rota
app.get('/cps', function (req, res) {
  let end = path.resolve('./view/cps.html')
  res.sendFile(end)
  })

// terceira rota
app.get('/dtsComemorativas', function (req, res) {
  let end = path.resolve('./view/dtsComemorativas.html')
  res.sendFile(end)
})

// quarta rota
app.get('/eventosCulturais', function (req, res) {
  let end = path.resolve('./view/eventosCulturais.html')
  res.sendFile(end)
  })

  // quinta rota
app.get('/paginaFofoca', function (req, res) {
  let end = path.resolve('./view/PaginaFofoca.html')
  res.sendFile(end)
  })

  // sexta rota
app.get('/curso', function (req, res) {
  let end = path.resolve('./view/cursos.html')
  res.sendFile(end)
  })
app.listen(3000, ()=>{console.log("Funcionando na porta 3000")})