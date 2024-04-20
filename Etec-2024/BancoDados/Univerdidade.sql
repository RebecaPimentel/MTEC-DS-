CREATE DATABASE db_universidade
GO

USE db_universidade

/* primeira tabela */
CREATE TABLE tblCampus  (
	idCampus INT PRIMARY KEY
	, nomeCampus VARCHAR (100)
)

CREATE TABLE tblCurso (
	idCurso INT PRIMARY KEY 
	, nomeCurso VARCHAR (50)
	, descricaoCurso VARCHAR (100)
	, duracaoCurso VARCHAR (50)
	, idCampus INT FOREIGN KEY REFERENCES tblCampus
) 

CREATE TABLE tblDisciplina (
	idDisciplina INT PRIMARY KEY
	, nomeDisciplina VARCHAR (100)
)

CREATE TABLE tblAluno (
	idAluno INT PRIMARY KEY
	, nomeAluno VARCHAR (100)
	, matriculaAluno INT 
)

CREATE TABLE tblProfessor (
	idProfessor INT PRIMARY KEY
	, nomeProfessor VARCHAR (100)
)

CREATE TABLE tblTurma (
	idTurma INT PRIMARY KEY
	, salaTurma INT
	, anoFormacaoTurma DATE 
	, idCurso INT FOREIGN KEY REFERENCES tblCurso
)

CREATE TABLE tblMatricula (
	idMatricula INT PRIMARY KEY 
	, idAluno INT FOREIGN KEY REFERENCES tblAluno
	, idTurma INT FOREIGN KEY REFERENCES tblTurma
)

CREATE TABLE tblOferecidas(
	idOferecidas INT PRIMARY KEY
	, idCurso INT FOREIGN KEY REFERENCES tblCurso
	, idDisciplina INT FOREIGN KEY REFERENCES tblDisciplina
)

CREATE TABLE tblAulas (
	idAulas INT PRIMARY KEY
	, idProfessor INT FOREIGN KEY REFERENCES tblProfessor
	, idDisciplina INT FOREIGN KEY REFERENCES tblDisciplina
)

