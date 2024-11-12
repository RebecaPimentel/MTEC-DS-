-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva


------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- Banco de Dados Etec -----------------------------------------------------
------------------------------------------------------------------------------------------------------------------------

CREATE DATABASE dbEtec
GO

USE dbEtec


 --TURMA do 2ºA
CREATE TABLE tbTurma2A (
    rmAluno INT 
    ,nomeAluno VARCHAR(255) 
    ,statusAluno VARCHAR(10) 
    ,PRIMARY KEY (rmAluno)
)

 --TURMA 2ºB
CREATE TABLE tbTurma2B (
    rmAluno INT 
    ,nomeAluno VARCHAR(255) 
    ,statusAluno VARCHAR(10) 
    ,PRIMARY KEY (rmAluno)
)

 --TURMA 3ºC
CREATE TABLE tbTurma3C (
    rmAluno INT 
    ,nomeAluno VARCHAR(255) 
    ,statusAluno VARCHAR(10) 
    ,PRIMARY KEY (rmAluno)
)






