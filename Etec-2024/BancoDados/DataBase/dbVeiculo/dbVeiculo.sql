CREATE DATABASE bdVeiculo
GO

USE bdVeiculo

CREATE TABLE tbMotorista (
	codMotorista INT PRIMARY KEY IDENTITY(1,1)
	,nomeMotorista VARCHAR(50) NOT NULL
	,cpfMotorista CHAR(14)
	,pontuacaoAcumulada INT DEFAULT 0
)

CREATE TABLE tbVeiculo(
	codVeiculo INT PRIMARY KEY IDENTITY(1,1)
	,placaVeiculo CHAR (7) NOT NULL
	,renavam CHAR(10) NOT NULL
	,anoFabricacao INT NOT NULL
	,codMotorista INT FOREIGN KEY REFERENCES tbMotorista (codMotorista)
)

CREATE TABLE tbMulta (
	codMulta INT PRIMARY KEY IDENTITY(1,1)
	,dataMulta smalldatetime
	,numPontos int
	,codVeiculo INT FOREIGN KEY REFERENCES tbVeiculo(codVeiculo)
)
