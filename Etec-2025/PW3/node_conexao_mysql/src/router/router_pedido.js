const express = require('express')
const pedidoRouter = express.Router();

const {buscarPedidos, buscarPedido} = require('../DAO/pedido/buscar_pedido.js')
const {incluirPedido} = require('../DAO/pedido/inserir_pedido.js')
const {editarIntegralmentePedido} = require('../DAO/pedido/editar_integralmente_pedido.js')

const {editarParcialmentePedido} = require('../DAO/pedido/editar_parcialmente_pedido.js')
const {deletarPedido} = require('../DAO/pedido/deletar_pedido.js')
// GET

pedidoRouter.get('/', async (req, res) =>{
    let clientes = await buscarPedidos()
    res.json(clientes)
})

pedidoRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarPedido(codigo)
    res.json(cliente)
})


// POST

pedidoRouter.post('/', async (req, res) =>{
    let {codigo, numero, data_elaboracao, cliente_id} = req.body
    const infos = [codigo, numero, data_elaboracao, cliente_id]
    let result = await incluirPedido(infos)
    res.json(result)
})

 
// PUSH

pedidoRouter.put('/', async (req, res) =>{
    let {codigo, numero, data_elaboracao, cliente_id} = req.body
    const infos = [numero, data_elaboracao, cliente_id]
    let result = await editarIntegralmentePedido(infos, codigo)
    res.status(200).json(result)
})

// PATCH

pedidoRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmentePedido(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

pedidoRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarPedido(codigo)
    res.json(result)
})

module.exports = pedidoRouter;