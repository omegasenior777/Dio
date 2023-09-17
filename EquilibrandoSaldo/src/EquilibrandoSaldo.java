import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double valorRetirada = scanner.nextDouble();

        double saldoFinal = saldoAtual + valorDeposito - valorRetirada;

        System.out.println("O saldo final é: " + saldoFinal);

        scanner.close();
    }
}
