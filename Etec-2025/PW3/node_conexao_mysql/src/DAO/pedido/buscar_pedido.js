const {conexao} = require('../conexao.js')


async function buscarPedidos(){
    const sql = `SELECT * FROM tbl_pedido;`
    
    const conn = await conexao()
    try {
        // Executar a consulta
        const [rows, fields] = await conn.query(sql);
        await conn.end()
        return rows
      } catch (err) {
        return err.message
      }
}

async function buscarPedido(codigo){
    const sql = `SELECT * FROM tbl_pedido WHERE codigo = ?`
    
    const conn = await conexao()
    
    try {
        // Executar a consulta
        const [rows, fields] = await conn.query(sql, [codigo]);
        await conn.end()
        return rows
      } catch (err) {
        return err.message
      }
}


module.exports = {buscarPedidos, buscarPedido}