package application;

import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		// Fa�a um programa para ler a cota��o do dolar, e depois um valor em dolares a ser comprado por
		// uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda
		// que a pessoa ter� que pagar 6% de IOF sobre o dolar. Criar uma classe CurrencyConverter
		// (conversor de moeda) para ser a respons�vel pelos calculos;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double dollar = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantity = scan.nextDouble();
		
		double total = util.CurrencyConverter.buyDollar(dollar, quantity);
		
		System.out.printf("You will pay R$ %.2f reais per dollar\n", dollar);
		System.out.printf("You will pay R$ %.2f in total with taxes", total);

		scan.close();
		
		
		
		
		

	}

}
