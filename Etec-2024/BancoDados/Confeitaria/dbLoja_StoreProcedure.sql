-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

-------------------------------------------------------------------------------------------------------------------------

---------------------------------------- Exercícios de Stored Procedures Confeitaria ------------------------------------

-------------------------------------------------------------------------------------------------------------------------

USE dbConfeitaria



-- 1) Criar o banco de dados no SQL Server via Script conforme abaixo:

	-- a) Criar uma Stored Procedure para inserir as categorias de produto conforme abaixo:

			-- PROCEDURE: spInserirCategorias

			CREATE PROCEDURE spInserirCategorias
			@nomeCategoria VARCHAR(50)
			AS
			BEGIN
				DECLARE @codCategoria INT
				BEGIN
					INSERT INTO tbCategoriaProduto(nomeCategoriaProduto)
					VALUES (@nomeCategoria)
					SET @codCategoria = (SELECT MAX(codCategoriaProduto) FROM tbCategoriaProduto) 
					PRINT('Produto '+@nomeCategoria+ ' cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codCategoria))
				END
			END 
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spInserirCategorias 'Bolo Festa'
			EXEC spInserirCategorias 'Bolo Simples'
			EXEC spInserirCategorias 'Torta'
			EXEC spInserirCategorias 'Salgado'
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbCategoriaProduto
-------------------------------------------------------------------------------------------------------------------------

	-- b) Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure deverá antes de inserir verificar se o nome do produto já existe, evitando assim que um produto seja duplicado:

		-- PROCEDURE: spInserirProdutos

			CREATE PROCEDURE spInserirProdutos	
				@nomeProduto VARCHAR(150)
				, @precoKiloProduto FLOAT
				, @codCategoriaProduto INT 
			AS
			BEGIN
				DECLARE @codProduto INT
				IF EXISTS (SELECT nomeProduto FROM tbProduto WHERE nomeProduto LIKE @nomeProduto)
				BEGIN
					PRINT ('Não é possivel inserir! Nome '+@nomeProduto +' já registrado!')
				END
				IF NOT EXISTS (SELECT codCategoriaProduto FROM tbCategoriaProduto WHERE codCategoriaProduto LIKE @codCategoriaProduto)
				BEGIN
					PRINT ('Não é possivel inserir! Código inexistente ' +CONVERT(VARCHAR(5), @codCategoriaProduto) )
				END
				ELSE
				BEGIN
					INSERT INTO tbProduto(nomeProduto,precoKiloProduto,codCategoriaProduto)
					VALUES (@nomeProduto,@precoKiloProduto,@codCategoriaProduto)
					SET @codProduto = (SELECT MAX(codProduto) FROM tbProduto) 
					PRINT('Produto '+@nomeProduto+ ' cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codProduto))
				END
			END 
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spInserirProdutos 'Bolo Floresta Negra', 42.00, 1
			EXEC spInserirProdutos 'Bolo Prestígio', 43.00, 1
			EXEC spInserirProdutos 'Bolo Nutella', 44.00, 1  
			EXEC spInserirProdutos 'Bolo Formigueiro', 17.00, 2
			EXEC spInserirProdutos 'Bolo de Cenoura', 19.00, 2
			EXEC spInserirProdutos 'Torta de palmito', 45.00, 3
			EXEC spInserirProdutos 'Torta de frango e catupiry', 47.00, 3
			EXEC spInserirProdutos 'Torta de escarola', 44.00, 3
			EXEC spInserirProdutos 'Coxinha frango', 25.00, 4
			EXEC spInserirProdutos 'Esfiha came', 27.00, 4
			EXEC spInserirProdutos 'Folhado queijo', 31.00, 4
			EXEC spInserirProdutos 'Risoles de feijao', 29.00, 40

			-- Teste com codigo inexistente e nome repetido  
			EXEC spInserirProdutos 'Risoles misto', 29.00, 400
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbProduto
-------------------------------------------------------------------------------------------------------------------------

	-- c) Criar uma stored procedure para cadastrar os clientes abaixo relacionados, sendo que deverão ser feitas duas validações:
		
		-- Verificar pelo CPF se o cliente já existe. Caso já exista emitir a mensagem: "Cliente cpf XXXXX já cadastrado" (Acrescentar a coluna CPF)
		-- Verificar se o cliente é morador de Itaquera ou Guaianases, pois a confeitaria não realiza entregas para clientes que residam fora desses bairros. Caso o cliente não seja morador desses bairros enviar a mensagem "Não foi possível cadastrar o cliente XXXX pois o bairro XXXX não é atendido pela confeitaria"

			-- PROCEDURE: spCadastrarCliente
			
			CREATE PROCEDURE spCadastrarCliente	
				@nomeCliente VARCHAR(255)
				, @dataNascimentoCliente SMALLDATETIME
				, @ruaCliente VARCHAR(255) 
				, @numCasaCliente VARCHAR(50) 
				, @cepCliente VARCHAR(50) 
				, @bairroCliente VARCHAR(255) 
				, @cidadeCliente VARCHAR(255) 
				, @estadoCliente VARCHAR(50) 
				, @cpfCliente VARCHAR(14) 
				, @sexoCliente VARCHAR(10) 
			AS
			BEGIN
				DECLARE @codCliente INT
				IF EXISTS (SELECT cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente)
					BEGIN
						PRINT ('Cliente cpf '+@cpfCliente +' já cadastrado')
						
					END
				IF (SELECT bairroCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente) <> 'Guaianases' OR (SELECT bairroCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente) <> 'Itaquera'
					BEGIN
						PRINT ('Não foi possivel cadastrar o cliente '+@nomeCliente +' pois o bairro '+@bairroCliente+' não é atendido pela confeitaria')
					END
				ELSE
				BEGIN
					INSERT INTO tbCliente(nomeCliente,dataNascimentoCliente,ruaCliente,numCasaCliente,cepCliente,bairroCliente,cidadeCliente,estadoCliente, cpfCliente,sexoCliente)
					VALUES (@nomeCliente,@dataNascimentoCliente,@ruaCliente,@numCasaCliente,@cepCliente,@bairroCliente, @cidadeCliente, @estadoCliente, @cpfCliente,@sexoCliente)
					SET @codCliente = (SELECT MAX(codCliente) FROM tbCliente) 
					PRINT('Cliente '+@nomeCliente+ ' cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codCliente))
				END
			END 
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spCadastrarCliente 'Samira Fatah', '1990-05-05 00:00:00', 'Rua Aguapeí', 1000, '08.090-000', 'Itaquera','Araraquara','SP', '127.828.789-99','F'
			EXEC spCadastrarCliente 'Celia Nogueira', '1992-06-06 00:00:00 ', 'Rua Andes', 234, '08.456-090', 'Guaianases','Analândia','SP', '675.562.799-95', 'F'
			EXEC spCadastrarCliente 'Paulo Cesar Siqueira', '1984-04-04 00:00:00 ', 'Rua Castelo do Piauí', 232, '08.109-000', 'Itaquera','Alambari','SP', '222.222.222-22' , 'M'
			EXEC spCadastrarCliente 'Rodrigo Favaroni', '1991-04-09 00:00:00 ', 'Rua Sansão Castelo Branco', 10, '08.431-090', 'Guaianases','São Paulo','SP', '523.743.789-95', 'M'
			EXEC spCadastrarCliente 'Flávia Regina Brito', '1992-22-04 00:00:00 ', 'Rua Mariano Moro', 300, '08.200-123', 'Penha','São Paulo','SP', '123.543.789' , 'F'

			-- Teste com Bairro diferente e CPF repetido: 
			EXEC spCadastrarCliente 'Samira Fatah', '1990-05-05 00:00:00', 'Rua Aguapeí', 1000, '08.090-000', 'Cidade Tiradente','Araraquara','SP', '127.828.789-99','F'

-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbCliente
-------------------------------------------------------------------------------------------------------------------------

	-- d) Criar via stored procedure as encomendas abaixo relacionadas, fazendo as verificações abaixo: 
		
		-- No momento da encomenda o cliente irá fornecer o seu cpf. Caso ele não tenha sido cadastrado enviar a mensagem "não foi possível efetivar a encomenda pois o cliente xxxx não está cadastrado"
		-- Verificar se a data de entrega não é menor do que a data da encomenda. Caso seja enviar a mensagem "não é possível entregar uma encomenda antes da encomenda ser realizada" - Caso tudo esteja correto, efetuar a encomenda e emitir a mensagem: "Encomenda XXX para o cliente YYY efetuada com sucesso" sendo que no lugar de XXX deverá aparecer o número da
		-- encomenda e no YYY deverá aparecer o nome do cliente; 

		-- PROCEDURE: spCadastrarCliente
		
			CREATE PROCEDURE spEncomenda
				@cpfCliente VARCHAR(14) 
				,@dataEncomenda SMALLDATETIME 
				,@codCliente INT 
				,@valorTotalEncomenda DECIMAL(10,2) 
				,@dataEntregaEncomenda SMALLDATETIME 
			AS
			BEGIN
				DECLARE @codEncomenda INT
				DECLARE @nomeCliente VARCHAR(255)

				IF NOT EXISTS (SELECT cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente)
					BEGIN
						PRINT ('Não foi possível efetivar a encomenda pois o cliente '+@cpfCliente +' não está cadastrado')
						RETURN  
					END
				IF @dataEntregaEncomenda < @dataEncomenda
					BEGIN
						PRINT ('Não foi possivel entregar uma encomenda antes da encomenda ser realizada')
						RETURN  
					END
				ELSE
					SET @nomeCliente = (SELECT nomeCliente FROM tbCliente WHERE cpfCliente LIKE @cpfCliente)
					BEGIN
						INSERT INTO tbEncomenda(dataEncomenda,codCliente,valorTotalEncomenda,dataEntregaEncomenda)
						VALUES (@dataEncomenda,@codCliente,@valorTotalEncomenda,@dataEntregaEncomenda)
						SET @codEncomenda = (SELECT MAX(codEncomenda) FROM tbEncomenda) 
						PRINT('Encomenda ' +CONVERT(VARCHAR(5), @codEncomenda) +' para o cliente '+@nomeCliente+' efetuada com sucesso')
					END
				
			END 
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spEncomenda '127.828.789-99', '2015-08-08 00:00:00', 1, 450, '2015-08-12 00:00:00'
			EXEC spEncomenda '123.543.789-45', '2015-10-10 00:00:00', 2, 200, '2015-15-10 00:00:00'
			EXEC spEncomenda '523.743.789-95', '2015-10-10 00:00:00', 3, 150, '2015-10-12 00:00:00'
			EXEC spEncomenda '222.222.222-22', '2015-06-10 00:00:00', 1, 250, '2015-12-10 00:00:00'
			EXEC spEncomenda '675.562.799-95', '2015-05-10 00:00:00', 4, 150, '2015-12-10 00:00:00'

		-- Teste com CPF inexistente: 
			EXEC spEncomenda '127.808.789-99', '2015-08-08 00:00:00', 1, 450, '2015-08-12 00:00:00'

