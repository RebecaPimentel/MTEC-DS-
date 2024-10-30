-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva

USE dbEscola

INSERT INTO tbAluno(nomeAluno, dataNascAluno, cpfAluno, naturalidadeAluno) VALUES
('Paulo Santos', '2000-03-10 00:00:00', '822.821.220-00', 'SP'),
('Maria da Gloria', '1999-10-03 00:00:00', '452.331.230-00', 'SP'),
('Pedro Nogueira da Silva', '1998-04-04 00:00:00', '235.332.119-00', 'SP'),
('Gilson Barros Silva', '1995-09-09 00:00:00', '342.211.110-10', 'PE'),
('Mariana Barbosa Santos', '2001-10-10 00:00:00', '542.221.229-00', 'RJ'),
('Alessandro Pereira', '2003-10-11 00:00:00', '244.024.549-00', 'ES'),
('Aline Melo', '2001-10-08 00:00:00', '883.650.123-00', 'RJ');

INSERT INTO tbCurso(nomeCurso, cargaHorariaCurso, valorCurso) VALUES
('Inglês', 2000, 356.00),
('Alemão', 3000, 478.00),
('Espanhol', 4000, 500.00)
 
INSERT INTO tbTurma(nomeTurma, codCurso, horarioTurma) VALUES
('1|A', 1, '1900-01-01 12:00:00'),
('1|C', 3, '1900-01-01 18:00:00'),
('1|B', 1, '1900-01-01 18:00:00'),
('1AA', 2, '1900-01-01 19:00:00')
 
INSERT INTO tbMatricula(dataMatricula, codAluno, codTurma) VALUES
('2015-10-03 00:00:00', 1, 1),
('2014-05-04 00:00:00', 2,1), 
('2014-05-04 00:00:00', 2,4),
('2012-05-03 00:00:00', 3, 2),
('2016-03-03 00:00:00', 1,3),
('2015-05-07 00:00:00', 4,2),
('2015-07-05 00:00:00', 4, 3)


 SELECT * FROM tbAluno
 SELECT * FROM tbCurso
 SELECT * FROM tbTurma
 SELECT * FROM tbMatricula