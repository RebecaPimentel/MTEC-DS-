const express = require('express')
const statusRouter = express.Router();

const {buscarStatus, buscarStatu} = require('../DAO/status/buscar_status.js')
const {incluirStatus} = require('../DAO/status/inserir_status.js')
const {editarIntegralmenteStatus} = require('../DAO/status/editar_integralmente_status.js')

const {editarParcialmenteStatus} = require('../DAO/status/editar_parcialmente_status.js')
const {deletarStatus} = require('../DAO/status/deletar_status.js')

// GET

statusRouter.get('/', async (req, res) =>{
    let clientes = await buscarStatus()
    res.json(clientes)
})

statusRouter.get('/:codigo', async (req, res) =>{
    let codigo = parseInt( req.params.codigo)
    let cliente = await buscarStatu(codigo)
    res.json(cliente)
})


// POST

statusRouter.post('/', async (req, res) =>{
    let {codigo, nome} = req.body
    const infos = [codigo, nome]
    let result = await incluirStatus(infos)
    res.json(result)
})

 
// PUSH

statusRouter.put('/', async (req, res) =>{
    let {codigo, nome} = req.body
    const infos = [nome]
    let result = await editarIntegralmenteStatus(infos, codigo)
    res.status(200).json(result)
})

// PATCH

statusRouter.patch('/', async (req, res) =>{
    let {codigo, campo, valor } = req.body
    let result = await editarParcialmenteStatus(codigo, campo, valor)
    res.status(200).json(result)
})

// DELETE

statusRouter.delete('/', async (req, res) =>{
    let { codigo } = req.body
    let result = await deletarStatus(codigo)
    res.json(result)
})

module.exports = statusRouter;