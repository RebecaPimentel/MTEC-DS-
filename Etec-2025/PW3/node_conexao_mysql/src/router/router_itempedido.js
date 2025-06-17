const express = require('express')
const itempedidoRouter = express.Router();

const {buscarItempedidos, buscarItempedido} = require('../DAO/itempedido/buscar_itempedido.js')
const {incluirItempedido} = require('../DAO/itempedido/inserir_itempedido.js')
const {editarIntegralmenteItempedido} = require('../DAO/itempedido/editar_integralmente_itempedido.js')

const {editarParcialmenteItempedido} = require('../DAO/itempedido/editar_parcialmente_itempedido.js')
const {deletarItempedido} = require('../DAO/itempedido/deletar_itempedido.js')
// GET

itempedidoRouter.get('/', async (req, res) =>{
    let clientes = await buscarItempedidos()
    res.json(clientes)
})

itempedidoRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarItempedido(codigo)
    res.json(cliente)
})


// POST

itempedidoRouter.post('/', async (req, res) =>{
    let {codigo, id_pedido, id_produto, qnt} = req.body
    const infos = [codigo, id_pedido, id_produto, qnt]
    let result = await incluirItempedido(infos)
    res.json(result)
})


// PUSH

itempedidoRouter.put('/', async (req, res) =>{
    let {codigo, id_pedido, id_produto, qnt} = req.body
    const infos = [id_pedido, id_produto, qnt]
    let result = await editarIntegralmenteItempedido(infos, codigo)
    res.status(200).json(result)
})

// PATCH

itempedidoRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteItempedido(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

itempedidoRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarItempedido(codigo)
    res.json(result)
})

module.exports = itempedidoRouter;