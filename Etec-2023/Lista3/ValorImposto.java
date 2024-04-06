import java.util.Scanner;
public class ValorImposto {
	public static void main(String[] args) {
		// criar objeto Scanner 1
		Scanner ler = new Scanner (System.in);
		double sal, imp;
		
		System.out.println("Qual é o seu salário? ");
		sal = ler.nextDouble();
		
		if (sal<1903.98) {
			imp=0;
			System.out.printf("seu imposto de renda é de:R$ %.2f",imp);
			
		} else if(sal<=2826.65) {
			imp=sal/100*7.5-142.80;
			System.out.printf("seu imposto de renda é de:R$ %.2f",imp);
			
		} else if(sal<=3751.05) {
			imp=sal/100*15.0-354.80;
			System.out.printf("seu imposto de renda é de:R$ %.2f",imp);
			
		} else if(sal<= 4664.68) {
				imp=sal/100*22.5-636.13; 
				System.out.printf("seu imposto de renda é de:R$ %.2f",imp);
				
		} else {
			imp=sal/100*27.5-869.36;
			System.out.printf("seu imposto de renda é de:R$ %.2f",imp);
			
		}
		ler.close();			
	}

}
