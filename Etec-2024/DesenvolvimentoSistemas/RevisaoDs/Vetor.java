import java.util.Scanner;
public class Vetor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int TAM=6;
    int i;
    int[] vetorA = {3, 2, 8, 7, 5, 4};
    
    for(i=0;i<TAM;i++){
      System.out.println("Na posição "+i+" teremos o valor "+vetorA[i]);
    }
    ler.close();
  }
}

// Barbara Samira Santiesteban Saravia
// Rebeca Elaine Pimentel da Silva