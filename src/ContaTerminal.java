import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta ;
        String agencia ;
        String nomeCliente ;
        double saldo ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Conta: ");
        numeroConta = scanner.nextInt();


        System.out.println("Digite o número da Agência: ");
        agencia = scanner.next();


        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();



        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

