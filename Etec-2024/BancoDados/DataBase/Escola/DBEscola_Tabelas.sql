-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

CREATE DATABASE dbEscola;
GO

USE dbEscola

CREATE TABLE tbAluno (
    codAluno INT IDENTITY(1,1) 
    ,nomeAluno VARCHAR(255) 
    ,dataNascAluno SMALLDATETIME 
    ,cpfAluno VARCHAR(255) 
    ,naturalidadeAluno VARCHAR(255) 
    ,PRIMARY KEY (codAluno)
)

CREATE TABLE tbCurso (
    codCurso INT IDENTITY(1,1)
    ,nomeCurso VARCHAR(255)
    ,cargaHorariaCurso INT
    ,valorCurso FLOAT
    ,PRIMARY KEY (codCurso)
)

CREATE TABLE tbTurma (
    codTurma INT IDENTITY(1,1) 
    ,nomeTurma VARCHAR(255) 
    ,codCurso INT 
    ,horarioTurma SMALLDATETIME 
    ,FOREIGN KEY (codCurso) REFERENCES tbCurso(codCurso)
    ,PRIMARY KEY (codTurma)
)

CREATE TABLE tbMatricula (
    codMatricula INT IDENTITY(1,1) 
    ,dataMatricula SMALLDATETIME 
    ,codAluno INT
    ,codTurma INT
    ,FOREIGN KEY (codAluno) REFERENCES tbAluno(codAluno)
    ,FOREIGN KEY (codTurma) REFERENCES tbTurma(codTurma)
    ,PRIMARY KEY (codMatricula)
)

select * from tbMatricula