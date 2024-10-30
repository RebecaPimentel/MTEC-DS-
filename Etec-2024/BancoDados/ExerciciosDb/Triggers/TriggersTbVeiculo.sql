
-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

------------------------------------------------------------------------------------------------------------------------

 --------------------------------------------- Exercícios de Triggers Estoque -----------------------------------------

------------------------------------------------------------------------------------------------------------------------
-- database Veiculo
USE bdVeiculo

-- database Conta
USE dbConta

-- 1) Criar um trigger que ao veículo tomar uma multa os pontos da multa sejam atualizados na tabela do motorista no campo pontuacaoAcumulada. Caso o motorista alcance 20 pontos informar via mensagem que o mesmo poderá ter sua habilitação suspensa.

-- TRIGGER: tgAtualizarPontos
DROP TRIGGER tgAtualizarPontos
CREATE TRIGGER tgAtualizarPontos
ON tbMulta
AFTER INSERT
AS

BEGIN
    
    DECLARE @pontuacaoAcumulada INT,@pontoMulta INT, @codMotorista INT
	DECLARE @codVeiculo INT

	SET @pontuacaoAcumulada = (SELECT pontuacaoAcumulada FROM tbMotorista) 
    SET @pontoMulta = (SELECT numPontos FROM inserted)

	SET @codVeiculo = (SELECT codVeiculo FROM inserted)
	SET @codMotorista = (SELECT codMotorista FROM tbVeiculo WHERE codVeiculo = @codVeiculo)

    UPDATE tbMotorista
    SET pontuacaoAcumulada = @pontuacaoAcumulada + @pontoMulta
		WHERE codMotorista = @codMotorista
		

	BEGIN
		IF @pontuacaoAcumulada >20
			BEGIN
				PRINT('Você corre o risco de ter sua habilitação suspensa.')
			END
		ELSE
			BEGIN
				PRINT('Sua pontuação atual é de' +CONVERT(VARCHAR(5), @pontuacaoAcumulada) + ' pontos.')
			END
	END
	
    
END
GO

-------------------------------------------------------------------------------------------------------------------------
-- Resultado: 

INSERT INTO tbMulta VALUES 
('2023-06-12', 4, 5)

-------------------------------------------------------------------------------------------------------------------------
-- SELECTS 

SELECT * FROM tbMulta
SELECT * FROM tbMotorista
SELECT * FROM tbVeiculo

-------------------------------------------------------------------------------------------------------------------------

-- a) Ao ser feito um depósito atualize o saldo da conta corrente somando a quantia depositada

-- TRIGGER: tggAtualizarSaldo

CREATE TRIGGER tgAtualizarSaldo
ON tbDeposito
AFTER INSERT
AS

BEGIN

    DECLARE @valorDeposito FLOAT
    DECLARE @numConta INT
    
    SELECT @valorDeposito = valorDeposito, @numConta = numConta
    FROM inserted

    UPDATE tbContaCorrente
    SET saldoConta = saldoConta + @valorDeposito
    WHERE numConta = @numConta

END
GO

-------------------------------------------------------------------------------------------------------------------------
-- Resultado: 

-- Teste 1 
INSERT INTO tbContaCorrente VALUES
(2000,1)	
	

-------------------------------------------------------------------------------------------------------------------------
-- SELECTS 

SELECT * FROM tbDeposito
SELECT * FROM tbContaCorrente
-------------------------------------------------------------------------------------------------------------------------

-- b) Ao ser feito um saque atualize o saldo da conta corrente descontando o valor caso tenha saldo suficiente

-- TRIGGER: 



-------------------------------------------------------------------------------------------------------------------------
-- Resultado: 

INSERT INTO tblItensVenda 
VALUES (9,5, 2200, 300.00)

-------------------------------------------------------------------------------------------------------------------------
-- SELECTS 

SELECT * FROM tblItensVenda
SELECT * FROM tblSaidaProduto

-------------------------------------------------------------------------------------------------------------------------