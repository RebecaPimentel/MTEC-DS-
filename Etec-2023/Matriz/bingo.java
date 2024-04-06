/**/
import java.util.Random;
public class Bingo {
	public static void main(String[] args) {
		int v[][] = new int[4][4];
		int i, j, num,r=0, cont=0, aux=0;
		Random in = new Random();
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) { 
				v[i][j] = in.nextInt(76);
			}
		}
		
		for(i=0; i<4; i++) { 
			System.out.println(); 
			for(j=0; j<4; j++) {
				System.out.print("[ "+v[i][j]+" ]");
			}
		}
		System.out.println();
		
		while(r<16) {
			num = in.nextInt(76);
			System.out.println("Numero sorteado � "+num);
			cont++;
			
			for(i=0; i<4; i++) {
				for(j=0; j<4; j++) { 
					if (num==v[i][j]) {
						r++;
						
						aux=1;
					}
				}
			}
			if (aux==1) {
				System.out.println("Este numero esta na cartela");
				System.out.println();
			}else {
				System.out.println("Este numero n�o esta na cartela");
				System.out.println();
			}
			aux=0;
		}
		
		
		System.out.print("BINGO!!");
 		 
		
		for(i=0; i<4; i++) { 
			System.out.println(); 
			for(j=0; j<4; j++) {
				System.out.print("[ x ]");
			}
		}
		System.out.println();
		System.out.println(cont+" rodadas");
	}
}
