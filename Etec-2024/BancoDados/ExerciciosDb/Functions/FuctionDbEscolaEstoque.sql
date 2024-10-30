-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

----------------------------------------------------------------------------------------------------------------
----------------------------- Exercicio de Function utilizando dbEscolaIdiomas ---------------------------------
----------------------------------------------------------------------------------------------------------------

-- DB Escola -----
USE dbEscola

-- 1- Crie uma função que informada uma data da  matrícula retorne o dia da semana.

CREATE FUNCTION fcDiaDaSemana (@dataMatricula SMALLDATETIME)
	RETURNS VARCHAR(20)  
AS
BEGIN 
    RETURN DATENAME(WEEKDAY, @dataMatricula)  
END

-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbo.fcDiaDaSemana(CONVERT(smalldatetime, '2024-10-08')) AS 'Dia da Semana'
------------------------------------------------------------------------------------------------------------

-- 2- Crie uma funçao que de acordo com a carga horária do curso exiba curso rápido ou curso extenso. (Rápido menos de 1000 horas).

CREATE FUNCTION fcDuracaoCurso (@cargaHoraria INT)
RETURNS VARCHAR(20)  
AS
BEGIN 
	DECLARE @duracao Varchar(20)
		
    IF @cargaHoraria < 1000
        SET @duracao = 'Curso rápido'
    ELSE
        SET @duracao = 'Curso extenso'

    RETURN @duracao;  
END

-- Resultado: ----------------------------------------------------------------------------------------------

-- Curso rápido
SELECT dbo.fcDuracaoCurso(800) AS 'Tempo de curso'

-- Curso extenso
SELECT dbo.fcDuracaoCurso(1200) AS 'Tempo de curso'

------------------------------------------------------------------------------------------------------------

-- 3- Crie uma funçao que de acordo com o valor do curso exiba curso caro ou curso barato. (Curso caro acima de 400).

CREATE FUNCTION fcValorCurso (@valor INT)
RETURNS VARCHAR(20)  
AS
BEGIN 
	DECLARE @valorCurso Varchar(20)
		
    IF @valor < 400
        SET @valorCurso = 'Curso barato'
    ELSE
        SET @valorCurso = 'Curso caro'

    RETURN @valorCurso;  
END
-- Resultado: ----------------------------------------------------------------------------------------------

-- Curso caro
SELECT dbo.fcValorCurso(500) AS 'Valor do curso'  

-- Curso barato
SELECT dbo.fcValorCurso(300) AS 'Valor de curso' 

------------------------------------------------------------------------------------------------------------
-- 4- Criar uma função que informada a data da matrícula converta-a no formato (dd/mm/aaaa).

CREATE FUNCTION fcConverterData (@dataMatricula SMALLDATETIME)
RETURNS VARCHAR(10)
AS
BEGIN 
    RETURN CONVERT(VARCHAR(10), @dataMatricula, 103)
END

-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbo.fcConverterData('2024-10-09') AS 'Data Convertida'


------------------------------------------------------------------------------------------------------------
-- DB Escola -----------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------

USE dbEstoque

-- 1-  Criar uma função que retorne o dia de semana da venda (no formato segunda, terça, etc) ao lado do código da venda, valor total da venda e sua data

CREATE FUNCTION fcInfoVendas (@codigo INT)
	RETURNS VARCHAR(200)
AS
BEGIN 
	DECLARE @valorTotal FLOAT, @DiaSemana VARCHAR(15), @data date, @resul VARCHAR(200)

	SET @valorTotal = (SELECT valorTotalVenda FROM tblVendas WHERE codVenda = @codigo)
	SET @data = (SELECT dataVenda FROM tblVendas WHERE codVenda = @codigo)
	SET @DiaSemana = DATENAME(WEEKDAY, @data)

	SET @resul = 'Codigo: '+CONVERT(VARCHAR(3),@codigo)+' | Valor Total: '+CONVERT(VARCHAR(16),@valorTotal)+' | Data: '+CONVERT(VARCHAR(10),@data)+' | Dia da Semana: '+CONVERT(VARCHAR(15),@DiaSemana)

    RETURN @resul
END

-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbo.fcInfoVendas(2) AS 'Dados da Venda'

