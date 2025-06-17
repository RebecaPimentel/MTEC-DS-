const express = require('express')
const categoriaRouter = express.Router();

const {buscarCategorias, buscarCategoria} = require('../DAO/categoria/buscar_categoria.js')
const {incluirCategoria} = require('../DAO/categoria/inserir_categoria.js')
const {editarIntegralmenteCategoria} = require('../DAO/categoria/editar_integralmente_categoria.js')

const {editarParcialmenteCategoria} = require('../DAO/categoria/editar_parcialmente_categoria.js')
const {deletarCategoria} = require('../DAO/categoria/deletar_categoria.js')
// GET

categoriaRouter.get('/', async (req, res) =>{
    let clientes = await buscarCategorias()
    res.json(clientes)
})

categoriaRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarCategoria(codigo)
    res.json(cliente)
})


// POST

categoriaRouter.post('/', async (req, res) =>{
    let {codigo, nome} = req.body
    const infos = [codigo, nome]
    let result = await incluirCategoria(infos)
    res.json(result)
})

// PUSH

categoriaRouter.put('/', async (req, res) =>{
    let {codigo, nome} = req.body
    const infos = [telefone, nome, limite, id_endereco, id_status]
    let result = await editarIntegralmenteCategoria(infos, codigo)
    res.status(200).json(result)
})

// PATCH

categoriaRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteCategoria(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

categoriaRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarCategoria(codigo)
    res.json(result)
})

module.exports = categoriaRouter;