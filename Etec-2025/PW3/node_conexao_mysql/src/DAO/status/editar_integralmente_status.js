const {conexao} = require('../conexao.js')

async function editarIntegralmenteStatus(infos, codigo){

    const sql = `UPDATE tbl_status SET nome = ? WHERE codigo = ${codigo} ;`
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

module.exports = {editarIntegralmenteStatus}

