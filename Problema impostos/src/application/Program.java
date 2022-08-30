package application;
/*
 * Objetivo:
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais
 * podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um,
 * bem como o total de imposto arrecadado. 
 * 
 * Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de.
 * Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de funcion�rios. 
 * 
 * As regras para c�lculo de imposto est�o nas respectivas classes:
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPlayer> list = new ArrayList<>(); //Lista onde � armazenados os impostos
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nTax payer #" +i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			switch(ch) {
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double total = 0;
		for (TaxPlayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
			total = total + tax.tax();
		}
		
		System.out.printf("\nTotal taxes : $ %.2f", total);
		
		
		sc.close();
		
	}

}
