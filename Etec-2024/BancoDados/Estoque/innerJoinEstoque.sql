USE dbEstoque

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Exercicíos com INNER JOIN DATABASE Estoque

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- a) Listar as descrições dos produtos ao lado do nome dos fabricantes;

SELECT descricaoProduto AS 'Descrição do Produto', nomeFabricante AS 'Nome do Fabricante' FROM tblProduto
	INNER JOIN tblFabricante
		ON tblProduto.codFabricante = tblFabricante.codFabricante



-- b) Listar as descrições dos produtos ao lado do nome dos fornecedores;

SELECT descricaoProduto AS 'Descrição do Produto', nomeFornecedor AS 'Nome do Fornecedor' FROM tblProduto
	INNER JOIN tblFornecedor
		ON tblProduto.codFornecedor = tblFornecedor.codFornecedor



-- c) Listar a soma das quantidades dos produtos agrupadas pelo nome do fabricante;

SELECT SUM(quantidade) AS 'Quantidade Total', nomeFabricante AS 'Nome do Fabricante' FROM tblProduto
	INNER JOIN tblFabricante ON tblProduto.codFabricante = tblFabricante.codFabricante
			GROUP BY nomeFabricante 



-- d) Listar o total das vendas ao lado do nome do cliente;

SELECT SUM(valorTotalVenda) AS 'Total das Vendas', nomeCliente AS 'Nome do Cliente' FROM tblVendas
	INNER JOIN tblCliente ON tblVendas.codCliente = tblCliente.codCliente
			GROUP BY nomeCliente



-- e) Listar a média dos preços dos produtos agrupados pelo nome do fornecedor;

SELECT AVG(valorProduto) AS 'Média dos Preços', nomeFornecedor AS 'Nome do Fornecedor' FROM tblProduto
	INNER JOIN tblFornecedor ON tblProduto.codFornecedor = tblFornecedor.codFornecedor
			GROUP BY nomeFornecedor



-- f) Listar todas a soma das vendas agrupadas pelo nome do cliente em ordem alfabética;

SELECT nomeCliente, SUM(valorTotalVenda) AS Total  FROM tblCliente 
	INNER JOIN tblVendas ON tblCliente.codCliente = tblVendas.codCliente 
		GROUP BY nomeCliente 
			ORDER BY nomeCliente ASC;



-- g) Listar a soma dos preços dos produtos agrupados pelo nome do fabricante;

SELECT nomeFabricante, SUM(valorProduto) AS Total  FROM tblFabricante 
	INNER JOIN tblProduto ON tblProduto.codFabricante = tblFabricante.codFabricante 
		GROUP BY nomeFabricante 
			ORDER BY nomeFabricante DESC;



-- h) Listar a média dos preços dos produtos agrupados pelo nome do fornecedor;

SELECT nomeFornecedor,	AVG(valorProduto) AS Media  FROM tblFornecedor 
	INNER JOIN tblProduto ON tblProduto.codFornecedor  = tblFornecedor.codFornecedor 
		GROUP BY nomeFornecedor 
			ORDER BY nomeFornecedor DESC;



-- i) Listar a soma das vendas agrupadas pelo nome do produto;

SELECT descricaoProduto, SUM(subTotalItensVenda) AS Total FROM tblProduto
	INNER JOIN tblItensVenda ON tblProduto.codProduto = tblItensVenda.codProduto
		GROUP BY descricaoProduto
			ORDER BY descricaoProduto ASC;



-- j) Listar a soma das vendas pelo nome do cliente somente das vendas realizadas em fevereiro de 2014;

SELECT tblCliente.nomeCliente, SUM(tblVendas.valorTotalVenda) AS Total FROM tblCliente
	INNER JOIN tblVendas ON tblCliente.codCliente = tblVendas.codCliente
		WHERE YEAR(tblVendas.dataVenda) = 2014 AND MONTH(tblVendas.dataVenda) = 02
			GROUP BY tblCliente.nomeCliente;


-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- SELECT para visualizar todas as tabelas com todos os valores

SELECT codCliente, nomeCliente, cpfCliente, emailCliente, sexoCliente, CONVERT(varchar, dataNascimentoCliente, 20) +' '+  CONVERT(varchar, DATEADD (SECOND,0 + 0, 0),114)  AS dataNascimentoCliente FROM tblCliente 
SELECT codVenda, CONVERT(varchar, dataVenda, 103) AS dataVenda, valorTotalVenda, codCliente FROM tblVendas;
SELECT * FROM tblFabricante
SELECT * FROM tblFornecedor
SELECT * FROM tblProduto
SELECT * FROM tblItensVenda
