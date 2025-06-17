const {conexao} = require('../conexao.js')

async function editarIntegralmenteItempedido(infos, codigo){

    const sql = `UPDATE tbl_itempedido SET id_pedido = ?, id_produto = ?, qnt = ? WHERE codigo = ${codigo} ;`
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

module.exports = {editarIntegralmenteItempedido}

