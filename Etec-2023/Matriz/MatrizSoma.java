import java.util.Scanner;

public class MatrizSoma{
    public static void main(String[] args) {
    	int i, j;
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir os valores da matriz 3x4
        System.out.println("Digite os valores da matriz 3x4:");

        int[][] matriz = new int[3][4];
        
        for(i=0; i<3; i++) {
			for(j=0; j<3; j++) { 
				System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
			}
		}
        
        for(i=0; i<3; i++) { 
			System.out.println(); 
			for(j=0; j<4; j++) {
				if (j==3) {
	            	matriz[i][j]=matriz[i][j-1]+matriz[i][j-2]+matriz[i][j-3];
	            }
			}
		} 
            
                  
        for(i=0; i<3; i++) { 
			System.out.println(); 
			for(j=0; j<4; j++) {
				System.out.print("[ "+matriz[i][j]+"]");
			}
		} 
    }
}