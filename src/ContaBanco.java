import java.util.Scanner;

public class ContaBanco {
    // Atributos
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar e ler o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo inicial
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Exibir a mensagem com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
