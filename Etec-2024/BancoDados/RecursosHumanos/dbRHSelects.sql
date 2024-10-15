-- Barbara Samira 
-- Rebeca Pimentel

-- Banco Recursos Humanos inserts   

USE dbRH

-- a) Criar uma view para exibir a quantidade de funcion�rios por nome de departamento;

	CREATE VIEW vwFuncDp AS 
		SELECT COUNT(codFuncionario) AS 'Codigo',  nomeDepartamento 'Departameto' FROM tbFuncionario 
			INNER JOIN tbDepartamento ON tbFuncionario.codDepartamento = tbDepartamento.codDepartamento
			GROUP BY nomeDepartamento

	SELECT * FROM vwFuncDp

-- b) Usando a view anterior, exibir somente o nome do departamento que possui o menor n�mero de funcion�rios

	SELECT * FROM vwFuncDp
		WHERE Codigo = (SELECT MIN(Codigo) FROM vwFuncDp)
		

-- c) Criar uma view para exibir a soma dos sal�rios por nome de departamento

		CREATE VIEW vwSalDp AS 
		SELECT SUM(salarioFuncionario) AS 'Salario',  nomeDepartamento 'Departameto' FROM tbFuncionario 
			INNER JOIN tbDepartamento ON tbFuncionario.codDepartamento = tbDepartamento.codDepartamento
			GROUP BY nomeDepartamento

	SELECT * FROM vwSalDp

-- d) Utilizando a view do exerc�cio anterior, mostrar somente a maior soma dentre os departamentos

	SELECT * FROM vwSalDp
		WHERE Salario = (SELECT MAX(Salario) FROM vwSalDp)

-- e) Criar uma view para exibir somente o nome dos funcion�rios e o nome dos departamentos daqueles funcion�rios que n�o possuem dependentes

	CREATE VIEW vwFuncDep AS 
		SELECT nomeFuncionario 'Funcionario',  nomeDepartamento 'Departameto' FROM tbFuncionario 
			INNER JOIN tbDepartamento ON tbFuncionario.codDepartamento = tbDepartamento.codDepartamento
				WHERE tbFuncionario.codFuncionario NOT IN (SELECT codFuncionario FROM tbDependente)

	SELECT * FROM vwFuncDep

-- f) Criar uma view que exiba a quantidade de dependentes por nome de funcion�rio

	CREATE VIEW vwDepenFunc AS 
		SELECT COUNT(codDependente) AS 'Dependentes',  nomeFuncionario 'Funcionario' FROM tbDependente 
			INNER JOIN tbFuncionario ON tbDependente.codFuncionario = tbFuncionario.codFuncionario
			GROUP BY nomeFuncionario

	SELECT * FROM vwDepenFunc

-- g) Utilizando a view anterior, mostrar somente o nome do funcion�rio que possui mais dependentes


-- h) Criar uma view para exibir a quantidade de dependentes por departamento

	CREATE VIEW vwDepenDepart AS

		SELECT nomeDepartamento, COUNT(codDependente) AS 'quantidadeDependentes' FROM tbDepartamento
			INNER JOIN tbFuncionario ON tbDepartamento.codDepartamento = tbFuncionario.codDepartamento
				INNER JOIN tbDependente ON tbFuncionario.codFuncionario = tbDependente.codFuncionario
					GROUP BY nomeDepartamento

	SELECT * FROM vwDepenDepart


-- i) Utilizando a view do exerc�cio anterior, apresentar a soma geral dos dependentes


	SELECT SUM(quantidadeDependentes) AS 'Soma Geral'  FROM vwDepenDepart