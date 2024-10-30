-- Barbara Samira Santiesteban Saravia 
-- Rebeca Elaine Pimentel da Silva 

USE dbEstoque

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Exercicio com SubQuerys dbEstoque. 

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 1- Criar uma consulta que retorne o código do produto, o nome do produto e o nome do fabricante somente daqueles produtos que custam igual ao valor mais alto;

	SELECT codProduto AS 'Código do Produto', descricaoProduto AS 'Nome do Produto', nomeFabricante AS 'Nome Fabricante' FROM tblProduto
		INNER JOIN tblFabricante ON tblFabricante.codFabricante = tblProduto.codFabricante
			WHERE valorProduto IN (SELECT MAX(valorProduto) FROM tblProduto)

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- 2- Criar uma consulta que retorne o nome do produto eo nome do fabricante e o valor somente dos produtos que custem acima do valor médio dos produtos em estoque

	SELECT descricaoProduto AS 'Nome do Produto', nomeFabricante AS 'Nome Fabricante' FROM tblProduto
		INNER JOIN tblFabricante ON tblFabricante.codFabricante = tblProduto.codFabricante
			WHERE valorProduto > (SELECT AVG(valorProduto) FROM tblProduto)

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- 3- Criar uma consulta que retorne o nome dos clientes que tiveram vendas com valor acima do valor médio das vendas

	SELECT nomeCliente AS 'Nome do Cliente' FROM tblCliente
		INNER JOIN tblVendas ON tblVendas.codCliente = tblCliente.codCliente
			WHERE valorTotalVenda > (SELECT AVG(valorTotalVenda) FROM tblVendas)

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- 4- Criar uma consulta que retorno o nome e o preço dos produtos mais caros

	SELECT descricaoProduto AS 'Nome do Produto', valorProduto AS 'Valor do Produto' FROM tblProduto
		WHERE valorProduto IN (SELECT MAX(valorProduto) FROM tblProduto)

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- 5- Criar uma consulta que retorne o nome e o preço do produto mais barato 

	SELECT descricaoProduto AS 'Nome do Produto', valorProduto AS 'Valor do Produto' FROM tblProduto
		WHERE valorProduto IN (SELECT MIN(valorProduto) FROM tblProduto)

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- SELECT para visualizar todas as tabelas com todos os valores

SELECT codCliente, nomeCliente, cpfCliente, emailCliente, sexoCliente, CONVERT(varchar, dataNascimentoCliente, 20) +' '+  CONVERT(varchar, DATEADD (SECOND,0 + 0, 0),114)  AS dataNascimentoCliente FROM tblCliente 
SELECT codVenda, CONVERT(varchar, dataVenda, 103) AS dataVenda, valorTotalVenda, codCliente FROM tblVendas;
SELECT * FROM tblFabricante
SELECT * FROM tblFornecedor
SELECT * FROM tblProduto
SELECT * FROM tblItensVenda
