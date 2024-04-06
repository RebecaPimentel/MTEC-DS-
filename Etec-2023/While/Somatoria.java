import java.util.Scanner;
public class Somatoria {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1 , r=0;
		
		while(i<101) {
			
			r=(r+i);
			i++;
		}
		
		System.out.println(r);
		ler.close();
	}
}	

