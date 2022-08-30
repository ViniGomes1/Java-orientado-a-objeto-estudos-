package application;

/*
 * Objetivo:
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). 
 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, 
 * e produtos usados possuem data de fabricação.
 * Estes dados específicos devem ser acrescentados na etiqueta de preço.
 * Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();	//Lista usada para armazenar as etiquetas
		Product prod = new Product();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		
		//Todo o sistema de repetição do programa 
		for (int i = 1; i <= N; i++) {
			System.out.println("\nProduct #" + i + "data: ");
			System.out.print("Common, used or imported (c/u/i)?: ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			/*
			 * ao invés de "if´s e else´s" resolvi usar o "switch & case" 
			 * pois acho melhor para multiplas escolhas 
			 */
			
			switch (ch) {
			case 'c':
				prod = new Product(name, price);
				list.add(prod);
			break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				prod= new UsedProduct(name, price, date);
				list.add(prod);
			break;
			case 'i':
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				
				prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			break;
			}
			
		}
		System.out.println();
		/* esta última repetição é a saída de dados no qual pega todos os "product" na lista "list"
		 * e imprime a partir da chamada espeçifica da classe
		 */
		for(Product product : list){
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
