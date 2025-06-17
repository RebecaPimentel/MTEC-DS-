const express = require('express')
const clienteRouter = express.Router();

const {buscarClientes, buscarCliente} = require('../DAO/cliente/buscar_cliente.js')
const {incluirCliente} = require('../DAO/cliente/inserir_cliente.js')
const {editarIntegralmenteCliente} = require('../DAO/cliente/editar_integralmente_cliente.js')

const {editarParcialmenteCliente} = require('../DAO/cliente/editar_parcialmente_cliente.js')
const {deletarCliente} = require('../DAO/cliente/deletar_cliente.js')
// GET

clienteRouter.get('/', async (req, res) =>{
    let clientes = await buscarClientes()
    res.json(clientes)
})

clienteRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarCliente(codigo)
    res.json(cliente)
})


// POST

clienteRouter.post('/', async (req, res) =>{
    let {codigo, nome, limite, telefone, id_endereco, id_status} = req.body
    const infos = [codigo, nome, telefone, limite, id_endereco, id_status]
    let result = await incluirCliente(infos)
    res.json(result)
})

// PUSH

clienteRouter.put('/', async (req, res) =>{
    let {codigo, nome, limite, telefone, id_endereco, id_status} = req.body
    const infos = [telefone, nome, limite, id_endereco, id_status]
    let result = await editarIntegralmenteCliente(infos, codigo)
    res.status(200).json(result)
})

// PATCH

clienteRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteCliente(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

clienteRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarCliente(codigo)
    res.json(result)
})

module.exports = clienteRouter;