package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

/*
 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.

Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
exemplo).

Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
suficiente para realizar o saque e/ou pagar a taxa.

Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
mostrando os dados da conta ap�s cada opera��o
 */

public class Program {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US); // a forma��o dos valores est� em formato americano
		Scanner sc = new Scanner(System.in);
		
		
		Account account; // os dados da conta ser� armazenado aqui, a localiza��o do pacote est� em entities/Account.java
		
		//entrada de dados
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		//caso a pessoa deseje um deposito inicial todos os atributos da "account" ser�o alocados
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();		
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder); // caso "n�o" apenas dois dos atributos ser�o alocados inicialmente
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
		//atualiza��o da conta apos o deposito
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		//saque de valor com $ 5.00 de impostos
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdwaw(withdrawValue);
		//atualiza��o da conta apos o saque
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
		
	}

}
