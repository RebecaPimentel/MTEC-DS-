
public class Catalogo {
	public static void Catalogo() {
		int i, contagem=6;
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
			
			String categoria[] = {
				    "Crime", "História", "Drama", "Fantasia", "Drama", 
				    "Ação", "Super-Herói", "Ficção Científica", "Romance", "Ficção Científica",
				    "Ficção Científica", "Drama", "Crime", "Fantasia", "Animação",
				    "Guerra", "Terror", "Mistério", "Terror", "Aventura", 
				    "Aventura", "Ficção Científica", "Aventura", "Animação", "Animação", 
				    "Animação", "Animação", "Ficção Científica", "Fantasia", "Romance", 
				    "Ação", "Drama", "Comédia", "Aventura", "Ação", 
				    "Comédia", "Fantasia", "Aventura", "Animação", "Drama"
				};


			for (i = 0; i < 40; i++) {
	            System.out.println(contagem+"º) O filme " + nome[i] +" de Categoria: "+ categoria[i]+" possui: " + tempo[i] + " minutos");
	            contagem++;
			}

	}

	public static void CatalogoSerie() {
	    int i, contagem = 6;
	    String nome[] = {
	        "Game of Thrones", "Breaking Bad", "Stranger Things", "The Crown", "The Mandalorian",
	        "The Witcher", "Friends", "The Office", "Black Mirror", "The Simpsons",
	        "Sherlock", "Money Heist", "The Umbrella Academy", "The Boys", "Dark",
	        "Better Call Saul", "Narcos", "Vikings", "Supernatural", "Fargo",
	        "The Walking Dead", "True Detective", "Westworld", "Dexter", "The Good Place",
	        "Parks and Recreation", "Buffy the Vampire Slayer", "Glee", "Community", "The Marvelous Mrs. Maisel",
	        "The Haunting of Hill House", "Brooklyn Nine-Nine", "This Is Us", "Peaky Blinders", "Chernobyl",
	        "Mad Men", "The Sopranos", "Atlanta", "Ozark", "Ted Lasso"
	    };

	    int quantidadeTemporada[] = {
	        8, 5, 3, 6, 2,
	        2, 10, 9, 5, 34,
	        4, 5, 3, 4, 3,
	        6, 3, 6, 15, 6,
	        11, 3, 4, 8, 6,
	        7, 7, 6, 6, 4,
	        3, 4, 3, 6, 5,
	        6, 3, 4, 4, 2
	    };

	    int quantEpisodio[] = {
	        73, 62, 25, 60, 16,
	        16, 236, 201, 22, 706,
	        13, 41, 25, 32, 26,
	        63, 30, 89, 327, 61,
	        36, 24, 32, 96, 50,
	        27, 30, 22, 88, 27,
	        37, 44, 32, 33, 5,
	        10, 28, 12, 40, 12
	    };

	    for (i = 0; i < 40; i++) {
	        System.out.println(contagem + "º) A Série " + nome[i] + " com: " + quantidadeTemporada[i] + " temporadas, possui: " + quantEpisodio[i] + " episódios");
	        contagem++;
	    }
	}

}