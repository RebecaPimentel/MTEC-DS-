
USE bdVeiculo

INSERT INTO tbMotorista (nomeMotorista, cpfMotorista, pontuacaoAcumulada) VALUES 
('Carlos Silva', '12345678901', 10),
('Ana Pereira', '98765432100', 15),
('João Santos', '45678912345', 8),
('Mariana Oliveira', '32165498700', 20),
('Fernando Almeida', '65432178912', 5);

INSERT INTO tbVeiculo (placaVeiculo, renavam, anoFabricacao, codMotorista) VALUES 
('ABC1A23', '1234567890', 2015, 1),
('DEF2B34', '2345678901', 2018, 2),
('GHI3C45', '3456789012', 2020, 3),
('JKL4D56', '4567890123', 2016, 4),
('MNO5E67', '5678901234', 2019, 5);


INSERT INTO tbMulta (dataMulta, numPontos, codVeiculo) VALUES 
('2023-01-05', 5, 1),
('2023-02-10', 3, 2),
('2023-03-10', 4, 3),
('2023-04-05', 2, 4),
('2023-05-03', 6, 5);
