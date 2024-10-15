-- Barbara Samira 
-- Rebeca Pimentel

-- Banco Recursos Humanos inserts   

USE dbRH

-- tabela tbDepartamento
INSERT INTO tbDepartamento (codDepartamento, nomeDepartamento) VALUES
(1, 'Compras'),
(2, 'Vendas'),
(3, 'TI'),
(4, 'Marketing')

-- tabela tbFuncionario
INSERT INTO tbFuncionario (codFuncionario, nomeFuncionario, cpfFuncionario, sexoFuncionario, dataNascimentoFuncionario, salarioFuncionario, codDepartamento) VALUES
(1, 'Maria Luisa Moura', '12345678900', 'F', '1990-02-10', 3400.00, 1),
(2, 'Mariana Goulart', '45678901299', 'F', '1991-04-08', 2800.00, 1),
(3, 'Pedro Paulo Vidigal', '64587222388', 'M', '1994-05-07', 5400.00, 2),
(4, 'Carlos Calixto', '83783232233', 'M', '1965-03-03', 8900.00, 2),
(5, 'Viviane Martins', '77832233399', 'F', '1976-06-06', 4300.00, 3),
(6, 'Analice Mendes', '83703383843', 'F', '1981-09-09', 6800.00, 3),
(7, 'Patricia Ishikawa', '43356609300', 'F', '1978-05-05', 4900.00, 4)

-- tabela tbDependente
INSERT INTO tbDependente (codDependente, nomeDependente, dataNascimentoDependente, sexoDependente, codFuncionario) VALUES
(1, 'Lucas Moura', '2015-01-10', 'M', 1),
(2, 'Carlos Calixto Jr', '2000-06-08', 'M', 4),
(3, 'Michele Costa Calixto', '2003-09-09', 'F', 4),
(4, 'Silvana Costa Calixto', '2006-04-04', 'F', 4),
(5, 'Arthur Mendes Silva', '2010-07-07', 'M', 6)


SELECT * FROM tbDepartamento
SELECT * FROM tbFuncionario
SELECT * FROM tbDependente