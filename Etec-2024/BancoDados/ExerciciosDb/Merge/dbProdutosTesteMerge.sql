CREATE DATABASE dbTesteProdutos 
GO
 
USE dbTesteProdutos

------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- Tabela de teste MERGE ---------------------------------------------------
------------------------------------------------------------------------------------------------------------------------


--PRODUTOS DA LOJA 1
	CREATE TABLE tbProdutosLj1 (
		idProduto INT
		,nomeProduto VARCHAR(255) 
		,precoProduto FLOAT
		,qtdeProduto INT
		,PRIMARY KEY (idProduto)
	)

--PRODUTOS DA LOJA 2
	CREATE TABLE tbProdutosLj2 (
		idProduto INT
		,nomeProduto VARCHAR(255) 
		,precoProduto FLOAT
		,qtdeProduto INT
		,PRIMARY KEY (idProduto)
	)

--PRODUTOS DA LOJA GERAL
	CREATE TABLE tbProdutosGeral (
		idProduto INT
		,nomeProduto VARCHAR(255) 
		,precoProduto FLOAT
		,qtdeProduto INT
		,PRIMARY KEY (idProduto)
	)


------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- Insert de teste MERGE ---------------------------------------------------
------------------------------------------------------------------------------------------------------------------------



-- Inserindo produtos na tabela tbProdutosLj1
	INSERT INTO tbProdutosLj1 VALUES
	(101, 'Camiseta B�sica', 29.90, 100),
	(102, 'Cal�a Jeans', 89.90, 50),
	(103, 'T�nis Esportivo', 199.90, 30),
	(104, 'Jaqueta de Couro', 249.90, 15),
	(105, 'Rel�gio Digital', 159.90, 20),
	(106, 'Bolsa Feminina', 120.00, 25),
	(107, '�culos de Sol', 79.90, 40),
	(108, 'Chinelo de Borracha', 19.90, 70),
	(109, 'Cinto de Couro', 49.90, 35),
	(110, 'Meias Coloridas', 9.90, 200)



-- Inserindo produtos na tabela tbProdutosLj2
	INSERT INTO tbProdutosLj2 VALUES
	(201, 'Camiseta B�sica', 27.90, 120),
	(202, 'Cal�a Jeans', 92.90, 45),
	(203, 'T�nis Casual', 189.90, 25),
	(204, 'Jaqueta Esportiva', 199.90, 20),
	(205, 'Rel�gio Anal�gico', 149.90, 30),
	(206, 'Mochila Escolar', 99.90, 60),
	(207, '�culos de Grau', 129.90, 15),
	(208, 'Sand�lia Feminina', 59.90, 50),
	(209, 'Carteira Masculina', 39.90, 55),
	(210, 'Meias Brancas', 8.90, 180)


------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- Exercicio de teste MERGE ------------------------------------------------
------------------------------------------------------------------------------------------------------------------------

	MERGE tbProdutosGeral dest
		USING tbProdutosLj1 ori
		ON ori.idProduto = dest.idProduto
		WHEN NOT MATCHED THEN
		INSERT values (ori.idProduto, ori.nomeProduto, ori.precoProduto, ori.qtdeProduto)
		WHEN MATCHED THEN
		UPDATE SET dest.qtdeProduto += ori.qtdeProduto;


	MERGE tbProdutosGeral dest
		USING tbProdutosLj2 ori
		ON ori.idProduto = dest.idProduto
		WHEN NOT MATCHED THEN
		INSERT values (ori.idProduto, ori.nomeProduto, ori.precoProduto, ori.qtdeProduto)
		WHEN MATCHED THEN
		UPDATE SET dest.qtdeProduto += ori.qtdeProduto;


-- Select 

	SELECT * FROM tbProdutosGeral