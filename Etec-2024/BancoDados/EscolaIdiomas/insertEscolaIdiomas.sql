USE db_escolaIdiomas

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- INSERT DOS DADOS

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Tabela de Curso

INSERT INTO tblCurso VALUES
('Inglês', 2000, 356.00),
('Alemão', 3000, 478.00),
('Espanhol', 4000, 500.00)

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Tabela de Aluno 

INSERT INTO tblAluno VALUES 
('Paulo Santos', '2000-03-10', '82.282.122-0', 'SP'),
('Maria da Gloria', '1999-10-03', '45.233.123-0', 'SP'),
('Pedro Nogueira da Silva', '1998-04-04', '23.533.211-9', 'SP'),
('Gilson Barros Silva', '1995-09-09', '34.221.111x', 'PE'),
('Mariana Barbosa Santos', '2001-10-10', '54.222.122-9', 'RJ'),
('Alessandro Pereira', '2003-10-11', '24.402.454-9', 'ES'),
('Aline Melo', '2001-10-08', '88.365.012-3', 'RJ')

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Tabela de Turma

INSERT INTO tblTurma VALUES
('1|A', 1, '1900-01-01 12:00:00'),
('1|C', 3, '1900-01-01 18:00:00'),
('1|B', 1, '1900-01-01 18:00:00'),
('1AA', 2, '1900-01-01 19:00:00')

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Tabela de Matricula

INSERT INTO tblMatricula VALUES
('2015-10-03 00:00:00', 1, 1),
('2014-05-04 00:00:00', 2, 1),
('2014-05-04 00:00:00', 2, 4),
('2012-05-03 00:00:00', 3, 2),
('2016-03-03 00:00:00', 1, 3),
('2015-05-07 00:00:00', 4, 2),
('2015-07-05 00:00:00', 4, 3)

-----------------------------------------------------------------------------------------------------------------------------------


SELECT * FROM tblAluno
SELECT * FROM tblTurma
SELECT * FROM tblCurso
SELECT * FROM tblMatricula