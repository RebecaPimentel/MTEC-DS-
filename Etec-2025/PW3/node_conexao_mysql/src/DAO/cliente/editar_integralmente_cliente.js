const {conexao} = require('../conexao.js')

async function editarIntegralmenteCliente(infos, codigo){

    const sql = `UPDATE tbl_cliente SET telefone = ?, nome = ?, limite = ?, id_endereco = ?, id_status = ? WHERE codigo = ${codigo} ;`
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

module.exports = {editarIntegralmenteCliente}