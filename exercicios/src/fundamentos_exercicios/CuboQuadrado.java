package fundamentos_exercicios;

import java.util.Scanner;

public class CuboQuadrado {
	// programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\nO valor em cubo é: " + cubo);
		
		scanner.close();
    }
}