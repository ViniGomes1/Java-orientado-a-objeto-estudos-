package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

/*
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação
 */

public class Program {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US); // a formação dos valores está em formato americano
		Scanner sc = new Scanner(System.in);
		
		
		Account account; // os dados da conta será armazenado aqui, a localização do pacote está em entities/Account.java
		
		//entrada de dados
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		//caso a pessoa deseje um deposito inicial todos os atributos da "account" serão alocados
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();		
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder); // caso "não" apenas dois dos atributos serão alocados inicialmente
		}
		
		//saida dos dados da conta
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		// deposito de valor
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		//atualização da conta apos o deposito
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		//saque de valor com $ 5.00 de impostos
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdwaw(withdrawValue);
		//atualização da conta apos o saque
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
		
	}

}
