package calculadora;

import java.util.Scanner;

public class Multiplica��o {

	public static void multiplicar()
	{
		
		System.out.println("Voc� entrou na opera��o de multiplica��o.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, mult;
		
		System.out.print("Por favor digite um n�mero: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro n�mero para realizar sua multiplica��o: \n");
		y = input.nextFloat();
		
		mult = x * y;
		
		System.out.print("O resultado da multiplica��o �: " + mult);
		
		input.close();
	}
}