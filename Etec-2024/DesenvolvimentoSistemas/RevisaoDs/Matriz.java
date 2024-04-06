
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {

        double[][] notas = new double[3][4];
        Scanner scanner = new Scanner(System.in); 

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite as notas do " + (i + 1) + " aluno :");

            for (int j = 0; j < 4; j++) {

                System.out.print("Nota " + (j + 1) + ": ");

                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {

            System.out.print("Aluno " + (i + 1) + " Notas: ");

            for (int j = 0; j < 4; j++) {

                System.out.print(notas[i][j]);

                if (j < 4) {

                    System.out.print(" ; ");
                } 
            }
            System.out.println();
        }
        scanner.close();
    }
    
}

//Barbara Samira Santiesteban Saravia
//Rebeca Elaine Pimentel da Silva
