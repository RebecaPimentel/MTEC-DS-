import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, cpf;
        int perguntaConta, r = 3, m, perguntaAdm, i = 2;
        double quantia;

        // Perguntas
        System.out.println("Qual é o seu NOME?");
        nome = ler.next();

        System.out.println("Qual é seu CPF?");
        cpf = ler.next();

        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, cpf);
        
        while (r == 3) {
            System.out.println("Qual conta deseja utilizar hoje " + nome + ": \n(1-Conta Poupança | 2-Conta Corrente | 3-Finalizar Atividade)");
            perguntaConta = ler.nextInt();

            if (perguntaConta == 3) {
                r++;
                i++;
            } else if (perguntaConta > 3 || perguntaConta < 1) {
                System.out.println("Forneça um número válido.");
                i = 2;
            } else {
                i = 3;
            }

            while (i == 3) {
                System.out.println("O que deseja fazer hoje " + nome + ": \n(1-Sacar | 2-Depositar | 3-Ver Saldo Atual | 4-Finalizar Atividade)");
                perguntaAdm = ler.nextInt();

                switch (perguntaAdm) {
                    case 1: // Sacar
                        System.out.println("Qual é a quantia que deseja SACAR?");
                        double quantiaSacar = ler.nextDouble();
                        System.out.println(contaPoupanca.sacar(quantiaSacar) + "\n");
                        break;
                    case 2: // Depositar
                        System.out.println("Qual é a quantia que deseja DEPOSITAR?");
                        double quantiaDepositar = ler.nextDouble();
                        System.out.println(contaPoupanca.depositar(quantiaDepositar) + "\n");
                        break;
                    case 3: // Ver Saldo
                        System.out.println(contaPoupanca.verificar() + "\n");
                        break;
                    case 4: // Finalizar
                        i = 4;
                        break;
                    default:
                        System.out.println("Forneça um número válido.");
                        break;
                }
            }
        }

        System.out.println("Obrigado pela sua atenção");
        ler.close();
    }
}
