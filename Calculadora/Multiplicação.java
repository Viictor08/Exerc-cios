package calculadora;

import java.util.Scanner;

public class Multiplicação {

	public static void multiplicar()
	{
		
		System.out.println("Você entrou na operação de multiplicação.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, mult;
		
		System.out.print("Por favor digite um número: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro número para realizar sua multiplicação: \n");
		y = input.nextFloat();
		
		mult = x * y;
		
		System.out.print("O resultado da multiplicação é: " + mult);
		
		input.close();
	}
}