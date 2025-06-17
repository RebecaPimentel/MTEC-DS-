const express = require('express')
const env = require('dotenv')
const clienteRouter = require('./src/router/router_cliente.js')
const categoriaRouter = require('./src/router/router_categoria.js')
const enderecoRouter = require('./src/router/router_endereco.js')
const itempedidoRouter = require('./src/router/router_itempedido.js')
const pedidoRouter = require('./src/router/router_pedido.js')
const produtoRouter = require('./src/router/router_produto.js')
const statusRouter = require('./src/router/router_status.js')

const {conexao, closeConexao, testarConexao} = require('./src/DAO/conexao.js')

const app = express()
env.config()


app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use('/firma/1.0.0/cliente', clienteRouter);
app.use('/firma/1.0.0/categoria', categoriaRouter);
app.use('/firma/1.0.0/endereco', enderecoRouter);
app.use('/firma/1.0.0/itempedido', itempedidoRouter);
app.use('/firma/1.0.0/pedido', pedidoRouter);
app.use('/firma/1.0.0/produto', produtoRouter);
app.use('/firma/1.0.0/status', statusRouter);

app.get('/', (req, res) => {
  res.send('Hello World')
})

app.listen(process.env.PORTA, () => {
    console.log(`Operando na porta ${process.env.PORTA}`), 
    testarConexao(conexao())
})