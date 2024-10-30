-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

-------------------------------------------------------------------------------------------------------------------------

-------------------------------------------------------Tabela Confeitaria------------------------------------------------

-------------------------------------------------------------------------------------------------------------------------

CREATE DATABASE dbConfeitaria
GO

USE dbConfeitaria

-- Tabela Cliente
CREATE TABLE tbCliente ( 
    codCliente INT IDENTITY(1,1) 
    ,nomeCliente VARCHAR(255) 
    ,dataNascimentoCliente SMALLDATETIME 
    ,ruaCliente VARCHAR(255) 
    ,numCasaCliente VARCHAR(50) 
    ,cepCliente VARCHAR(50) 
    ,bairroCliente VARCHAR(255) 
    ,cidadeCliente VARCHAR(255) 
    ,estadoCliente VARCHAR(50) 
    ,cpfCliente VARCHAR(14) 
    ,sexoCliente VARCHAR(10) 
    ,PRIMARY KEY (codCliente)
)

-- Tabela Categoria Produto
CREATE TABLE tbCategoriaProduto (
    codCategoriaProduto INT IDENTITY(1,1) 
    ,nomeCategoriaProduto VARCHAR(255) 
    ,PRIMARY KEY (codCategoriaProduto)
)

-- Tabela Produto
CREATE TABLE tbProduto (
    codProduto INT IDENTITY(1,1) 
    ,nomeProduto VARCHAR(255) 
    ,precoKiloProduto DECIMAL(10,2) 
    ,codCategoriaProduto INT 
    ,PRIMARY KEY (codProduto)
    ,FOREIGN KEY (codCategoriaProduto) REFERENCES tbCategoriaProduto(codCategoriaProduto)
)

-- Tabela Encomenda
CREATE TABLE tbEncomenda (
    codEncomenda INT IDENTITY(1,1) 
    ,dataEncomenda SMALLDATETIME 
    ,codCliente INT 
    ,valorTotalEncomenda DECIMAL(10,2) 
    ,dataEntregaEncomenda SMALLDATETIME 
    ,PRIMARY KEY (codEncomenda)
    ,FOREIGN KEY (codCliente) REFERENCES tbCliente(codCliente)
)

-- Tabela Itens Encomenda
CREATE TABLE tbItensEncomenda (
    codItensEncomenda INT IDENTITY(1,1) 
    ,codEncomenda INT 
    ,codProduto INT 
    ,quantidadeKilos DECIMAL(10,2) 
    ,subTotal DECIMAL(10,2) 
    ,PRIMARY KEY (codItensEncomenda)
    ,FOREIGN KEY (codEncomenda) REFERENCES tbEncomenda(codEncomenda)
    ,FOREIGN KEY (codProduto) REFERENCES tbProduto(codProduto)
)
  
-------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------- SELECTS ------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------

SELECT * FROM tbCliente
SELECT * FROM tbCategoriaProduto
SELECT * FROM tbProduto
SELECT * FROM tbItensEncomenda
SELECT * FROM tbItensEncomenda
