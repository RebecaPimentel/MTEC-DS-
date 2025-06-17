const express = require('express')
const produtoRouter = express.Router();

const {buscarProdutos, buscarProduto} = require('../DAO/produto/buscar_produto.js')
const {incluirProduto} = require('../DAO/produto/inserir_produto.js')
const {editarIntegralmenteProduto} = require('../DAO/produto/editar_integralmente_produto.js')

const {editarParcialmenteProduto} = require('../DAO/produto/editar_parcialmente_produto.js')
const {deletarProduto} = require('../DAO/produto/deletar_produto.js')
// GET

produtoRouter.get('/', async (req, res) =>{
    let clientes = await buscarProdutos()
    res.json(clientes)
})

produtoRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarProduto(codigo)
    res.json(cliente)
})


// POST

produtoRouter.post('/', async (req, res) =>{
    let {codigo, nome, id_categoria, preco} = req.body
    const infos = [codigo, nome, id_categoria, preco]
    let result = await incluirProduto(infos)
    res.json(result)
})

 
// PUSH

produtoRouter.put('/', async (req, res) =>{
    let {codigo, nome, id_categoria, preco} = req.body
    const infos = [nome, id_categoria, preco]
    let result = await editarIntegralmenteProduto(infos, codigo)
    res.status(200).json(result)
})

// PATCH

produtoRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteProduto(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

produtoRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarProduto(codigo)
    res.json(result)
})

module.exports = produtoRouter;