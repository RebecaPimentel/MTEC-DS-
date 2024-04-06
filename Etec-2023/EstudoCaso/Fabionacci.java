import java.util.Scanner;
public class Fabionacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, tAtual=1, tAnterior=0, pTermo, i=1;
		
		System.out.print("Digite o número: ");
        n = ler.nextInt();
        
        while(i<=n) {
        	if (i==n) {
        		System.out.print(tAtual);
        	}else {
        		System.out.print(tAtual+", ");
        	}
        	pTermo = tAnterior+ tAtual;
        	tAnterior = tAtual;
        	tAtual = pTermo;
        	i++;
        }
    }
        
}

