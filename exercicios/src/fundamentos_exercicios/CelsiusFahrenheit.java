package fundamentos_exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	// programa que leia a temperatura em Celsius e converta para Fahrenheit
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
				
		double conversao = (celsius * 9 / 5) + 32;
		
		System.out.println("Valor em Fahrenheit: " + conversao);
		
		scanner.close();
				
	}
	
}

