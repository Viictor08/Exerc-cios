package calculadora;

import java.util.Scanner;

public class Subtra��o
{
	public static void subtrair() 
	{
		
		System.out.println("Voc� entrou na opera��o de subtra��o.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, subtrair;
		
		System.out.print("Por favor digite um n�mero: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro n�mero para realizar sua subtra��o: \n");
		y = input.nextFloat();
		
		subtrair = x - y;
		
		System.out.print("O resultado da subtra��o �: " + subtrair);
		
		input.close();
	}	
}