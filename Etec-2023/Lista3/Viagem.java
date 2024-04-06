import java.util.Scanner;
public class Viagem {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		double passagem, v, total, precoV, t;
		String rBag;
		String rAssent;
		
		System.out.println("Escreva o valor da passagem? ");
		passagem = in.nextDouble();
		
		System.out.println("Vai despachar a bagagem? ");
		rBag = in.next();
		
		if (rBag.equalsIgnoreCase("Sim")) {
			System.out.println("Escreva o volume da bagagem: ");
			v = in.nextDouble();
			precoV = v*90;
		} else {
			precoV = 0;
		}
			
		System.out.println("Quer marcar assento? ");
		rAssent = in.next();
		if (rAssent.equalsIgnoreCase("Sim")) {
			t = 60;
		} else {
			t = 0;
		}
			
		total = passagem+precoV+t;
		System.out.println("O preço total da viagem é:" +total);
		in.close();	
	}

}