-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbEncomenda
-------------------------------------------------------------------------------------------------------------------------

	--e)Ao adicionar a encomenda, criar uma Stored procedure, para que sejam inseridos os itens da encomenda conforme tabela a seguir.

		-- PROCEDURE: spInserirItens
		drop PROCEDURE spInserirItens
		CREATE PROCEDURE spInserirItens
				@codEncomenda INT 
				,@codProduto INT 
				,@quantidadeKilos DECIMAL(10,2) 
				,@subTotal DECIMAL(10,2) 
				AS
				BEGIN
					DECLARE @codItensEncomenda INT
					IF NOT EXISTS (SELECT codEncomenda FROM tbEncomenda WHERE codEncomenda LIKE @codEncomenda)
					BEGIN
						PRINT ('Não é possivel inserir! Código da Encomenda ' +CONVERT(VARCHAR(5), @codEncomenda)+' inexistente' )
					END
					IF NOT EXISTS (SELECT codProduto FROM tbProduto WHERE codProduto LIKE @codProduto)
					BEGIN
						PRINT ('Não é possivel inserir! Código inexistente ' +CONVERT(VARCHAR(5), @codProduto) )
						RETURN
					END

					BEGIN
						INSERT INTO tbItensEncomenda (codEncomenda,codProduto,quantidadeKilos,subTotal )
						VALUES (@codEncomenda,@codProduto,@quantidadeKilos,@subTotal )
						SET @codItensEncomenda = (SELECT MAX(codItensEncomenda) FROM tbItensEncomenda) 
						PRINT('Item cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codItensEncomenda))
					END
				END 

-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spInserirItens 1,1,2.5,105.00
			EXEC spInserirItens 1, 10, 2.6, 70.00
			EXEC spInserirItens 1, 9, 6, 150.00
			EXEC spInserirItens 1, 12, 4.3, 125.00
			EXEC spInserirItens 2, 9, 8, 200.00
			EXEC spInserirItens 3, 11, 3.2, 100.00
			EXEC spInserirItens 3, 9, 2, 50.00
			EXEC spInserirItens 4, 2, 3.5, 150.00
			EXEC spInserirItens 4, 3, 2.2, 100.00
			EXEC spInserirItens 5, 6, 3.4, 150.00

		-- Teste com CODIGO ENCOMENDA e CODIGO PRODUTO inexistentes: 
			EXEC spInserirItens 89,56,2.5,105.00
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbItensEncomenda
-------------------------------------------------------------------------------------------------------------------------

-- 2) Após todos os cadastros, criar Stored procedures para alterar o que se pede:

	-- a) O preço dos produtos da categoria "Bolo festa" sofreram um aumento de 10%

		-- PROCEDURE: spAumentarPrecoBoloFesta
		
			CREATE PROCEDURE spAumentarPrecoBoloFesta
			AS
			BEGIN
				UPDATE tbProduto
				SET precoKiloProduto = precoKiloProduto * 1.10	WHERE codCategoriaProduto = (SELECT codCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto LIKE 'Bolo Festa')
				PRINT 'O preço dos produtos da categoria "Bolo festa" foi aumentado em 10%.'
			END
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spAumentarPrecoBoloFesta;
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM TbProduto
-------------------------------------------------------------------------------------------------------------------------


	-- b) O preço dos produtos categoria "Bolo simples" estão em promoção e terão um desconto de 20%;
	
	-- PROCEDURE: spAplicarDesconto

		CREATE PROCEDURE spAplicarDesconto
		AS
		BEGIN
			UPDATE tbProduto
			SET precoKiloProduto = precoKiloProduto * 0.80 WHERE codCategoriaProduto = (SELECT codCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto LIKE 'Bolo Simples')
			PRINT 'O preço dos produtos da categoria Bolo simples foi reduzido em 20%.'
		END
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spAplicarDesconto;
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM TbProduto
-------------------------------------------------------------------------------------------------------------------------

	-- c) O preço dos produtos categoria "Torta" aumentaram 25%

	-- PROCEDURE: spAumentarPrecoTorta

		CREATE PROCEDURE spAumentarPrecoTorta
		AS
		BEGIN
			UPDATE tbProduto
			SET precoKiloProduto = precoKiloProduto * 1.25 WHERE nomeProduto LIKE 'Torta %'
			PRINT 'O preço dos produtos da categoria Torta foi aumentado em 25%.'
		END
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spAumentarPrecoTorta;
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM TbProduto
-------------------------------------------------------------------------------------------------------------------------

	-- d) O preço dos produtos categoria "Salgado", com exceção da esfiha de carne, sofreram um aumento de 20%

	-- PROCEDURE: spAumentarPrecoSalgado

		CREATE PROCEDURE spAumentarPrecoSalgado
		AS
		BEGIN
			UPDATE tbProduto
			SET precoKiloProduto = precoKiloProduto * 1.20 WHERE codCategoriaProduto = (SELECT codCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto LIKE 'Salgado'  AND nomeProduto NOT LIKE 'Esfiha came' )
			PRINT 'O preço dos produtos da categoria Salgado, exceto o preço da Esfiha de Carne, foi aumentado em 20%.'
		END
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spAumentarPrecoSalgado
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM TbProduto
-------------------------------------------------------------------------------------------------------------------------

	-- 3) Criar uma procedure para excluir clientes pelo CPF sendo que:

		-- a) Caso o cliente possua encomendas emitir a mensagem "Impossivel remover esse cliente pois o cliente XXXXX possui encomendas; onde XXXXX é o nome do cliente.
		-- b) Caso o cliente não possua encomendas realizar a remoção e emitir a mensagem "Cliente XXXX removido com sucesso", onde XXXX é o nome do cliente;

	-- PROCEDURE: spExcluirClienteCPF

		CREATE PROCEDURE spExcluirClienteCPF
		@cpfCliente VARCHAR(15) 
		AS
		BEGIN
			DECLARE @codCliente INT;
			DECLARE @nomeCliente VARCHAR(100);

			SELECT @codCliente = codCliente, @nomeCliente = nomeCliente FROM tbCliente WHERE cpfCliente = @cpfCliente

			IF EXISTS (SELECT 1 FROM tbEncomenda WHERE codCliente = @codCliente)
			BEGIN
				PRINT 'Impossível remover esse cliente, pois o cliente ' + @nomeCliente + ' possui encomendas.'
			END
			ELSE
			BEGIN
				DELETE FROM tbCliente WHERE codCliente = @codCliente;
				PRINT 'O cliente ' + @nomeCliente + ' foi removido com sucesso.'
			END
		END
