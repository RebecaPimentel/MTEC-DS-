import java.util.Scanner;
public class Desafio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nas, nAtual, idade, aux=0;
		String pergunta;
		
		System.out.println("Qual é o ano atual? ");
		nAtual = ler.nextInt();
		
		while(aux<1) {
				System.out.println("Escreva o ano de nascimento? ");
				nas = ler.nextInt();
				
				idade = nAtual-nas;
				
				if(idade>18) {
					System.out.println("Você é maior de idade ");
				}else{
					System.out.println("Você é menor de idade ");
				}
				
				System.out.println("Deseja calcular a idade de mais uma pessoa? ");
				pergunta = ler.next();
				
				if (pergunta.equalsIgnoreCase("Sim")) {
					
				} else {
					aux++;
					System.out.println("Processo Encerrado");
				}
				

			}
		ler.close();
		
		}
		
		
	}

//Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva