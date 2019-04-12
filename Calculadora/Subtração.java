package calculadora;

import java.util.Scanner;

public class Subtração
{
	public static void subtrair() 
	{
		
		System.out.println("Você entrou na operação de subtração.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, subtrair;
		
		System.out.print("Por favor digite um número: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro número para realizar sua subtração: \n");
		y = input.nextFloat();
		
		subtrair = x - y;
		
		System.out.print("O resultado da subtração é: " + subtrair);
		
		input.close();
	}	
}