------------------------------------------------------------------------------------------------------------

-- 2-  Criar uma função que receba o código do cliente e retorne o total de vendas que o cliente já realizou

CREATE FUNCTION fcVendasTotal (@codigo INT)
	RETURNS INT
AS
BEGIN
	DECLARE @total INT

	SET @total = (SELECT SUM(valorTotalVenda) FROM tblVendas WHERE codCliente = @codigo)
	
    RETURN  @total
END

-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbo.fcVendasTotal(1) AS 'Total de Vendas'

------------------------------------------------------------------------------------------------------------

-- 3- Criar uma função que receba o código de um vendedor e o mês e informe o total de vendas do vendedor no mês informado

CREATE FUNCTION fcMesVendasTotal (@codigoVendedor INT, @mes INT)
	RETURNS INT
AS
BEGIN
	DECLARE @totalVendedor INT

	SELECT  @totalVendedor = SUM(tblItensVenda.subTotalItensVenda) FROM tblVendas
		INNER JOIN tblItensVenda ON tblVendas.codVenda = tblItensVenda.codVenda
			INNER JOIN tblProduto ON tblItensVenda.codProduto = tblProduto.codProduto
				INNER JOIN tblFornecedor ON tblProduto.codFornecedor = tblFornecedor.codFornecedor
					WHERE tblFornecedor.codFornecedor = @codigoVendedor AND MONTH(tblVendas.dataVenda) = @mes
	
    RETURN @totalVendedor
END

-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbo.fcMesVendasTotal(1, 2) AS 'Total Vendido'

------------------------------------------------------------------------------------------------------------
-- 4- Criar uma função que usando o bdEstoque diga se o cpf do cliente é ou não válido.

CREATE FUNCTION CPF_VALIDO(@CPF VARCHAR(11))
RETURNS CHAR(1)
AS
BEGIN
    DECLARE @INDICE INT,
            @SOMA INT,
            @DIG1 INT,
            @DIG2 INT,
            @CPF_TEMP VARCHAR(11),
            @DIGITOS_IGUAIS CHAR(1),
            @RESULTADO CHAR(1)
    
    SET @RESULTADO = 'N'
    SET @CPF_TEMP = SUBSTRING(@CPF, 1, 1)
    SET @INDICE = 1
    SET @DIGITOS_IGUAIS = 'CPF válido'
    
    WHILE (@INDICE <= 11)
    BEGIN
        IF SUBSTRING(@CPF, @INDICE, 1) <> @CPF_TEMP
            SET @DIGITOS_IGUAIS = 'CPF inválido'
        
        SET @INDICE = @INDICE + 1
    END;

    IF @DIGITOS_IGUAIS = 'CPF inválido' 
    BEGIN

        SET @SOMA = 0
        SET @INDICE = 1
        
        WHILE (@INDICE <= 9)
        BEGIN
            SET @SOMA = @SOMA + CONVERT(INT, SUBSTRING(@CPF, @INDICE, 1)) * (11 - @INDICE);
            SET @INDICE = @INDICE + 1
        END
        
        SET @DIG1 = 11 - (@SOMA % 11)
        IF @DIG1 > 9
            SET @DIG1 = 0;

        SET @SOMA = 0
        SET @INDICE = 1
        
        WHILE (@INDICE <= 10)
        BEGIN
            SET @SOMA = @SOMA + CONVERT(INT, SUBSTRING(@CPF, @INDICE, 1)) * (12 - @INDICE);
            SET @INDICE = @INDICE + 1
        END
        
        SET @DIG2 = 11 - (@SOMA % 11)
        IF @DIG2 > 9
            SET @DIG2 = 0;
        IF (@DIG1 = SUBSTRING(@CPF, LEN(@CPF) - 1, 1)) AND (@DIG2 = SUBSTRING(@CPF, LEN(@CPF), 1))
            SET @RESULTADO = 'CPF válido'
        ELSE
            SET @RESULTADO = 'CPF inválido'
    END
    
    RETURN @RESULTADO
END



-- Resultado: ----------------------------------------------------------------------------------------------

SELECT dbEstoque.dbo.CPF_VALIDO(cpfCliente) FROM tblCliente

