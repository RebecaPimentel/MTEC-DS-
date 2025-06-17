const {conexao} = require('../conexao.js')

async function incluirStatus(infos){
    const data = [infos]
    const sql = `INSERT INTO tbl_status (codigo, nome) VALUES ?`
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

module.exports = {incluirStatus}