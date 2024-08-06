package services.webplus;

import java.util.Scanner;

import services.webplus.models.Conta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Conta conta = new Conta();

        Scanner sc = new Scanner(System.in);
        System.out.println( "--- CONTA BANCARIA --- " );
        System.out.println();

        System.out.println("Por favor, digite o número da Conta: (1234)");
		conta.setNumero(sc.nextInt()); 
        sc.nextLine();

		System.out.println("Agora digite o número da Agência: (123-8)");
		conta.setAgencia(sc.next());
        sc.nextLine();

		System.out.println("Me informe seu nome: ");
		conta.setNomeCliente(sc.next());
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		conta.setSaldo(sc.nextDouble());
        

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

		sc.close();

    }
}
