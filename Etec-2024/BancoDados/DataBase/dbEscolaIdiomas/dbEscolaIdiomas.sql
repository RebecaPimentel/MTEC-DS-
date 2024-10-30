CREATE DATABASE db_escolaIdiomas
GO

USE db_escolaIdiomas

/* Curso */
CREATE TABLE tblCurso (
	idCurso INT PRIMARY KEY IDENTITY(1,1)
	, nomeCurso VARCHAR (50)
	, cargahorariaCurso INT
	, valorCurso FLOAT
) 

/* Aluno */
CREATE TABLE tblAluno (
	idAluno INT PRIMARY KEY IDENTITY(1,1)
	, nomeAluno VARCHAR (100)
	, dataNascAluno DATE 
	, rgAluno VARCHAR (50)
	, naturalidadeAluno VARCHAR (2)
)

/* Turma */
CREATE TABLE tblTurma (
	idTurma INT PRIMARY KEY IDENTITY(1,1)
	, nomeTurma VARCHAR (50)
	, idCurso INT FOREIGN KEY REFERENCES tblCurso
	, horarioTurma DATETIME
)

/* Matricula */
CREATE TABLE tblMatricula (
	idMatricula INT PRIMARY KEY IDENTITY(1,1)
	, dataMatricula DATE
	, idAluno INT FOREIGN KEY REFERENCES tblAluno
	, idTurma INT FOREIGN KEY REFERENCES tblTurma
)
