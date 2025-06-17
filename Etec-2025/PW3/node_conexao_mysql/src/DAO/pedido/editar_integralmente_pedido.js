const {conexao} = require('../conexao.js')

async function editarIntegralmentePedido(infos, codigo){

    const sql = `UPDATE tbl_pedido SET numero = ?, data_elaboracao = ?, cliente_id = ? WHERE codigo = ${codigo} ;`
    const conn = await conexao()
    
    try {
        // Executar a consulta
        const [results] = await conn.query(sql,[...infos]);

        await conn.end()
        return results
      } catch (err) {
        return err.message
      }
}

module.exports = {editarIntegralmentePedido}

