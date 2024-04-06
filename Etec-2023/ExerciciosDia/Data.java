import java.util.Scanner;

public class Data {
	public static void main(String[] args) { 
		Scanner ler = new Scanner (System.in);
		int d, m, a;
		
		System.out.println("Entre com o dia:");
		d = ler.nextInt();
		
		System.out.println("Entre com o mês:");
		m = ler.nextInt();
		
		System.out.println("Entre com o ano:");
		a = ler.nextInt();
		
		if (d >= 1 ) && (m == 1 | m == 3| m == 5| m == 7 | m == 8 | m == 10 )) {
			d= d+1;
			m= m+1;
			System.out.printf("data:" + d +"/" +m + "/"+a);
			
		} else if (d <= 31 && (m == 1 | m == 3| m == 5| m == 7 | m == 8 | m == 10 )) {
			d= 01;
			m= m+1;
			System.out.printf("data:" + d +"/" +m + "/"+a);
			
		} else if (d == 31 && (m == 12)) {
			d = 01;
			m = 01;
			a = a + 1;
			System.out.printf("data:" + d +"/" +m + "/"+a);
			
		} else if (d == 30 && (m == 4 | m == 6| m == 9| m == 11 )) {
			d= 01;
			m= m+1;
			System.out.printf("data:" + d +"/" +m+ "/"+a);
			
		} else if (a%4 == 0 && (d == 28)) {
			d = d +1;
			System.out.printf("data:" + d +"/" +m + "/"+a);
			
		} else if (d==29 && m==2) {
			d = 01;
			m = m+1;
			System.out.printf("data:" + d +"/" +m + "/"+a);
		}
		
		ler.close();
	}	
}
