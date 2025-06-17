const {conexao} = require('../conexao.js')

async function editarIntegralmenteEndereco(infos, codigo){

    const sql = `UPDATE tbl_endereco SET  logradouro = ?, cep = ?, numero = ?, bairro = ?, cidade = ? WHERE codigo = ${codigo} ;`
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

module.exports = {editarIntegralmenteEndereco}

