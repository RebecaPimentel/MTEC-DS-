const {conexao} = require('../conexao.js')

async function incluirItempedido(infos){
    const data = [infos]
    const sql = `INSERT INTO tbl_itempedido (codigo, id_pedido, id_produto, qnt) VALUES ?`
    const conn = await conexao()
    
    try {
        // Executar a consulta
        const [results] = await conn.query(sql,[data]);

        await conn.end()
        return results
      } catch (err) {
        return err.message
      }
}

module.exports = {incluirItempedido}