---- Store procedure para inserir os clientes

USE dbConta

CREATE PROCEDURE spInserirCliente

@nomeCliente VARCHAR(255) 
, @cpfCliente VARCHAR(255) 


AS
	BEGIN		
		IF EXISTS (SELECT codCliente FROM tbCliente WHERE cpfAluno LIKE @cpfCliente)
		BEGIN
			PRINT ('Não é possivel Cadastrar! CPF '+@cpfCliente +' CPF já existe!')
		END
		ELSE
		BEGIN
			INSERT INTO tbCliente(nomeCliente, cpfCliente)
			VALUES (@nomeCliente, @cpfCliente)
			DECLARE @codCliente INT
			SET @codAluno = (SELECT MAX(codAluno) FROM tbCliente)
				PRINT ('Cliente '+ @nomeCliente + '  cadastrado com sucesso. Código = ' + CONVERT(VARCHAR(5), @codAluno))
		END
	END
--------------------------------------------------------------------------------------------------------------------
-- RESULTADO

	EXEC spInserirCliente 'Melanie Campos', '123.828.789-99'

--------------------------------------------------------------------------------------

-- SELECT ---

 SELECT * FROM tbCliente