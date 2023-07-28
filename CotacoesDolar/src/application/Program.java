package application;

import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		// Faça um programa para ler a cotação do dolar, e depois um valor em dolares a ser comprado por
		// uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda
		// que a pessoa terá que pagar 6% de IOF sobre o dolar. Criar uma classe CurrencyConverter
		// (conversor de moeda) para ser a responsável pelos calculos;
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
