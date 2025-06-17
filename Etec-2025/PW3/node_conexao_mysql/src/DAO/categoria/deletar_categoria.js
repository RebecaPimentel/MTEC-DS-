const {conexao} = require('../conexao.js')

async function deletarCategoria(codigo){
    
    const sql = `DELETE FROM tbl_categoria WHERE codigo = ?`
    const conn = await conexao()
    
    try {
        // Executar a consulta
        const [results] = await conn.query(sql,[codigo]);

        await conn.end()
        return results
      } catch (err) {
        return err.message
      }
}

module.exports = {deletarCategoria}