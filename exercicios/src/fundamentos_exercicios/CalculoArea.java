package fundamentos_exercicios;

import java.util.Scanner;

public class CalculoArea {
	// programa que leia o valor da base e da altura de um triângulo e calcule a área.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = scanner.nextDouble();
				
		System.out.println("Digite a altura: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A área de trângulo é: " + area);
		
		scanner.close();
	} 
}
