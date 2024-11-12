-- Barbara Samira Santiesteban Saravia
-- Rebeca Elaine Pimentel da Silva


------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- Exercícios de Merge Etec ------------------------------------------------
------------------------------------------------------------------------------------------------------------------------

USE dbEtec

-- Fazer um MERGE entre a tbTurma2A e tbTurma2A criando uma única turma de 3º ano.

MERGE tbTurma3C dest 
	USING (SELECT rmAluno, nomeAluno, statusAluno FROM tbTurma2A WHERE statusAluno = 'APROVADO') AS origem
	ON origem.rmAluno = dest.rmAluno
	WHEN NOT MATCHED THEN 
	INSERT (rmAluno, nomeAluno, statusAluno)
	VALUES (origem.rmAluno, origem.nomeAluno, origem.statusAluno);


MERGE tbTurma3C dest 
	USING (SELECT rmAluno, nomeAluno, statusAluno FROM tbTurma2B WHERE statusAluno = 'APROVADO') AS origem
	ON origem.rmAluno = dest.rmAluno
	WHEN NOT MATCHED THEN 
	INSERT (rmAluno, nomeAluno, statusAluno)
	VALUES (origem.rmAluno, origem.nomeAluno, origem.statusAluno);




-- Select da turma do 3º ano

	SELECT * FROM tbTurma3C
