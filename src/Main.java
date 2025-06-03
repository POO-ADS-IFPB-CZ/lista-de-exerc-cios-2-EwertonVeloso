import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaCorrente minhaConta = new ContaCorrente(1, "Pedro");

        int operacao = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma operação: ");
            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.print("Digite o valor do saque: ");
                    float saque = scanner.nextFloat();
                    minhaConta.sacar(saque);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    float deposito = scanner.nextFloat();
                    minhaConta.depositar(deposito);
                    break;
                case 3:
                    minhaConta.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
            }

        } while (operacao != 4);

    }
}