
public class Informacoes {
	public static void informacoes() {
		int i, contagem=11;
		String nome[] = {
			    "O Poderoso Chef�o", "A Lista de Schindler", "Forrest Gump", "O Senhor dos An�is: A Sociedade do Anel", "Um Sonho de Liberdade", 
			    "Gladiador", "O Cavaleiro das Trevas", "Matrix", "Titanic", "A Origem",
			    "Interstellar", "Clube da Luta", "Pulp Fiction", "O Labirinto do Fauno", "O Rei Le�o",
			    "O Resgate do Soldado Ryan", "Psicose", "O Sexto Sentido", "O Iluminado", "Jurassic Park", 
			    "Indiana Jones e os Ca�adores da Arca Perdida", "E.T. - O Extraterrestre", "De Volta para o Futuro", "Os Incr�veis", "Toy Story", 
			    "Moana", "Frozen 2", "Star Wars: Epis�dio IV - Uma Nova Esperan�a", "Harry Potter e a Pedra Filosofal", "A Bela e a Fera", 
			    "O Rei Le�o (live-action)", "Capit�o Am�rica: O Soldado Invernal", "O Lobo de Wall Street", "Esqueceram de Mim", "Mad Max: Estrada da F�ria", 
			    "Piratas do Caribe: A Maldi��o do P�rola Negra", "O Grinch", "Senhor dos An�is: O Retorno do Rei", "Homem-Aranha: No Aranhaverso", "As Aventuras de Pi"
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
	            System.out.println(contagem+"�) O filme " + nome[i] + " possui: " + tempo[i] + " minutos");
	            contagem++;
			}

	}
}