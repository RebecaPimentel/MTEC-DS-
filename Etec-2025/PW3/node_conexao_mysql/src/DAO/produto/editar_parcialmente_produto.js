const {conexao} = require('../conexao.js')

async function editarParcialmenteProduto(codigo, campo, valor){
    const data = [valor, codigo]
    
    const colunasPermitidas = ['nome', 'id_categoria', 'preco'];
    if (!colunasPermitidas.includes(campo)) {
        throw new Error('Coluna inválida');
    }

    const sql = `UPDATE tbl_produtos set ${campo} = ? WHERE codigo = ? ;`
    const conn = await conexao()
    
    try {
        const [results] = await conn.query(sql, data);

        await conn.end()
        return results
      } catch (err) {
        return err.message
      }
}

module.exports = {editarParcialmenteProduto}