-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spExcluirClienteCPF '127.828.789-99'
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbProduto 
-------------------------------------------------------------------------------------------------------------------------

-- 4) Criar uma procedure que permita excluir qualquer item de uma encomenda cuja data de entrega seja maior que a data atual. 
	-- Para tal o cliente deverá fornecer o código da encomenda e o código do produto que será excluído da encomenda.
	-- A procedure deverá remover o item e atualizar o valor total da encomenda, do qual deverá ser subtraído o valor do item a ser removido. A procedure poderá remover apenas um item da encomenda de cada vez.

	-- PROCEDURE: spExcluirItemEncomenda

	CREATE PROCEDURE spExcluirItemEncomenda
		@codEncomenda INT,     
		@codProduto INT        
	AS
	BEGIN
    
		DECLARE @dataEntregaEncomenda DATE
		DECLARE @subTotal DECIMAL(18, 2)

		SELECT @dataEntregaEncomenda = dataEntregaEncomenda FROM tbEncomenda WHERE codEncomenda = @codEncomenda

		IF @dataEntregaEncomenda > GETDATE()
		BEGIN
        
			SELECT @subTotal = subTotal
			FROM ItensEncomenda
			WHERE codEncomenda = @codEncomenda AND codProduto = @codProduto

			DELETE FROM ItensEncomenda
			WHERE codEncomenda = @codEncomenda AND codProduto = @codProduto

			UPDATE tbEncomenda
			SET valorTotalEncomenda = valorTotalEncomenda - @subTotal WHERE codEncomenda = @codEncomenda

			PRINT 'O item foi removido da encomenda e o valor total foi atualizado.'
		END
		ELSE
		BEGIN
			PRINT 'A data de entrega já passou ou é hoje. Não é possível remover o item da encomenda.'
		END
	END

-------------------------------------------------------------------------------------------------------------------------
		-- Resultado: 
			EXEC spExcluirItemEncomenda 22, 12
-------------------------------------------------------------------------------------------------------------------------
		-- SELECTS 
			SELECT * FROM tbItensEncomenda
-------------------------------------------------------------------------------------------------------------------------
