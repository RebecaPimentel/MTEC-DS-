
public class Informacoes {
	public static void informacoes() {
		int i, contagem=11;
		String nome[] = {
			    "O Poderoso Chefão", "A Lista de Schindler", "Forrest Gump", "O Senhor dos Anéis: A Sociedade do Anel", "Um Sonho de Liberdade", 
			    "Gladiador", "O Cavaleiro das Trevas", "Matrix", "Titanic", "A Origem",
			    "Interstellar", "Clube da Luta", "Pulp Fiction", "O Labirinto do Fauno", "O Rei Leão",
			    "O Resgate do Soldado Ryan", "Psicose", "O Sexto Sentido", "O Iluminado", "Jurassic Park", 
			    "Indiana Jones e os Caçadores da Arca Perdida", "E.T. - O Extraterrestre", "De Volta para o Futuro", "Os Incríveis", "Toy Story", 
			    "Moana", "Frozen 2", "Star Wars: Episódio IV - Uma Nova Esperança", "Harry Potter e a Pedra Filosofal", "A Bela e a Fera", 
			    "O Rei Leão (live-action)", "Capitão América: O Soldado Invernal", "O Lobo de Wall Street", "Esqueceram de Mim", "Mad Max: Estrada da Fúria", 
			    "Piratas do Caribe: A Maldição do Pérola Negra", "O Grinch", "Senhor dos Anéis: O Retorno do Rei", "Homem-Aranha: No Aranhaverso", "As Aventuras de Pi"
			};

			int tempo[] = {
			    175, 195, 142, 178, 142, 
			    155, 152, 136, 195, 148, 
			    169, 139, 154, 118, 88, 
			    169, 109, 107, 146, 127, 
			    115, 115, 116, 115, 81, 
			    103, 107, 121, 152, 84, 
			    118, 136, 180, 103, 120, 
			    143, 105, 201, 117, 127
			};

			for (i = 0; i < 40; i++) {
	            System.out.println(contagem+"º) O filme " + nome[i] + " possui: " + tempo[i] + " minutos");
	            contagem++;
			}

	}
}