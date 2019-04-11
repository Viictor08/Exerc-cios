package calculadora;

import java.util.Scanner;

public class Adição 
{
	
	public static void somar() 
	{
		
		System.out.println("Você entrou na operação de Adição.\n");
		
		Scanner input = new Scanner(System.in);
		
		float x, y, soma;
		
		System.out.print("Por favor digite um número: \n");
		x = input.nextFloat();
		System.out.print("Agora digite outro número para realizar sua soma: \n");
		y = input.nextFloat();
		
		soma = x + y;
		
		System.out.print("O resultado da soma é: " + soma);
		
		input.close();
	}
}