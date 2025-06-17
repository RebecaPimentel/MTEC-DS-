const express = require('express')
const enderecoRouter = express.Router();

const {buscarEnderecos, buscarEndereco} = require('../DAO/endereco/buscar_endereco.js')
const {incluirEndereco} = require('../DAO/endereco/inserir_endereco.js')
const {editarIntegralmenteEndereco} = require('../DAO/endereco/editar_integralmente_endereco.js')

const {editarParcialmenteEndereco} = require('../DAO/endereco/editar_parcialmente_endereco.js')
const {deletarEndereco} = require('../DAO/endereco/deletar_endereco.js')
// GET

enderecoRouter.get('/', async (req, res) =>{
    let clientes = await buscarEnderecos()
    res.json(clientes)
})

enderecoRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarEndereco(codigo)
    res.json(cliente)
})


// POST

enderecoRouter.post('/', async (req, res) =>{
    let {codigo, logradouro, cep, numero, bairro, cidade} = req.body
    const infos = [codigo, logradouro, cep, numero, bairro, cidade]
    let result = await incluirEndereco(infos)
    res.json(result)
})

// PUSH

enderecoRouter.put('/', async (req, res) =>{
    let {codigo, logradouro, cep, numero, bairro, cidade} = req.body
    const infos = [codigo, logradouro, cep, numero, bairro, cidade]
    let result = await editarIntegralmenteEndereco(infos, codigo)
    res.status(200).json(result)
})

// PATCH

enderecoRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteEndereco(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

enderecoRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarEndereco(codigo)
    res.json(result)
})

module.exports = enderecoRouter;