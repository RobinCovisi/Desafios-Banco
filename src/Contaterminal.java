import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e obtém os dados da conta do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibe a mensagem com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o scanner
        scanner.close();
    }
}