CREATE DATABASE dbConta 
GO

USE dbConta

--  tabela cliente

CREATE TABLE tbCliente (
	codCliente INT PRIMARY KEY IDENTITY(1,1)
	,nomeCliente VARCHAR(50) NOT NULL
	,cpfCliente CHAR(14)
)

--  tabela ContaCorrente

CREATE TABLE tbContaCorrente (
	numConta INT PRIMARY KEY IDENTITY(1,1)
	, saldoConta FLOAT
	, codCliente INT FOREIGN KEY REFERENCES tbCliente(codCliente)
)

--  tabela Deposito

CREATE TABLE tbDeposito (
	codDeposito INT PRIMARY KEY IDENTITY(1,1)
	, valorDeposito FLOAT
	, dataDeposito SMALLDATETIME
	, horaDeposito TIME
	, numConta INT FOREIGN KEY REFERENCES tbContaCorrente(numConta)
)

--  tabela Saque

CREATE TABLE tbSaque (
	codSaque INT PRIMARY KEY IDENTITY(1,1)
	, valorSaque FLOAT
	, dataSaque SMALLDATETIME
	, horaSaque TIME
	, numConta INT FOREIGN KEY REFERENCES tbContaCorrente(numConta)
)