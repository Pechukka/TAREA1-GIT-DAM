package SUMA_2_VALORES;

import java.util.Scanner;

public class suma_2_valores
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el primer numero a sumar: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Introduce el segundo numero a sumar: ");
		double num2 = Double.parseDouble(scanner.nextLine());

		double resultado = num1 + num2;

		System.out.println("El resultado de la suma es: " + resultado);

		scanner.close();
	}
}
