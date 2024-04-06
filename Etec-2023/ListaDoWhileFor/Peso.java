import java.util.Scanner;
public class Peso {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo;
		int r=1;
		double alt, pesoIdeal;
        
        do {
        	System.out.print("Qual é o seu sexo? (f ou m) ");
            sexo = ler.next();
            
            System.out.print("Qual é sua altura? ");
            alt = ler.nextDouble();
            
            alt = alt*100;
            
        	if(sexo.equalsIgnoreCase("f")) {
        		pesoIdeal = 52+(0.67*(alt-152.4));
        		System.out.println("O seu peso ideal é:" +pesoIdeal);
        		System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
                r = ler.nextInt();
                
        	}else if(sexo.equalsIgnoreCase("m")) {
        		pesoIdeal = 52+(0.75*(alt-152.4));
        		System.out.println("O seu peso ideal é:" +pesoIdeal);
        		System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
                r = ler.nextInt();
        	}else {
        		System.out.println("Informações invalidas! ");
        		System.out.println("Tente novamente escrevendo (f ou m) ");
        	}
        	
        }while(r==1);
        System.out.println("Execução Concluida!");
		
		ler.close();
	}
}

