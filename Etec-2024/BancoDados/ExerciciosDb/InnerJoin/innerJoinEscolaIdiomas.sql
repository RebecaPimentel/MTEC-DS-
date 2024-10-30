USE db_escolaIdiomas

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- SELECTS

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- Exercícios


-- 1) Apresentar os nomes dos alunos ao lado do nome dos cursos que eles fazem;

	SELECT nomeAluno AS 'Nome do aluno', nomeCurso AS 'Nome do Curso' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 2) Apresentar a quantidade de alunos matriculados por nome do curso;

	SELECT tblCurso.NomeCurso, COUNT(tblMatricula.idAluno) AS 'Matriculados Curso' FROM tblCurso
		INNER JOIN tblTurma ON tblCurso.IdCurso = tblTurma.IdCurso
			INNER JOIN tblMatricula ON tblTurma.idTurma = tblMatricula.IdTurma
			GROUP BY tblCurso.NomeCurso

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 3) Apresentar a quantidade de alunos matriculados por nome da turma;

	SELECT tblTurma.nomeTurma, COUNT(tblMatricula.idAluno) AS 'Matriculados Turma' FROM tblTurma
		INNER JOIN tblMatricula ON tblTurma.IdTurma = tblMatricula.idTurma
			GROUP BY tblTurma.NomeTurma

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 4) Apresentar a quantidade de alunos que fizeram matricula em maio de 2016;

	SELECT COUNT(tblMatricula.IDAluno) AS 'Alunos Matriculados em Maio de 2016' FROM tblMatricula
		WHERE MONTH(tblMatricula.DataMatricula) = 5 AND YEAR(tblMatricula.dataMatricula) = 2016

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 5) Apresentar o nome dos alunos em ordem alfabética ao lado do nome das turmas e os nomes dos cursos em que estão matriculados

	SELECT tblAluno.NomeAluno, tblTurma.NomeTurma, tblCurso.NomeCurso  FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.IdAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
					ORDER BY tblAluno.nomeAluno

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 6) Apresentar o nome dos cursos e os horários em que eles são oferecidos

	SELECT tblCurso.nomeCurso, tblTurma.horarioTurma FROM tblCurso
		INNER JOIN tblTurma ON tblCurso.idCurso = tblTurma.IdCurso

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 7) Apresentar a quantidade de alunos nascidos por estado (Naturalidade) que estejam matriculados no curso de ingles

	SELECT tblAluno.naturalidadeAluno, COUNT(tblMatricula.idAluno) AS 'Quantidade de Alunos Matriculados no Ingles' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
					WHERE tblCurso.nomeCurso = 'Inglês'
						GROUP BY tblAluno.naturalidadeAluno

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 8) Apresentar o nome dos alunos ao lado da data de matrícula no formato dd/mm/aaaa

	SELECT nomeAluno AS 'Nome do aluno',CONVERT(varchar, dataMatricula, 103) AS 'Data de Matrícula' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno

-------------------------------------------------------------------------------------------------------------------------------------------------------------


-- 9) Apresentar os alunos cujo nome comece com A e que estejam matriculados no curso de inglês

	SELECT nomeAluno AS 'Nome do aluno', nomeCurso AS 'Nome do Curso' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
					WHERE nomeAluno LIKE 'A%' AND nomeCurso = 'Inglês'

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 10) Apresentar a quantidade de matriculas feitas no ano de 2016

	SELECT COUNT(*) AS 'Quantidade de Matrículas em 2016' FROM tblMatricula WHERE YEAR(dataMatricula) = 2016

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 11) Apresentar a quantidade de matriculas por nome do curso

	SELECT nomeCurso AS 'Nome do Curso', COUNT(*) AS 'Quantidade de Matrículas' FROM tblMatricula
		INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
			INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
				WHERE nomeCurso IN ('Alemão', 'Inglês', 'Espanhol')
					GROUP BY nomeCurso

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 12) Apresentar a quantidade de alunos que fazem os cursos que custam mais de R$ 300,00

	SELECT COUNT(*) AS 'Quantidade de Alunos com Cursos de mais de R$300,00' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
					WHERE valorCurso >300.00

-------------------------------------------------------------------------------------------------------------------------------------------------------------

-- 13) Apresentar os nomes dos alunos que fazem o curso de alemão

	SELECT nomeAluno AS 'Nome do aluno', nomeCurso AS 'Nome do Curso' FROM tblAluno
		INNER JOIN tblMatricula ON tblAluno.idAluno = tblMatricula.idAluno
			INNER JOIN tblTurma ON tblMatricula.idTurma = tblTurma.idTurma
				INNER JOIN tblCurso ON tblTurma.idCurso = tblCurso.idCurso
					WHERE nomeCurso LIKE 'Alemão'
