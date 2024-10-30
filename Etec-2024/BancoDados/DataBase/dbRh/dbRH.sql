-- Barbara Samira 
-- Rebeca Pimentel

-- Banco Recursos Humanos  

CREATE DATABASE dbRH
GO

USE dbRH

CREATE TABLE tbDepartamento (
    codDepartamento INT PRIMARY KEY
    ,nomeDepartamento VARCHAR(50)
)

CREATE TABLE tbFuncionario (
    codFuncionario INT PRIMARY KEY
    ,nomeFuncionario VARCHAR(100)
    ,cpfFuncionario VARCHAR(11)
    ,sexoFuncionario CHAR(1)
    ,dataNascimentoFuncionario DATE
    ,salarioFuncionario DECIMAL(10, 2)
    ,codDepartamento INT
    ,FOREIGN KEY (codDepartamento) REFERENCES tbDepartamento(codDepartamento)
)

CREATE TABLE tbDependente (
    codDependente INT PRIMARY KEY
    ,nomeDependente VARCHAR(100)
    ,dataNascimentoDependente DATE
    ,sexoDependente CHAR(1)
    ,codFuncionario INT
    ,FOREIGN KEY (codFuncionario) REFERENCES tbFuncionario(codFuncionario)
)
