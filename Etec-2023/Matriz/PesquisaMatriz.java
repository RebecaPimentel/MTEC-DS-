/**/

import java.util.Random;
public class PesquisaMatriz {
	public static void main(String[] args) {
		int v[][] = new int[3][3];
		int i, j, maior=-1000, menor=1000, coluna=0, linha=0;
		Random in = new Random();
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) { 
				v[i][j] = in.nextInt()%50;
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) { 
				
				if(v[i][j]>maior) {
					maior=v[i][j];
				}else if(v[i][j]<menor){
					menor=v[i][j];
				}
			}
		}
		
		for(i=0; i<3; i++) { 
			for(j=0; j<3; j++) {
				if(v[i][j]==maior) {
					coluna=i;
					linha=j;
					System.out.println("O maior valor é "+maior+" que se localiza na coluna [ "+(linha+1) +" ] e na linha [ "+(coluna+1)+" ]  ");
				}
			}
		}
		
		for(i=0; i<3; i++) { 
			for(j=0; j<3; j++) {
				if(v[i][j]==menor) {
					coluna=i;
					linha=j;
					System.out.println("O menor valor é "+menor+" que se localiza na coluna [ "+(linha+1) +" ] e na linha [ "+(coluna+1)+" ] ");
				}
			}
		}
		
		for(i=0; i<3; i++) { 
			System.out.println(); 
			for(j=0; j<3; j++) {
				System.out.print("[ "+v[i][j]+"]");
			}
		} 
		
	}
}