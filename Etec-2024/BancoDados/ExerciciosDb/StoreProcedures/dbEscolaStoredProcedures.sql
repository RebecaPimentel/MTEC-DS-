-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

USE dbEscola

--------------------------------------------------------------------------------------

----------------------- Exercícios de Stored Procedures ------------------------------

--------------------------------------------------------------------------------------


-- 1) Criar uma stored procedure "Busca_Aluno" que receba o código do aluno e retorne seu nome e data de nascimento.


-- PROCEDURE: spBuscaAluno

CREATE PROCEDURE spBuscaAluno
	@codAluno INT
AS
	BEGIN
    SELECT nomeAluno, dataNascAluno FROM tbAluno WHERE codAluno = @codAluno;
END 

--------------------------------------------------------------------------------------
-- RESULTADO

EXEC spBuscaAluno 6

--------------------------------------------------------------------------------------

-- 2) Criar uma stored procedure "Insere_Aluno" que insira um registro na tabela de Alunos.

--------------------------------------------------------------------------------------

-- PROCEDURE: spInsereAluno

CREATE PROCEDURE spInsereAluno

@nomeAluno VARCHAR(255) 
, @dataNascAluno SMALLDATETIME 
, @cpfAluno VARCHAR(255) 
, @naturalidadeAluno VARCHAR(255) 

AS
	BEGIN		
		IF EXISTS (SELECT codAluno FROM tbAluno WHERE cpfAluno LIKE @cpfAluno)
		BEGIN
			PRINT ('Não é possivel Cadastrar! CPF '+@cpfAluno +' CPF já existe!')
		END
		ELSE
		BEGIN
			INSERT INTO tbAluno(nomeAluno, dataNascAluno, cpfAluno, naturalidadeAluno)
			VALUES (@nomeAluno, @dataNascAluno, @cpfAluno, @naturalidadeAluno)
			DECLARE @codAluno INT
			SET @codAluno = (SELECT MAX(codAluno) FROM tbAluno)
				PRINT ('Aluno '+ @nomeAluno + '  cadastrado com sucesso. Código = ' + CONVERT(VARCHAR(5), @codAluno))
		END
	END

--------------------------------------------------------------------------------------------------------------------
-- RESULTADO

	EXEC spInsereAluno 'Melanie Campos', '2007-08-09 01:20:03', '123.828.789-99', 'RJ'

--------------------------------------------------------------------------------------

-- SELECT ---

 SELECT * FROM tbAluno

--------------------------------------------------------------------------------------

-- 3) Criar uma stored procedure "Aumenta_Preco" que, dados o nome do curso e um percentual, aumente o valor do curso com a porcentagem informada.

--------------------------------------------------------------------------------------

-- PROCEDURE: spAumentaPreco

CREATE PROCEDURE spAumentaPreco 
@nomeCurso VARCHAR(255)
, @porcAumento FLOAT
AS
	BEGIN
		UPDATE tbCurso
			SET valorCurso = valorCurso + (valorCurso / 100 * @porcAumento)
		WHERE nomeCurso = @nomeCurso
	END

--------------------------------------------------------------------------------------
-- RESULTADO

EXEC spAumentaPreco 'Inglês', 10

--------------------------------------------------------------------------------------
-- SELECT ---

 SELECT * FROM tbCurso

--------------------------------------------------------------------------------------

-- 4) Criar uma stored procedure "Exibe_Turma" que, dado o nome da turma, exiba todas as informações dela.

--------------------------------------------------------------------------------------
-- PROCEDURE: Exibe_Turma

CREATE PROCEDURE Exibe_Turma
@nomeTurma CHAR(5) 
AS
BEGIN
	SELECT codTurma, nomeTurma, codCurso, horarioTurma FROM tbTurma
	WHERE @nomeTurma LIKE nomeTurma
END

--------------------------------------------------------------------------------------
-- RESULTADO

EXEC Exibe_Turma '1|B'

--------------------------------------------------------------------------------------

-- 5) Criar uma stored procedure "Exibe_AlunosdaTurma" que, dado o nome da turma, exiba os seus alunos.


-- PROCEDURE: Exibe_AlunosdaTurma

CREATE PROCEDURE Exibe_AlunosdaTurma
@nomeTurma CHAR(5) 
AS
BEGIN
	SELECT nomeAluno AS 'Nome do aluno' FROM tbAluno
		INNER JOIN tbMatricula ON tbAluno.codAluno = tbMatricula.codAluno
			INNER JOIN tbTurma ON tbMatricula.codTurma = tbTurma.codTurma
				WHERE @nomeTurma LIKE nomeTurma
END

--------------------------------------------------------------------------------------
-- RESULTADO

EXEC Exibe_AlunosdaTurma '1|B'

--------------------------------------------------------------------------------------


-- 6) Criar uma stored procedure para inserir alunos, verificando pelo CPF se o aluno existe ou não, e informar essa condição via mensagem.


-- PROCEDURE: Inscricao_CPF

CREATE PROCEDURE Inscricao_CPF
@nomeAluno VARCHAR(50) 
,@cpfAluno CHAR(11)
AS
BEGIN
	DECLARE @codAluno INT
		IF EXISTS (SELECT cpfAluno FROM tbAluno WHERE cpfAluno LIKE @cpfAluno)
		BEGIN
			PRINT ('Não é possivel Cadastrar! CPF '+@cpfAluno +' CPF já existe!')
		END
		ELSE
		BEGIN
			INSERT tbAluno (nomeAluno, cpfAluno) VALUES (@nomeAluno, @cpfAluno)
			SET @codAluno = (SELECT MAX(codAluno) FROM tbAluno) 
			PRINT('Aluno '+@nomeAluno+ ' cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codAluno))
		END
END
--------------------------------------------------------------------------------------
-- RESULTADO:

EXEC Inscricao_CPF 'João Silva', '123.456.789-00'

--------------------------------------------------------------------------------------

-- 7) Criar uma stored procedure que receba o nome do curso e o nome do aluno e matricule o mesmo no curso pretendido.


-- PROCEDURE: Inscricao_Curso
DROP PROCEDURE Inscricao_Curso
CREATE PROCEDURE Inscricao_Curso
@nomeAluno VARCHAR(50) 
,@cursoAluno CHAR(10)
AS
BEGIN
	DECLARE @codAluno INT
	DECLARE @codMatricula INT
	DECLARE @codTurma INT
		BEGIN
			IF @cursoAluno LIKE 'Inglês'
				SET @codTurma = 1;
			ELSE IF @cursoAluno LIKE 'Alemão'
				SET @codTurma = 4;
			ELSE IF @cursoAluno LIKE 'Espanhol'
				SET @codTurma = 2;
		END
		BEGIN
			INSERT tbAluno (nomeAluno) VALUES (@nomeAluno)
			SET @codAluno = (SELECT MAX(codAluno) FROM tbAluno) 
			PRINT('Aluno '+@nomeAluno+ ' cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codAluno))
		END
		BEGIN

			INSERT tbMatricula (codAluno, codTurma) VALUES (@codAluno, @codTurma)
			SET @codMatricula = (SELECT MAX(codMatricula) FROM tbMatricula) 
			PRINT('Matricula no curso de '+@cursoAluno+ 'cadastrado com sucesso com codigo ' +CONVERT(VARCHAR(5), @codMatricula))
		END
END
--------------------------------------------------------------------------------------
-- RESULTADO

EXEC Inscricao_Curso 'Vanessa Ribeiro', 'Alemão'

--------------------------------------------------------------------------------------
