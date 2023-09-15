import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Por favor, digite o nome do cliente: ");
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
